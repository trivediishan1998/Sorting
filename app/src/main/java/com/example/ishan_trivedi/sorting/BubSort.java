package com.example.ishan_trivedi.sorting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BubSort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bub_sort);
        Intent mintent = getIntent();
        TextView textView = findViewById(R.id.textView4);
        ArrayList<Integer> n = mintent.getIntegerArrayListExtra("getdata1");
        int[] arr = new int[n.size()];
        for (int x = 0; x < n.size(); x++) {
            arr[x] = n.get(x);
        }
        int q = arr.length;
        int p, temp,l=1,cnt,swp = 0, cmp = 0;
        for (int m = q; m >= 0; m--) {
            cnt=0;
            for (int i = 0; i < q - 1; i++) {
                p = i + 1;
                cmp++;
                if (arr[i] > arr[p]) {
                    temp = arr[i];
                    arr[i] = arr[p];
                    arr[p] = temp;
                    cnt++;
                    swp++;
                }
            }
            if(cnt==0)
            {
                break;
            }
            textView.append("Pass "+l+"\n");
            l++;
            for (int k = 0; k < arr.length; k++) {
                textView.append(arr[k]+"  ");
            }
            textView.append("\n");
        }
        textView.append("Total Comparisions : "+cmp);
        textView.append("\n");
        textView.append("Total Swaps : "+swp);
    }
}