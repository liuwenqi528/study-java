package com.java.study.design.abstractFactoryMode;

import com.java.study.design.abstractFactoryMode.cpu.Cpu;
import com.java.study.design.abstractFactoryMode.factory.AbstractFactory;
import com.java.study.design.abstractFactoryMode.mainboard.Mainboard;

public class ComputeEngine {

    /**
     * 定义装机使用的CPU
     */
    private Cpu cpu = null;

    /**
     * 定义装机使用的主板
     */
    private Mainboard mainboard = null;

    //定义装机使用的其它零部件对象


    /**
     * 组装机器过程
     * @param af
     */
    public void makeComputer(AbstractFactory af){
        /**
         * 组装机器的基本步骤
         */
        //1:首先准备好装机所需要的配件
        prepareHardwares(af);
        //2:组装机器(略)
        //3:测试机器(略)
        //4:交付客户(略)
    }
    private void prepareHardwares(AbstractFactory af){
        //这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
        //可是，装机工程师并不知道如何去创建，怎么办呢？

        //直接找相应的工厂获取
        this.cpu = af.createCpu();
        this.mainboard = af.createMainboard();

        //测试配件是否好用
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
