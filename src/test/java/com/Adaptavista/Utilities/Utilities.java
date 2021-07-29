package com.Adaptavista.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utilities {

    public static void click(By element){
        Driver.get().findElement(element).click();
    }

    public static void writeText(By element,String text){
        Driver.get().findElement(element).sendKeys(text);
    }

    public static WebElement elementReturner(By element){
        return Driver.get().findElement(element);
    }

    public static String getInput(By element){
        return Driver.get().findElement(element).getAttribute("value");
    }

    public static String getText(By element){
        return  Driver.get().findElement(element).getText();
    }

    public static void clear(By element){
        Driver.get().findElement(element).clear();
    }


}
