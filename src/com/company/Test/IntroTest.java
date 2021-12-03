package com.company;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class IntroTest {

    Intro intro;

    @BeforeEach
    void setUp() {
        intro = new Intro();
    }

    @Test
    void testIntro() {
    assertEquals("You are in a land full of dragons. In front of you, \nyou see two caves. In one cave, the dragon is friendly \nand will share his treasure with you. The other dragon \nis greedy and hungry and will eat you on sight \nWhich cave will you go into? (1 or 2)", intro.printIntro(), "printIntro method not working.");
}

    @Test
    void printIntro() {

    }
}