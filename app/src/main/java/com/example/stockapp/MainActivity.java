package com.example.stockapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final String dbName = "hm.db";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AssetsDatabaseHelper assetsDatabaseHelper = new AssetsDatabaseHelper(MainActivity.this, dbName);

        Button searchButton = findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.edit_text);
                try {
                    int productId  = Integer.parseInt(editText.getText().toString());
                    TextView sizeOfTableTextView = findViewById(R.id.text_view);
                    Product product = assetsDatabaseHelper.getProductSwords(productId);
                    //Log.i("test",  );
                    if(product != null) {
                        sizeOfTableTextView.setText(product.toString());
                    }
                    else {
                        sizeOfTableTextView.setText("not found");
                    }

                }
                catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                }

            }
        });

    }
}
