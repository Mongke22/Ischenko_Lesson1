package com.example.astonlesson1

import android.util.Log
import kotlin.math.log

class StoreOfSimpleDataClass {
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
    fun printTheStore(){
        Log.i("store", "________________________\n")
        for(element in store){
            Log.i("store", element.toString() + '\n')
        }
        Log.i("store", "________________________\n")
    }
}