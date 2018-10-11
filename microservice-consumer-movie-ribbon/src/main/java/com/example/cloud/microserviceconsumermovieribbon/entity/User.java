package com.example.cloud.microservicesimpleconsumermovie.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author zhumingli
 */
@Data
public class User {
  private Long id;

  private String username;

  private String name;

  private Short age;

  private BigDecimal balance;



}
