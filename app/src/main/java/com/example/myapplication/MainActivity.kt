package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    private var Tags="kalyani"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CoroutineScope(Dispatchers.IO).launch {
            printFollowers()
        }
//        CoroutineScope()
    }
    private suspend fun printFollowers(){
        var  jaji=0                                                                                                 //getting image from drawable
        CoroutineScope(Dispatchers.IO).launch {
            jaji=getFollowers()
        }
        Log.d(Tags,jaji.toString())
//        var fellow1= CoroutineScope(Dispatchers.IO).async {
//                getFollowers()
//        }
//        Log.d(Tags,fellow1.await().toString())
    }

    private suspend fun getFollowers(): Int {                                                                           //getting from the google videos or imges
        delay(1600)
        return 54
    }
}

