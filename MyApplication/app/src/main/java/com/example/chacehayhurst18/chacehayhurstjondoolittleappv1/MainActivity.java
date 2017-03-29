package com.example.chacehayhurst18.chacehayhurstjondoolittleappv1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bitmap = BitmapFactory.decodeResource(R.drawable.ic_android_black_24dp, 0);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(4);
    }

}
