package googleplayservices.samples.android.com.whitney.sparepartsadvisor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {

    private EditText enterusernameEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        enterusernameEditText = (EditText) findViewById(R.id.enterusernameEditText);
        loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener((View.OnClickListener) this);

    }

}
