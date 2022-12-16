package de.thermondo.advent2022.day01

import java.io.BufferedReader
import java.io.FileReader

/*
By the time you calculate the answer to the Elves' question, they've already realized that the Elf carrying the most
Calories of food might eventually run out of snacks.To avoid this unacceptable situation, the Elves would instead like
to know the total Calories carried by the top three Elves carrying the most Calories. That way, even if one of those
Elves runs out of snacks, they still have two backups.

In the example above, the top three Elves are the fourth Elf (with 24000 Calories), then the third Elf
(with 11000 Calories), then the fifth Elf (with 10000 Calories). The sum of the Calories carried by these three elves
is 45000.

Find the top three Elves carrying the most Calories. How many Calories are those Elves carrying in total?
*/

fun main() {
    val listOfStrings: MutableList<String> = ArrayList()

    // load data from file
    val bf = BufferedReader(
        FileReader("src/main/resources/advent2022/InputDay01.txt")
    )

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
        if (i == "") {
            list.add(sum)
            sum = 0
        } else {
            sum += i.toInt()
        }

    }
    list.sortDescending()
    var count = 0
    var totalCalories = 0
    for (x in list) {
        if (count < 3) {
           // println(x)
            totalCalories = totalCalories + x
            count++
        } else {
            break
        }
    }
    println(totalCalories)
}
