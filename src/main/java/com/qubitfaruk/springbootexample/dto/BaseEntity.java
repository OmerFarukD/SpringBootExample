package com.qubitfaruk.springbootexample.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_by")
    @CreatedBy
    private String createdBy;

    @Column(name = "created_date")
    @CreatedDate
    private Date createdDate;

    @Column(name = "updated_by")
    @LastModifiedBy
    private String updatedBy;
    @LastModifiedDate
    @Column(name = "updated_date")
    private Date uptatedDate;

    @Column(name = "system_auto_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date date;



}
