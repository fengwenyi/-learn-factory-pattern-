package com.fengwenyi.learnfactorypattern;

import com.fengwenyi.learnfactorypattern.simple.HungryFactory;
import com.fengwenyi.learnfactorypattern.simple.jk.Hungry;

/**
 * @author Erwin Feng
 * @since 2019-05-30 23:54
 */
public class AppSimple {

    public static void main(String[] args) {
        Hungry hungry = HungryFactory.getHungry("rice");
        hungry.eat();
        hungry = HungryFactory.getHungry("noodle");
        hungry.eat();
    }

}
