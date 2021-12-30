package xyDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TestPostConstructService {
    @Autowired
    private MyService myService;

    private static MyService staticMyService;

    @PostConstruct
    public void init(){
        System.out.println("执行init");
        staticMyService = this.myService;
    }

    public void test1() {
        if (staticMyService == null) {
            System.out.println("staticMyService is null");
        } else {
            int x = staticMyService.getNum();
            System.out.println(x);
        }
    }

    public static void main(String[] args) {


    }
}
