package cn.tedu.jvm;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

class Container{
    private Object[] array;
    public Container(int cap){
        this.array= new Object[cap];
    }
    @Override
    protected void finalize() throws  Throwable{
        System.out.println("finalize");
    }
}
/*
* 在JAVA中我们可以使用的对象应用方式
* 1)强引用：引用时生命力最强，不会GC
* 2)软引用：引用时只有在内存不足时会被GC
* 3)弱引用：引用时触发GC时会被销毁
* 4)虚引用：最少使用，几乎没有引用，主要用于对象销毁的记录
*
* 缓存常用来引用"软/弱"
* */
public class TestGC02 {

    public static void main(String[] args) {
       /* new Container(200);*/
       /* //1.强引用
        Container c1 = new Container(100);
        c1=null;//此时c1指向的Container对象不可达*/
        //2.软引用
       /* SoftReference(Container) c2=new SoftReference<Container>(new Container(100));
        Container c3=c2.get();//这个就是软引用进行转换为强引用
        System.out.println(c2.get());//通过软引用获取个操作对象*/
        //3.弱引用
        WeakReference<Container> c3 = new WeakReference<>(new Container(100));
        System.out.println(c3.get());
        //手动GC
        System.gc();//GC启动后，GC系统会对内存中的对象进行可达性分析，访问不到进行标记
        //手动设置内存不足
        List<byte[]> list = new ArrayList<>();
        for (int i=0;i<10000;i++) {
            list.add(new byte[1024]);
        }
    }
}
