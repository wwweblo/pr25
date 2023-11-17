package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton = findViewById<View>(R.id.cry)

        playButton.setOnClickListener {
            // Загрузить MP3 файл
            mediaPlayer = MediaPlayer.create(this, R.raw.cry)

            // Запустить воспроизведение
            mediaPlayer.start()
        }
    }
}