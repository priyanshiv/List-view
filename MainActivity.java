package com.example.dialing;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText text;
Button dialing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(EditText)findViewById(R.id.no);
        dialing=(Button)findViewById(R.id.dialing);
        dialing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1=text.getText().toString();
                if(TextUtils.isEmpty(text1)) {
                    text.setError("Enter no");
                }
                else
                {
                    Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+text1));
                    startActivity(i);
                }
            }
        });
    }
}
