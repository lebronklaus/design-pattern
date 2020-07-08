package com.xiuhao.StructuralPatterns.BridgePattern;

/**
 * 桥接模式
 * step1:创建桥接实现接口
 */
public interface DrawApi {
    void drawCircle(int radius, int x, int y);
}
