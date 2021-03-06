package com.xiuhao.StructuralPatterns.BridgePattern;

/**
 * 桥接模式
 * step2:创建实现了DrawApi接口的实体桥接实现类
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
