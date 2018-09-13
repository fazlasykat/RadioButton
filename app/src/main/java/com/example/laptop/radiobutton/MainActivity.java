package com.example.laptop.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button showButton;
    private RadioButton selectedButton;
    private TextView outPutText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.raidoGroupId);
        showButton = findViewById(R.id.showBtnId);
        outPutText = findViewById(R.id.showTextViewId);


        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               int selectedId = radioGroup.getCheckedRadioButtonId();

               selectedButton = findViewById(selectedId);

               String sykat = selectedButton.getText().toString();


               outPutText.setText("You have select " + sykat);








            }
        });



    }
}
