package com.example.dbapplication;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.xml.parsers.DocumentBuilder;

public class MainActivity extends AppCompatActivity {
    EditText name, contact, dob;
    Button insert, update, delete, view;
    private Object String;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editText1);
        contact = findViewById(R.id.editText2);
        dob = findViewById(R.id.dob);
        insert = findViewById(R.id.button1);
        update = findViewById(R.id.button3);
        delete = findViewById(R.id.button4);
        view = findViewById(R.id.button2);

        insert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String dobTXT = dob.getText().toString();
                Boolean checkinsertdata = insertuserdata(nameTXT, contactTXT, dobTXT);
                if (checkinsertdata == true)
                    Toast.makeText(MainActivity.this, "New Entry Inserted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "New Entry not Inserted", Toast.LENGTH_LONG).show();
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String dobTXT = dob.getText().toString();
                Boolean checkupdatedata = updateuserdata(nameTXT, contactTXT, dobTXT);
                if (checkupdatedata == true)
                    Toast.makeText(MainActivity.this, "Entry Updated", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "Entry not Updated", Toast.LENGTH_LONG).show();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String nameTXT = name.getText().toString();
                Boolean checkdeletedata = deletedata(nameTXT);
                if (checkdeletedata == true)
                    Toast.makeText(MainActivity.this, "Entry Deleted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "Entry not Deleted", Toast.LENGTH_LONG).show();
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Cursor res = getdata();
                if (res.getCount() == 0) {
                    Toast.makeText(MainActivity.this, "No entry found", Toast.LENGTH_LONG).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Name: " + res.getString(0) + "\n");
                    buffer.append("Contact: " + res.getString(1) + "\n");
                    buffer.append("DOB: " + res.getString(2) + "\n\n");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("User Enteries");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
    }

    private Cursor getdata() {

        private Boolean insertuserdata (String Object nameTXT;nameTXT, String Object contactTXT;contactTXT, String Object dobTXT; dobTXT)
        {

            private Boolean deletedata (String nameTXT){

                private Boolean updateuserdata (String nameTXT, String contactTXT, String dobTXT){
                }
            }
        }
    }
}
