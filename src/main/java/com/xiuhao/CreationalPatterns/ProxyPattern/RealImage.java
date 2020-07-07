package com.xiuhao.CreationalPatterns.ProxyPattern;

/**
 * 代理模式
 * step2:创建实现接口的实体类
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("loading " + fileName);
    }
}
