package com.example.ishan_trivedi.sorting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    StringBuilder str= new StringBuilder(200);
    TextView textView;
    ArrayList<Integer> n = new ArrayList<Integer>();
    public int i=0;
    public String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        EditText editText= findViewById(R.id.editText2);
        textView= findViewById(R.id.textView2);
        textView.setText(null);
        String a= editText.getText().toString();
        int x=Integer.parseInt(a);
        if(x!=0) {
            n.add(x);
            i++;
            str.append(a);
            str.append("  ");
            textView.setText("Your Numbers are \n" + str);
            editText.setText(null);
        }
    }

    public void  BubbleSort(View view)
    {
        Intent intent= new Intent(this, BubSort.class);
        intent.putIntegerArrayListExtra("getdata1",n);
        startActivity(intent);
    }

    public void SelectionSort(View view)
    {
        Intent intent= new Intent(this, SelSort.class);
        intent.putIntegerArrayListExtra("getdata2",n);
        startActivity(intent);
    }

    public void Clear(View view)
    {
            n.clear();
            i=0;
            textView.setText("");
            a = "";
            str = null;
            str = new StringBuilder(200);
    }
}