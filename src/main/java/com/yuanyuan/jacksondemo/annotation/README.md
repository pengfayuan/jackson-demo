##常用注解
### @JsonProperty
设置json的属性名，如果不指定，则默认使用类的属性名   

### @JsonIgnore
标记忽略，不参与序列化和反序列化  

### @JsonCreator
jackson将json反序列化成对象时，默认使用无参构造函数，可以通过@JsonCreator指定默认的构造函数，构造函数的形参必须使用@JsonProperty注解

### @JsonAnyGetter
1、序列化对象时，将map中的键值对转成对象的基础属性

### @JsonGetter和@JsonSetter
默认属性的get和set方法是属性的首字母大写，然后前面加上get和set，可以通过@JsonGetter和@JsonSetter自定义get和set方法

