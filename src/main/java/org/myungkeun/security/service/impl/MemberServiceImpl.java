package org.myungkeun.security.service.impl;

import org.modelmapper.ModelMapper;
import org.myungkeun.security.entity.Member;
import org.myungkeun.security.payload.MemberDto;
import org.myungkeun.security.payload.MemberResponseDto;
import org.myungkeun.security.repository.MemberRepository;
import org.myungkeun.security.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    private MemberRepository memberRepository;
    private ModelMapper modelMapper;
    public MemberServiceImpl(MemberRepository memberRepository, ModelMapper modelMapper) {
        this.memberRepository = memberRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public MemberDto createMember(Member member) {
        return null;
    }

    @Override
    public MemberResponseDto getAllMember(int pageNo, int pageSize, String sortBy, String sortDir) {
        return null;
    }

    @Override
    public MemberDto getMemberById(Long id) {
        return null;
    }

    @Override
    public MemberDto updateMemberById(Long id, MemberDto memberDto) {
        return null;
    }

    @Override
    public String deleteMemberById(Long id) {
        return null;
    }
}
