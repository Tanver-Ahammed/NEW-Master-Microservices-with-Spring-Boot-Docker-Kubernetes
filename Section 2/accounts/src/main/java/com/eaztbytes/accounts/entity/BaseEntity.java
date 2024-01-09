package com.eaztbytes.accounts.entity;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class BaseEntity {

    @Column(updatable = false)
    private LocalDate createdDate;

    @Column(updatable = false)
    private String createdAt;

    @Column(insertable = false)
    private LocalDate updatedAt;

    @Column(insertable = false)
    private String updatedBy;

}
