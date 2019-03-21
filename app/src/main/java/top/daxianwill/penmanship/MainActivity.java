package top.daxianwill.penmanship;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private float typefaceSize = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.edit_text);
        Button enlarge = findViewById(R.id.enlarge);
        Button reduce = findViewById(R.id.reduce);
        final Typeface typeface = Typeface.createFromAsset(getAssets(),"yizhiqingshu.ttf");
        editText.setTypeface(typeface);
        enlarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typefaceSize = typefaceSize + 2;
                editText.setTextSize(typefaceSize);
            }
        });
        reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typefaceSize = typefaceSize - 2;
                editText.setTextSize(typefaceSize);
            }
        });
    }
}
