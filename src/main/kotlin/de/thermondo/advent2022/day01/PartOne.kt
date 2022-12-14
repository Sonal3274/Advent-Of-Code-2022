package de.thermondo.advent2022.day01

import java.io.BufferedReader
import java.io.FileReader
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths


/**
 * The jungle must be too overgrown and difficult to navigate in vehicles or access from the air; the Elves' expedition
 * traditionally goes on foot. As your boats approach land, the Elves begin taking inventory of their supplies.
 * One important consideration is food - in particular, the number of Calories each Elf is carrying (your puzzle input).
 *
 * The Elves take turns writing down the number of Calories contained by the various meals, snacks, rations, etc. that
 * they've brought with them, one item per line. Each Elf separates their own inventory from the previous Elf's
 * inventory (if any) by a blank line.
 *
 * For example, suppose the Elves finish writing their items' Calories and end up with the following list:
 *
 * 1000
 * 2000
 * 3000
 *
 * 4000
 *
 * 5000
 * 6000
 *
 * 7000
 * 8000
 * 9000
 *
 * 10000
 *
 * This list represents the Calories of the food carried by five Elves:
 *  - The first Elf is carrying food with 1000, 2000, and 3000 Calories, a total of 6000 Calories.
 *  - The second Elf is carrying one food item with 4000 Calories.
 *  - The third Elf is carrying food with 5000 and 6000 Calories, a total of 11000 Calories.
 *  - The fourth Elf is carrying food with 7000, 8000, and 9000 Calories, a total of 24000 Calories.
 *  - The fifth Elf is carrying one food item with 10000 Calories.
 *
 *  In case the Elves get hungry and need extra snacks, they need to know which Elf to ask: they'd like to know how many
 *  Calories are being carried by the Elf carrying the most Calories. In the example above, this is 24000
 *  (carried by the fourth Elf).
 *
 *  Find the Elf carrying the most Calories. How many total Calories is that Elf carrying?
 */

fun main() {
   // elvesCalories()
    val listOfStrings: MutableList<String> = ArrayList()

    // load data from file
    val bf = BufferedReader(
        FileReader("/Users/sonaldhage/Advent-Of-Code-2022/src/main/kotlin/de/thermondo/advent2022/day01/InputDay01.txt")
    )
/*
    val txt = bf.read()
    println(txt)*/
    // read entire line as string
    var line = bf.readLine()

    // checking for end of file
    while (line != null) {
        listOfStrings.add(line)
        line = bf.readLine()
    }
    listOfStrings.add("")
    // closing bufferreader object
    bf.close()

    // storing the data in arraylist to array
    val array = listOfStrings.toTypedArray()

    val list: MutableList<Int> = mutableListOf()
    var sum = 0

    for (i in array) {
       // println(i)

        if (i == "") {
           // println("Empty line\n")
            list.add(sum)
           // println(sum)
            sum = 0
            //println(list)
        }
        else {
            sum += i.toInt()
        }

    }

    val max = list.max()
    println(max)


    // printing each line of file
    // which is stored in array
  /*  for (str in array) {
        println(str)
    }*/


}

fun elvesCalories() {
    val a = arrayOf(arrayOf(1000, 2000, 3000), arrayOf(4000, 5000, 6000), arrayOf(7000, 8000, 9000), arrayOf(10000))
    var sum = 0
    val list: MutableList<Int> = mutableListOf()

    for (j in a) {
        for (i in j) {
            //  println(i)
            sum += i
        }
//        println(sum)
        list.add(sum)
//        println(list)
        sum = 0
//        println()
    }
    val max = list.max()
    println(max)
}