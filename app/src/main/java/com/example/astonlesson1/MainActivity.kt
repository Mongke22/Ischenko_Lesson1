package com.example.astonlesson1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.ViewDebug.IntToString
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var rgScope: RadioGroup
    lateinit var textView: TextView
    var nullableString: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rgScope = findViewById(R.id.rg_scope)
        textView = findViewById(R.id.tv_text)

        rgScope.setOnCheckedChangeListener{_, checkedId ->

            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
            nullableString = "test"
            when(checkedId){
                R.id.rb_apply -> {
                    textView.apply {
                        text = "changed text"
                        setTextSize(TypedValue.COMPLEX_UNIT_SP, 40F)
                        setTextColor(Color.GRAY)
                    }
                    rgScope.setBackgroundColor(Color.YELLOW)
                }
                R.id.rb_with -> {
                    val veryveryveryveryveryveryveryveryveryveryveryveryLongNameToTypeHere = "123"
                    with(veryveryveryveryveryveryveryveryveryveryveryveryLongNameToTypeHere){
                        val size = length
                        val firstLetter = get(0)
                        val lastLetter = get(lastIndex)
                        textView.text = "$firstLetter..$lastLetter = $size"
                    }
                    rgScope.setBackgroundColor(Color.RED)
                }
                R.id.rb_let -> {
                    nullableString?.let{
                        textView.text = it
                    }
                    rgScope.setBackgroundColor(Color.CYAN)
                }
                R.id.rb_also -> {
                    var firstParam = 10
                    var secondParam = 20
                    textView.text = "first = $firstParam, second = $secondParam"
                    firstParam = secondParam.also{
                        secondParam = firstParam
                    }
                    textView.text = textView.text.toString() + "\nfirst = $firstParam, second = $secondParam"
                    rgScope.setBackgroundColor(Color.GREEN)
                }
            }
        }
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