package com.java.study.design.factoryMethodMode;

/**
 * 工厂接口
 */
public interface ExportFactory {
    ExportFile factory(String type);
}
