package com.example;

/**
 * 必须完成：设计复数类，运行主函数，结果如图片：result.jpg所示
 * 扩展完成：设计实数类，继承虚数类，同样重写复数类的方法
 */
public class TestComplex {
    public static void main(String[] args) {

        Complex x = new Complex(10,-4);
        Complex temp = new Complex(-20,5);
        Complex y = new Complex(temp);
        System.out.println("x:" + x.toString());
        System.out.println("y:" + y.toString());
        System.out.println("(x + y) = " + x.add(y).toString());
        System.out.println("(x - y) = " + x.minus(y).toString());
        System.out.println("(x * y) = " + x.multiply(y).toString());

    }
}
