package com.cloud.gcp.cloudsql.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBConfig {

    @Bean
    DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:mysql://34.131.47.73:3306/testdb");
        builder.username("root");
        builder.password("password");
        builder.driverClassName("com.mysql.cj.jdbc.Driver");
        return builder.build();
    }
}
