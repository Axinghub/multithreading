package com.axing.chapter2.tax;


/*
在java8中，满足下面任意一个条件的接口都是函数式接口：

1、被@FunctionalInterface注释的接口，满足@FunctionalInterface注释的约束。

2、没有被@FunctionalInterface注释的接口，但是满足@FunctionalInterface注释的约束

 

     @FunctionalInterface注释的约束：

1、接口有且只能有个一个抽象方法，只有方法定义，没有方法体

2、在接口中覆写Object类中的public方法，不算是函数式接口的方法。
---------------------
作者：漠风-
来源：CSDN
原文：https://blog.csdn.net/qq_36372507/article/details/78757811
版权声明：本文为博主原创文章，转载请附上博文链接！
 */
@FunctionalInterface
public interface CalculatorStrategy {

    double calculate(double salary, double bonus);

}
