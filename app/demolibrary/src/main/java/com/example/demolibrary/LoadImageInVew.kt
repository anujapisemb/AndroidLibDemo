package com.example.demolibrary

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

class LoadImageInView {
    companion object {
        fun loadImage(context:Context,imageView: ImageView){
            var options: RequestOptions = RequestOptions()
                .centerCrop()
                .placeholder(R.drawable.progress_animation)
//            .error(R.drawable.user_image)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.HIGH)
                .dontAnimate()
                .dontTransform()
            Glide.with(context).load("https://picsum.photos/id/237/200/300").apply(options).into(imageView);
//            Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
        }
    }
}