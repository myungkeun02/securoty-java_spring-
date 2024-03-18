package org.myungkeun.security.service;

import org.myungkeun.security.entity.Member;
import org.myungkeun.security.payload.MemberDto;
import org.myungkeun.security.payload.MemberResponseDto;

public interface MemberService {
    MemberDto createMember(Member member);

    MemberResponseDto getAllMember(int pageNo, int pageSize, String sortBy, String sortDir);

    MemberDto getMemberById(Long id);

    MemberDto updateMemberById(Long id, MemberDto memberDto);

    String deleteMemberById(Long id);



}
