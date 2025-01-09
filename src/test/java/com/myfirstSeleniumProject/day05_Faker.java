package com.myfirstSeleniumProject;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class day05_Faker {




    @Test
    public void javaFaker(){

        Faker faker=new Faker();

        System.out.println(faker.book().title());


        System.out.println(faker.animal().name());

        System.out.println(faker.address().cityName());

        System.out.println(faker.name().firstName());

        System.out.println(faker.funnyName().name());

        System.out.println(faker.internet().password());

        System.out.println(faker.phoneNumber().phoneNumber());

        System.out.println(faker.internet().emailAddress());


        System.out.println(faker.harryPotter().book());

        System.out.println(faker.lordOfTheRings().character());

        System.out.println(faker.harryPotter().character());

    }
}
