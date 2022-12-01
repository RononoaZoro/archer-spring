package com.luo.spring.guides.tagparsing.bean.lookupmethod;

/**
 * @author : archer
 * @date : Created in 2022/10/14 11:07
 * @description :
 */
public abstract class GetBeanTest {
    public void showMe(){
        this.getBean().showMe();
    }

    public abstract User getBean();
}
