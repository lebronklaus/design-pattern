package com.xiuhao.BehavioralPatterns.TemplatePattern;

/**
 * 模板模式
 * step2:创建扩展了上述类的实体类
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
