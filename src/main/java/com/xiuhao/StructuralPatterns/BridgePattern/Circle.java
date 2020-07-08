package com.xiuhao.StructuralPatterns.BridgePattern;

/**
 * 桥接模式
 * step4:创建实现了Shape接口的实体类
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawApi drawApi){
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(){
        drawApi.drawCircle(radius,x,y);
    }


}
