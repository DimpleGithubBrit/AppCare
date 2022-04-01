package com.mca.healtyconsernapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityAllDocDetail extends AppCompatActivity {
    CardView tvslot;

    TextView tv1,tv2,tv3,tv4,tv5,tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_doc_detail);

        tv1=findViewById(R.id.docname);
        tv2=findViewById(R.id.docexp2);
        tv3=findViewById(R.id.addressbuildn);
        tv4=findViewById(R.id.addcity);
        tv5=findViewById(R.id.addpin);
        tv6=findViewById(R.id.txtcontact);
        tvslot=findViewById(R.id.tvslot);


        tv1.setText(getIntent().getStringExtra("docname"));
        tv2.setText(getIntent().getStringExtra("docexp"));
        tv3.setText(getIntent().getStringExtra("addressbuildn"));
        tv4.setText(getIntent().getStringExtra("addcity"));
        tv5.setText(getIntent().getStringExtra("addpin"));
        tv6.setText(getIntent().getStringExtra("txtcontact"));
        tvslot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityAllDocDetail.this,Appoinment.class);
                startActivity(intent);
//                Toast toast = Toast.makeText(getApplicationContext(), "Hi",Toast.LENGTH_SHORT);
//                toast.show();

            }
        });



    }
}