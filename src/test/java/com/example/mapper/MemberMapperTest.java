package com.example.mapper;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.dto.MemberFactory;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
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
    public void singleMapping(Blackhole blackhole) {
        MemberDto dto = mapper().map(this.member);
        blackhole.consume(dto);
    }

    @Benchmark
    public void multiMapping(Blackhole blackhole) {
        List<MemberDto> dtoList = mapper().map(this.memberList);
        blackhole.consume(dtoList);
    }

    public abstract BaseMapper<Member, MemberDto> mapper();

    public static Options createOptions(String className) {
        return new OptionsBuilder()
                .include(className)
                .warmupIterations(10)
                .measurementIterations(1)
                .forks(1)
                .build();
    }
}
