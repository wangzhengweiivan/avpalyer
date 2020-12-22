package com.example.myapplication;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.jar.Attributes;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class XPlay extends GLSurfaceView implements Runnable, SurfaceHolder.Callback, GLSurfaceView.Renderer {

   private final SurfaceHolder mHolder; // 声明一个表面持有者对象
/*
    public XPlay(Context context) {
        this(context, null);
    }
*/
    public XPlay(Context context, AttributeSet attrs){
        super(context,attrs);

        mHolder = getHolder();
        // 给表面持有者添加表面变更监听器
        mHolder.addCallback(this);

    }

    @Override
    public void run() {
       Open("/sdcard/v1080.mp4",mHolder.getSurface());
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        setRenderer(this);
        new Thread(this).start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }



    public native void Open(String url, Object surface);

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {

    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i1) {

    }

    @Override
    public void onDrawFrame(GL10 gl10) {

    }
}
