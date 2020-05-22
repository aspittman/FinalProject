package com.affinityapps.javajokes;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JokesActivity {


    List<String> jokesList = asList("Today at the bank, an old lady asked me to help check her balance. So I pushed her over.",
            "I bought some shoes from a drug dealer. I don't know what he laced them with, but I've been tripping all day.",
            "I told my girlfriend she drew her eyebrows too high. She seemed surprised.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "I'm so good at sleeping. I can do it with my eyes closed.",
            "My boss told me to have a good day.. so I went home.",
            "Why is Peter Pan always flying? He neverlands.",
            "A woman walks into a library and asked if they had any books about paranoia. The librarian says \"They're right behind you!\"",
            "The other day, my wife asked me to pass her lipstick but I accidentally passed her a glue stick. She still isn't talking to me.",
            "My friend says to me: \"What rhymes with orange\" I said: \"No it doesn't\"");

    public String jokesList(){
        Random random = new Random();

        String jokeSelector = jokesList.get(random.nextInt(jokesList.size()));

        return jokeSelector;
    }
}


