package com.example.misikirmehari.shippingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Data Model for ship item.
    private ShipItem shipItem;

    // View Items
    private EditText weightET;
    private TextView baseCosTV;
    private TextView addedCosTV;
    private TextView totalCostTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Set Activity content
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Create a data model to be shipped
        shipItem = new ShipItem();

        // Establish references to Input Views
        weightET = (EditText) findViewById(R.id.editText1);
        baseCosTV = (TextView) findViewById(R.id.textView4);
        addedCosTV = (TextView) findViewById(R.id.textView6);
        totalCostTV = (TextView) findViewById(R.id.textView8);

        // Add a change  listener

        weightET.addTextChangedListener(weightTextWatcher);


    }

    private TextWatcher weightTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                shipItem.setWeight((int) Double.parseDouble(s.toString()));
            }
            catch (NumberFormatException e){
                shipItem.setWeight(0);
            }
            displayShipping();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }


    };

private void displayShipping(){
    baseCosTV.setText("$"+String.format("%.02f",shipItem.getBaseCost()));
    addedCosTV.setText("$"+String.format("%.02f",shipItem.getAddedCost()));
    totalCostTV.setText("$"+String.format("%.02f",shipItem.getTotalCost()));
}

}
