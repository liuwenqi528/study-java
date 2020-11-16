package com.java.study.design.factoryMethodMode;

public class Test {

    /**
     * @param args
     * 客户端创建ExportHtmlFactory对象，
     * 这时客户端所持有变量的静态类型为ExportFactory，
     * 而实际类型为ExportHtmlFactory。
     * 然后客户端调用ExportHtmlFactory对象的工厂方法factory()，
     * 接着后者调用ExportFinancialHtmlFile的构造子创建出导出对象。
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String data = "";
        ExportFactory exportFactory = new ExportPdfFactory();
        ExportFile ef = exportFactory.factory("standard");
        ef.export(data);
    }

}