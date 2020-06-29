package cn.tedu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* 由此注解（@SpringBootApplication）描述的类为springboot项目的启动入口类
* 1)springboot只有一个
* 2)springboot项目的入口需要@SpringBootApplication
* FAQ:
* 1）需要做的事情
* a)加载类(将类的信息从磁盘读到内存)：线程+IO
* b)创建字节码对象(其类型为Class类型)用于存储类的字节码信息
* c)基于字节码对象获取类上的注解信息，判定此类是否要交给spring管理
* d)假如是交给spring管理的对象，spring框架会创建其对象然后赋予其特性
* e)基于配置文件以及springboot提供的自动配置对对象进行初始化应用
*
* 2)验证启动类在启动时加载的类(基于jvm参数进行分析)
* a)类加载过程分析参数：-XX:+TraceClassLoading
*
* 3)在springboot中我们自己的Java业务代码所在位置
* a)所有的业务代码写到src/main/java目录中启动类所在包中
* b)将这些类使用特定注解进行描述(@Controller,@Service)
*
* 4)在springboot中我们自己的业务测试代码所在位置
* a)所有测试代码写在src/test/java目录中启动类所在包
* b)所有测试类使用@SpringBootTest注解进行描述
* c)所有测试方法使用org.junit.jupiter.api的包
* */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {//main方法运行在主线程
        SpringApplication.run(DemoApplication.class, args);
    }

}
