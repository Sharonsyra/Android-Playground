package com.example.sharonsyra.alc;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/*
* App form to order coffee */
public class MainActivity extends ActionBarActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * Increment method*/
    public void increment(View view) {
        quantity++;
        display(quantity);
    }

    /*
    * Decrement method*/
    public void decrement(View view) {
        quantity--;
        display(quantity);
    }

    /*
    * Clicked when the order button is clicked*/
    public void submitOrder(View view) {
        int price = quantity * 5;
        String priceMessage = "Amount due is Ksh" + price;
        displayMessage(priceMessage);
    }

    /*
    * Displays the content value on the screen*/
    private void display(int number) {
        TextView digitTextView = (TextView) findViewById(
                R.id.digit_text_view);
        digitTextView.setText("" + number);
    }

    /*
    * Displays price value on the screen*/
    private void displayPrice(int number) {
        TextView priceValueTextView = (TextView) findViewById(
                R.id.price_value_text_view);
        priceValueTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /*
    * Displays text on screen*/
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(
            R.id.price_text_view);
        priceTextView.setText(message);
    }
}
