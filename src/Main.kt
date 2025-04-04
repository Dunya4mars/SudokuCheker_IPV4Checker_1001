import SudokuChecker.isValidSudoku

fun main() {

    //9*9
    println("validSudoku is valid 9*9 : ${isValidSudoku(validBoard)}")
    println("invalidRowSudoku is valid 9*9 : ${isValidSudoku(invalidRowBoard)}")
    println("invalidColumnSudoku is valid 9*9 : ${isValidSudoku(invalidColumnBoard)}")
    println("invalidBoxSudoku is valid 9*9 : ${isValidSudoku(invalidBoxBoard)}")
    //4*4
    println("validSudokuDynamic is valid 4*4 : ${isValidSudoku(validSudokuDynamic)}")
    println("invalidRowSudokuDynamic is valid 4*4 : ${isValidSudoku(invalidRowSudokuDynamic)}")
    println("invalidColumnSudokuDynamic is valid 4*4 : ${isValidSudoku(invalidColumnSudokuDynamic)}")
    println("invalidBoxSudokuDynamic is valid 4*4 : ${isValidSudoku(invalidBoxSudokuDynamic)}")
    //16*16
    println("validBoardSudokuDynamic is valid 16*16 : ${isValidSudoku(validBoardSudokuDynamic)}")
    println("invalidRowBoardSudokuDynamic is valid 16*16 : ${isValidSudoku(invalidRowBoardSudokuDynamic)}")
    println("invalidColBoardSudokuDynamic is valid 16*16 : ${isValidSudoku(invalidColBoardSudokuDynamic)}")
    println("invalidBoxBoardSudokuDynamic is valid 16*16 : ${isValidSudoku(invalidBoxBoardSudokuDynamic)}")
}


// Board for 9x9 Sudoku
val validBoard = arrayOf(
    charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
    charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
    charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
    charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
)

val invalidRowBoard = arrayOf(
    charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
    charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
    charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
    charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    charArrayOf('5', '-', '-', '-', '8', '-', '-', '7', '9')
)

val invalidColumnBoard = arrayOf(
    charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
    charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
    charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
    charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    charArrayOf('5', '-', '-', '-', '8', '-', '-', '7', '9')
)

val invalidBoxBoard = arrayOf(
    charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
    charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
    charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
    charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    charArrayOf('5', '-', '-', '-', '8', '-', '-', '7', '9')
)

// Board for 4*4 Sudoku
val validSudokuDynamic = arrayOf(
    charArrayOf('1', '2', '3', '4'),
    charArrayOf('3', '4', '1', '2'),
    charArrayOf('2', '1', '4', '3'),
    charArrayOf('4', '3', '2', '1')
)
val invalidRowSudokuDynamic = arrayOf(
    charArrayOf('1', '2', '1', '4'),
    charArrayOf('3', '4', '-', '2'),
    charArrayOf('2', '1', '4', '3'),
    charArrayOf('4', '3', '2', '1')
)

val invalidColumnSudokuDynamic = arrayOf(
    charArrayOf('1', '2', '3', '4'),
    charArrayOf('3', '4', '1', '2'),
    charArrayOf('1', '1', '4', '3'),
    charArrayOf('4', '3', '2', '1')
)

val invalidBoxSudokuDynamic = arrayOf(
    charArrayOf('1', '2', '3', '4'),
    charArrayOf('3', '1', '1', '2'),
    charArrayOf('2', '4', '3', '1'),
    charArrayOf('4', '3', '2', '1')
)
// Board for 16*16 Sudoku
val validBoardSudokuDynamic = arrayOf(
    charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'),
    charArrayOf('4', '5', '6', '7', '0', '1', '2', '3', 'C', 'D', 'E', 'F', '8', '9', 'A', 'B'),
    charArrayOf('8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '0', '1', '2', '3', '4', '5', '6', '7'),
    charArrayOf('C', 'D', 'E', 'F', '8', '9', 'A', 'B', '4', '5', '6', '7', '0', '1', '2', '3'),

    charArrayOf('1', '0', '3', '2', '5', '4', '7', '6', '9', '8', 'B', 'A', 'D', 'C', 'F', 'E'),
    charArrayOf('5', '4', '7', '6', '1', '0', '3', '2', 'D', 'C', 'F', 'E', '9', '8', 'B', 'A'),
    charArrayOf('9', '8', 'B', 'A', 'D', 'C', 'F', 'E', '1', '0', '3', '2', '5', '4', '7', '6'),
    charArrayOf('D', 'C', 'F', 'E', '9', '8', 'B', 'A', '5', '4', '7', '6', '1', '0', '3', '2'),

    charArrayOf('2', '3', '0', '1', '6', '7', '4', '5', 'A', 'B', '8', '9', 'F', 'E', 'D', 'C'),
    charArrayOf('6', '7', '4', '5', '2', '3', '0', '1', 'E', 'F', 'C', 'D', 'A', 'B', '8', '9'),
    charArrayOf('A', 'B', '8', '9', 'E', 'F', 'C', 'D', '2', '3', '0', '1', '6', '7', '4', '5'),
    charArrayOf('E', 'F', 'C', 'D', 'A', 'B', '8', '9', '6', '7', '4', '5', '2', '3', '0', '1'),

    charArrayOf('3', '2', '1', '0', '7', '6', '5', '4', 'B', 'A', '9', '8', 'E', 'D', 'C', 'F'),
    charArrayOf('7', '6', '5', '4', '3', '2', '1', '0', 'F', 'E', 'D', 'C', 'B', 'A', '9', '8'),
    charArrayOf('B', 'A', '9', '8', 'F', 'E', 'D', 'C', '3', '2', '1', '0', '7', '6', '5', '4'),
    charArrayOf('F', 'E', 'D', 'C', 'B', 'A', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0')
)

//
//    val validBoardSudokuDynamic = arrayOf(
//        charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'),
//        charArrayOf('4', '5', '6', '7', '0', '1', '2', '3', 'C', 'D', 'E', 'F', '8', '9', 'A', 'B'),
//        charArrayOf('8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '0', '1', '2', '3', '4', '5', '6', '7'),
//        charArrayOf('C', 'D', 'E', 'F', '8', '9', 'A', 'B', '4', '5', '6', '7', '0', '1', '2', '3'),
//        charArrayOf('1', '0', '3', '2', '5', '4', '7', '6', '9', '8', 'B', 'A', 'E', 'F', 'D', 'C'),
//        charArrayOf('5', '4', '7', '6', '1', '0', '3', '2', 'D', 'C', 'F', 'E', '9', '8', 'B', 'A'),
//        charArrayOf('9', '8', 'B', 'A', 'D', 'C', 'F', 'E', '1', '0', '3', '2', '5', '4', '7', '6'),
//        charArrayOf('D', 'C', 'F', 'E', '9', '8', 'B', 'A', '5', '4', '7', '6', '1', '0', '3', '2'),
//        charArrayOf('2', '3', '0', '1', '6', '7', '4', '5', 'A', 'B', '8', '9', 'F', 'E', 'C', 'D'),
//        charArrayOf('6', '7', '4', '5', '2', '3', '0', '1', 'E', 'F', 'C', 'D', 'A', 'B', '8', '9'),
//        charArrayOf('A', 'B', '8', '9', 'E', 'F', 'C', 'D', '2', '3', '0', '1', '6', '7', '4', '5'),
//        charArrayOf('E', 'F', 'C', 'D', 'A', 'B', '8', '9', '6', '7', '4', '5', '2', '3', '0', '1'),
//        charArrayOf('3', '2', '1', '0', '7', '6', '5', '4', 'B', 'A', '9', '8', 'F', 'D', 'C', 'E'),
//        charArrayOf('7', '6', '5', '4', '3', '2', '1', '0', 'F', 'E', 'D', 'C', 'B', 'A', '9', '8'),
//        charArrayOf('B', 'A', '9', '8', 'F', 'E', 'D', 'C', '3', '2', '1', '0', '7', '6', '5', '4'),
//        charArrayOf('F', 'E', 'D', 'C', 'B', 'A', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0')
//    )

    val invalidRowBoardSudokuDynamic = arrayOf(
        charArrayOf('0', '1', '2', '0', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'),
        charArrayOf('4', '5', '6', '7', '0', '1', '2', '3', 'C', 'D', 'E', 'F', '8', '9', 'A', 'B'),
        charArrayOf('8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '0', '1', '2', '3', '4', '5', '6', '7'),
        charArrayOf('C', 'D', 'E', 'F', '8', '9', 'A', 'B', '4', '5', '6', '7', '0', '1', '2', '3'),
        charArrayOf('1', '0', '3', '2', '5', '4', '7', '6', '9', '8', 'B', 'A', 'E', 'F', 'D', 'C'),
        charArrayOf('5', '4', '7', '6', '1', '0', '3', '2', 'D', 'C', 'F', 'E', '9', '8', 'B', 'A'),
        charArrayOf('9', '8', 'B', 'A', 'D', 'C', 'F', 'E', '1', '0', '3', '2', '5', '4', '7', '6'),
        charArrayOf('D', 'C', 'F', 'E', '9', '8', 'B', 'A', '5', '4', '7', '6', '1', '0', '3', '2'),
        charArrayOf('2', '3', '0', '1', '6', '7', '4', '5', 'A', 'B', '8', '9', 'F', 'E', 'C', 'D'),
        charArrayOf('6', '7', '4', '5', '2', '3', '0', '1', 'E', 'F', 'C', 'D', 'A', 'B', '8', '9'),
        charArrayOf('A', 'B', '8', '9', 'E', 'F', 'C', 'D', '2', '3', '0', '1', '6', '7', '4', '5'),
        charArrayOf('E', 'F', 'C', 'D', 'A', 'B', '8', '9', '6', '7', '4', '5', '2', '3', '0', '1'),
        charArrayOf('3', '2', '1', '0', '7', '6', '5', '4', 'B', 'A', '9', '8', 'F', 'D', 'C', 'E'),
        charArrayOf('7', '6', '5', '4', '3', '2', '1', '0', 'F', 'E', 'D', 'C', 'B', 'A', '9', '8'),
        charArrayOf('B', 'A', '9', '8', 'F', 'E', 'D', 'C', '3', '2', '1', '0', '7', '6', '5', '4'),
        charArrayOf('F', 'E', 'D', 'C', 'B', 'A', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0')
    )

    val invalidColBoardSudokuDynamic = arrayOf(
        charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'),
        charArrayOf('4', '5', '6', '7', '0', '1', '2', '3', 'C', 'D', 'E', 'F', '8', '9', 'A', 'B'),
        charArrayOf('8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '0', '1', '2', '3', '4', '5', '6', '7'),
        charArrayOf('C', 'D', 'E', 'F', '8', '9', 'A', 'B', '4', '5', '6', '7', '0', '1', '2', '3'),
        charArrayOf('0', '0', '3', '2', '5', '4', '7', '6', '9', '8', 'B', 'A', 'E', 'F', 'D', 'C'),
        charArrayOf('5', '4', '7', '6', '1', '0', '3', '2', 'D', 'C', 'F', 'E', '9', '8', 'B', 'A'),
        charArrayOf('9', '8', 'B', 'A', 'D', 'C', 'F', 'E', '1', '0', '3', '2', '5', '4', '7', '6'),
        charArrayOf('D', 'C', 'F', 'E', '9', '8', 'B', 'A', '5', '4', '7', '6', '1', '0', '3', '2'),
        charArrayOf('2', '3', '0', '1', '6', '7', '4', '5', 'A', 'B', '8', '9', 'F', 'E', 'C', 'D'),
        charArrayOf('6', '7', '4', '5', '2', '3', '0', '1', 'E', 'F', 'C', 'D', 'A', 'B', '8', '9'),
        charArrayOf('A', 'B', '8', '9', 'E', 'F', 'C', 'D', '2', '3', '0', '1', '6', '7', '4', '5'),
        charArrayOf('E', 'F', 'C', 'D', 'A', 'B', '8', '9', '6', '7', '4', '5', '2', '3', '0', '1'),
        charArrayOf('3', '2', '1', '0', '7', '6', '5', '4', 'B', 'A', '9', '8', 'F', 'D', 'C', 'E'),
        charArrayOf('7', '6', '5', '4', '3', '2', '1', '0', 'F', 'E', 'D', 'C', 'B', 'A', '9', '8'),
        charArrayOf('B', 'A', '9', '8', 'F', 'E', 'D', 'C', '3', '2', '1', '0', '7', '6', '5', '4'),
        charArrayOf('F', 'E', 'D', 'C', 'B', 'A', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0')
    )

    val invalidBoxBoardSudokuDynamic = arrayOf(
        charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'),
        charArrayOf('4', '0', '6', '7', '0', '1', '2', '3', 'C', 'D', 'E', 'F', '8', '9', 'A', 'B'),
        charArrayOf('8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '0', '1', '2', '3', '4', '5', '6', '7'),
        charArrayOf('C', 'D', 'E', 'F', '8', '9', 'A', 'B', '4', '5', '6', '7', '0', '1', '2', '3'),
        charArrayOf('1', '0', '3', '2', '5', '4', '7', '6', '9', '8', 'B', 'A', 'E', 'F', 'D', 'C'),
        charArrayOf('5', '4', '7', '6', '1', '0', '3', '2', 'D', 'C', 'F', 'E', '9', '8', 'B', 'A'),
        charArrayOf('9', '8', 'B', 'A', 'D', 'C', 'F', 'E', '1', '0', '3', '2', '5', '4', '7', '6'),
        charArrayOf('D', 'C', 'F', 'E', '9', '8', 'B', 'A', '5', '4', '7', '6', '1', '0', '3', '2'),
        charArrayOf('2', '3', '0', '1', '6', '7', '4', '5', 'A', 'B', '8', '9', 'F', 'E', 'C', 'D'),
        charArrayOf('6', '7', '4', '5', '2', '3', '0', '1', 'E', 'F', 'C', 'D', 'A', 'B', '8', '9'),
        charArrayOf('A', 'B', '8', '9', 'E', 'F', 'C', 'D', '2', '3', '0', '1', '6', '7', '4', '5'),
        charArrayOf('E', 'F', 'C', 'D', 'A', 'B', '8', '9', '6', '7', '4', '5', '2', '3', '0', '1'),
        charArrayOf('3', '2', '1', '0', '7', '6', '5', '4', 'B', 'A', '9', '8', 'F', 'D', 'C', 'E'),
        charArrayOf('7', '6', '5', '4', '3', '2', '1', '0', 'F', 'E', 'D', 'C', 'B', 'A', '9', '8'),
        charArrayOf('B', 'A', '9', '8', 'F', 'E', 'D', 'C', '3', '2', '1', '0', '7', '6', '5', '4'),
        charArrayOf('F', 'E', 'D', 'C', 'B', 'A', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0')
    )

