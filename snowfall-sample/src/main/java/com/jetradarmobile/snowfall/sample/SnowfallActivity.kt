package com.jetradarmobile.snowfall.sample

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jetradarmobile.snowfall.SnowfallView

class SnowfallActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_snowfall)

    findViewById<SnowfallView>(R.id.snowfall).setSnowflakeBitmaps(listOf(
      BitmapFactory.decodeResource(resources, R.drawable.egg),
      BitmapFactory.decodeResource(resources, R.drawable.egg2),
      BitmapFactory.decodeResource(resources, R.drawable.egg3),
      BitmapFactory.decodeResource(resources, R.drawable.egg4)
    ))
  }
}
