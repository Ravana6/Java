package com.josh.aop.methodwithanymethodinpackage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.josh.aop.methodwithanymethodinpackage")
public class DemoConfig {

}
