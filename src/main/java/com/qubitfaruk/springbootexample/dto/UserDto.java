package com.qubitfaruk.springbootexample.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Log4j2
public class UserDto {
    private Long userId;
    @NotEmpty(message = "kullanıcı adı boş olamaz.")
    @Size(min = 3,max = 20)
    private String userName;
    @NotEmpty(message = "emailiniz boş olmamalı.")
    @Email
    private String email;
    @NotEmpty(message = "şifre boş olamaz.")
    private String password;
}
