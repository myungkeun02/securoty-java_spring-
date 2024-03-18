package org.myungkeun.security.payload;

import lombok.Data;

@Data
public class LoginResponseDto {
    private String accessToken;
    private String tokenType = "Bearer";
}
