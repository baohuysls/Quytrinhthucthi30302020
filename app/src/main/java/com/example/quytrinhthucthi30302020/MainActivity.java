package com.example.quytrinhthucthi30302020;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 1 : Khai bao bien
    EditText mEdtSothunhat,mEdtSothuhai;
    Button mBtnReset,mBtnCong,mBtnTru,mBtnNhan,mBtnChia;
    TextView mTvKetqua;

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 : Anh xa
        mEdtSothunhat = findViewById(R.id.edittextSothunhat);
        mEdtSothuhai = findViewById(R.id.edittextSothuhai);
        mBtnReset = findViewById(R.id.buttonReset);
        mBtnCong = findViewById(R.id.buttonCong);
        mBtnTru = findViewById(R.id.buttonTru);
        mBtnNhan = findViewById(R.id.buttonNhan);
        mBtnChia = findViewById(R.id.buttonChia);
        mTvKetqua = findViewById(R.id.textviewKetqua);

//        mBtnCong.setText("++");
////        Log.d("BBB",mBtnCong.getText().toString());

    }
}
