package com.ruszkowski.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class Circle implements Shape {

    private Point center;
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    @Resource(name = "messageSource")
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void draw() {
        System.out.println("Drawing circle: ");
        System.out.println("Center is: " + center.getX() + ", " + center.getY());
        System.out.println(this.messageSource.getMessage("points", new Object[] {center.getX(), center.getY()}, "DefaultText", null));
    }

    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointC")
    public void setCenter(Point center) {
        this.center = center;
    }

    @PostConstruct
    public void initializeCircle(){
        System.out.println("This text is shown after initialization");
    }

    @PreDestroy
    public void destroyCircle(){
        System.out.println("This text is shown before destroyment");
    }
}
