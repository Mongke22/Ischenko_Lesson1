package com.example.astonlesson1

import android.util.Log

class PrinterOfSimpleDataClass {
    private var store: MutableList<SimpleDataClass> = arrayListOf()
    fun addNewEntry(simpleDataClass: SimpleDataClass){
        Log.i("SimpleDataClass", "inserted")
        store.add(simpleDataClass)
    }
    fun deleteByIndex(index: Int){
        if(index >= 0 && index <= store.lastIndex) {
            store.removeAt(index)
        }
    }
    fun clearTheStore(){
        store.clear()
    }
}