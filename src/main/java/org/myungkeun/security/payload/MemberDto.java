package org.myungkeun.security.payload;

import lombok.Data;

@Data
public class MemberDto {
    private String email;
    private String name;
    private String password;
    private int phone;
}
