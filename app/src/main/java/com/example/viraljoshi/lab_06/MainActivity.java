package com.example.viraljoshi.lab_06;

import android.app.assist.AssistStructure;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button capture;
    //instanting the DrawImageView class
    private DrawImageView drawView;
    ImageView setImage;
    RelativeLayout relativelayout;
    private ImageButton currPaint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DrawImageView mDrawingView=new DrawImageView(this);
        setContentView(R.layout.activity_main);
        //casting out the relative layout
        relativelayout=(RelativeLayout)findViewById(R.id.relativelayout);
        //This thing will make user to draw or to paint on the image
        relativelayout.addView(mDrawingView);
        //casting button and image
        capture = (Button) findViewById(R.id.capture);
        setImage = (ImageView) findViewById(R.id.setImage);
//click event which is used to capture the image accessing the inbuit camera
        capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }
        });
    }
    //That image will be converted to bitmap and then it will ask user to set the image
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap photo = (Bitmap) data.getExtras().get("data");
        setImage.setImageBitmap(photo);
    }
}