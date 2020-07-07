package com.xiuhao.BehavioralPatterns.TemplatePattern;

/**
 * 模板模式
 * step1:创建一个抽象类，它的模板方法被设置为final
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){
        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
