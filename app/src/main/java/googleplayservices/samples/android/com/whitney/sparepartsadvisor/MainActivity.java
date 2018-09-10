package googleplayservices.samples.android.com.whitney.sparepartsadvisor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView welcomeTextView;
    private TextView memberTextView;
    private TextView alreadymemberTextView;
    private Button registerButton;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeTextView = (TextView) findViewById (R.id.welcomeTextView);
        memberTextView = (TextView) findViewById (R.id.memberTextView);
        alreadymemberTextView = (TextView) findViewById (R.id.alreadymemberTextView);
        registerButton = (Button) findViewById (R.id.registerButton);
        registerButton.setOnClickListener(this);
        loginButton = (Button) findViewById (R.id.loginButton);
        loginButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        openRegistrationForm();
              switch (v.getId()){
          case R.id.registerButton:
              Toast.makeText(this, "Register Button clicked", Toast.LENGTH_SHORT).show();
              break;
          case R.id.loginButton:
              Toast.makeText(this, "LogIn Button clicked", Toast.LENGTH_SHORT).show();
              break;
      }
    }

    private void openRegistrationForm() {
        Intent intent = new Intent (this, RegistrationForm.class);
        startActivity(intent);


    }
}
