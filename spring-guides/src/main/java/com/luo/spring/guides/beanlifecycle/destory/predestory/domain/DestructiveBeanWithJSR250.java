package com.luo.spring.guides.beanlifecycle.destory.predestory.domain;

import org.springframework.context.support.GenericXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;

public class DestructiveBeanWithJSR250 {
    private File file;
    private String filePath;
    
    @PostConstruct
    public void init() throws Exception {
        System.out.println("Initializing Bean");

        if (filePath == null) {
            throw new IllegalArgumentException(
                    "You must specify the filePath property of " + 
                    DestructiveBeanWithJSR250.class);
        }

        this.file = new File(filePath);
        this.file.createNewFile();

        System.out.println("File exists: " + file.exists());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying Bean");

        if(!file.delete()) {
            System.err.println("ERROR: failed to delete file.");
        }

        System.out.println("File exists: " + file.exists());
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


}
