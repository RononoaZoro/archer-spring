package com.luo.spring.guides.iocdi.lookup.xml;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * @author : archer
 * @date : Created in 2022/12/1 11:23
 * @description :
 */
public class Main {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:iocdi/injection/lookup/app-context-xml.xml");
        ctx.refresh();

        DemoBean abstractBean = ctx.getBean("abstractLookupBean", DemoBean.class);
        DemoBean standardBean = ctx.getBean("standardLookupBean", DemoBean.class);

        displayInfo("abstractLookupBean", abstractBean);
        displayInfo("standardLookupBean", standardBean);

        ctx.close();
    }

    public static void displayInfo(String beanName, DemoBean bean) {
        Singer singer1 = bean.getMySinger();
        Singer singer2 = bean.getMySinger();

        System.out.println("[" + beanName + "]: Singer Instances the Same?  "
                + (singer1 == singer2));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");

        for (int x = 0; x < 100000; x++) {
            Singer singer = bean.getMySinger();
            singer.sing();
        }

        stopWatch.stop();
        System.out.println("100000 gets took " + stopWatch.getTotalTimeMillis() + " ms");
    }
}
