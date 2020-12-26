package com.sang.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sang.controller.UserController;
import com.sang.po.User;
import com.sang.service.UserService;
import com.sang.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.session.ConcurrentSessionControlAuthenticationStrategy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/","/loginPage","/register","/community/**").permitAll()//允许所有人访问
                .anyRequest().authenticated()
                .and()
                //formLogin指表单登录，可以通过.loginPage("/请求")来自定义“/登录”页面
                .formLogin()
                .loginProcessingUrl("/login")
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                        HttpSession session = httpServletRequest.getSession();
                        String username = httpServletRequest.getParameter("username");
                        session.setAttribute("username",username);
                        String json="";
                        ObjectMapper objectMapper = new ObjectMapper();
                        json = objectMapper.writeValueAsString(new Result(0,"success!!",null));
                        PrintWriter printWriter = httpServletResponse.getWriter();
                        printWriter.print(json);
                        printWriter.flush();
                        printWriter.close();
                    }
                })
                .failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
                        String json="";


                        String username = httpServletRequest.getParameter("username");
                        System.out.println(username);
                        ObjectMapper objectMapper = new ObjectMapper();
                        json = objectMapper.writeValueAsString(new Result(1,"登陆失败!",null));
                        PrintWriter printWriter = httpServletResponse.getWriter();
                        printWriter.print(json);
                        printWriter.flush();
                        printWriter.close();
                    }
                })
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and()
                .csrf().disable();

    }

    @Autowired
    UserService userService;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());

    }
}
