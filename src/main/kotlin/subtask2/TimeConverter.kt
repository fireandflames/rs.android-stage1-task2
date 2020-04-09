package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        var intHours = hour.toInt()
        var intMinutes = minute.toInt()
        var mapOfMinutes : MutableMap<Int, String>
        mapOfMinutes = mutableMapOf<Int, String>()
        mapOfMinutes.put(1,"one")
        mapOfMinutes.put(2,"two")
        mapOfMinutes.put(3,"three")
        mapOfMinutes.put(4,"four")
        mapOfMinutes.put(5,"five")
        mapOfMinutes.put(6,"six")
        mapOfMinutes.put(7,"seven")
        mapOfMinutes.put(8,"eight")
        mapOfMinutes.put(9,"nine")
        mapOfMinutes.put(10,"ten")
        mapOfMinutes.put(11,"eleven")
        mapOfMinutes.put(12,"twelve")
        mapOfMinutes.put(13,"thirteen")
        mapOfMinutes.put(14,"fourteen")
        mapOfMinutes.put(15,"quarter")
        mapOfMinutes.put(16,"sixteen")
        mapOfMinutes.put(17,"seventeen")
        mapOfMinutes.put(18,"eighteen")
        mapOfMinutes.put(19,"nineteen")
        mapOfMinutes.put(20,"twenty")
        mapOfMinutes.put(21,"twenty one")
        mapOfMinutes.put(22,"twenty two")
        mapOfMinutes.put(23,"twenty three")
        mapOfMinutes.put(24,"twenty four")
        mapOfMinutes.put(25,"twenty five")
        mapOfMinutes.put(26,"twenty six")
        mapOfMinutes.put(27,"twenty seven")
        mapOfMinutes.put(28,"twenty eight")
        mapOfMinutes.put(29,"twenty nine")
        mapOfMinutes.put(30, "half")
        var listOfHours :List<String>
        listOfHours = listOf("twelve","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve")
        if(intMinutes == 0) { return listOfHours.get(intHours) + " o' clock"}
        if(intMinutes ==1) { return mapOfMinutes.get(intMinutes) + " minute past " + listOfHours.get(intHours)}
        if(intMinutes ==15) { return mapOfMinutes.get(intMinutes) + " past " + listOfHours.get(intHours)}
        if(intMinutes <30) { return mapOfMinutes.get(intMinutes) + " minutes past " + listOfHours.get(intHours)}
        if(intMinutes ==30) { return mapOfMinutes.get(intMinutes) + " past " + listOfHours.get(intHours)}
        if(intMinutes ==45) { return mapOfMinutes.get(60-intMinutes) + " to " + listOfHours.get(intHours+1)}
        if(intMinutes >30 && intMinutes <60) { return mapOfMinutes.get(60-intMinutes) + " minutes to " + listOfHours.get(intHours+1)}
        return ""
    }
}
