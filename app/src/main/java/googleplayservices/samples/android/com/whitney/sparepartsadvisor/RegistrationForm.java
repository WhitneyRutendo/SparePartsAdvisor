package googleplayservices.samples.android.com.whitney.sparepartsadvisor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationForm extends AppCompatActivity {


    private EditText nameEditText;
    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText farmerid;
    private Button registrationButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);

        final DatabaseHelper myDb = new DatabaseHelper(this);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        emailEditText = (EditText) findViewById(R.id.emailEditText);
        farmerid = (EditText) findViewById(R.id.farmeridEditText);
        registrationButton = (Button) findViewById(R.id.registrationButton);
        registrationButton.setOnClickListener(new View.OnClickListener() {

   @Override
            public void onClick(View v) {
                registerNewMember();
                myDb.insertData(nameEditText,usernameEditText,emailEditText );

            }
        });


    }

    private void registerNewMember() {
        Intent intent = new Intent(this, Catalogue.class);
        startActivity(intent);
    }

    }

