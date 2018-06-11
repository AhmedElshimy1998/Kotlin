fun main(args: Array<String>) {
    var selectMenu: Int? = null
    println("hello in Select menu of my small program Multiplication table")
    println("1- print one Multiplication table u select it")
    println("2- print Multiplication table from  1 to 10")
    println("3- print Multiplication table from  x to y\n")
    print("plz enter value :")
    selectMenu = readLine()!!.toInt()
    when (selectMenu) {
    //1- print one Multiplication table u select it
        1 -> {

            var tableNumber: Int
            print("Plz enter table number : ")
            tableNumber = readLine()!!.toInt()


            for (table in 1..12) {
                var resultant: Int? = null
                resultant = tableNumber * table
                println("$tableNumber * $table = $resultant")

            }

        }

    //2- print Multiplication table from  1 to 10
        2 -> {

            for (tableNumber in 1..10) {
                println("hi u in table : $tableNumber")
                for (table in 1..12) {
                    var resultant: Int? = null
                    resultant = tableNumber * table
                    println("$tableNumber * $table = $resultant")

                }
                println("-----------------------------")

            }

        }

    //3- print Multiplication table from  x to x
        3 -> {

            var x: Int
            print("Plz enter x number : ")
            x = readLine()!!.toInt()

            var y: Int
            print("Plz enter y number : ")
            y = readLine()!!.toInt()

            for (tableNumber in x..y) {
                println("hi u in table : $tableNumber")
                for (table in 1..12) {
                    var resultant: Int? = null
                    resultant = tableNumber * table
                    println("$tableNumber * $table = $resultant")

                }
                println("-----------------------------")

            }
        }

    // u worng select
        else -> {


            println("plz rerun a program and He select right menu number ")
        }


    }

}
