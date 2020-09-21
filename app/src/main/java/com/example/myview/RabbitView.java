package com.example.myview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Author: Created by zwp on 2020/9/19.
 */
public class RabbitView extends View {
    //定义两个全局变量
    public float bitmapX;
    public float bitmapY;
    //构造方法(带一个参数)
    public RabbitView(Context context) {
        super(context);
        bitmapX = 290;
        bitmapY = 130;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //创建并实例化一个画笔对象
        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.rabbit);
        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);
        //强制回收图片
        if(bitmap.isRecycled()){
            bitmap.recycle();
        }
    }
}
