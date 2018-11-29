package com.example.demo.apollo;


import com.google.common.base.Charsets;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Configuration
@EnableApolloConfig
@ComponentScan(basePackages = { "com.example.*" }) // 将该包下的文件纳入容器中
@EnableAutoConfiguration
public class ApolloDemo {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApolloDemo.class, args);

        SimpleApolloConfigDemo apolloConfigDemo = new SimpleApolloConfigDemo();
        System.out.println(
                "Apollo Config Demo. Please input key to get the value. Input quit to exit.");
        while (true) {
            System.out.print("> ");
            String input = new BufferedReader(new InputStreamReader(System.in, Charsets.UTF_8)).readLine();
            if (input == null || input.length() == 0) {
                continue;
            }
            input = input.trim();
            if (input.equalsIgnoreCase("quit")) {
                System.exit(0);
            }
            apolloConfigDemo.getConfig1(input);
        }
    }
}
