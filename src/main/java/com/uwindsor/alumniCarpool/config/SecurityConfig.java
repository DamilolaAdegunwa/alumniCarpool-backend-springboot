//package com.uwindsor.alumniCarpool.config;
//import com.uwindsor.alumniCarpool.repository.UserRepository;
//import com.uwindsor.alumniCarpool.service.user.UserDetailsServiceImpl;
//import com.uwindsor.alumniCarpool.service.user.UserService;
//import com.uwindsor.alumniCarpool.service.user.UserServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
////import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
////import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
///**
// * Created by Suo Tian on 2018/10/16.
// */
//
////@EnableWebSecurity
////public class SecurityConfigOld  extends WebSecurityConfigurerAdapter {
//////    @Autowired
//////    MyUserDetailsService myUserDetailsService;
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http
////            .csrf().disable()
////            .authorizeRequests()
////                .antMatchers("/js/**","/css/**","/fonts/**","/images/**","/login", "/", "/logout").permitAll();//resources,static,templates,public下面是系统默认的静态资源搜索路径
////            //.anyRequest().authenticated()//要求访问应用的所有用户都要被验证
//////                .and()
//////            .formLogin()
//////                .loginProcessingUrl("/login")
//////                .loginPage("/login").successForwardUrl("/user").permitAll()
//////                .and()
//////                .logout().logoutSuccessUrl("/login");
////}
////    @Autowired
////    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
////        /*
////        * 多种方式的authenticate, 参考https://www.programcreek.com/java-api-examples/index.php?api=org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
////        * UserDetails(查询数据库得到用户名相对应的密码和权限塞到这个对象中) - UserDetailsService - AuthenticationManager(AuthenticationProvider列表中的每一个AuthenticationProvider依次验证 - 实现类ProviderManager，例如代码中的AuthenticationManagerBuilder auth，auth中存储的是http请求中的用户名和密码信息) - 验证成功后填充到Authentication对象-存储在SecurityContext（HttpSession的一个属性）中。其中AuthenticationManager之后的步骤都是Spring boot框架封装好的。
////        */
////        //auth.userDetailsService(myUserDetailsService).passwordEncoder(passwordEncoder());
//////        auth.inMemoryAuthentication().withUser("admin").password(encodePassword("admin")).roles("admin");
////    }
////    @Bean
////    public static PasswordEncoder passwordEncoder() {
////        return new BCryptPasswordEncoder();
////    }
////}
//
////@EnableWebSecurity
//@Configuration
//public class SecurityConfig //extends AuthenticationConfiguration
//{
//
//    //@Autowired
//    //private UserDetailsServiceImpl userDetailsService;
//    
//    //@Autowired
//    //private UserService userService;
//    
//    //@Autowired
//    //private UserRepository repository;
//
//    //@Autowired
//    private PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//
//    //@Override
////    public void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth
////            .userDetailsService(null)
////            .passwordEncoder(passwordEncoder);
////    }
//    
////     @Bean
////     public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
////         return authenticationConfiguration.getAuthenticationManager();
////     }
//    
//    // @Bean
//    // public PasswordEncoder passwordEncoder()
//    // {
//        // return new BCryptPasswordEncoder();
//    // }
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//            //return null;
//            return passwordEncoder;
//            //return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//	}
//        
//    /**
//     *
//     * @return
//     */
////    @Bean
////        public UserService userService()
////        {
////            return null;
////        }
//        
////        @Bean
////        public UserDetailsServiceImpl UserDetailsServiceImpl()
////        {
////            return null;
////        }
//        @Bean
//        public UserDetailsService userDetailsService()
//        {
//            return new UserDetailsServiceImpl();
//        }
//        
////        @Bean
////        public UserService userService() 
////        {
////            // Implement the UserService interface or inject the required dependencies to create an instance of the UserService class
////            return new UserServiceImpl(); // Replace UserServiceImpl with the actual implementation of the UserService interface
////        }
//        //---
//        @Bean
//        public UserService userService()
//        {
//            return new UserServiceImpl();
//        }
//
////        @Bean
////        public UserRepository userRepository()
////        {
////            return null;//new UserJpaRepository(); // Replace UserJpaRepository with the actual implementation of the UserRepository interface
////        }
//}