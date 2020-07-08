package com.xiuhao.BehavioralPatterns.StrategyPattern;

/**
 * 策略模式
 * step3:创建Context类
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
