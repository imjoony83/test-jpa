package com.github.imjoony83;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import org.hibernate.criterion.Example;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.imjoony83.entity.Member;
import com.github.imjoony83.repository.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberTest {

	@Autowired
	MemberRepository memberRepository;
	
	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void _1멤버추가() {
		memberRepository.save(Member.builder().id("id_a").name("name_a").regdate(new Date()).build());
		memberRepository.save(Member.builder().id("id_b").name("name_b").regdate(new Date()).build());
		memberRepository.save(Member.builder().id("id_c").name("name_c").regdate(new Date()).build());
		
//		memberRepository.findAll().stream().map;
		
		assertThat(memberRepository.findAll().size()).isEqualTo(3);
	}
	
	@Test
	public void _2멤버삭제() {
		memberRepository.delete(Member.builder().id("id_a").build());
		assertThat(memberRepository.findAll().size()).isEqualTo(2);
		
//		memberRepository.findAll(member);
		
	}
	
}
