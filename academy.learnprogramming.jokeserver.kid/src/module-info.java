module academy.learnprogramming.jokeserver.kid {

    // whichever module requires academy.learnprogramming.jokeserver.programmer module
    // will automatically get academy.learnprogramming.jokeserver module also
    requires transitive academy.learnprogramming.jokeserver;
    requires java.logging;
    //requires guava; // this should work, but not sure why it is not working. guava is not yet modularized, so java creates automatic module which should be same as jar file name without version number.
    exports academy.learnprogramming.jokserver.kid;
}