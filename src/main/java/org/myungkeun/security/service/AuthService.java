package org.myungkeun.security.service;

import org.myungkeun.security.payload.LoginUserDto;
import org.myungkeun.security.payload.MemberDto;

public interface AuthService {
    String loginMember(LoginUserDto loginUserDto);
    String registerMember(MemberDto memberDto);
}
