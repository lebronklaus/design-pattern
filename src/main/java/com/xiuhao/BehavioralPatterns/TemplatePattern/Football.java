package com.xiuhao.BehavioralPatterns.TemplatePattern;

/**
 * 模板模式
 * step2:创建扩展了上述类的实体类
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
