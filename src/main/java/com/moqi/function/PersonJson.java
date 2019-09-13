package com.moqi.function;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.moqi.bean.Person;

/**
 * @author wenbo17
 * On 8/27/19 17:25
 */

public class PersonJson {

    public static void main(String[] args) {

        String text = "{\"address\": \"beijing\"}";

        Person defaultPerson = JSON.parseObject(text, Person.class);
        String name = defaultPerson.getName();
        System.out.println("name = " + name);

        Person person = JSON.parseObject(text, Person.class, Feature.InitStringFieldAsEmpty);
        String extendName = person.getName();
        System.out.println("extendName = " + extendName);
        if ("".equals(extendName)) {
            System.out.println("字符串设定为空");
        }
    }

}
