package com.ruszkowski.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements Shape{

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context = null;
    private List points;

    public void initMethod(){

    }

    public void afterPropertiesSet() throws Exception {

    }

    public void draw(){
        System.out.println("Drawing Triangle: ");
        System.out.println("Triangle: " + "\n"
                                        + getPointA().getX() + ", " + getPointA().getY() + "\n"
                                        + getPointB().getX() + ", " + getPointB().getY() + "\n"
                                        + getPointC().getX() + ", " + getPointC().getY() + "\n");
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void setListOfPoints(List listOfPoints) {
        this.points = listOfPoints;
    }

    public List getListOfPoints() {
        return points;
    }
}
