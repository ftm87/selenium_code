package com.myfirstSeleniumProject;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class day05_Faker {




    @Test
    public void javaFaker(){

        Faker faker=new Faker();

        System.out.println(faker.book().title());


        System.out.println(faker.animal().name());

    }
}
