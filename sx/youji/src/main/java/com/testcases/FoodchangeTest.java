package com.testcases;

import com.base.BasePrepare;

import org.testng.annotations.Test;

public class Foodmessage extends BasePrepare {
    @Test
    public void foodm() throws InterruptedException {
        driver.findElementByName("美食").click();
        driver.findElementById("neet.com.youjidemo:id/tv_description").click();
        Thread.sleep(3000);
        driver.findElementById("neet.com.youjidemo:id/ib_good").click();
}
}
