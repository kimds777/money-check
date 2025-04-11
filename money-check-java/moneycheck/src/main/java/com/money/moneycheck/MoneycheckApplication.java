package com.money.moneycheck;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.money.moneycheck.mapper")
public class MoneycheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneycheckApplication.class, args);
	}

}
