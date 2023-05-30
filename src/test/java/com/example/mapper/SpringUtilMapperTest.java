package com.example.mapper;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;

public class SpringUtilMapperTest extends MemberMapperTest {

    private final SpringUtilMapper mapper = new SpringUtilMapper();

    @Override
    public BaseMapper<Member, MemberDto> mapper() {
        return mapper;
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = createOptions(SpringUtilMapperTest.class.getSimpleName());
        new Runner(opt).run();
    }

}
