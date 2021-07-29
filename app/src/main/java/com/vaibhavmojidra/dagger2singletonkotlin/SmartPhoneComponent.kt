package com.vaibhavmojidra.dagger2singletonkotlin

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface SmartPhoneComponent {
    fun inject(mainActivity: MainActivity)
}