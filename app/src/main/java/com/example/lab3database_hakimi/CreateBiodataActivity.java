package com.example.lab3database_hakimi;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateBiodataActivity extends AppCompatActivity {

    protected Cursor cursor;
    DataHelper dbHelper;
    Button ton1, ton2;
    EditText text1, text2, text3, text4, text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_biodata);

        dbHelper = new DataHelper(this);
        text1 = findViewById(R.id.editText1);
        text2 = findViewById(R.id.editText2);
        text3 = findViewById(R.id.editText3);
        text4 = findViewById(R.id.editText4);
        text5 = findViewById(R.id.editText5);
        ton1 = findViewById(R.id.button1);
        ton2 = findViewById(R.id.button2);

        ton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into biodata(no, name, dob, gender, address) values('"
                        + text1.getText().toString() + "','"
                        + text2.getText().toString() + "','"
                        + text3.getText().toString() + "','"
                        + text4.getText().toString() + "','"
                        + text5.getText().toString() + "')");
                Toast.makeText(getApplicationContext(), "Data Successfully Added", Toast.LENGTH_SHORT).show();
                MainActivity.ma.RefreshList();
                finish();
            }
        });

        ton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                finish();
            }
        });
    }
}
//
//    <?xml version="1.0" encoding="utf-8"?>
//<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
//        xmlns:app="http://schemas.android.com/apk/res-auto"
//        xmlns:tools="http://schemas.android.com/tools"
//        android:layout_width="match_parent"
//        android:layout_height="match_parent"
//        tools:context=".CreateBiodataActivity">
//
//<EditText
//        android:id="@+id/editText1"
//                android:layout_width="0dp"
//                android:layout_height="0dp"
//                android:layout_below="@+id/textView1"
//                android:layout_alignLeft="@+id/textView1"
//                android:layout_inputType="number"
//                android:layout_maxLength="10"
//                app:layout_constraintEnd_toEndOf="parent"
//
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toBottomOf="@+id/textView1"
//                tools:ignore="UnknownId">
//
//<requestFocus />
//
//</EditText>
//
//<TextView
//        android:id="@+id/textView1"
//                android:layout_width="wrap_content"
//                android:layout_height="wrap_content"
//                android:layout_alignParentLeft="true"
//                android:layout_alignParentTop="true"
//                android:layout_marginStart="12dp"
//                android:layout_marginLeft="12dp"
//                android:layout_marginTop="12dp"
//                android:text="ID NUmber"
//                app:layout_constraintStart_toStartOf="@+id/editText1"
//                app:layout_constraintTop_toTopOf="parent" />
//
//<TextView
//        android:id="@+id/textView2"
//                android:layout_width="wrap_content"
//                android:layout_height="wrap_content"
//                android:layout_below="@+id/editText1"
//                android:layout_alignLeft="@+id/editText1"
//                android:layout_marginStart="12dp"
//                android:layout_marginLeft="12dp"
//                android:layout_marginTop="12dp"
//                android:text="Name"
//                app:layout_constraintStart_toStartOf="@+id/editText2"
//                app:layout_constraintTop_toBottomOf="@+id/editText1"
//                tools:ignore="UnknownId" />
//
//<EditText
//        android:id="@+id/editText2"
//                android:layout_width="0dp"
//                android:layout_height="wrap_content"
//                android:layout_below="@+id/textView2"
//                android:layout_alignLeft="@+id/textView2"
//                android:layout_inputType="text"
//                android:layout_marginTop="2dp"
//                android:layout_maxLength="20"
//                app:layout_constraintEnd_toEndOf="parent"
//
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toBottomOf="@+id/textView2" />
//
//<TextView
//        android:id="@+id/textView3"
//                android:layout_width="wrap_content"
//                android:layout_height="wrap_content"
//                android:layout_below="@+id/editText2"
//                android:layout_alignLeft="@+id/editText2"
//                android:layout_marginStart="12dp"
//                android:layout_marginLeft="12dp"
//                android:layout_marginTop="20dp"
//                android:text="Date of Birth"
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toBottomOf="@+id/editText2" />
//
//<EditText
//        android:id="@+id/editText3"
//                android:layout_width="0dp"
//                android:layout_height="wrap_content"
//                android:layout_below="@+id/textView3"
//                android:layout_alignLeft="@+id/textView3"
//                android:layout_inputType="date"
//                android:layout_marginTop="17dp"
//                app:layout_constraintEnd_toEndOf="parent"
//                app:layout_constraintHorizontal_bias="0.0"
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toBottomOf="@+id/textView3" />
//
//<TextView
//        android:id="@+id/textView4"
//                android:layout_width="wrap_content"
//                android:layout_height="wrap_content"
//                android:layout_below="@+id/editText2"
//                android:layout_alignLeft="@+id/editText3"
//                android:layout_marginStart="12dp"
//                android:layout_marginLeft="12dp"
//                android:layout_marginTop="20dp"
//                android:text="Gender"
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toBottomOf="@+id/editText3" />
//
//<EditText
//        android:id="@+id/editText4"
//                android:layout_width="0dp"
//                android:layout_height="wrap_content"
//                android:layout_below="@+id/textView4"
//                android:layout_alignLeft="@+id/textView4"
//                android:layout_marginTop="10dp"
//                android:hint="M/F"
//                android:inputType="text"
//                android:maxLength="1"
//                app:layout_constraintEnd_toEndOf="parent"
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toBottomOf="@+id/textView4" />
//
//<TextView
//        android:id="@+id/textView5"
//                android:layout_width="wrap_content"
//                android:layout_height="wrap_content"
//                android:layout_below="@+id/editText4"
//                android:layout_alignLeft="@+id/editText4"
//                android:layout_marginStart="12dp"
//                android:layout_marginLeft="12dp"
//                android:layout_marginTop="20dp"
//                android:text="Address"
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toBottomOf="@+id/editText4" />
//
//<EditText
//        android:id="@+id/editText5"
//                android:layout_width="0dp"
//                android:layout_height="wrap_content"
//                android:layout_below="@+id/textView5"
//                android:layout_alignLeft="@+id/textView5"
//                android:layout_marginTop="4dp"
//                app:layout_constraintEnd_toEndOf="parent"
//                app:layout_constraintHorizontal_bias="0.0"
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toBottomOf="@+id/textView5" />
//
//<Button
//        android:id="@+id/button1"
//                android:layout_width="0dp"
//                android:layout_height="wrap_content"
//                android:layout_alignLeft="@+id/editText5"
//                android:layout_alignParentBottom="true"
//                android:layout_marginBottom="22dp"
//                android:background="@color/teal_200"
//                android:text="SAVE"
//                app:layout_constraintBottom_toTopOf="@+id/button2"
//                app:layout_constraintEnd_toEndOf="parent"
//                app:layout_constraintHorizontal_bias="0.0"
//                app:layout_constraintStart_toStartOf="parent" />
//
//<Button
//        android:id="@+id/button2"
//                android:layout_width="0dp"
//                android:layout_height="wrap_content"
//                android:layout_alignEnd="@+id/editText5"
//                android:layout_alignRight="@+id/editText5"
//                android:layout_alignParentBottom="true"
//                android:layout_marginBottom="24dp"
//                android:text="BACK"
//                app:layout_constraintBottom_toBottomOf="parent"
//                app:layout_constraintEnd_toEndOf="parent"
//                app:layout_constraintHorizontal_bias="0.0"
//                app:layout_constraintStart_toStartOf="parent" />
//
//</androidx.constraintlayout.widget.ConstraintLayout>