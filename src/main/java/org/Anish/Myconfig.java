package org.Anish;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {

     @Bean
    public Student getStudent() {
         System.out.println("Creating a object of the bean Method");
          return new Student();
      }
    @Bean
    public Appling getAppling() {
         System.out.println("Creating new Appling in SpringBoot");
         return new Appling();
    }


}
