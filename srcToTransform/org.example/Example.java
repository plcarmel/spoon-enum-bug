package org.example;

enum Example {

    ENGLISH( /* boom */
            "Hello",
            "World"
    ),
    FRENCH(
            "Bonjour",
            "l'univers"
    );

    String hello;
    String world;

    public Example(
            String hello,
            String world
    ) {
        this.hello = hello;
        this.world = world;
    }

}