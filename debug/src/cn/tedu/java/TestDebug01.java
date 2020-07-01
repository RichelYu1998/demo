package cn.tedu.java;

/*
* JAVA中的断点过程分析
* idea debug快捷键
    F9            resume programe 恢复程序
    Alt+F10       show execution point 显示执行断点
    F8            Step Over 相当于eclipse的f6      跳到下一步
    F7            Step Into 相当于eclipse的f5就是  进入到代码
    Alt+shift+F7  Force Step Into 这个是强制进入代码
    Shift+F8      Step Out  相当于eclipse的f8跳到下一个断点，也相当于eclipse的f7跳出函数
    Atl+F9        Run To Cursor 运行到光标处
    ctrl+shift+F9   debug运行java类
    ctrl+shift+F10  正常运行java类
    alt+F8          debug时选中查看值

* */
public class TestDebug01 {
    static void doMethod01(){
        System.out.println("method01");
    }
    static void doMethod02(){
        System.out.println("method02");
    }
    static void doMethod03(){
        System.out.println("method03");
    }
    public static void main(String[] args) {
        System.out.println("main()");
        doMethod01();
    }
}
