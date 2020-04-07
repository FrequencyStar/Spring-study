package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author 魏铭
 * @date 2020/3/30 - 19:58
 */
public class People {
    //如果显示定义了Autowired的require属性为false，说明这个对象可以为null，否则不允许为空
    //@Autowired(required = false)
    //@Qualifier(value = "cat1")

    @Resource(name = "cat2")
    private Cat cat;
    //@Autowired
    //@Qualifier(value = "dog1")
    @Resource
    private Dog dog;
    private String name;

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
