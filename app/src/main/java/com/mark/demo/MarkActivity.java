package com.mark.demo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MarkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark);

        TextView textView = (TextView) findViewById(R.id.tv_text_style);
        //3D的字体设置，资源包下载地址https://fonts.google.com/
        // 学习网址资料介绍：https://mp.weixin.qq.com/s/LKYWgjKLbBKkwXge0uh6gg
        //        https://www.1001freefonts.com/
        Typeface typeface = Typeface.createFromAsset(getAssets(),"orangejuice2.0.ttf");
        textView.setTypeface(typeface);
    }
}
