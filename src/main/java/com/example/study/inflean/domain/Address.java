package com.example.study.inflean.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

/**
 * value Type
 * JPA 스펙상 엔티티나 임베디드 타입( @Embeddable )은
 * 자바 기본 생성자(default constructor)를 public 또는 protected 로 설정해야 한다!
 */
@Embeddable
@Getter
@Setter
public class Address {

    String city;
    String street;
    String zipcode;

    protected Address() {

    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;

    }
}
