package com.example.navoiynoma;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class Xamsa extends Activity {
    private Animation animation1;
    private Button back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xamsa);
        back1 = findViewById(R.id.back);
        animation1 = AnimationUtils.loadAnimation(this,R.anim.animatsiya_bir);
    }

    @SuppressLint("NonConstantResourceId")
    public void XamsaOnclick(View vav) {
        switch (vav.getId()){
         case R.id.back:
            startActivity(new Intent(Xamsa.this,MainActivity.class));break;
            case R.id.btnn1:
                Intent intent1 = new Intent(Xamsa.this,Xamsa_matn.class);
                intent1.putExtra("title","button1");
                startActivity(intent1);break;
            case R.id.btnn2:
                Intent intent2= new Intent(Xamsa.this,Xamsa_matn.class);
                intent2.putExtra("title","button2");
                startActivity(intent2);break;
            case R.id.btnn3:
                Intent intent3 = new Intent(Xamsa.this,Xamsa_matn.class);
                intent3.putExtra("title","button3");
                startActivity(intent3);break;
            case R.id.btnn4:
                Intent intent4 = new Intent(Xamsa.this,Xamsa_matn.class);
                intent4.putExtra("title","button4");
                startActivity(intent4);break;
            case R.id.btnn5:
                Intent intent5 = new Intent(Xamsa.this,Xamsa_matn.class);
                intent5.putExtra("title","button5");
                startActivity(intent5);break;
            case R.id.btnn6:
                Intent intent6 = new Intent(Xamsa.this,Xamsa_matn.class);
                intent6.putExtra("title","button6");
                startActivity(intent6);break;

        }

    }


}