package com.tom.chat

class CheckLog {
    var x = false
    var data = listOf<String>(" ","~","!","#","$","%","^","&","*","(",")","_","-","+","=","?","<",">",".","—","，","。","/","","|","《",",","》"
        ,"？",";",":","：","'","‘","；","“")
    fun check(account: String, secret: String){
        x = if (account.length >20 || account.length <4) false
            else if (secret.length >12 || secret.length <6) false
            else for ()

    }

}