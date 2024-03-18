package org.myungkeun.security.payload;

import lombok.Data;

@Data
public class LoginUserDto {
    private String email;
    private String password;
}
