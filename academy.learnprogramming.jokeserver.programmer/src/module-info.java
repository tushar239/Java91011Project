module academy.learnprogramming.jokeserver.programmer {
    // whichever module requires academy.learnprogramming.jokeserver.programmer module
    // will automatically get academy.learnprogramming.jokeserver module also
    requires transitive academy.learnprogramming.jokeserver;

    exports academy.learnprogramming.jokeserver.programmer;

}