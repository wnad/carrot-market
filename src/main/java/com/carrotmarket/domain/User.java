package com.carrotmarket.domain;


import com.carrotmarket.dto.user.UserDto;
import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "profile_img", nullable = true)
    private String profileImg;

    @Column(name = "profile_nickname", nullable = true)
    private String profileNickname;

    @Column(name = "manner_temperature", nullable = false)
    private Double mannerTemperature;

    @Column(name = "login_id", nullable = false)
    private String loginId;

    @Column(name = "login_pwd", nullable = false)
    private String loginPwd;

    @Column(name = "neibor1", nullable = true)
    private Long neighbor1;

    @Column(name = "neibor2", nullable = true)
    private Long neighbor2;

    public UserDto.Response toDto() {
        return UserDto.Response.builder()
                .profileImg(this.profileImg)
                .profileNickname(this.profileNickname)
                .mannerTemperature(this.mannerTemperature)
                .loginId(this.loginId)
                .loginPwd(this.loginPwd)
                .build();
    }

}
