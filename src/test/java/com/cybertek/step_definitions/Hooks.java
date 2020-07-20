package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before(order = 2)
    public void setUpScenario(){
        System.out.println("-----> Before annotation: Setting up browser");
    }

    @Before(value = "@db", order = 1)
    public void setUpDatabaseConnection(){
        //System.out.println("--------> BEFORE ANNOTATION: DB CONNECTION CREATED <------");



    }

    @After(order = 1)
    public void tearDownScenario(Scenario scenario){




        byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png",scenario.getName());


    }

    @After(value = "@db", order = 2)
    public void tearDownDatabaseConnection(){
        System.out.println("--------> AFTER ANNOTATION: DB CONNECTION CLOSED <------");
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("------------->  Before: Taking Screenshot  <-------------------");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("------------->  After: Taking Screenshot  <-------------------");
    }
}