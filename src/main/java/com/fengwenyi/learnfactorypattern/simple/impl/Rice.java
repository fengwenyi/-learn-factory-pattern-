package com.fengwenyi.learnfactorypattern.simple.impl;

import com.fengwenyi.learnfactorypattern.simple.jk.Hungry;
import net.iutil.javalib.util.PrintUtils;

/**
 * @author Erwin Feng
 * @since 2019-05-30 23:45
 */
public class Rice implements Hungry {
    public void eat() {
        PrintUtils.info("吃米饭");
    }
}
