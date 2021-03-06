package org.infinity.passport.annotation;

import org.infinity.passport.config.ApplicationConstants;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DistributedLock {

    String AROUND = "@annotation(" + ApplicationConstants.BASE_PACKAGE + ".annotation.DistributedLock)";

    /**
     * Expiration
     *
     * @return
     */
    long expiration() default 30;

    /**
     * Time Unit
     *
     * @return
     */
    TimeUnit timeUnit() default TimeUnit.SECONDS;


    /**
     * Decide whether need to release lock after execution
     *
     * @return
     */
    boolean requireReleaseLock() default true;
}