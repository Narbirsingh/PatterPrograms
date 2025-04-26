package com.example.myapplication.arraydsa


fun main() {
    DsaArray().findSecondLargestNumberWithoutSorting2()
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

    /*
     Find Second Largest number in array with Sorting.
     [2,3,1,5,6,20]

        Brutal Solution
     */
    fun findSecondLargestNumber() {
        val arr = arrayOf(2, 6, 6, 20, 3, 1, 5, 6, 20).sorted()
        var largest = arr[0]
        var secondLargest = -1
        for (i in 0 until arr.size) {
            if (arr[i] > largest)
                largest = arr[i]
        }

        for (i in 0 until arr.size) {
            if (arr[i] < largest && largest != arr[i])
                secondLargest = arr[i]
        }
        println("Largest no :$largest")
        print("secondLargest no :$secondLargest")
    }

    /*
     Find Second Largest number in array without Sorting.
     [1,2,4,7,7,5]

     Better Solution
 */
    fun findSecondLargestNumberWithoutSorting() {
        val arr = arrayOf(6, 2, 4, 7, 7, 5, 3, 2, 1)
        var largest = arr[0]
        var secondLargest = -1
        for (i in 0 until arr.size) {
            if (arr[i] > largest)
                largest = arr[i]
        }

        for (i in 0 until arr.size) {
            if (arr[i] > secondLargest && largest != arr[i])
                secondLargest = arr[i]
        }
        println("Largest no :$largest")
        print("secondLargest no :$secondLargest")
    }

    /*
     Find Second Largest and second smallest number in array without Sorting.
     [1,2,4,7,7,5]
     Optimal Solution
 */
    fun findSecondLargestNumberWithoutSorting2() {
        val arr = arrayOf(6, -7, -4, 2, 4, 7, 7, 5, 3, 2, 1)


        val secondLargest = getSecondLargestNumber(arr)
        println("secondLargest no :$secondLargest  \n")

        val secondSmallest = getSecondSmallestNumber(arr)
        println("secondLargest no :$secondSmallest  \n")

    }

    //This function is used to find second largest number from array with optimal solution
    private fun getSecondLargestNumber(arr: kotlin.Array<kotlin.Int>): Int {
        var largest = arr[0]
        var sLargest = -11
        for (i in 0 until arr.size) {
            if (arr[i] > largest) {
                sLargest = largest
                largest = arr[i]
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i]
            }
        }
        println("Largest no :$largest")
        return sLargest
    }

    //This function is used to find second smallest number form array with optimal solution
    fun getSecondSmallestNumber(arr: Array<Int>): Int {
        var smallest = 100
        var sSmallest = -1
        for (i in 0 until arr.size) {
            if (arr[i] < smallest) {
                sSmallest = smallest
                smallest = arr[i]
            } else if (arr[i] > smallest && arr[i] < sSmallest) {
                sSmallest = arr[i]
            }
        }

        println("Smallest no :$smallest")
        return sSmallest  //secondSmallest
    }


    /*
  Check array is sorted or not.If sorted return true otherwise false
  [2,3,1,5,6,20]

  */
    fun checkArrayIsSortedOrNot() {
        val arr = arrayOf(1, 2, 0, 3, 4, 5, 6, 20)
        var largest = arr[0]
        var arraySortedStatus = true
        for (i in 0 until arr.size) {
            if (arr[i] >= largest) {
                largest = arr[i]
            } else {
                arraySortedStatus = false
                break
            }
        }
        print("Array is Sorted: $arraySortedStatus")

    }
}