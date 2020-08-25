package platformpbp.uajy.guided3_stringextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra("inputAngka");

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Angka yang anda Inputkan adalah " + message);

        setContentView(textView);

    }
}