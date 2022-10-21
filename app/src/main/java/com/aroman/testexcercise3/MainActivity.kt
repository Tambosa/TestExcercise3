package com.aroman.testexcercise3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import at.wirecube.additiveanimations.additive_animator.AdditiveAnimator
import com.aroman.testexcercise3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainContainer.setOnTouchListener { view, motionEvent ->
            view.performClick()
            AdditiveAnimator.animate(binding.imageBike, 1000).x(motionEvent.x-64).y(motionEvent.y-64)
                .start()
            true
        }
    }
}