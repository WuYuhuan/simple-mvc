package org.simplemvc.web.bind.annotation;

import java.lang.annotation.*;

/**
 * Created by wuyuhuan on 2017/1/20.
 * Usage：
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
    String value() default "";
}
