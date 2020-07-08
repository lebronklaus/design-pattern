package com.xiuhao.StructuralPatterns.BridgePattern;

/**
 * 桥接模式
 * step3:使用DrawApi接口创建抽象类Shape
 */
public abstract class Shape {
    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
