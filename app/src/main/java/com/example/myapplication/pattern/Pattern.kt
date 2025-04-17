package com.example.myapplication.pattern

fun main() {
    Pattern().printPatter13()
}

class Pattern {


    //1. Function to print pattern
    /*
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
      */
    fun printPattern1(rows: Int = 5) {
        for (i in 0 until rows) {
            for (j in 0 until rows) {
                print("* ")
            }
            println("")
        }
    }


    /*2. Function to print pyramid star pattern
    *
    * *
    * * *
    * * * *
    * * * * *
    */

    fun printPattern2(rows: Int = 6) {
        for (i in 0 until rows) {
            for (j in 0 until i) {
                print("* ")
            }
            println("")
        }
    }


    /* 3.Function to print pyramid star pattern
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
     */
    fun printPattern3(rows: Int = 6) {
        var count = 1
        for (i in 0 until rows) {
            count = 1
            for (j in 0 until i) {
                print(count)
                count++
            }
            println("")
        }
    }


    /* 4.Function to print pyramid star pattern
    1
    2 2
    3 4 3
    4 4 4 4
    5 5 5 5 5
    */
    fun printPattern4(rows: Int = 6) {
        var count = 1
        for (i in 0 until rows) {

            for (j in 0..i) {
                print("$count ")
            }

            count++
            println("")
        }
    }

    /* 5.Function to print pyramid star pattern
     * * * * *
     * * * *
     * * *
     * *
     *

  */
    fun printPattern5(rows: Int = 5) {
        for (i in 0 until rows) {
            for (j in i until rows) {
                print("* ")
            }
            println("")
        }
    }


    /* 6.Function to print pattern
    12345
    1234
    123
    12
    1
*/
    fun printPattern6() {
        val rows = 5
        for (i in 0..rows) {
            //space
            for (j in 1..rows - i) {
                print(j)
            }

            println("")
        }
    }


    /* 7.Function to print pyramid star pattern
         *
        ***
       *****
      *******
     *********

 */
    fun printPattern7(rows: Int = 5) {
        for (i in 0 until rows) {
            //space
            for (j in i until 5) {
                print(" ")
            }
            //star
            for (j in 0 until 2 * i + 1) {
                print("*")
            }
            //space
            for (j in i until 5) {
                print(" ")
            }
            println("")
        }
    }


    /* 83.Function to print pyramid star pattern
      *********
       *******
        *****
         ***
          *

*/
    fun printPattern8(rows: Int = 5) {
        for (i in 0 until rows) {
            //star
            for (j in 0 until i) {
                print(" ")
            }
            //star
            for (j in 0 until 2 * rows - 2 * i - 1) {
                print("*")
            }

            //space
            for (j in 0 until i) {
                print(" ")
            }
            println("")
        }
    }

    /* 9.Function to print pyramid star pattern
         *
        ***
       *****
      *******
     *********
     *********
      *******
       *****
        ***
         *

*/
    fun printPatter9(rows: Int = 5) {
        for (i in 0 until rows) {
            //star
            for (j in i + 1 until rows) {
                print(" ")
            }
            //star
            for (j in 0 until 2 * i + 1) {
                print("*")
            }

            //space
            for (j in i + 1 until rows) {
                print(" ")
            }
            println("")
        }

        for (i in 0 until rows) {
            //star
            for (j in 0 until i) {
                print(" ")
            }
            //star
            for (j in 0 until 2 * rows - 2 * i - 1) {
                print("*")
            }

            //space
            for (j in 0 until i) {
                print(" ")
            }
            println("")
        }
    }


    /* 10.Function to print pyramid star pattern
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

*/
    fun printPatter10(rows: Int = 5) {
        for (i in 1..rows) {
            //star
            for (j in 0 until i) {
                print("*")
            }

            //space
            for (j in i until rows) {
                print(" ")
            }
            println("")
        }

        for (i in 0 until rows - 1) {
            //star
            for (j in i until rows - 1) {
                print("*")
            }

            //space
            for (j in 0 until i) {
                print(" ")
            }
            println("")
        }
    }


    /* 11.Function to print pyramid star pattern
   1
   0 1
   1 0 1
   0 1 0 1
   1 0 1 0 1

*/
    fun printPatter11(rows: Int = 5) {
        for (i in 0 until rows) {
            var start = 1
            start = if (i % 2 == 0) 1 else 0

            for (j in 0..i) {
                print("$start ")
                start = 1 - start
            }
            println()

        }

    }


    /* 12.Function to print pyramid star pattern
1      1
12    21
123  321
12344321

*/
    fun printPatter12(rows: Int = 4) {
        var printSpace = (rows * 2) - 1

        for (i in 1..rows) {
            //number
            for (j in 1..i) {
                print(j)
            }
            //space
            for (space in 1 until printSpace) {
                print("-")
            }
            // Print numbers in reverse
            for (num in i downTo 1) {
                print(num)
            }
            println()
            printSpace -= 2

        }


    }


    /* 13.Function to print pyramid star pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/
    fun printPatter13(rows: Int = 5) {
        var num = 1
        for (i in 1..rows) {
            //number
            for (j in 1..i) {
                print("$num ")
                num = num+1
            }
            println()

        }


    }
}