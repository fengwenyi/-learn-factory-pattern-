package com.fengwenyi.learnfactorypattern.simple.impl;

import com.fengwenyi.learnfactorypattern.simple.jk.Hungry;
import net.iutil.javalib.util.PrintUtils;

/**
 * @author Erwin Feng
 * @since 2019-05-30 23:48
 */
public class Noodle implements Hungry {
    public void eat() {
        PrintUtils.info("吃面条");
    }
}
