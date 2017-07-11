package com.example.sumeet.kalwardirectorytry1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AdddDetails extends AppCompatActivity {

    EditText et_name, et_Address_R, et_Town_R, et_District_R, et_state_R, et_Country_R, et_Pincode_R, et_MobileNumber_R;
    EditText et_Address_P, et_Town_P, et_District_P, et_state_P, et_Country_P, et_Pincode_P, et_MobileNumber_P, et_Occupation_P;
    EditText et_socialOrganization_S, et_memberAs_S, et_Town_S, et_state_S, et_Country_S;

    DatabaseReference databaseReferenceMember;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addd_details);

        databaseReferenceMember = FirebaseDatabase.getInstance().getReference("Member");

        et_name = (EditText) findViewById(R.id.et_name);
        et_Address_R = (EditText) findViewById(R.id.et_Address_R);
        et_Town_R = (EditText) findViewById(R.id.et_Town_R);
        et_District_R = (EditText) findViewById(R.id.et_name);
        et_state_R = (EditText) findViewById(R.id.et_District_R);
        et_Country_R = (EditText) findViewById(R.id.et_Country_R);
        et_Pincode_R = (EditText) findViewById(R.id.et_Pincode_R);
        et_MobileNumber_R = (EditText) findViewById(R.id.et_MobileNumber_R);


        et_Address_P = (EditText) findViewById(R.id.et_Address_P);
        et_Town_P = (EditText) findViewById(R.id.et_Town_P);
        et_District_P = (EditText) findViewById(R.id.et_District_P);
        et_state_P = (EditText) findViewById(R.id.et_state_P);
        et_Country_P = (EditText) findViewById(R.id.et_Country_P);
        et_Pincode_P = (EditText) findViewById(R.id.et_Pincode_P);
        et_MobileNumber_P = (EditText) findViewById(R.id.et_MobileNumber_P);
        et_Occupation_P = (EditText) findViewById(R.id.et_Occupation_P);


        et_socialOrganization_S = (EditText) findViewById(R.id.et_socialOrganization_S);
        et_memberAs_S = (EditText) findViewById(R.id.et_memberAs_S);
        et_Town_S = (EditText) findViewById(R.id.et_Town_S);
        et_state_S = (EditText) findViewById(R.id.et_state_S);
        et_Country_S = (EditText) findViewById(R.id.et_Country_S);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.save, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        //respond to menu item selection
        switch (item.getItemId()) {
            case R.id.save_menu:
                addMember();
                return true;
            default:
                return false;
        }

    }

    private void addMember() {


        //Toast.makeText(this, "test 1", Toast.LENGTH_SHORT).show();
        String et_name_value, et_Address_R_value, et_Town_R_value, et_District_R_value, et_state_R_value, et_Country_R_value, et_Pincode_R_value, et_MobileNumber_R_value;
        String et_Address_P_value, et_Town_P_value, et_District_P_value, et_state_P_value, et_Country_P_value, et_Pincode_P_value, et_MobileNumber_P_value, et_Occupation_P_value;
        String et_socialOrganization_S_value, et_memberAs_S_value, et_Town_S_value, et_state_S_value, et_Country_S_value;

        et_name_value = et_name.getText().toString().trim();
        et_Address_R_value = et_Address_R.getText().toString().trim();
        et_Town_R_value = et_Town_R.getText().toString().trim();
        et_District_R_value = et_District_R.getText().toString().trim();
        et_state_R_value = et_state_R.getText().toString().trim();
        et_Country_R_value = et_Country_R.getText().toString().trim();
        et_Pincode_R_value = et_Pincode_R.getText().toString().trim();
        et_MobileNumber_R_value = et_MobileNumber_R.getText().toString().trim();
        //Toast.makeText(this, "test 2" + et_name_value, Toast.LENGTH_SHORT).show();


        et_Address_P_value = et_Address_P.getText().toString().trim();
        et_Town_P_value = et_Town_P.getText().toString().trim();
        et_District_P_value = et_District_P.getText().toString().trim();
        et_state_P_value = et_state_P.getText().toString().trim();
        et_Country_P_value = et_Country_P.getText().toString().trim();
        et_MobileNumber_P_value = et_MobileNumber_P.getText().toString().trim();
        et_Pincode_P_value = et_Pincode_P.getText().toString().trim();
        et_Occupation_P_value = et_Occupation_P.getText().toString().trim();
        // Toast.makeText(this, "test 3" + et_Address_P_value, Toast.LENGTH_SHORT).show();

        et_socialOrganization_S_value = et_socialOrganization_S.getText().toString().trim();
        et_memberAs_S_value = et_memberAs_S.getText().toString().trim();
        et_Town_S_value = et_Town_S.getText().toString().trim();
        et_state_S_value = et_state_S.getText().toString().trim();
        et_Country_S_value = et_Country_S.getText().toString().trim();
        //Toast.makeText(this, "test 2" + et_socialOrganization_S_value, Toast.LENGTH_SHORT).show();

        // final Random randomIDGenerate = new Random(500);

        // Toast.makeText(this, "text 5 utils check pass" + et_name_value, Toast.LENGTH_SHORT).show();
        if (!TextUtils.isEmpty(et_name_value)) {
            //Toast.makeText(this, "text 5 utils check pass", Toast.LENGTH_SHORT).show();

            String ID = databaseReferenceMember.push().getKey();
            Toast.makeText(this, "ID" + ID, Toast.LENGTH_SHORT).show();

            Member_Pojo member = new Member_Pojo(et_name_value, et_Address_R_value, et_Town_R_value, et_District_R_value, et_state_R_value, et_Country_R_value
                    , et_Pincode_R_value, et_MobileNumber_R_value, et_Address_P_value, et_Town_P_value, et_District_P_value, et_state_P_value, et_Country_P_value, et_Pincode_P_value, et_MobileNumber_P_value, et_Occupation_P_value
                    , et_socialOrganization_S_value, et_memberAs_S_value, et_Town_S_value, et_state_S_value, et_Country_S_value, ID);

            databaseReferenceMember.child(ID).setValue(member);
            Toast.makeText(this, "New Member Added", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, HomeSearchActivity.class);
            startActivity(intent);

        } else {
            // Toast.makeText(this, "text 5 utils check fail", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Please Enter Name", Toast.LENGTH_LONG).show();
        }


    }


}
