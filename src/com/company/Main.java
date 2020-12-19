package com.company;

abstract class Human {
    /*
     *  Class serves for describe a human person
     */

    public String name;
    public boolean RunJogging;
    public boolean RunNormal;
    public boolean SwimCrawl;
    public boolean SwimBreaststroke;

    public abstract void getName();

    public interface AbleToMakeRun {
        public void makeRunJogging();
        public void makeRunNormal();
    }
    public interface AbleToMakeSwim{
        public void makeSwimCrawl();
        public void makeSwimBreaststroke();
    }
}


class Man extends Human implements Human.AbleToMakeRun, Human.AbleToMakeSwim {

    public String name = "Mr. Claus";
    public boolean RunJogging = true;
    public boolean RunNormal = false;
    public boolean SwimCrawl = true;
    public boolean SwimBreaststroke = false;

    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void makeRunJogging() {
        System.out.println(name + " can run jogging - " + RunJogging);
    }

    @Override
    public void makeRunNormal() {
        System.out.println(name + " can run normal - " + RunNormal);
    }

    @Override
    public void makeSwimCrawl() {
        System.out.println(name + " can swim crawl - " + SwimCrawl);
    }

    @Override
    public void makeSwimBreaststroke() {
        System.out.println(name + " can swim breaststroke - " + SwimBreaststroke);
    }
}

class Woman extends Human implements Human.AbleToMakeRun, Human.AbleToMakeSwim {

    public String name = "Mrs. Claus";
    public boolean RunJogging = false;
    public boolean RunNormal = true;
    public boolean SwimCrawl = false;
    public boolean SwimBreaststroke = true;

    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void makeRunJogging() {
        System.out.println(name + " can run jogging - " + RunJogging);
    }

    @Override
    public void makeRunNormal() {
        System.out.println(name + " can run normal - " + RunNormal);
    }

    @Override
    public void makeSwimCrawl() {
        System.out.println(name + " can swim crawl - " + SwimCrawl);
    }

    @Override
    public void makeSwimBreaststroke() {
        System.out.println(name + " can swim breaststroke - " + SwimBreaststroke);
    }
}

public class Main {

    public static void main(String[] args) {
        Man m = new Man();
        m.getName();
        m.makeRunJogging();
        m.makeRunNormal();
        m.makeSwimCrawl();
        m.makeSwimBreaststroke();
        Woman w = new Woman();
        w.getName();
        w.makeRunJogging();
        w.makeRunNormal();
        w.makeSwimCrawl();
        w.makeSwimBreaststroke();
    }
}
