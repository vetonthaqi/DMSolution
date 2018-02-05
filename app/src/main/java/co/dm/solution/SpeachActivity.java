package co.dm.solution;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class SpeachActivity extends AppCompatActivity {

    private RelativeLayout mRelativeSpeach1, mRelativeSpeach2, mRelativeSpeach3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speach);

        mRelativeSpeach1 = (RelativeLayout) findViewById(R.id.relative_speach_1);
        mRelativeSpeach2 = (RelativeLayout) findViewById(R.id.relative_speach_2);
        mRelativeSpeach3 = (RelativeLayout) findViewById(R.id.relative_speach_3);


        mRelativeSpeach1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityIntent = new Intent(getApplicationContext(),SignsActivity.class);
                startActivity(startActivityIntent);
            }
        });


        mRelativeSpeach2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlphabetActivity.class);
                startActivity(intent);
            }
        });


        mRelativeSpeach3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TextToSpeachActivity.class);
                startActivity(intent);
            }
        });
    }
}
