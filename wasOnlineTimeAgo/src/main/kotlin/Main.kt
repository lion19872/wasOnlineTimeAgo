fun agoToText(secondsAgo: Long): String {
    return when {
        secondsAgo in 0..60 -> "был(а) только что"
        secondsAgo in 61..60 * 60 -> "${minutesAgoToText(secondsAgo / 60)} назад"
        secondsAgo in 60 * 60 + 1..24 * 60 * 60 -> "${hoursAgoToText(secondsAgo / 3600)} назад"
        secondsAgo in 24 * 60 * 60 + 1..2 * 24 * 60 * 60 -> "вчера"
        secondsAgo in 2 * 24 * 60 * 60 + 1..3 * 24 * 60 * 60 -> "позавчера"
        else -> "давно"
    }
}

fun minutesAgoToText(minutes: Long): String {
    return when {
        minutes in 11..20 -> "$minutes минут назад"
        minutes % 10 == 1L -> "$minutes минуту назад"
        minutes % 10 in 2..4 -> "$minutes минуты назад"
        else -> "$minutes минут назад"
    }
}

fun hoursAgoToText(hours: Long): String {
    return when {
        hours in 11..20 -> "$hours часов назад"
        hours % 10 == 1L -> "$hours час назад"
        hours % 10 in 2..4 -> "$hours часа назад"
        else -> "$hours часов назад"
    }
}

fun main() {
    // Пример использования
    val secondsAgo: Long = 3600 // Например, 1 час назад
    val result = agoToText(secondsAgo)
    println(result) // Output: 1 час назад
}
