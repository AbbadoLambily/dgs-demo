package com.example.demo;

import lombok.Data;
import org.nutz.dao.entity.annotation.*;

import java.time.LocalDateTime;


@Data
public class Member {

    private Long id;

    private String mobile;

    private String email;

    private String wechat;

    private String name;

    private LocalDateTime birthday;

    private Integer height;

    private Integer weight;

    private String password;

    private String salt;

    private String profile;

    private Integer gender;

    private String province;

    private String city;

    private Double longitude;

    private Double latitude;

    private Boolean isAuthentication;

    private Integer status;

    private Boolean hide;

    private Boolean status2;

    private Boolean hideGeo;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Boolean followStatus;

    private Boolean onlineStatus;

    private Long timestamp;
}