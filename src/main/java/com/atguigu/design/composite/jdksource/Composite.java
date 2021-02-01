package com.atguigu.design.composite.jdksource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SXH
 * @create 2021-02-01 21:59
 * @description:
 */
public class Composite {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        //直接存放叶子节点(Node)
        hashMap.put(0,"东游记");

        Map<Integer, String> map = new HashMap<>();
        map.put(0,"西游记");
        map.put(1,"红楼梦");
        hashMap.putAll(map);
        System.out.println(hashMap);

        /**
         * 建议结合组合模式原理图进行阅读
         *
         * Map 接口有个实现类AbstractMap，其中实现了Map接口的put()方法，但是默认抛出不支持的异常，说明还需AbstractMap的子类来继续实现
         * Map和AbstractMap 就是组合模式中的Component,比学校案例中多了一层
         *
         * public abstract class AbstractMap<K,V> implements Map<K,V> {
         *      public V put(K key, V value) {
         *         throw new UnsupportedOperationException();
         *     }
         * }
         *
         * AbstractMap中的子类有我们熟悉的HashMap,此时的HashMap就相当于组合模式中的Composite
         * 因为他具体实现了put()方法,put()方法中有个putVal()方法，该方法帮助HashMap组合了一个静态内部类Node，
         * HashMap可以通过put remove方法对Node进行操作，而Node只存在存储及关联下个Node位置功能。
         *
         * Node内部类就是组合模式中的叶子节点   Node<K,V>[] tab = newNode(hash, key, value, null);
         *
         * public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable {
         *
         *      public V put(K key, V value) {
         *         return putVal(hash(key), key, value, false, true);
         *     }
         *
         *
         *     final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
         *                    boolean evict) {
         *         Node<K,V>[] tab; Node<K,V> p; int n, i;
         *         if ((tab = table) == null || (n = tab.length) == 0)
         *             n = (tab = resize()).length;
         *         if ((p = tab[i = (n - 1) & hash]) == null)
         *             tab[i] = newNode(hash, key, value, null);
         *         else {
         *             Node<K,V> e; K k;
         *             if (p.hash == hash &&
         *                 ((k = p.key) == key || (key != null && key.equals(k))))
         *                 e = p;
         *             else if (p instanceof TreeNode)
         *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
         *             else {
         *                 for (int binCount = 0; ; ++binCount) {
         *                     if ((e = p.next) == null) {
         *                         p.next = newNode(hash, key, value, null);
         *                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
         *                             treeifyBin(tab, hash);
         *                         break;
         *                     }
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k))))
         *                         break;
         *                     p = e;
         *                 }
         *             }
         *             if (e != null) { // existing mapping for key
         *                 V oldValue = e.value;
         *                 if (!onlyIfAbsent || oldValue == null)
         *                     e.value = value;
         *                 afterNodeAccess(e);
         *                 return oldValue;
         *             }
         *         }
         *         ++modCount;
         *         if (++size > threshold)
         *             resize();
         *         afterNodeInsertion(evict);
         *         return null;
         *     }
         *
         * }
         *
         *
         *
         *
         * 总结：----------
         *   1. Map 就是一个抽象的构建(类似我们的Component)
         *   2. HashMap 是一个中间的构建(Composite)，实现/继承了相关方法:put、putAll
         *   3. Node是HashMap的静态内部类,类似Leaf叶子节点，没有put、putALL方法
         *
         */
    }
}
