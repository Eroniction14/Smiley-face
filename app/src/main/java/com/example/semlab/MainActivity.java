package com.example.semlab;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.ImageView;

public class MainActivity extends Activity {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //Creating a Bitmap
            Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);
            //Setting the Bitmap as background for the ImageView
            ImageView i = (ImageView) findViewById(R.id.imageView);
            i.setBackgroundDrawable(new BitmapDrawable(bg));
            //Creating the Canvas Object
            Canvas canvas = new Canvas(bg);
            //Creating the Paint Object and set its color & TextSize
            Paint paint = new Paint();

            Paint paint2 = new Paint();
            paint2.setColor(Color.BLACK);
            paint.setColor(Color.YELLOW);//
            canvas.drawCircle(350, 350, 300, paint);
            canvas.drawCircle(250, 250, 30, paint2);
            canvas.drawCircle(450, 250, 30, paint2);
            RectF rectF = new RectF(300, 300, 400, 500);
            canvas.drawArc (rectF, 0, 180, false, paint2);



        }
    }