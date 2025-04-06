package com.example.ch08_event

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.example.ch08_event.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    //터치이벤트
    override fun onTouchEvent(event: MotionEvent?): Boolean {

        when(event?.action){
            MotionEvent.ACTION_DOWN -> Log.d("tag", "Touch Down ${event.x}, ${event.y}")
            MotionEvent.ACTION_UP -> Log.d("tag", "Touch Up Event")
        }
        return super.onTouchEvent(event)
    }
}