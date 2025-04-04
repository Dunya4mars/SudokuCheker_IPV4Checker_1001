package IPV4

fun main() {
    val ValidIP: String = "192.168.1.1"
    val InvalidIP: String = "192.168.01.1"

    println("IPV4 VALID : ${isValidIPv4Optimized(ValidIP)}")
    println("IPV4 INVALID : ${isValidIPv4Optimized(InvalidIP)}")

}

// Initial implementation for TDD
//fun isValidIPv4(ip: String): Boolean {
//    return false
//}

fun isValidIPv4Optimized(ip: String): Boolean {
    val segments = ip.split('.')
    return segments.size == 4 && segments.all { isValidSegment(it) }
}

fun isValidSegment(segment: String): Boolean {
    if (segment.isEmpty() || segment.length > 3) {
        return false
    }

    if (!isNumeric(segment)) {
        return false
    }

    val value = segment.toInt()
    return value in 0..255 && !hasLeadingZero(segment)
}

fun isNumeric(str: String): Boolean {
    return str.all { it in '0'..'9' }
}

fun hasLeadingZero(str: String): Boolean {
    return str.length > 1 && str.startsWith('0')
}

