package com.example.ashraf.edittextempty;

//https://stackoverflow.com/questions/6290531/check-if-edittext-is-empty


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText v1,v2;
    Button button1;
    String str1,str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = (EditText) findViewById(R.id.value1);
        v2 = (EditText) findViewById(R.id.value2);
        button1= (Button) findViewById(R.id.button);


       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               str1 = v1.getText().toString();
               if(TextUtils.isEmpty(str1)){
                   v1.setError("Please Enter it first!!");
               }
               else{
                   Toast.makeText(MainActivity.this, str1, Toast.LENGTH_SHORT).show();
               }
           }
       });

    }


    public void onClick_Method(View view) {


        str1 = v1.getText().toString();
        str2 = v2.getText().toString();

        //Rule one

      /*
      if(str1.matches("")){
            Toast.makeText(this, "Please Enter value", Toast.LENGTH_SHORT).show();
            return;
        }
        */

        //Rule two

      /*
      if(TextUtils.isEmpty(str1)){
            v1.setError("Please Enter it first!!");
            return;
        }
        */

        //Rule three

      /*
      if(v1.getText().toString().isEmpty()){
          Toast.makeText(this, "Is empty", Toast.LENGTH_SHORT).show();
      }
      else{
          Toast.makeText(this, "Not empty", Toast.LENGTH_SHORT).show();
      }
      */


    }
}
