package com.qubitfaruk.springbootexample.bean;

import com.qubitfaruk.springbootexample.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
     @Bean(initMethod = "initialBeanMetodu",destroyMethod = "destroyBeanMethod")
     @Scope("singleton")
    public BeanDto beanDto(){
        return BeanDto.builder().id(0L).beanName("Bean Adı").beanData("Bean Data").build();
    }
}
