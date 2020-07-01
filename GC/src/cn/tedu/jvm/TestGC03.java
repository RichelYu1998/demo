package cn.tedu.jvm;

/*
*当GC系统没有启动时，对象可能被回收
* tips:JAVA中大多数对象都会存储在堆(Heap)中，但对于一些没有逃逸的小对象
* 现在也可能分配在栈上(JVM发展过程中的一种新的优化方式)
* */
public class TestGC03 {
    public static void main(String[] args) {
        for (int i = 0; i < 100000000; i++) {
            doMethod01();
        }
    }
    //static byte[] b2;
    static void doMethod01(){
        //小对象，未逃逸，栈上分配对象的对象。方法调用结束，对象销毁。
        byte[] b1 = new byte[1];//小对象，未逃逸，堆上分配，对象回收会借助GC
        //b2 = new byte[1];//小对象，但是逃逸了。对象分配在堆
    }
    //JDK8默认打开逃逸分析，希望未逃逸的小对象分配到栈上，这样避免启动逃逸分析
}
