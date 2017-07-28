package xxxschool.llll;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private ImageButton LEDlightbulb_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        LEDlightbulb_btn = (ImageButton) findViewById(R.id.LEDlightbulb_imageButton);

        LEDlightbulb_btn.setOnClickListener(new View.OnClickListener() {

            @Override //is @override supposed to be here...what's it for...
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Main2Activity.this,Pop.class));
            }
        });

    }
}
