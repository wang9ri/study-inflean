package com.example.study.inflean.member;


import com.example.study.inflean.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;


    public Long saveMember(Member member) {

        return memberRepository.save(member);
    }

    public Member findMember(Long id){

        return memberRepository.findById(id);
    }
}
