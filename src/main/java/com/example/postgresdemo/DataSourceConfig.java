package com.example.postgresdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import com.yugabyte.YBClusterAwareDataSource;

@Configuration
public class DataSourceConfig {

  @Bean
  public DataSource getDataSource() {
    String jdbcUrl = "jdbc:postgresql://127.0.0.1:5433/postgres";
    return new YBClusterAwareDataSource(jdbcUrl);
  }
}