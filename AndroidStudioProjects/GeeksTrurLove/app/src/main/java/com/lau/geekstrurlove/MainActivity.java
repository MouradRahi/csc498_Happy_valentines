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
    public int tag1;
    public int tag2;
    public TextView res1;
    public TextView res2;
    public TextView res3;
    public TextView res4;
    public TextView res5;
    public TextView res6;
    public ImageView res1_image;
    public ImageView res2_image;
    public ImageView res3_image;

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
        tag1=0;
        tag2=0;
    }
    public void calculate(View v){
        Random random=new Random ();
        test_image= (ImageView) findViewById(R.id.imageView2);
        show_image= (ImageView) findViewById(R.id.imageView);
        full_name= (EditText) findViewById(R.id.fullName);
        res= (TextView) findViewById(R.id.result);
        res1= (TextView) findViewById(R.id.result1);
        res2= (TextView) findViewById(R.id.result2);
        res3= (TextView) findViewById(R.id.result3);
        res4= (TextView) findViewById(R.id.result4);
        res5= (TextView) findViewById(R.id.result5);
        res6= (TextView) findViewById(R.id.result6);
        res1_image= (ImageView) findViewById(R.id.imageResult1);
        res2_image= (ImageView) findViewById(R.id.imageResult2);
        res3_image= (ImageView) findViewById(R.id.imageResult3);
        if (full_name.getText().toString().equals("") || isNotImg){
            Toast.makeText(this, "Enter your name and select a language to see your love index", Toast.LENGTH_SHORT).show();
        }
        else{
            int rand=random.nextInt(101);
            show_image.setImageResource(tag);
            show_image.animate().alpha(1.0F);
            res.setText(full_name.getText().toString()+" has "+rand+"% compatibility with ");
            res.animate().alpha(1.0F);
            if (res2.getText().toString().length()!=0){
                res3.setText(res2.getText().toString());
                res3.animate().alpha(1.0F);
            }
            if (res1.getText().toString().length()!=0){
                res2.setText(res1.getText().toString());
                res2.animate().alpha(1.0F);
            }

            res1.setText(full_name.getText().toString());
            res1.animate().alpha(1.0F);
            if (res5.getText().toString().length()!=0){
                res6.setText(res5.getText().toString());
                res6.animate().alpha(1.0F);
            }
            if (res4.getText().toString().length()!=0){
                res5.setText(res4.getText().toString());
                res5.animate().alpha(1.0F);
            }

            res4.setText(rand+"%");
            res4.animate().alpha(1.0F);
            if (tag2!=0){
                res3_image.setImageResource(tag2);
                res3_image.animate().alpha(1.0F);
            }
            if (tag1!=0){
                res2_image.setImageResource(tag1);
                res2_image.animate().alpha(1.0F);
                tag2=tag1;
            }

            res1_image.setImageResource(tag);
            res1_image.animate().alpha(1.0F);
            tag1=tag;


        }


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        test_image= (ImageView) findViewById(R.id.imageView2);
        if (position==1){
            test_image.setImageResource(R.drawable.img1);
            tag=R.drawable.img1;
            isNotImg=false;
        }
        if (position==2){
            test_image.setImageResource(R.drawable.img2);
            tag=R.drawable.img2;
            isNotImg=false;
        }
        if (position==3){
            test_image.setImageResource(R.drawable.img3);
            tag=R.drawable.img3;
            isNotImg=false;
        }
        if (position==4){
            test_image.setImageResource(R.drawable.img4);
            tag=R.drawable.img4;
            isNotImg=false;
        }
        if (position==5){
            test_image.setImageResource(R.drawable.img5);
            tag=R.drawable.img5;
            isNotImg=false;
        }
        if (position==6){
            test_image.setImageResource(R.drawable.img6);
            tag=R.drawable.img6;
            isNotImg=false;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}