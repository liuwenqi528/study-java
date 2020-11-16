package com.java.study.design.abstractFactoryMode.factory;

import com.java.study.design.abstractFactoryMode.cpu.AmdCpu;
import com.java.study.design.abstractFactoryMode.cpu.Cpu;
import com.java.study.design.abstractFactoryMode.cpu.IntelCpu;
import com.java.study.design.abstractFactoryMode.mainboard.IntelMainboard;
import com.java.study.design.abstractFactoryMode.mainboard.Mainboard;

public class IntelFactory implements AbstractFactory{

    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }
}
