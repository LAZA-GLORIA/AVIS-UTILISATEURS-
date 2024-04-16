package app.nosybe.avis.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ConfigSecurityApplication {

//    Depuis la version 3 de SP on a plus besoin d'heriter de la class WebSecurity ...
//    On déclare des bean pour la configuration de Spring security
//    Un bean c'est une class public que l'on peut instancier

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    return httpSecurity.csrf(AbstractHttpConfigurer::disable)
            .authorizeHttpRequests(
                    authorize -> authorize.requestMatchers(HttpMethod.POST, "/inscription").permitAll()
                            .anyRequest().authenticated()
                    )
            .build();
    }
//    et Spring va injecter un httpSecurity et configurer la securité avec

}
