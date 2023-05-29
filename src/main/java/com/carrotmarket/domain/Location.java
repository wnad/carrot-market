package com.carrotmarket.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "location")
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "do", nullable = false)
    private String doo;

    @Column(name = "si", nullable = false)
    private String si;

    @Column(name = "gu", nullable = false)
    private String gu;

    @Column(name = "dong", nullable = false)
    private String dong;


}
