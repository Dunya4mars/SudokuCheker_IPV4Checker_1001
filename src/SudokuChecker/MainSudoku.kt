package SudokuChecker

import validBoard
import validSudokuDynamic
import kotlin.math.sqrt


fun main() {
    println("Sudoku Is It Valid: ${isValidSudoku(validBoard)}")
    println("SudokuDynamic Is It: ${isValidSudoku(validSudokuDynamic)}")
}

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val size = board.size

    if (board.isEmpty() || size != board.firstOrNull()?.size) {
        return false
    }

    val boxSize = sqrt(size.toDouble()).toInt()

    if (boxSize * boxSize != size && size != 1) {
        return false
    }

    return checkRowsDynamic(board, size) &&
            checkColumnsDynamic(board, size) &&
            checkBoxesDynamic(board, size, boxSize)
}

fun checkRowsDynamic(board: Array<CharArray>, size: Int): Boolean {
    for (row in 0 until size) {
        if (hasDuplicatesDynamic(board[row])) {
            return false
        }
    }
    return true
}

fun checkColumnsDynamic(board: Array<CharArray>, size: Int): Boolean {
    for (col in 0 until size) {
        val column = CharArray(size)
        for (row in 0 until size) {
            column[row] = board[row][col]
        }
        if (hasDuplicatesDynamic(column)) {
            return false
        }
    }
    return true
}

fun checkBoxesDynamic(board: Array<CharArray>, size: Int, boxSize: Int): Boolean {
    if (size == 1) {
        return true
    }
    for (boxRow in 0 until size step boxSize) {
        for (boxCol in 0 until size step boxSize) {
            val box = CharArray(size)
            var index = 0
            for (row in boxRow until boxRow + boxSize) {
                for (col in boxCol until boxCol + boxSize) {
                    box[index++] = board[row][col]
                }
            }
            if (hasDuplicatesDynamic(box)) {
                return false
            }
        }
    }
    return true
}

fun hasDuplicatesDynamic(arr: CharArray): Boolean {
    val seen = mutableSetOf<Char>()
    for (c in arr) {
        if (c != '-' && c in seen) {
            return true
        }
        seen.add(c)
    }
    return false
}

