package com.example.navoiynoma;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

public class Sherlari extends Activity {
    private Animation animation1;
    private Button back1;
        private Button btnPress1, btnPress2, btnPress3, btnPress4, btnPress5, btnPress6, btnPress7, btnPress8,btnPress9
                ,btnPress10,btnPress11,btnPress12,btnPress13,btnPress14;
    private TextView txtt1, txtt2, txtt3, txtt4, txtt5, txtt6, txtt7, txtt8,txtt9,txtt10,txtt11,txtt12,txtt13,txtt14;
    Boolean ok1 = false,ok2 = false,ok3 = false,ok4 = false,ok5 = false,ok6 = false,ok7 = false,ok8 = false,ok9 = false
            ,ok10 = false,ok11 = false,ok12= false,ok13 = false,ok14 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sherlari);
        berilganlar();
        back1 = findViewById(R.id.back);
        animation1 = AnimationUtils.loadAnimation(this,R.anim.animatsiya_bir);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @SuppressLint({"UseCompatLoadingForDrawables", "NonConstantResourceId"})
    public void Bosish(View view) {
        switch (view.getId()) {
            case R.id.back:
                startActivity(new Intent(Sherlari.this,MainActivity.class));break;
            case R.id.btn1:
                if (!ok1) {
                    txtt1.setVisibility(View.VISIBLE);
                    btnPress1.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.icon,getTheme());
                    btnPress1.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok1 = true;
                } else {
                    txtt1.setVisibility(View.GONE);
                    btnPress1.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress1.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok1 = false;
                }
                break;
            case R.id.btn2:
                if (!ok2) {
                    txtt2.setVisibility(View.VISIBLE);
                    btnPress2.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.icon,getTheme());
                    btnPress2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok2 = true;
                } else {
                    txtt2.setVisibility(View.GONE);
                    btnPress2.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress2.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok2 = false;
                }
                break;
            case R.id.btn3:
                if (!ok3) {
                    txtt3.setVisibility(View.VISIBLE);
                    btnPress3.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.icon,getTheme());
                    btnPress3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok3 = true;
                } else {
                    txtt3.setVisibility(View.GONE);
                    btnPress3.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress3.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);
                    ok3 = false;
                }
                break;
            case R.id.btn4:
                if (!ok4) {
                    txtt4.setVisibility(View.VISIBLE);
                    btnPress4.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.icon,getTheme());
                    btnPress4.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok4 = true;
                } else {
                    txtt4.setVisibility(View.GONE);
                    btnPress4.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress4.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok4 = false;
                }
                break;
            case R.id.btn5:
                if (!ok5) {
                    txtt5.setVisibility(View.VISIBLE);
                    btnPress5.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.icon,getTheme());
                    btnPress5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok5 = true;
                } else {
                    txtt5.setVisibility(View.GONE);
                    btnPress5.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress5.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok5 = false;
                }
                break;
            case R.id.btn6:
                if (!ok6) {
                    txtt6.setVisibility(View.VISIBLE);
                    btnPress6.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.icon,getTheme());
                    btnPress6.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok6 = true;
                } else {
                    txtt6.setVisibility(View.GONE);
                    btnPress6.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress6.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok6 = false;
                }
                break;
            case R.id.btn7:
                if (!ok7) {
                    txtt7.setVisibility(View.VISIBLE);
                    btnPress7.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.icon,getTheme());
                    btnPress7.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok7 = true;
                } else {
                    txtt7.setVisibility(View.GONE);
                    btnPress7.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress7.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok7 = false;
                }
                break;
            case R.id.btn8:
                if (!ok8) {
                    txtt8.setVisibility(View.VISIBLE);
                    btnPress8.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.icon,getTheme());
                    btnPress8.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok8 = true;
                } else {
                    txtt8.setVisibility(View.GONE);
                    btnPress8.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress8.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok8 = false;
                }
                break;
            case R.id.btn9:
                if (!ok9) {
                    txtt9.setVisibility(View.VISIBLE);
                    btnPress9.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.icon,getTheme());
                    btnPress9.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok9 = true;
                } else {
                    txtt9.setVisibility(View.GONE);
                    btnPress9.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress9.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok9 = false;
                }
                break;
            case R.id.btn10:
                if (!ok10) {
                    txtt10.setVisibility(View.VISIBLE);
                    btnPress10.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.tuyuq,getTheme());
                    btnPress10.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok10 = true;
                } else {
                    txtt10.setVisibility(View.GONE);
                    btnPress10.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress10.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok10 = false;
                }
                break;
            case R.id.btn11:
                if (!ok11) {
                    txtt11.setVisibility(View.VISIBLE);
                    btnPress11.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.tuyuq,getTheme());
                    btnPress11.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok11 = true;
                } else {
                    txtt11.setVisibility(View.GONE);
                    btnPress11.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress11.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok1 = false;
                }
                break;
            case R.id.btn12:
                if (!ok12) {
                    txtt12.setVisibility(View.VISIBLE);
                    btnPress12.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.tuyuq,getTheme());
                    btnPress12.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok12 = true;
                } else {
                    txtt12.setVisibility(View.GONE);
                    btnPress12.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress12.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok12 = false;
                }
                break;
            case R.id.btn13:
                if (!ok13) {
                    txtt13.setVisibility(View.VISIBLE);
                    btnPress13.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.tuyuq,getTheme());
                    btnPress13.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok13 = true;
                } else {
                    txtt13.setVisibility(View.GONE);
                    btnPress13.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress13.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok13 = false;
                }
                break;
            case R.id.btn14:
                if (!ok14) {
                    txtt14.setVisibility(View.VISIBLE);
                    btnPress14.setBackgroundResource(R.drawable.shape_knopka4);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.tepaga,getTheme());
                    Drawable drawable2 = VectorDrawableCompat.create(getResources(),R.drawable.tuyuq,getTheme());
                    btnPress14.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2,null,drawable,null);
                    ok14 = true;
                } else {
                    txtt14.setVisibility(View.GONE);
                    btnPress14.setBackgroundResource(R.drawable.shape_knopka3);
                    Drawable drawable = VectorDrawableCompat.create(getResources(),R.drawable.pastga,getTheme());
                    btnPress14.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable,null);

                    ok14 = false;
                }
                break;

        }
    }

    private void berilganlar() {
        btnPress1 = findViewById(R.id.btn1);
        btnPress2 = findViewById(R.id.btn2);
        btnPress3 = findViewById(R.id.btn3);
        btnPress4 = findViewById(R.id.btn4);
        btnPress5 = findViewById(R.id.btn5);
        btnPress6 = findViewById(R.id.btn6);
        btnPress7 = findViewById(R.id.btn7);
        btnPress8 = findViewById(R.id.btn8);
        btnPress9 = findViewById(R.id.btn9);
        btnPress10 = findViewById(R.id.btn10);
        btnPress11 = findViewById(R.id.btn11);
        btnPress12 = findViewById(R.id.btn12);
        btnPress13 = findViewById(R.id.btn13);
        btnPress14 = findViewById(R.id.btn14);
        txtt1 = findViewById(R.id.txt1);
        txtt2 = findViewById(R.id.txt2);
        txtt3 = findViewById(R.id.txt3);
        txtt4 = findViewById(R.id.txt4);
        txtt5 = findViewById(R.id.txt5);
        txtt6 = findViewById(R.id.txt6);
        txtt7 = findViewById(R.id.txt7);
        txtt8 = findViewById(R.id.txt8);
        txtt9 = findViewById(R.id.txt9);
        txtt10 = findViewById(R.id.txt10);
        txtt11 = findViewById(R.id.txt11);
        txtt12 = findViewById(R.id.txt12);
        txtt13 = findViewById(R.id.txt13);
        txtt14 = findViewById(R.id.txt14);
    }

}
