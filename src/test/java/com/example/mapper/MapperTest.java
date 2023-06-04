package com.example.mapper;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.dto.MemberFactory;
import com.example.mapper.impl.ManuallyMapper;
import com.example.mapper.impl.MapStructMapper;
import com.example.mapper.impl.ModelMapperImpl;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.All)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class MapperTest {

    protected List<Member> memberList;

    private final ManuallyMapper manuallyMapper = new ManuallyMapper();
    private final ModelMapperImpl modelMapper = new ModelMapperImpl();
    private final MapStructMapper mapStructMapper = MapStructMapper.MAPPER;

    @Setup
    public void setup() {
        MemberFactory memberFactory = new MemberFactory();
        this.memberList = memberFactory.createList(100);
    }

    @Benchmark
    public void manually(Blackhole blackhole) {
        List<MemberDto> dtoList = manuallyMapper.map(this.memberList);
        blackhole.consume(dtoList);
    }

    @Benchmark
    public void modelMapper(Blackhole blackhole) {
        List<MemberDto> dtoList = modelMapper.map(this.memberList);
        blackhole.consume(dtoList);
    }


    @Benchmark
    public void mapStruct(Blackhole blackhole) {
        List<MemberDto> dtoList = mapStructMapper.map(this.memberList);
        blackhole.consume(dtoList);
    }

    public static void main(String[] args) throws RunnerException {
        Options option = new OptionsBuilder()
                .include(MapperTest.class.getSimpleName())
                .warmupIterations(10)
                .measurementIterations(20)
                .forks(1)
                .build();
        new Runner(option).run();
    }
}