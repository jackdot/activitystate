package ru.geekbrains.activitystate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private int counter1 = 0;
    private int counter2 = 0;
    private int counter3 = 0;
    private int counter4 = 0;

    private TextView textCounter1;
    private TextView textCounter2;
    private TextView textCounter3;
    private TextView textCounter4;

    private final View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            counter2 += 2;
            textCounter2.setText(String.format(Locale.getDefault(), "%d", counter2));

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCounter1 = findViewById(R.id.textView1);
        textCounter2 = findViewById(R.id.textView2);
        textCounter3 = findViewById(R.id.textView3);
        textCounter4 = findViewById(R.id.textView4);

        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(this);
        Button button4 = findViewById(R.id.button_4);
        button3.setOnClickListener(this);

        ((Button) findViewById(R.id.button_2)).setOnClickListener(listener);

    }

    public void button1_onClick(View view) {
        counter1++;
        textCounter1.setText(String.format(Locale.getDefault(), "%d", counter1));
    }

    @Override
    public void onClick(View v) {
        counter3 += 3;
        textCounter3.setText(String.format(Locale.getDefault(), "%d", counter3));
    }
}