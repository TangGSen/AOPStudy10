package sen.com.aopstudy10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @CheckNet
    public void checkNet(View view) {
        Toast.makeText(this, "checkNet hasNet", Toast.LENGTH_SHORT).show();
    }
}
