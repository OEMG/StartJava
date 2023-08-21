package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("USA");
        gipsyDanger.setHeight(79.25);
        gipsyDanger.setWeight(1.98);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);
        
        Jaeger strikerEureka = new Jaeger("Striker Eurika", "Mark-5", "Australia", 76.2, 1.85, 10, 10, 9);
        gipsyDanger.destroy();
        System.out.println(gipsyDanger.getOrigin());
        gipsyDanger.setArmor(7);
        gipsyDanger.showSpecInfo();
        strikerEureka.destroy();
        strikerEureka.showSpecInfo();
        strikerEureka.upArmor();
        strikerEureka.upStrength();
        strikerEureka.showSpecInfo();
    }
}