package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author 魏铭
 * @date 2020/4/1 - 14:54
 */
//等价于<bean id="user" class="com.kuang.pojo.User"/>
//@Component组件


@Component
@Scope("prototype")
public class User {
    //@Value("wm")相当于<property name="name" value="wm"/>
    //@Value("wm")
    public String name;
    @Value("wm")
    public void setName(String name) {
        this.name = name;
    }
}
