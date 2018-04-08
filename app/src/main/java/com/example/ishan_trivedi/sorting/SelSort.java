package com.example.ishan_trivedi.sorting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SelSort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sel_sort);
        Intent mintent = getIntent();
        TextView textView = findViewById(R.id.textView);
        ArrayList<Integer> n = mintent.getIntegerArrayListExtra("getdata2");
        int[] arr = new int[n.size()];
        for (int x=0; x < n.size(); x++)
        {
            arr[x] = n.get(x);
        }
        int temp,index;
        int cmp=0,swp=0;
        for (int i = 0; i < arr.length - 1; i++)
        {
            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                cmp++;
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            if(index!=i)
            {
                swp++;
            }
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            textView.append("Pass "+(i+1)+"\n");
            for(int k=0;k<arr.length;k++)
            {
                textView.append(arr[k]+"\t");
            }
            textView.append("\n");
        }
        textView.append("\nTotal Comparisions : "+cmp+"\n");
        textView.append("Total Swaps : "+swp);
    }
}
