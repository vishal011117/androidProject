package example.vishal.demoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText userName, passWord;
    Button login;

    String user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        userName = findViewById(R.id.et_userName);
        passWord = findViewById(R.id.et_password);
        login = findViewById(R.id.bt_Login);
    }

    public void Login(View view) {
        user = userName.getText().toString();
        Intent intent = new Intent(MainActivity.this,FinalActivity.class);
        intent.putExtra("USERNAME", user);
        startActivity(intent);
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
    }
}
