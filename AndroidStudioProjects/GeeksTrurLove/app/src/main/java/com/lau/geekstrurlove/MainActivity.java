package com.lau.geekstrurlove;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public EditText full_name;
    public ImageView test_image;
    public ImageView show_image;
    boolean isNotImg;
    public TextView res;
    public int tag;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.languages);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        isNotImg=true;
        tag=0;
    }
    public void calculate(View v){
        Random random=new Random ();
        test_image= (ImageView) findViewById(R.id.imageView2);
        show_image= (ImageView) findViewById(R.id.imageView);
        full_name= (EditText) findViewById(R.id.fullName);
        res= (TextView) findViewById(R.id.result);
        if (full_name.getText().toString().equals("") || isNotImg){
            Toast.makeText(this, "Enter your name and select a language to see your love index", Toast.LENGTH_SHORT).show();
        }
        else{
            //show_image.setImageResource();
            //random.nextInt(101);
        }


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        test_image= (ImageView) findViewById(R.id.imageView2);
        if (position==1){
            test_image.setImageResource(R.drawable.img1);
            isNotImg=false;
        }
        if (position==2){
            test_image.setImageResource(R.drawable.img2);
            isNotImg=false;
        }
        if (position==3){
            test_image.setImageResource(R.drawable.img3);
            isNotImg=false;
        }
        if (position==4){
            test_image.setImageResource(R.drawable.img4);
            isNotImg=false;
        }
        if (position==5){
            test_image.setImageResource(R.drawable.img5);
            isNotImg=false;
        }
        if (position==6){
            test_image.setImageResource(R.drawable.img6);
            isNotImg=false;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}