package com.carrotmarket.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "ctegory", nullable = false)
    private String category;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "product_status", nullable = false)
    private Integer productStatus;

    @ManyToOne
    @JoinColumn(name = "id")
    @Column(name = "seller", nullable = false)
    private User seller;

    @ManyToOne
    @JoinColumn(name = "id")
    @Column(name = "location", nullable = false)
    private Location location;

    @Column(name = "write_date", nullable = false)
    private LocalDate writeDate;

}
