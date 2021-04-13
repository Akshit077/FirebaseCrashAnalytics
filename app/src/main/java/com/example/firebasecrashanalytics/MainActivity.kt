package com.example.firebasecrashanalytics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.perf.FirebasePerformance
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* Log.d("OnCreate", "${intent.extras?.getString(("my_data"))}")

        findViewById<Button>(R.id.btn).setOnClickListener()
        {
            throw RuntimeException("Test Crash")
        }*/
        myFunction()
    }
}
    val myTrace = FirebasePerformance.getInstance().newTrace("testTrace")
    private fun myFunction() {
        myTrace.start()
        myTrace.incrementMetric("Hi this is akshit",2)
        myTrace.stop()
}