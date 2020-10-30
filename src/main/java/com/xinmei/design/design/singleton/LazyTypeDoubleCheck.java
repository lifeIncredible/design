package com.xinmei.design.design.singleton;

/**
 * @Author: 苏晓虎
 * @Create: 2020-10-30 15:32
 * @Description: DCL双重检查
 */

/**
 * 优缺点说明：
 *  双重检查概念是多线程开发中常使用到的，如代码中所示，我们进行了两次if(single == null)检查，这样就可以保证线程安全了。
 *  这样，实例化代码只用执行一次，后面再次访问时，判断if(singleton == null),直接return 实例化对象，也避免的反复进行方法同步。
 *  线程安全；延迟加载；效率高
 *  强烈推荐
 *  ps： volatile主要是用于禁止指令重排序,以免造成双重检查不完美。
 */
public class LazyTypeDoubleCheck {
    private static volatile LazyTypeDoubleCheck instance;

    private LazyTypeDoubleCheck() {
    }

    public static LazyTypeDoubleCheck getInstance(){
        if (instance == null){
            synchronized (LazyTypeDoubleCheck.class){
                if (instance == null){
                    instance = new LazyTypeDoubleCheck();
                }
            }
        }
        return instance;
    }
}
