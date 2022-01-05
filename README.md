1、json中key和对象中的属性名不一致？
通过@JsonProperty可以将json中的key和属性名绑定在一起
```java
public class Person {

    @JsonProperty("holdName")
    private String name;
}
```

2、