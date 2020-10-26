package academy.learnprogramming.jokeapp;

import academy.learnprogramming.jokeserver.JokeServer;
import academy.learnprogramming.jokeserver.programmer.ProgrammerJokeServer;
import academy.learnprogramming.jokserver.kid.KidJokeServer;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        /*
            Using ServiceLoader, you can instantiate all child classes of an interface as shown below.
            You don't have to instantiate KidJokeServer and ProgrammerJokeServer explicitly.
            This reduces coupling in code, but you still have to provide coupling in module-info.java

            module-info.java of academy.learnprogramming.jokeserver
            uses academy.learnprogramming.jokeserver.JokeServer

            module-info.java of KidJokeServer
            provides academy.learnprogramming.jokeserver.JokeServer with academy.learnprogramming.jokeserver.KidJokeServer

            module-info.java of ProgrammerJokeServer
            provides academy.learnprogramming.jokeserver.JokeServer with academy.learnprogramming.jokeserver.ProgrammerJokeServer
         */
        ServiceLoader<JokeServer> jokeServers = ServiceLoader.load(JokeServer.class);
        for (JokeServer jokeServer : jokeServers) {
            System.out.println(jokeServer.name());
        }

        int NUM_JOKES = 20;
        {
            JokeServer jokeServer = new KidJokeServer();

            System.out.printf("Displaying %d random kid jokes from %s\n", NUM_JOKES, jokeServer.name());
            System.out.println("--------------------------------");

            for (int i = 0; i < NUM_JOKES; i++) {
                System.out.println(jokeServer.getJoke() + "\n");
            }
        }
        {
            JokeServer jokeServer = new ProgrammerJokeServer();

            System.out.printf("Displaying %d random programmer jokes from %s\n", NUM_JOKES, jokeServer.name());
            System.out.println("--------------------------------");

            for (int i = 0; i < NUM_JOKES; i++) {
                System.out.println(jokeServer.getJoke() + "\n");
            }
        }
    }
}
