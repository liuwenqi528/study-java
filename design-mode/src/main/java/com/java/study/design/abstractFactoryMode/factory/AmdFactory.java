package com.java.study.design.abstractFactoryMode.factory;

import com.java.study.design.abstractFactoryMode.cpu.AmdCpu;
import com.java.study.design.abstractFactoryMode.cpu.Cpu;
import com.java.study.design.abstractFactoryMode.mainboard.AmdMainboard;
import com.java.study.design.abstractFactoryMode.mainboard.IntelMainboard;
import com.java.study.design.abstractFactoryMode.mainboard.Mainboard;

public class AmdFactory implements AbstractFactory{

    @Override
    public Cpu createCpu() {
        return new AmdCpu(985);
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard(985);
    }
}
