package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{
    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
        new SpringApplicationBuilder(App.class).run(args);
    }

    @Bean
    public CommandLineRunner test(ApplicationContext ac){
        return args ->{
        };
    }

    @Bean
    public CommandLineRunner testRedisDemo1(RedisTemplate<String,String> redisTemplate){
        return args->{
            ValueOperations<String, String> stringStringValueOperations = redisTemplate.opsForValue();
            stringStringValueOperations.set("age","24");
        };
    }


}
