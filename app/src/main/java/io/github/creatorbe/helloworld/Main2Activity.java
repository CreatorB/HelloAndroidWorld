package io.github.creatorbe.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //terima string dari MainActivity
        Intent i = getIntent();
        String comment = i.getStringExtra(MainActivity.MESSAGES);

        //set string yang didapat ke textview di activity_main2
        TextView tv = (TextView)findViewById(R.id.isi_komen);
        tv.setText(comment);
    }
}
