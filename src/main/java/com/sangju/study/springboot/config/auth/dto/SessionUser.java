package com.sangju.study.springboot.config.auth.dto;

import com.sangju.study.springboot.domain.user.UserInfo;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(UserInfo user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
