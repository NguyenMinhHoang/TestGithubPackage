package com.tony.binsdk

import android.content.Context
import android.util.Log
import android.widget.Toast

class Car {

    fun idle(context: Context) {
        Log.d("HoangNM", "This car is idle")
        Toast.makeText(context, "This car is idle", Toast.LENGTH_LONG).show()
    }
    companion object {
        fun run(context: Context) {
            Log.d("HoangNM", "This car is running")
            Toast.makeText(context, "This car is running", Toast.LENGTH_LONG).show()
        }
    }
}