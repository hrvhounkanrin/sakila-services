package io.sakila.actor.config;


import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.r2dbc.spi.ConnectionFactory;
import org.jooq.*;
import org.jooq.impl.DSL;;

public class JooqConfig {

    @Bean
    public DSLContext dslContext(R2dbcProperties r2dbcProperties) {
        ConnectionFactory connectionFactory = new PostgresqlConnectionFactory(PostgresqlConnectionConfiguration.builder()
                .host(r2dbcProperties.getUrl())
                .username(r2dbcProperties.getUsername())
                .password(r2dbcProperties.getPassword())
                .build());

        return DSL.using(connectionFactory);
    }
}