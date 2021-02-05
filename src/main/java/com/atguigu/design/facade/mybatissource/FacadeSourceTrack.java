package com.atguigu.design.facade.mybatissource;

import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;

/**
 * @Program:com.atguigu.design.facade.mybatissource
 * @Author: mcrae.su
 * @Create: 2021-02-04 16:21
 * @Description:
 */
public class FacadeSourceTrack {
    DefaultReflectorFactory reflectorFactory = new DefaultReflectorFactory();
    DefaultObjectFactory objectFactory = new DefaultObjectFactory();
    protected ObjectWrapperFactory objectWrapperFactory = new DefaultObjectWrapperFactory();

    public MetaObject newMetaObject(Object object) {
        return MetaObject.forObject
                (object, objectFactory, objectWrapperFactory, reflectorFactory);
    }

}
