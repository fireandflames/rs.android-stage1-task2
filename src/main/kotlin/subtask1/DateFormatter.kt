package subtask1

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        var intDay = day.toInt()
        var intMonth = month.toInt()
        var intYear = year.toInt()
        var date : java.time.LocalDate
        try {
             date = java.time.LocalDate.of(intYear, intMonth, intDay)
        }
        catch ( e:java.time.DateTimeException)
        {
            return "Такого дня не существует"
        }
        var dayrus:String = ""
        var monthrus:String = ""
        if(date.dayOfWeek == java.time.DayOfWeek.MONDAY) { dayrus = "понедельник"}
        if(date.dayOfWeek == java.time.DayOfWeek.TUESDAY) { dayrus = "вторник"}
        if(date.dayOfWeek == java.time.DayOfWeek.WEDNESDAY) { dayrus = "среда"}
        if(date.dayOfWeek == java.time.DayOfWeek.THURSDAY) { dayrus = "четверг"}
        if(date.dayOfWeek == java.time.DayOfWeek.FRIDAY) { dayrus = "пятница"}
        if(date.dayOfWeek == java.time.DayOfWeek.SATURDAY) { dayrus = "суббота"}
        if(date.dayOfWeek == java.time.DayOfWeek.SUNDAY) { dayrus = "воскресенье"}
        if(date.month == java.time.Month.JANUARY) { monthrus = "января"}
        if(date.month == java.time.Month.FEBRUARY) { monthrus = "февраля"}
        if(date.month == java.time.Month.MARCH) { monthrus = "марта"}
        if(date.month == java.time.Month.APRIL) { monthrus = "апреля"}
        if(date.month == java.time.Month.MAY) { monthrus = "мая"}
        if(date.month == java.time.Month.JUNE) { monthrus = "июня"}
        if(date.month == java.time.Month.JULY) { monthrus = "июля"}
        if(date.month == java.time.Month.AUGUST) { monthrus = "августа"}
        if(date.month == java.time.Month.SEPTEMBER) { monthrus = "сентября"}
        if(date.month == java.time.Month.OCTOBER) { monthrus = "октября"}
        if(date.month == java.time.Month.NOVEMBER) { monthrus = "ноября"}
        if(date.month == java.time.Month.DECEMBER) { monthrus = "декабря"}
        return intDay.toString() + " " + monthrus + ", " + dayrus

    }
}
