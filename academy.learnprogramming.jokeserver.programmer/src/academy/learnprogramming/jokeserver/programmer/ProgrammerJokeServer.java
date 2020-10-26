package academy.learnprogramming.jokeserver.programmer;

import academy.learnprogramming.jokeserver.JokeServer;
import academy.learnprogramming.jokeserver.programmer.internal.Filter;

import java.util.LinkedList;
import java.util.List;

public class ProgrammerJokeServer implements JokeServer {
    private List<String> jokes;

    public ProgrammerJokeServer() {
        jokes = new LinkedList<>();
        jokes.add("P1");
        jokes.add("P2");
        jokes.add("P3");
        jokes.add("P4");
        jokes.add("P5");
        jokes.add("P6");
    }

    private static int getRandomInteger(int maximum, int minimum) {
        return (int) (Math.random() *(maximum-minimum));
    }
    @Override
    public String getJoke() {
        int index = getRandomInteger(jokes.size(), 0);
        return Filter.clean(jokes.get(index));
    }
    @Override
    public int availableJokes() {
        return jokes.size();
    }
    @Override
    public String name() {
        return "Programmer Joke Server";
    }
}
