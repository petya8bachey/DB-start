package org.petya8bachey.presentation;

import org.petya8bachey.application.ApplicationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationService service = applicationContext.getBean(ApplicationService.class);
        service.createDepartment("IRIT", 123, "4000-6000");
        System.out.println(service.findDepartment("IRIT", "name"));
        service.createEmployee("Sergey Syxanov", null, service.findDepartment("IRIT", "name"), "14.05.2004", "lox");
        service.createEmployee("Peter Scvortcov", null, service.findDepartment("IRIT", "name"), "13.01.2005", "god");
        System.out.println(service.findEmployee("lox", "position"));
        service.deleteEmployee(service.findEmployee("lox", "position"));
        System.out.println(service.findEmployee("lox", "position"));
        System.out.println(service.findEmployee("god", "position") + "");
    }
}