package kolin.mykotlin

/*
* 1.属性读写
* a.Kotlin 自动识别 Java Getter/Setter
* b.Java操作Kotlin 属性通过Getter/Setter
* 
* 2.空安全类型
* a.Kotlin空安全类型的原理
* b.平台类型 Platform type
* c.@Nullable和@NotNull
* 
* 3.几类函数的调用
* a.包级函数：静态方法
* b.扩展方法:带Receiver的静态方法
* c.运算符重载：带Receiver的对应名称的静态方法
* 
* 4.几个常用注解的使用
* a.JvmField:将属性编译为Java变量
* b.JvmStatic:将对象的方法编译成Java静态方法
* c.JvmOverloads:默认参数生成重载方法
* d.file:JvmName:指定kotlin文件编译后的类名
* 
* 5.NoArg与AllOpen
* a.NoArg:为被标注的类生成无参构造 支持Jpa注解 如@Entity
* b.AllOpen 为被标注的类去掉final,允许被继承 支持Spring注解 如@Compoent
* c.支持自定义注解类型，例如@PoKo
* 
* 6.泛型
* a.通配符Kotlin的 * 对应于java的 ？
* b.协变和逆变 out/in  ArrayList<out String>
* c.没有Raw类型 java的List->Kotlin的List<*>
* 
* */