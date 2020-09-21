package com.example.myview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout = findViewById(R.id.myLayout);
        //创建并实例化RabbitView对象
        final RabbitView rabbitView = new RabbitView(this);
        //为小兔子添加触摸事件监听器
        rabbitView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                rabbitView.bitmapX = motionEvent.getX();
                rabbitView.bitmapY = motionEvent.getY();
                //重绘小兔子
                rabbitView.invalidate();
                return true;
            }
        });
        //将小兔子添加到布局管理器中
        frameLayout.addView(rabbitView);
    }
}