package com.example.cloud.microservicesimpleprovideruser.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zhumingli
 * @create 2018-10-08 下午9:59
 * @desc
 **/
@Entity
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 8939280544339137933L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private Short age;

    @Column
    private BigDecimal balance;
}
