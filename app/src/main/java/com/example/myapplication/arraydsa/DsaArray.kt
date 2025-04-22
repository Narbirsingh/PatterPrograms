package com.example.myapplication.arraydsa


fun main() {
    DsaArray().findLargestNumber()
}


class DsaArray {

    /*
     Find Largest number in array.
     [2,3,1,5,6,20]

     */
    fun findLargestNumber() {
        val arr = arrayOf(2, 3, 1, 5, 6, 20)
        var largest = arr[0]
        for (i in 0 until arr.size) {
            if (arr[i] > largest)
                largest = arr[i]
        }

        print("Largest no.:$largest")
    }
}