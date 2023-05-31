package com.example.mapper;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.dto.MemberFactory;
import com.example.mapper.BaseMapper;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public abstract class MemberMapperTest {

    protected Member member;
    protected List<Member> memberList;

    @Setup
    public void setup() {
        MemberFactory memberFactory = new MemberFactory();
        this.member = memberFactory.create();
        this.memberList = memberFactory.createList(1000);
    }

    @Benchmark
    public void multiMapping(Blackhole blackhole) {
        List<MemberDto> dtoList = mapper().map(this.memberList);
        blackhole.consume(dtoList);
    }

    public abstract BaseMapper<Member, MemberDto> mapper();

    public static void run(String className) {
        try {
            new Runner(createOptions(className)).run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Options createOptions(String className) {
        return new OptionsBuilder()
                .include(className)
                .measurementIterations(10)
                .forks(1)
                .build();
    }
}