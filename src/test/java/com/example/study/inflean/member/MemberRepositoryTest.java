package com.example.study.inflean.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

//        @Rollback(value = false)
    @Transactional  // 엔티티 매니저를 이용한 데이터 변경은 Transactional 이 꼭 있어야 됨. TEST에 있으면 테스트 후 롤백함.
    @Test
    public void testMemeber() throws Exception {
        //given
        Member member = new Member();
        member.setUsername("aa");

        //when
        Long savedId = memberRepository.save(member);
        Member findMember = memberRepository.findById(savedId);

        //then
        assertEquals(savedId, findMember.getId());
        assertEquals(member, findMember);  //영속성 컨텍스트 1차 케새에 있는 동일한 객체임
    }

    @Test
    void save() {


    }

    @Test
    void findById() {
    }
}