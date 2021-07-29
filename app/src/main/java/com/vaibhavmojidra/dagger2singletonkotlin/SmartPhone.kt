package com.vaibhavmojidra.dagger2singletonkotlin

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SmartPhone @Inject constructor(val battery:Battery,val simCard:SimCard,val memoryCard:MemoryCard) {
    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()
        Log.i("MyInfo","SmartPhone Constructed")
    }

    fun makeCallRecording(){
        Log.i("MyInfo","Calling...")
    }
}