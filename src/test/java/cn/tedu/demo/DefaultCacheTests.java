package cn.tedu.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultCacheTests {
    /*
    * @Autowired注解描述属性时，用于告诉spring框架，要为此属性注入一个值
    * has a
    * */
    @Autowired
    private DefaultCache defaultCache;//DI
    @Test
    public void testCache(){
        System.out.println("defaultCache="+defaultCache);//toString()
    }
    /*
    * 分析:
    * 1.假如15行输出defaultCache的值为null，可能的原因
    * 1)defaultCache属性上没有使用@Autowired相关注解描述(spring不认为这个属于)
    * 2)单元测试类上没有使用@SpringBootTest注解描述
    * 3)Test注解所在包检测是否有问题，测试类的位置是否有问题
    *
    * 2.假如单元测试中出现NoSuchBeanDefinitionException异常
    * 其类型为cn.tedu.pj.common.cache.DefaultCache这个bean对象找不到
    * 1）DefaultCache所在的包不在启动项所在包
    * 2)DefaultCache类不使用spring指定注解进行描述
    * */
}
