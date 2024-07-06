package com.random.joke.config;

import org.jline.terminal.Terminal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.shell.command.CommandRegistration;

@Configuration
public class ShellConfiguration {

//    @Bean
//    public Terminal terminal() {
//        return CommandRegistration.builder()
//                .command("example")
//                .withTarget()
//                .consumer(ctx -> {
//                    ctx.getTerminal().writer().println("Hello");
//                    ctx.getTerminal().writer().flush();
//                })
//                .and()
//                .build();
//    }

}
