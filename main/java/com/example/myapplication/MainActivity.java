package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  //  SurfaceHolder holder;
  //  SurfaceView surface;


    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    String path = "/sdcard/v1080.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String action = intent.getAction();
        if (intent.ACTION_VIEW.equals(action)) {

            Log.e("TAG", "onCreate: enter 1" + action );
        }else
        {
            Log.e("TAG", "onCreate: enter 2" + action);
        }


     //   m_xplay.start();
 //       surface = (SurfaceView) findViewById(R.id.surfaceView);
    // holder =  surface.getHolder();

        // Example of a call to a native method
      //  TextView tv = findViewById(R.id.sample_text);
       // String  str = "/sdcard/v1080.mp4";

     //   tv.setText(stringFromJNI());

      
    }
/*
    public void prepare(View V)
    {
        MediaPlayer player = new MediaPlayer();

      try {
          player.setDataSource(path);

          player.prepareAsync();
            player.setDisplay(holder);
          player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
              @Override
              public void onPrepared(MediaPlayer mp) {
                mp.start();
              }
          });
      } catch (Exception e)
      {

          e.printStackTrace();
      }
    }
*/

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
