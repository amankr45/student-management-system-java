package com.aman.studentmanagementsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@ComponentScan("com.aman.studentmanagementsystem")
@PropertySource("classpath:database.properties")
public class AppConfig {

    private final Environment environment;

    public AppConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(
                Objects.requireNonNull(environment.getProperty("db.driver"))
        );

        dataSource.setUrl(
                environment.getProperty("db.url")
        );

        dataSource.setUsername(
                environment.getProperty("db.username")
        );

        dataSource.setPassword(
                environment.getProperty("db.password")
        );

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}