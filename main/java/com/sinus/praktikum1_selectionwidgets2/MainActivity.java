package com.sinus.praktikum1_selectionwidgets2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker1;
    Button btnChangeDate;
    TextView tvCurrentDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCurrentDate = (TextView)findViewById(R.id.textView1);
        datePicker1 = (DatePicker)findViewById(R.id.datePicker1);
        btnChangeDate = (Button)findViewById(R.id.button);

        tvCurrentDate.setText(getCurrentDate());
        btnChangeDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCurrentDate.setText(getCurrentDate());
            }
        });
    }

    public String getCurrentDate() {
        StringBuilder builder = new StringBuilder();
        builder.append("Current Date: ");
        builder.append((datePicker1.getMonth() + 1)+"/");
        builder.append(datePicker1.getDayOfMonth()+"/");
        builder.append(datePicker1.getYear());
        return builder.toString();
    }
}