package com.zencoderz.bluebank.auth.config.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserAuthorityDTO {

    private String username;
    private String authority;

}
