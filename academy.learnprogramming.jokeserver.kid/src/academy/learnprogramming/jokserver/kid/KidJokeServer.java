package academy.learnprogramming.jokserver.kid;

import academy.learnprogramming.jokeserver.JokeServer;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
//import static com.google.common.collect.Lists.*;


public class KidJokeServer implements JokeServer {
    private List<String> jokes;

    public KidJokeServer() {
        //jokes = com.google.common.collect.Lists.newArrayList("k1");
        //jokes = new LinkedList<>();
        jokes.add("k1");
        jokes.add("k2");
        jokes.add("k3");
        jokes.add("k4");
        jokes.add("k5");
        jokes.add("k6");
    }

    private static int getRandomInteger(int maximum, int minimum) {
        return (int) (Math.random() *(maximum-minimum));
    }

    @Override
    public String getJoke() {
        int index = getRandomInteger(jokes.size(), 0);
        return jokes.get(index);
    }

    @Override
    public int availableJokes() {
        return jokes.size();
    }

    @Override
    public String name() {
        return "Kid Joke Server";
    }
}
