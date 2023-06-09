package com.carrotmarket.domain;

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

    @ManyToOne
    @JoinColumn(name= "id")
    @Column(name = "neibor1", nullable = true)
    private Location neighbor1;

    @ManyToOne
    @JoinColumn(name= "id")
    @Column(name = "neibor2", nullable = true)
    private Location neighbor2;


}
