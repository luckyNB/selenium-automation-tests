package com.demo;


import org.testng.annotations.Test;

public class TestNG_SampleCode extends BaseTestClass{
    @Test
    public void testsetUP() {
        System.out.println("SetUp is more important");
    }

    @Test
    public void testAfterSetUP() {
        System.out.println("something be happedn");
    }

    @Test
    public void testDATA() {
        System.out.println("Raja ");
    }
}
