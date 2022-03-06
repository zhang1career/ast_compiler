package lab.zhang.risk.ast_compiler.annotation;

import java.lang.annotation.*;


/**
 * @author zhangrj
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Routing {
//    String source() default "";
//    Class<?>[] uses() default { };
}
