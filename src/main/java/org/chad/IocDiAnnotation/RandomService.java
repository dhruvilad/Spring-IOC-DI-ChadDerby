package org.chad.IocDiAnnotation;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements  FortuneService{

    private String[] data={
        "heloooooooooooooo1",
        "hellllllllllll",
        "hiiiiiiiiiiiiii"
    };

    //create random number generator
    private Random random=new Random();

    @Override
    public String getFortune() {

        int index = random.nextInt(data.length);
        return data[index];
    }
}
