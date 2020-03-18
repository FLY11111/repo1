package com.itheima.utils;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {

    public void beforePrintLog(){
        System.out.println("前Logger类中的beforePrintLog方法来说记录日志了。。。。");
    }

    public void afterReturnPrintLog(){
        System.out.println("后Logger类中的afterReturnPrintLog方法来说记录日志了。。。。");
    }

    public void afterThrowingPrintLog(){
        System.out.println("异常Logger类中的afterThrowingPrintLog方法来说记录日志了。。。。");
    }

    public void afterPrintLog(){
        System.out.println("最终Logger类中的afterPrintLog方法来说记录日志了。。。。");
    }

    public Object aroundPringLog(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try{
            Object[] args = pjp.getArgs();
            System.out.println("arround....qian");
            rtValue = pjp.proceed();
            System.out.println("arround....hou");
            return rtValue;
        }catch (Throwable t){
            System.out.println("arround....yichang");
               throw new RuntimeException(t);
        }finally {
            System.out.println("arround....zuizhong");
        }

    }
}
