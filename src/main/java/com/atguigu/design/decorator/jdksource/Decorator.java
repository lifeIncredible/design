package com.atguigu.design.decorator.jdksource;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author SXH
 * @create 2021-01-21 20:09
 * @description: 装饰者模式在IO流中的应用
 */
public class Decorator {

    public static void main(String[] args) {
        DataInputStream dis = null;
        try {
             dis = new DataInputStream(new FileInputStream("d://abc.txt"));
            System.out.println(dis.read());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     *  publilc class FileInputStream extends InputStream
     *  public abstract class InputStream implements Closeable
     *  public class FilterInputStream extends InputStream
     *
     *  1.首先FileInputStream 继承了 InputStream  -- FileInputStream就相当于我们的无因咖啡、美式咖啡、黑咖啡等
     *  2.InputStream 又是一个抽象类  -- InputStream相当于我们的Drink类
     *  3.InputStream 的子类中有个很重要的子类 -- FilterInputStream就相当于充当了装饰者
     *  4.FilterInputStream的子类有刚才入口用到的DataInputStream以及BufferedInputStream等等还有很多类。。。
     *    DataInputStream、BufferedInputStream就相当于装饰品
     *
     *
     *  装饰者类
     *  public class FilterInputStream extends InputStream {
     *     //被装饰者
     *     protected volatile InputStream in;
     *  }
     *
     * //装饰品(相当于牛奶)
     * public class DataInputStream extends FilterInputStream implements DataInput {}
     *
     * //装饰品（巧克力）
     * public class BufferedInputStream extends FilterInputStream {}
     *
     *  5.分析得出，在JDK的IO体系中，就是使用了装饰者模式！！！！！
     *
    */
}
