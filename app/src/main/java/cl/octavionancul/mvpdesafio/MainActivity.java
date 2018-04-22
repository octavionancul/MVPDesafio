package cl.octavionancul.mvpdesafio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements EvenCallback {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.valueEt);
        textView = findViewById(R.id.responseTv);
        Button button = findViewById(R.id.resultBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                new EvenCalculation(MainActivity.this).evenCalculation(value);
            }
        });


    }

    @Override
    public void evenResult(String value) {
        textView.setText(value);
    }

    @Override
    public void blankInput() {
        Toast.makeText(this, "Ingrese un número", Toast.LENGTH_SHORT).show();
    }
}
