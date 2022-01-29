package com.yzh.market;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yzh.market.mapper")
public class SecondMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondMarketApplication.class, args);
	}

}
