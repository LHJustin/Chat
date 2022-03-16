package com.tom.chat

import androidx.lifecycle.ViewModel

class CheckLog: ViewModel() {
    var x = false
    var y = 0
    var data = listOf<String>(" ","~","!","#","$","%","^","&","*","(",")","_","-","+","=","?","<",">",".","—","，","。","/"
        ,"\\","|","《",",","》","？",";",":","：","'","‘","；","“")

    fun check(account: String, secret: String){
        data.forEach {
            if (account.indexOf(it)== 1 || secret.indexOf(it)== 1) y++
        }
        x = if (account.length >20 || account.length <4) false
            else if (secret.length >12 || secret.length <6) false
            else if (y>0) false
            else true
    }
}