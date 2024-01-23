package com.example.androidLibDemo.ui.theme

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.androidLibDemo.R
import com.example.androidLibDemo.databinding.ActivityMainBinding
import com.example.demolibrary.LoadImageInView


class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        LoadImageInView.loadImage(this,activityMainBinding.homeImageView)
//        var options: RequestOptions = RequestOptions()
//            .centerCrop()
//            .placeholder(R.drawable.progress_animation)
////            .error(R.drawable.user_image)
//            .diskCacheStrategy(DiskCacheStrategy.ALL)
//            .priority(Priority.HIGH)
//            .dontAnimate()
//            .dontTransform()
//        Glide.with(this).load("https://picsum.photos/id/237/200/300").apply(options).into(activityMainBinding.homeImageView);

    }
}
