package IPV4

fun check(name: String, ip: String, correctResult: Boolean) {
    val result = isValidIPv4Optimized(ip)
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name (Expected: $correctResult, Got: $result)")
    }
}

fun main() {
    // Test cases

    check(
        name = "Valid IPv4 ",
        ip = "192.168.1.1", true
    )
    check(
        name = "Valid IPv4 with zero",
        ip = "0.0.0.0", true
    )
    check(name = "Valid IPv4 with max value", "255.255.255.255", true)

    check(
        name = "InValid IPv4  With Char",
        ip = "..l..",
        correctResult = false
    )
    check(
        name = "InValid IPv4 is Empty",
        ip = "l....",
        correctResult = false
    )
    check(
        name = "Invalid IPv4 - too many segments",
        ip = "192.168.1.1.1",
        correctResult = false
    )
    check(
        name = "Invalid IPv4 - too few segments",
        ip = "192.168.1",
        correctResult = false
    )
    check(
        name = "Invalid IPv4 - leading zero",
        ip = "192.168.01.1",
        correctResult = false
    )
    check(
        name = "Invalid IPv4 - out of range",
        ip = "192.168.256.1",
        correctResult = false
    )
    check(
        name = "Invalid IPv4 - non-numeric segment",
        ip = "192.168.a.1",
        correctResult = false
    )
    check(
        name = "Invalid IPv4 - extra characters",
        ip = "192.168.1.1abc",
        correctResult = false
    )
    check(
        name = "Invalid IPv4 - negative number",
        ip = "-1.168.1.1",
        correctResult = false
    )
    check(
        name = "Invalid IPv4 - empty string",
        ip = "",
        correctResult = false
    )
    check(
        name = "Invalid IPv4 - only dots",
        ip = "...",
        correctResult = false
    )
    check(
        name = "Invalid IPv4 - dots and one number",
        ip = "1...",
        correctResult = false
    )
    check(
        name = "Invalid IPv4 - large number in one segment",
        ip = "192.168.1.1000",
        correctResult = false
    )
    check(
        name = "Invalid IPv4 - leading zero multiple",
        ip = "192.168.001.1",
        correctResult = false
    )
}