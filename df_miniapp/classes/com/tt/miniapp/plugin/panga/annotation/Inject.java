package com.tt.miniapp.plugin.panga.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
public @interface Inject {
  boolean force() default true;
}


/* Location:              C:\Users\august\Desktop\tik\df_miniapp\classes.jar!\com\tt\miniapp\plugin\panga\annotation\Inject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */