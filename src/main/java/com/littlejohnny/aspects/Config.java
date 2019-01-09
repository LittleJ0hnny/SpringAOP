package com.littlejohnny.aspects;

import com.littlejohnny.aspects.components.IUser;
import com.littlejohnny.aspects.components.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com/littlejohnny/aspects"})
@EnableAspectJAutoProxy
public class Config {
    @Bean
    public IUser user() {
        User user = new User();
        user.setName("Valera");
        return user;
    }
}
