package io.github.creatorbe.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //membuat konstan komentar
    public static final String MESSAGES = "io.github.creatorbe.helloworld.MESSAGE";

    //deklarasi Onclicklistener sebagai object yang nantinya bisa di passing dengan Komentari
    private View.OnClickListener Komentari = new View.OnClickListener(){
        public void onClick (View v){
            //intent salah satu obyek yang bisa menjembati beberapa komponen
            Intent i = new Intent(getApplicationContext(), Main2Activity.class);
            // diatas adalah kode menghubungkan kontek (MainActivity) dengan Main2Activity

            //inisialisasi edittext/placeholder pada ui activity_main
            EditText et = (EditText)findViewById(R.id.editText);
            //passing dari input menjadi string
            String comment = et.getText().toString();
            //methods untuk mengirim value dari intent dengan paramater key,value
            i.putExtra(MESSAGES,comment);
            // dimana MESSAGES sebagai key, reusable
            // comment sebagai value
            startActivity(i);
            //kemudian startActivity salah satu methods untuk menjalankan i
            // dimana i sebelumnya di inisialisasikan sbg intent
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi button di ui activiy_main
        Button comment = (Button)findViewById(R.id.button);
        Button like = (Button)findViewById(R.id.like);
        //set aksi pop up ketika button like di klik
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //toast/popup memiliki 3 parameter
                //Toast.makeText(context, text, duration).show();
                Toast.makeText(getApplicationContext(),"Liked",Toast.LENGTH_LONG).show();
            }
        });
        //set aksi ketika button comment di klik dalam inline code dan passing dari Komentari
        comment.setOnClickListener(Komentari);

    }

}
