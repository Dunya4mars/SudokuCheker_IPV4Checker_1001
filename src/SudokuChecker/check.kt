package SudokuChecker

import invalidBoxBoard
import invalidBoxBoardSudokuDynamic
import invalidBoxSudokuDynamic
import invalidColBoardSudokuDynamic
import invalidColumnBoard
import invalidColumnSudokuDynamic
import invalidRowBoard
import invalidRowBoardSudokuDynamic
import invalidRowSudokuDynamic
import validBoard
import validBoardSudokuDynamic
import validSudokuDynamic


fun check(name: String, board: Array<CharArray>, correctResult: Boolean) {
    val result = isValidSudoku(board)
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name (Expected: $correctResult, Got: $result)")
    }
}

fun main() {

//9*9
    check(
        name = "Valid Sudoku9*9",
        board = validBoard,
        correctResult = true
    )
    check(
        name = "Invalid Sudoku (row9*9)",
        board = invalidRowBoard,
        correctResult = false
    )
    check(
        name = "Invalid Sudoku (column9*9)",
        board = invalidColumnBoard,
        correctResult = false
    )
    check(
        name = "Invalid Sudoku (box9*9)",
        board = invalidBoxBoard,
        correctResult = false
    )
    //4*4
    check(
        name = "Valid Sudoku4*4",
        board = validSudokuDynamic,
        correctResult = true
    )
    check(
        name = "Invalid Sudoku (row4*4)",
        board = invalidRowSudokuDynamic,
        correctResult = false
    )
    check(
        name = "Invalid Sudoku (column4*4)",
        board = invalidColumnSudokuDynamic,
        correctResult = false
    )
    check(
        name = "Invalid Sudoku (box4*4)",
        board = invalidBoxSudokuDynamic,
        correctResult = false
    )
    //16*16
    check(
        name = "Valid Sudoku16*16",
        board = validBoardSudokuDynamic,
        correctResult = true
    )
    check(
        name = "Invalid Sudoku (row16*16)",
        board = invalidRowBoardSudokuDynamic,
        correctResult = false
    )
    check(
        name = "Invalid Sudoku (column16*16)",
        board = invalidColBoardSudokuDynamic,
        correctResult = false
    )
    check(
        name = "Invalid Sudoku (box16*16)",
        board = invalidBoxBoardSudokuDynamic,
        correctResult = false
    )
}
