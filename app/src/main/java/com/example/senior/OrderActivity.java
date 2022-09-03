package com.example.senior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    EditText edit1;
    CheckBox checkBox1, checkBox2;
    TextView viewCounter, viewDetils;

    String hint;
    int counter =0;
    int TotlaPrice=0;
    String message="";

    int quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        edit1=(EditText) findViewById(R.id.name);

        checkBox1=findViewById(R.id.whi);
        checkBox2=findViewById(R.id.cho);
        viewCounter=findViewById(R.id.count);
        viewDetils=findViewById(R.id.orderdtesials);

        hint=viewDetils.getText().toString();

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                calculate();;
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                calculate();;
            }
        });


    }

    public void decremenrt(View view) {
        if(counter==0) return;

        counter--;
        viewCounter.setText(String.valueOf(counter));
        calculate();
    }

    public void incremenrt(View view) {

        counter++;
        viewCounter.setText(String.valueOf(counter));
        calculate();
    }

    private void calculate(){
        TotlaPrice=0;
        int coffeprice=10;
        int whippedceamprice=checkBox1.isChecked() ? 1:0;
        int chocolateprice=checkBox2.isChecked() ? 2:0;

        int price=coffeprice+whippedceamprice+chocolateprice;
        TotlaPrice=price*counter;
        viewDetils.setText(hint+"\n Total price= "+TotlaPrice);

    }

    public void order(View view) {

if(message.isEmpty()){
    Toast.makeText(OrderActivity.this, "Confirm Your Order", Toast.LENGTH_SHORT).show();
    return;
}


      message+="\n Thank You";

        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{ "amralshapony1@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, "Coffe Order");
        email.putExtra(Intent.EXTRA_TEXT, message);

//need this to prompts email client only
        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Choose an Email client :"));

    }

/*
    public void senddata(View view) {

       Intent intent=new Intent(OrderActivity.this, ReceiveActivity.class);

        intent.putExtra("a1","Amr mo");
        intent.putExtra("a2","Shaboon");

        User user=new User("AMR","Sohag");
        startActivity(intent);


    }

 */

    public void addnew(View view) {


        String name=edit1.getText().toString();
        if(name.isEmpty()){
            edit1.setError("Required");
            return;
        }


        message+=" Name: "+name
                +"\n Add whippedcream:  "+checkBox1.isChecked()
                +"\n Add chocolate: "+checkBox2.isChecked()
                +"\n Quantity= "+counter
                +"\n Price=  "+ TotlaPrice+"\n";

        edit1.setText("");
        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        quantity=0;
        viewCounter.setText(String.valueOf(quantity));
        viewDetils.setText(hint);

    }


}