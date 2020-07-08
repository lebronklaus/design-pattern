package com.xiuhao.StructuralPatterns.ProxyPattern;

/**
 * 代理模式
 * step3:当被请求时，使用 ProxyImage 来获取 RealImage 类的对象
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        //从磁盘加载
        image.display();
        System.out.println("----------------");
        //不需要从磁盘加载
        image.display();
    }
}
