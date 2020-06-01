package sg.edu.rp.c346.id18037611.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //…
        Intent intent = new Intent(MainActivity.this, AnswerActivity.class);  //Create an Intent object
        intent.putExtra("Question", 2);  //Pass data: name is “Question”; value is 2

        startActivity(intent); //Launch the AnswerActivity
    }







}
