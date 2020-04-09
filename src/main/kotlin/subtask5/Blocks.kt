package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        if(blockB == String::class)
        {
            var res:java.lang.StringBuilder
            res = java.lang.StringBuilder()
            for(item:Any in blockA)
            {if(item is String)
                res.append(item)
            }
            return res.toString()
        }
        if(blockB == Int::class)
        {
            var res:Int
            res = 0
            for(item:Any in blockA) {
                if(item is Int) {
                    res += item
                }
            }
            return res
        }
        else
        {
            var res:java.time.LocalDate
            res = java.time.LocalDate.MIN
            for(item:Any in blockA)
            {
                if(item is LocalDate)
                if(item.isAfter(res)) res = item
            }
            return res.format(java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"))
        }
        return 0
    }
}
