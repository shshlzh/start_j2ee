package com.xuyuan.j2ee.ioc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 应用在action 实例化
 * @author ajun
 * @http://blog.csdn.net/ajun_studio
 */
@Target(ElementType.TYPE) 
@Retention(RetentionPolicy.RUNTIME)  
@Documented  
@Inherited  
public @interface Action {

	public String value() default "";
	
}
