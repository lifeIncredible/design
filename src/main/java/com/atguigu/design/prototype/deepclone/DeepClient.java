package com.atguigu.design.prototype.deepclone;

/**
 * @author mcRae.su start
 * @create 2020-12-03 23:10
 * @description:
 */
public class DeepClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p1 = new DeepProtoType();
        p1.setName("宋江");
        p1.setDeepCloneableTarget(new DeepCloneableTarget("大牛","大牛的类"));

        //方式1 完成深拷贝
  //      DeepProtoType p2 = (DeepProtoType) p1.clone();

   //     System.out.println("p1.name = "+ p1.getName() +"\t"+"p1.deepCloneableTarget = "+ p1.getDeepCloneableTarget().hashCode());
   //     System.out.println("p2.name = "+ p2.getName() +"\t"+"p2.deepCloneableTarget = "+ p2.getDeepCloneableTarget().hashCode());


        //方式2 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p1.deepClone();
        System.out.println("p1.name = "+ p1.getName() +"\t"+"p1.deepCloneableTarget = "+ p1.getDeepCloneableTarget().hashCode());
        System.out.println("p2.name = "+ p2.getName() +"\t"+"p2.deepCloneableTarget = "+ p2.getDeepCloneableTarget().hashCode());


    }
}
