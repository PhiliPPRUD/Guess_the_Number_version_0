package my.application.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int rInt;

    EditText vvod;
    Button seve;
    TextView otvet;
    Random random = new Random();
    int vvodInt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vvod = findViewById(R.id.eT);
        seve = findViewById(R.id.b);
        otvet = findViewById(R.id.t);

        rInt = random.nextInt(100);
        seve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvodInt = Integer.parseInt(vvod.getText().toString());
                if(rInt>vvodInt) {
                    otvet.setText("Число " + vvodInt + "Меньше чем число которое сгенерировал android");
                }
                else if(rInt<vvodInt) {
                    otvet.setText("Число " + vvodInt + "Больше чем число которое сгенерировал android");
                }
                else if(rInt==vvodInt) {
                    otvet.setText("Число " + vvodInt + "Подходит");
                   
                }
            }
        });

    }
}