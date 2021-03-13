package com.example.navoiynoma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Xamsa_matn extends Activity {
private String intent_matn;
private TextView xamsa_matn;
    private Animation animation1;
    private Button back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xamsa_matn);
        xamsa_matn = findViewById(R.id.xamsa_matni1);
        back1 = findViewById(R.id.back);
        animation1 = AnimationUtils.loadAnimation(this,R.anim.animatsiya_bir);
        intent_matn = getIntent().getStringExtra("title");
        switch (intent_matn){
            case "button1":
                xamsa_matn.setText(R.string.xamsa_tarixi);
                break;
            case "button2":
                xamsa_matn.setText(R.string.xamsa_matni1);

                break;
            case "button3":
                xamsa_matn.setText(R.string.xamsa_matni2);

                break;
            case "button4":
                xamsa_matn.setText(R.string.xamsa_matni3);

                break;
            case "button5":
                xamsa_matn.setText(R.string.xamsa_matni4);

                break;
            case "button6":
                xamsa_matn.setText(R.string.xamsa_matni5);

                break;

        }
    }

    public void Xamsa_matnOnclick(View view) {
        switch (view.getId()){


            case R.id.back:
                startActivity(new Intent(Xamsa_matn.this,Xamsa.class));break;
        }
    }

}