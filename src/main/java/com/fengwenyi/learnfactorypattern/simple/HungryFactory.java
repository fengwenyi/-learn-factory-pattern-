package com.fengwenyi.learnfactorypattern.simple;

import com.fengwenyi.learnfactorypattern.simple.impl.Noodle;
import com.fengwenyi.learnfactorypattern.simple.impl.Rice;
import com.fengwenyi.learnfactorypattern.simple.jk.Hungry;

/**
 * 饥饿工厂
 * @author Erwin Feng
 * @since 2019-05-30 23:49
 */
public class HungryFactory {

    /**
     * 产生饥饿。。。
     * @param food
     * @return
     */
    public static Hungry getHungry(String food) {
        Hungry hungry = null;
        if ("rice".equals(food))
            hungry = new Rice();
        else if ("noodle".equals(food))
            hungry = new Noodle();
        return hungry;
    }

}
