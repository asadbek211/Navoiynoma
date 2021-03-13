package com.example.navoiynoma;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
 private TextView text;
 private Button dastur_haq;
 Boolean ok = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.dastur_matn);
        dastur_haq = findViewById(R.id.dastur_haqida);

    }

    public void MainOnclick(View v) {
        switch (v.getId()){
            case R.id.hayoti:
                startActivity(new Intent(MainActivity.this,Hayoti.class));
                break;
            case R.id.sherlari:
                startActivity(new Intent(MainActivity.this,Sherlari.class));
                break;
            case R.id.gazallari:
                startActivity(new Intent(MainActivity.this,Gazallari.class));
                break;
            case R.id.lison:
                startActivity(new Intent(MainActivity.this,Lison.class));
                break;
            case R.id.xamsa:
                startActivity(new Intent(MainActivity.this,Xamsa.class));
                break;
            case R.id.dastur_haqida:
                if (ok ==false){text.setVisibility(View.VISIBLE); ok=true;
                dastur_haq.setBackgroundResource(R.drawable.soroq2);
                }
                else {
                    text.setVisibility(View.GONE);
                    ok=false;
                    dastur_haq.setBackgroundResource(R.drawable.soroq);
                }
                break;
        }
    }

}