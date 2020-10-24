package com.posco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan( "inventory.entity" )
@EnableJpaRepositories( basePackages = { "inventory.model.dao" } )
@ComponentScan( { "inventory.controller" } )
@EnableAutoConfiguration
@SpringBootApplication
public class MiniProjectJeongHyeonApplication {

	public static void main( String[] args ) {
		SpringApplication.run( MiniProjectJeongHyeonApplication.class, args );
	}

}
