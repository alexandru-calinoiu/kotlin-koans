package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return  days() - days(other)
    }

    private fun days(date: MyDate = this) : Int {
        return date.year * 365 + date.month * 31 + date.dayOfMonth
    }
}

operator fun MyDate.rangeTo(other: MyDate): DateRange = DateRange(this, other)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(override val start: MyDate, override val endInclusive: MyDate) : ClosedRange<MyDate>, Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            private var date = start

            override fun hasNext(): Boolean = date <= endInclusive

            override fun next(): MyDate {
                val currentDate = date
                date = date.nextDay()
                return currentDate
            }
        }
    }
}
