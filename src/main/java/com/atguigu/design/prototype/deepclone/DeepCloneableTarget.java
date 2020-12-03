package com.atguigu.design.prototype.deepclone;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author mcRae.su start
 * @create 2020-12-03 22:54
 * @description:
 */
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 3993743617243387223L;

    //因为该类的属性都是String类型，因此我们这里使用默认的clone 方法完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    public DeepCloneableTarget() {
    }

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }
}
