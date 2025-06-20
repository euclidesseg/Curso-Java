package Clases;

import java.sql.SQLOutput;

public class AnimalHerbivoro extends Animal{
    @Override
    public void alimentarse() {
        System.out.println("Los animales herbivoros se alimentan con hierbas");
    }
}
