package com.example.curvedpath;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.image);

        //----> New Path Added
        Path path=new Path();

        //---->Customized New Path
        path.arcTo(0f,0f,1000f,1000f,270f,-180f,true);

        //---->Object Animator for Animation
        ObjectAnimator animator=ObjectAnimator.ofFloat(imageView, View.X,View.Y,path);
        
        animator.setDuration(3000);
        animator.start();
    }
}
