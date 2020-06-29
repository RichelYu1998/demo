package cn.tedu.pj.common.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultCacheTests {
    /*
    * @Autowired注解描述属性时，用于告诉spring框架，要为此属性注入一个值
    * */
    @Autowired
    private DefaultCache defaultCache;//DI
    @Test
    public void testCache(){
        System.out.println(defaultCache);
    }
}
