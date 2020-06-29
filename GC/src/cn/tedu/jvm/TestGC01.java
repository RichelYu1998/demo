package cn.tedu.jvm;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestGC01 {
    static class Point{
        int x,y;
        public Point(int x,int y){
            this.x=x;
            this.y=y;
        }
        protected void finalize() throws Throwable{
            System.out.println("finalize");
        }
    }
        static Map<String, Object> objectPool=new HashMap<>();
        public static void main(String[] args) {
            //构建一个实力对象,并通过p1引用只想这个对象
            Point p1 = new Point(10,20);
            objectPool.put("point",p1);
            p1=null;
            objectPool.clear();
            /**
             * Q 请问对于p1引用的这个对象何时会被标识垃圾对象,何时会被回收,如何确定此对象回收了
             * A 当p1引用不再指向构建的Point对象时,此对象会被GC系统认为是垃圾对象
             *   当JVM系统触发了GC操作时,对象可能会被回收
             *   此对象会被JVM中的垃圾回收系统(GC)回收.(释放内存)
             *   触发GC
             *   访问此对象(不引用就是垃圾)
             */
            //触发GC操作
            //手动GC
            /*System.gc();*/
            //2.自动GC
            List<byte[]> list=new ArrayList<>();
            for (int i = 0; i < 10000; i++) {
                list.add(new byte[1024]);
            }
        }
    }
