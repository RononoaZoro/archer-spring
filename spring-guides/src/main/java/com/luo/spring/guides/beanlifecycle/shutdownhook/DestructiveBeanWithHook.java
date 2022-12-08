package com.luo.spring.guides.beanlifecycle.shutdownhook;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;

public class DestructiveBeanWithHook implements ApplicationContextAware {
    private File file;
    private String filePath;

    private ApplicationContext applicationContext;

    @PostConstruct
    public void init() throws Exception {
        System.out.println("Initializing Bean");

        if (filePath == null) {
            throw new IllegalArgumentException(
                    "You must specify the filePath property of " +
                            DestructiveBeanWithHook.class);
        }

        this.file = new File(filePath);
        this.file.createNewFile();

        System.out.println("File exists: " + file.exists());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying Bean");

        if (!file.delete()) {
            System.err.println("ERROR: failed to delete file.");
        }

        System.out.println("File exists: " + file.exists());
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        if (applicationContext instanceof AbstractApplicationContext) {
            ((AbstractApplicationContext) applicationContext).registerShutdownHook();
        }
    }
}
