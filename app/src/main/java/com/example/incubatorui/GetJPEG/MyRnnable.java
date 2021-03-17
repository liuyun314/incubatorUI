package com.example.incubatorui.GetJPEG;

import android.graphics.Bitmap;

public class MyRnnable implements Runnable{
    Bitmap bitmap=null;

    /**
     * 将当前对象存储起来
     * @param b
     */
    public MyRnnable(Bitmap b){
        this.bitmap = b;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    @Override
    public void run() {

    }
}
