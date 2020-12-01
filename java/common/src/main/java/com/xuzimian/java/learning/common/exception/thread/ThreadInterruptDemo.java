package com.xuzimian.java.learning.common.exception.thread;

/**
 * https://www.jianshu.com/p/9811a1089783
 */
public class ThreadInterruptDemo {

    public static void main(String[] args) {
        System.out.println("初始中断状态：" + Thread.currentThread().isInterrupted());
        System.out.println("终止当前线程...");
        Thread.currentThread().interrupt();
        System.out.println("执行完interrupt方法后，中断状态：" + Thread.currentThread().isInterrupted());

        System.out.println();
        System.out.println("首次调用interrupted方法返回结果：" + Thread.currentThread().interrupted());
        System.out.println("此时中断状态：" + Thread.currentThread().isInterrupted());
        System.out.println("第二次调用interrupted方法返回结果：" + Thread.currentThread().interrupted());
        System.out.println("此时中断状态：" + Thread.currentThread().isInterrupted());

        System.out.println();
        System.out.println("再次调用interrupt");
        Thread.currentThread().interrupt();
        System.out.println("再调用interrupted方法返回结果：" + Thread.currentThread().interrupted());
        System.out.println("此时中断状态：" + Thread.currentThread().isInterrupted());
    }
}
