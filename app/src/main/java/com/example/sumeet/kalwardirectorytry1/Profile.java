package com.example.sumeet.kalwardirectorytry1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    private static final String MYTAG = "showmyTag";
    Button btn_DP, btn_RD, btn_PD, btn_SD;
    TextView name_tv;
    String tvName;

    private String address_R, townR, districtR, stateR, countryR, pincodeR, mobileNumberR, addressPersonal,
            townP, districtP, stateP, countryP, pincodeP, mobileNumberP, occupationP,
            socialOrganizationS, memberAsS, townS, stateS, countryS, mobileNumberS;
    // DatabaseReference databaseReferenceMember;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        btn_RD = (Button) findViewById(R.id.btn_RD);
        btn_PD = (Button) findViewById(R.id.btn_PD);
        btn_SD = (Button) findViewById(R.id.btn_SD);
        Intent intent = getIntent();

        name_tv = (TextView) findViewById(R.id.tv_name);


        tvName = intent.getStringExtra(HomeSearchActivity.MEMBER_NAME);

        address_R = intent.getStringExtra(HomeSearchActivity.MEMBER_ADDRESS_R);
        districtR = intent.getStringExtra(HomeSearchActivity.MEMBER_DISTRICT_R);
        townR = intent.getStringExtra(HomeSearchActivity.MEMBER_TOWN_R);
        stateR = intent.getStringExtra(HomeSearchActivity.MEMBER_STATE_R);
        countryR = intent.getStringExtra(HomeSearchActivity.MEMBER_COUNTRY_R);
        pincodeR = intent.getStringExtra(HomeSearchActivity.MEMBER_PINCODE_R);
        mobileNumberR = intent.getStringExtra(HomeSearchActivity.MEMBER_MOBILE_R);


        addressPersonal = intent.getStringExtra(HomeSearchActivity.MEMBER_ADDRESS_P);
        townP = intent.getStringExtra(HomeSearchActivity.MEMBER_TOWN_P);
        districtP = intent.getStringExtra(HomeSearchActivity.MEMBER_DISTRICT_P);
        stateP = intent.getStringExtra(HomeSearchActivity.MEMBER_STATE_P);
        countryP = intent.getStringExtra(HomeSearchActivity.MEMBER_COUNTRY_P);
        pincodeP = intent.getStringExtra(HomeSearchActivity.MEMBER_PINCODE_P);
        mobileNumberP = intent.getStringExtra(HomeSearchActivity.MEMBER_MOBILE_P);
        occupationP = intent.getStringExtra(HomeSearchActivity.MEMBER_OCCUPATION_P);

        socialOrganizationS = intent.getStringExtra(HomeSearchActivity.MEMBER_SOCIAL_ORG_S);
        memberAsS = intent.getStringExtra(HomeSearchActivity.MEMBER_MEMBER_AS_S);
        townS = intent.getStringExtra(HomeSearchActivity.MEMBER_TOWN_S);
        stateS = intent.getStringExtra(HomeSearchActivity.MEMBER_STATE_S);
        countryS = intent.getStringExtra(HomeSearchActivity.MEMBER_COUNTRY_S);
        //mobileNumberS = intent.getStringExtra(HomeSearchActivity.MEMBER_MOBILE_S);

        name_tv.setText(tvName);


        //    databaseReferenceMember = FirebaseDatabase.getInstance().getReference("Member");

        btn_RD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(Profile.this);
                LayoutInflater inflater = getLayoutInflater();

                final View dialogView = inflater.inflate(R.layout.residential_details_layout, null);
                Log.e("Address_Show", "Address Value is " + address_R);
                TextView tv_add_R, tv_town_R, tv_dist_R, tv_state_R, tv_country_R, tv_pincode_R, tv_mobile_R;

                tv_add_R = (TextView) dialogView.findViewById(R.id.tv_Address);
                tv_town_R = (TextView) dialogView.findViewById(R.id.tv_Town);
                tv_dist_R = (TextView) dialogView.findViewById(R.id.tv_District);
                tv_state_R = (TextView) dialogView.findViewById(R.id.tv_state);
                tv_country_R = (TextView) dialogView.findViewById(R.id.tv_Country);
                tv_pincode_R = (TextView) dialogView.findViewById(R.id.tv_Pincode);
                tv_mobile_R = (TextView) dialogView.findViewById(R.id.tv_MobileNumber);


                tv_add_R.setText(address_R);
                tv_town_R.setText(townR);
                tv_dist_R.setText(districtR);
                tv_state_R.setText(stateR);
                tv_country_R.setText(countryR);
                tv_pincode_R.setText(pincodeR);
                tv_mobile_R.setText(mobileNumberR);


                builder.setView(dialogView);
                builder.setTitle("Residential Details");
                final AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
        btn_PD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Profile.this);
                LayoutInflater inflater = getLayoutInflater();

                final View dialogView = inflater.inflate(R.layout.professional_details_layout, null);
                builder.setView(dialogView);
                builder.setTitle("Professional Details");
                final AlertDialog alertDialog = builder.create();
                TextView tv_add_P, tv_town_P, tv_dist_P, tv_state_P, tv_country_P, tv_pincode_P, tv_mobile_P, tv_profession;

                tv_add_P = (TextView) dialogView.findViewById(R.id.tv_Address);
                tv_town_P = (TextView) dialogView.findViewById(R.id.tv_Town);
                tv_dist_P = (TextView) dialogView.findViewById(R.id.tv_District);
                tv_state_P = (TextView) dialogView.findViewById(R.id.tv_state);
                tv_country_P = (TextView) dialogView.findViewById(R.id.tv_Country);
                tv_pincode_P = (TextView) dialogView.findViewById(R.id.tv_Pincode);
                tv_mobile_P = (TextView) dialogView.findViewById(R.id.tv_MobileNumber);
                tv_profession = (TextView) dialogView.findViewById(R.id.tv_Proffesion);


                tv_add_P.setText(address_R);
                tv_town_P.setText(townR);
                tv_dist_P.setText(districtR);
                tv_state_P.setText(stateR);
                tv_country_P.setText(countryR);
                tv_pincode_P.setText(pincodeR);
                tv_mobile_P.setText(mobileNumberR);
                tv_profession.setText(occupationP);

                alertDialog.show();

            }
        });
        btn_SD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Profile.this);
                LayoutInflater inflater = getLayoutInflater();

                final View dialogView = inflater.inflate(R.layout.social_details_layout, null);
                builder.setView(dialogView);
                builder.setTitle("Social Details");

                final AlertDialog alertDialog = builder.create();

                TextView tv_socialOrg, tv_memberAs, tv_town, tv_state, tv_country, tv_mobileNo;


                tv_socialOrg = (TextView) dialogView.findViewById(R.id.tv_socialOrganization);
                tv_memberAs = (TextView) dialogView.findViewById(R.id.tv_memberAs);
                tv_town = (TextView) dialogView.findViewById(R.id.tv_Town);
                tv_state = (TextView) dialogView.findViewById(R.id.tv_state);
                tv_country = (TextView) dialogView.findViewById(R.id.tv_Country);
                // tv_mobileNo = (TextView) dialogView.findViewById(R.id.tv_MobileNumber);

                tv_socialOrg.setText(socialOrganizationS);
                tv_memberAs.setText(memberAsS);
                tv_town.setText(townS);
                tv_state.setText(stateS);
                tv_country.setText(countryS);
                //   tv_mobileNo.setText(mobileNumberS);


                alertDialog.show();
            }
        });


    }

}
