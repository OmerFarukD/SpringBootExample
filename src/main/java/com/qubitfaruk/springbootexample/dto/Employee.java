package com.qubitfaruk.springbootexample.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
@Entity
@Table(name = "employees")
public class Employee extends BaseEntity implements Serializable {
    private String firstName;
    private String lastName;
    private String email;


}
