package cn.hacz.edu.service;

import cn.hacz.edu.properties.CarProperties;

/**
 * project - GitHub整理
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/2/26 时间:9:44
 * @JDK 1.8
 * @Description 功能模块：
 */
public class CarService implements GoAble {
    private CarProperties properties;

    public CarService(CarProperties properties) {
        this.properties = properties;
    }

    public CarService() {

    }

    public int getCarPrice() {
        return properties.getPrice();
    }

    public int getCarWeight() {
        return properties.getWeight();
    }

    @Override
    public int go() {
        return properties.getWeight();
    }
}
