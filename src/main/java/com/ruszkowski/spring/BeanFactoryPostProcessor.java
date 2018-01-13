package com.ruszkowski.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessor implements org.springframework.beans.factory.config.BeanFactoryPostProcessor{

    public void postProcessBeanFactory(ConfigurableListableBeanFactory BeanFactory) throws BeansException {

    }
}
