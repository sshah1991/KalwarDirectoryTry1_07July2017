package com.example.sumeet.kalwardirectorytry1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class HomeSearchActivity extends AppCompatActivity {


    ListView listViewHome;
    DatabaseReference databaseMember;
    List<Member_Pojo> memberList;
    //  SearchView searchView_Name, searchView_State, searchView_Town;
    String textName;
    //SearchView homeSearch;


    public static final String MEMBER_NAME = "ArtistName";

    public static final String MEMBER_ADDRESS_R = "ADDRESS_R";
    public static final String MEMBER_TOWN_R = "TOWN_R";
    public static final String MEMBER_DISTRICT_R = "DISTRICT_R";
    public static final String MEMBER_STATE_R = "STATE_R";
    public static final String MEMBER_COUNTRY_R = "COUNTRY_R";
    public static final String MEMBER_PINCODE_R = "PINCODE_R";
    public static final String MEMBER_MOBILE_R = "MOBILE_R";


    public static final String MEMBER_ADDRESS_P = "ADDRESS_P";
    public static final String MEMBER_TOWN_P = "TOWN_R";
    public static final String MEMBER_DISTRICT_P = "DISTRICT_R";
    public static final String MEMBER_STATE_P = "STATE_R";
    public static final String MEMBER_COUNTRY_P = "COUNTRY_R";
    public static final String MEMBER_PINCODE_P = "PINCODE_R";
    public static final String MEMBER_MOBILE_P = "MOBILE_R";
    public static final String MEMBER_OCCUPATION_P = "OCCUPATION_P";

    public static final String MEMBER_SOCIAL_ORG_S = "SOCIAL_ORG_S";
    public static final String MEMBER_MEMBER_AS_S = "MEMBER_AS_S";
    public static final String MEMBER_TOWN_S = "TOWN_S";
    public static final String MEMBER_STATE_S = "STATE_S";
    public static final String MEMBER_COUNTRY_S = "COUNTRY_S";
    //public static final String MEMBER_MOBILE_S = "MOBILE_S";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_search);
        final MembersListAdapter adapter = new MembersListAdapter(this, memberList);
        listViewHome = (ListView) findViewById(R.id.listView_displayall);
        // listViewHome.setAdapter(adapter);

        memberList = new ArrayList<>();
        databaseMember = FirebaseDatabase.getInstance().getReference("Member");


        listViewHome.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Member_Pojo member = memberList.get(i);
                Intent intent = new Intent(getApplicationContext(), Profile.class);


                intent.putExtra(MEMBER_NAME, member.getName());

                intent.putExtra(MEMBER_ADDRESS_R, member.getAddressR());
                intent.putExtra(MEMBER_TOWN_R, member.getTownR());
                intent.putExtra(MEMBER_DISTRICT_R, member.getDistrictR());
                intent.putExtra(MEMBER_STATE_R, member.getStateR());
                intent.putExtra(MEMBER_COUNTRY_R, member.getCountryR());
                intent.putExtra(MEMBER_PINCODE_R, member.getPincodeR());
                intent.putExtra(MEMBER_MOBILE_R, member.getMobileNumberR());


                intent.putExtra(MEMBER_ADDRESS_P, member.getAddressR());
                intent.putExtra(MEMBER_TOWN_P, member.getTownR());
                intent.putExtra(MEMBER_DISTRICT_P, member.getDistrictR());
                intent.putExtra(MEMBER_STATE_P, member.getStateR());
                intent.putExtra(MEMBER_COUNTRY_P, member.getCountryR());
                intent.putExtra(MEMBER_PINCODE_P, member.getPincodeR());
                intent.putExtra(MEMBER_MOBILE_P, member.getMobileNumberR());
                intent.putExtra(MEMBER_OCCUPATION_P, member.getOccupationP());


                intent.putExtra(MEMBER_SOCIAL_ORG_S, member.getSocialOrganizationS());
                intent.putExtra(MEMBER_MEMBER_AS_S, member.getMemberAsS());
                intent.putExtra(MEMBER_TOWN_S, member.getTownS());
                intent.putExtra(MEMBER_STATE_S, member.getStateS());
                intent.putExtra(MEMBER_COUNTRY_S, member.getCountryS());
                //  intent.putExtra(MEMBER_MOBILE_S, member.getS);

                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {

        databaseMember.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                memberList.clear();
                for (DataSnapshot memberSnapshot : dataSnapshot.getChildren()) {
                    Member_Pojo member = memberSnapshot.getValue(Member_Pojo.class);
                    memberList.add(member);
                }

                MembersListAdapter adapter = new MembersListAdapter(HomeSearchActivity.this, memberList);
                listViewHome.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return false;
    }


    public boolean onOptionsItemSelected(MenuItem item) {

        //respond to menu item selection
        switch (item.getItemId()) {
            case R.id.app_bar_search:


                return true;


            case R.id.contact_us:

                Intent intent = new Intent(this, Profile.class);
                startActivity(intent);

                return true;

            case R.id.add_menu:
                startActivity(new Intent(this, AdddDetails.class));

                return true;
            default:
                return false;
        }

    }
}
