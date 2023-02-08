package com.example.astonlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        exampleOfStoreUsage()
    }
    private fun exampleOfStoreUsage(){
        val store = StoreOfSimpleDataClass().apply {
            addNewEntry(SimpleDataClass("first", 0))
            addNewEntry(SimpleDataClass("second", 1))
            addNewEntry(SimpleDataClass("third", 2))
            addNewEntry(SimpleDataClass("fourth", 3))
            printTheStore()
        }
        store.deleteByIndex(2)
        store.printTheStore()
        store.clearTheStore()
        store.printTheStore()

    }
}