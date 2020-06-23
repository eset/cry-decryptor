package eset.crydecryptor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent myIntent = new Intent();
        myIntent.setClassName("com.crydroid","com.crydroid.services.DecryptionService");
        startService(myIntent);
    }
}
