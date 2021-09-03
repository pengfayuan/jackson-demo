package com.yuanyuan.jacksondemo.annotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yuanyuan.jacksondemo.enums.SexEnum;
import com.yuanyuan.jacksondemo.model.Accounting;
import com.yuanyuan.jacksondemo.model.BillRequest;
import com.yuanyuan.jacksondemo.model.Person;
import com.yuanyuan.jacksondemo.model.Programmer;
import com.yuanyuan.jacksondemo.model.Student;
import com.yuanyuan.jacksondemo.model.Teacher;

/**
 * @author FAYUAN.PENG
 * @version \$Id: AnnotationDemo.java,  2021-08-15 15:35 FAYUAN.PENG Exp $$
 */
public class AnnotationDemo {

    private ObjectMapper mapper = new ObjectMapper();

    public void testJsonProperty() throws JsonProcessingException {
        Person person = new Person();
        person.setName("yuanyuan");

        // {"holdName":"yuanyuan"}
        System.out.println("json：" + mapper.writeValueAsString(person));
    }

    public void testJsonIgnore() throws JsonProcessingException {
        Person person = new Person();
        person.setName("yuanyuan");
        person.setInternalIncome(10000);

        // {"holdName":"yuanyuan"}
        System.out.println("json：" + mapper.writeValueAsString(person));

        String json = "{\"internalIncome\":10000,\"holdName\":\"yuanyuan\"}";

        // Person(name=yuanyuan, internalIncome=null)
        System.out.println("pojo：" + mapper.readValue(json, Person.class));
    }

    public void testJsonCreator() throws JsonProcessingException {
        String json = "{\"name\":\"yuanyuan\"}";

        // Student(name=yuanyuan)
        System.out.println("pojo：" + mapper.readValue(json, Student.class));
    }

    public void testJsonAnyGetterAndJsonAnySetter() throws JsonProcessingException {
        BillRequest billRequest = new BillRequest();
        billRequest.setAction(1);
        billRequest.getExtendInfo().put("callBack", "http://127.0.0.1");
        billRequest.getExtendInfo().put("uid", "169391");
        System.out.println("json: " + mapper.writeValueAsString(billRequest));

        String json = "{\"action\":1,\"uid\":\"169391\",\"callBack\":\"http://127.0.0.1\"}";
        System.out.println("pojo: " + mapper.readValue(json, BillRequest.class));
    }

    public void testJsonGetterAndJsonSetter() throws JsonProcessingException {
        Teacher t = new Teacher();
        t.setHolderName("yuanyuan");

        // {"name":"yuanyuan"}
        System.out.println("json: " + mapper.writeValueAsString(t));

        String json = "{\"name\":\"yuanyuan\"}";
        Teacher teacher = mapper.readValue(json, Teacher.class);
        System.out.println("name: " + teacher.getHolderName());
    }

    public void testJsonPropertyOrder() throws JsonProcessingException {
        Accounting accounting = new Accounting();
        accounting.setAge(30);
        accounting.setId(1);
        accounting.setName("fanfan");

        System.out.println("json: " + mapper.writeValueAsString(accounting));
    }

    public void testJsonRawValue() throws JsonProcessingException {
        Programmer p = new Programmer();
        p.setName("yuanyuan");
        p.setAddress("{\"province\":\"ZJ\", \"city\":\"HZ\", \"homeAddress\":\"西湖大道\"}");
        p.setAddress2("{\"province\":\"ZJ\", \"city\":\"HZ\", \"homeAddress\":\"西湖大道\"}");

        System.out.println("json: " + mapper.writeValueAsString(p));
    }

    public void testJsonValue() throws JsonProcessingException {
        System.out.println("json: " + mapper.writeValueAsString(SexEnum.MAN));
    }


}
