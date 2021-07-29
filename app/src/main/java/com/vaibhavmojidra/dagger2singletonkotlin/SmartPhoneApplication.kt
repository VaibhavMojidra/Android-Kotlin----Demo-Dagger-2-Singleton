package com.vaibhavmojidra.dagger2singletonkotlin

import android.app.Application

class SmartPhoneApplication: Application() {
    lateinit var smartPhoneComponent: SmartPhoneComponent
    override fun onCreate() {
        smartPhoneComponent=initDagger()
        super.onCreate()
    }
    private fun initDagger():SmartPhoneComponent=DaggerSmartPhoneComponent.create()
}