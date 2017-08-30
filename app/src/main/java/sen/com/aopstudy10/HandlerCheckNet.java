package sen.com.aopstudy10;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Created by Administrator on 2017/8/30.
 * 处理切点
 */
@Aspect
public class HandlerCheckNet {
    /**
     * 找到要处理的切点
     * * *(..) 可以处理所有的方法
     */
    @Pointcut("execution(@sen.com.aopstudy10.CheckNet * *(..))")
    public void handlerCheckNet() {

    }
    @Around("handlerCheckNet()")
    public Object checkNet(ProceedingJoinPoint joinPoint) throws Throwable {
        // 获取CheckNet 注解
        //1.获取方法签名
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        CheckNet checkNet =methodSignature.getMethod().getAnnotation(CheckNet.class);
        if(checkNet !=null){
            //如果没有网 直接,就不会执行下面代码
            /**
             * joinPoint.getThis();
             * 获取当前的切点的类，有可能是Activity Fragment
             * view 或者是工具类，如果在想在Mvp 使用Concext
             * 需要想办法拿到concext
             */


            return null;
        }
        return joinPoint.proceed();
    }


}
