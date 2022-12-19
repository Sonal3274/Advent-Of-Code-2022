package de.thermondo.advent2022.day02

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Day02Test{

    @Test
    fun `Validate`(){
        assertEquals("Tie", rockPaperScissor("A X"))
        assertEquals("Win", rockPaperScissor("A Y"))
        assertEquals("Loss", rockPaperScissor("A Z"))
        assertEquals("Loss", rockPaperScissor("B X"))
        assertEquals("Tie", rockPaperScissor("B Y"))
        assertEquals("Win", rockPaperScissor("B Z"))
        assertEquals("Win", rockPaperScissor("C X"))
        assertEquals("Loss", rockPaperScissor("C Y"))
        assertEquals("Tie", rockPaperScissor("C Z"))


    }

}