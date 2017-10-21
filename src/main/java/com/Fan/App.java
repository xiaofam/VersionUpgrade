package com.Fan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
/**
 * Created by Fan on 17/10/17.
 */

@SpringBootApplication
@MapperScan("com.Fan") //use com.Fan.* if there is package under Fan
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}
