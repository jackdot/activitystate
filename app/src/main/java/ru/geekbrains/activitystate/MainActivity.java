package ru.geekbrains.activitystate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String COUNTERS = "Counters";

    private Counters counters;

    private TextView textCounter1;
    private TextView textCounter2;
    private TextView textCounter3;
    private TextView textCounter4;
    private TextView textCounter5;

    private final View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            counters.incrementCounter2();
            setTextCounter(textCounter2, counters.getCounter2());

        }
    };

    private void setTextCounters() {
        setTextCounter(textCounter1, counters.getCounter1());
        setTextCounter(textCounter2, counters.getCounter2());
        setTextCounter(textCounter3, counters.getCounter3());
        setTextCounter(textCounter4, counters.getCounter4());
        setTextCounter(textCounter5, counters.getCounter5());
    }

    private void setTextCounter(TextView textView, int counter) {
        textView.setText(String.format(Locale.getDefault(), "%d", counter));
    }


    @Override
    protected void onSaveInstanceState(Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        instanceState.putSerializable(COUNTERS, counters);
    }

    protected void onRestoreInstanceState(Bundle instanceState) {
        super.onRestoreInstanceState(instanceState);
        counters = (Counters) instanceState.getSerializable(COUNTERS);
        setTextCounters();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counters = new Counters();

        initTextView();
        initButton();


    }

    private void initButton() {
        ((Button) findViewById(R.id.button_2)).setOnClickListener(listener);
        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(this);
        Button button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(this);
        Button button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(this);

    }

    private void initTextView() {
        textCounter1 = findViewById(R.id.textView1);
        textCounter2 = findViewById(R.id.textView2);
        textCounter3 = findViewById(R.id.textView3);
        textCounter4 = findViewById(R.id.textView4);
        textCounter5 = findViewById(R.id.textView5);
    }

    public void button1_onClick(View view) {
        counters.incrementCounter1();
        setTextCounter(textCounter1, counters.getCounter1());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_3) {
            counters.incrementCounter3();
            setTextCounter(textCounter3, counters.getCounter3());
        }
        if (v.getId() == R.id.button_4) {
            counters.incrementCounter4();
            setTextCounter(textCounter4, counters.getCounter4());
        }
        if(v.getId() == R.id.button_5){
            counters.incrementCounter5();
            setTextCounter(textCounter5, counters.getCounter5());
        }
    }
}