package com.java.study.design.abstractFactoryMode.factory;

import com.java.study.design.abstractFactoryMode.cpu.Cpu;
import com.java.study.design.abstractFactoryMode.mainboard.Mainboard;

public interface AbstractFactory {

    /**
     * 创建CPU
     * @return
     */
    Cpu createCpu();

    /**
     * 创建主板
     * @return
     */
    Mainboard createMainboard();

    //创建其它零件（内存条、硬盘、等等）
}
