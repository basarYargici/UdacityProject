package com.example.justjava2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int quantity = 0;
    private Button btnInc;
    private Button btnOrder;
    private Button btnDec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInc = findViewById(R.id.increment_Button);
        btnDec = findViewById(R.id.decrease_Button);
        btnOrder = findViewById(R.id.order_Button);

        Increment();
        Decrement();
        Order();
    }


    //Order butonuna basinca kahve sayisini ve fiyatini bastiran fonksiyon
    public void Order() {
       btnOrder.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               displayNumOfCofee(quantity);
               displayPrice(quantity);
           }
       });
    }


    //1 fazla kahve alma butonunun fonksiyonu
    public void Increment() {
        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity++;
                displayNumOfCofee(quantity);
            }
        });
    }


    //1 fazla kahve azaltma butonunun fonksiyonu
    public void Decrement() {
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity--;
                displayNumOfCofee(quantity);
            }
        });
    }

    //kahve sayisini bastiran fonksiyon
    private void displayNumOfCofee(int number) {
        TextView numOfCofee_TextView = findViewById(R.id.numOfCofee_TextView);
        numOfCofee_TextView.setText("" + number);
    }

    //kahve fiyatini bastiran fonksiyon
    private void displayPrice(int number) {
        TextView tvMoneyPrice = findViewById(R.id.moneyPrice_TextView);
        if (number<=0){
            tvMoneyPrice.setText("" + 0 );

        }
        else {
            tvMoneyPrice.setText("Total : " + number * 5 +"\nThank You!");
        }
    }

}
