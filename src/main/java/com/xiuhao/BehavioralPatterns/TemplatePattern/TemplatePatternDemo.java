package com.xiuhao.BehavioralPatterns.TemplatePattern;

/**
 * 模板模式
 * step3:使用 Game 的模板方法 play() 来演示游戏的定义方式
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game football = new Football();
        football.play();
        System.out.println("------------");
        Game cricket = new Cricket();
        cricket.play();
    }
}
