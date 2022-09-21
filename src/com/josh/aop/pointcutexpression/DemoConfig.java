package com.josh.aop.pointcutexpression;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.josh.aop.pointcutexpression")
public class DemoConfig {

}
