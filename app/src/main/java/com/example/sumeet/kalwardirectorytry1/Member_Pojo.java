package com.example.sumeet.kalwardirectorytry1;

/**
 * Created by Sumeet on 04-07-2017.
 */

public class Member_Pojo {

    private String name, addressR, townR, districtR, stateR, countryR, pincodeR, mobileNumberR, addressPersonal, townP, districtP, stateP, countryP, pincodeP, mobileNumberP, occupationP, socialOrganizationS, memberAsS, townS, stateS, countryS;
    private String id;

    public Member_Pojo() {
    }

    public Member_Pojo(String name) {
        this.name = name;
    }

    public Member_Pojo(String name, String addressR, String townR, String districtR, String stateR, String countryR, String pincodeR, String mobileNumberR, String addressPersonal, String townP, String districtP, String stateP, String countryP, String pincodeP, String mobileNumberP, String occupationP, String socialOrganizationS, String memberAsS, String townS, String stateS, String countryS, String id) {
        this.name = name;
        this.addressR = addressR;
        this.townR = townR;
        this.districtR = districtR;
        this.stateR = stateR;
        this.countryR = countryR;
        this.pincodeR = pincodeR;
        this.mobileNumberR = mobileNumberR;
        this.addressPersonal = addressPersonal;
        this.townP = townP;
        this.districtP = districtP;
        this.stateP = stateP;
        this.countryP = countryP;
        this.pincodeP = pincodeP;
        this.mobileNumberP = mobileNumberP;
        this.occupationP = occupationP;
        this.socialOrganizationS = socialOrganizationS;
        this.memberAsS = memberAsS;
        this.townS = townS;
        this.stateS = stateS;
        this.countryS = countryS;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddressR() {
        return addressR;
    }

    public String getTownR() {
        return townR;
    }

    public String getDistrictR() {
        return districtR;
    }

    public String getStateR() {
        return stateR;
    }

    public String getCountryR() {
        return countryR;
    }

    public String getPincodeR() {
        return pincodeR;
    }

    public String getMobileNumberR() {
        return mobileNumberR;
    }

    public String getAddressPersonal() {
        return addressPersonal;
    }

    public String getTownP() {
        return townP;
    }

    public String getDistrictP() {
        return districtP;
    }

    public String getStateP() {
        return stateP;
    }

    public String getCountryP() {
        return countryP;
    }

    public String getPincodeP() {
        return pincodeP;
    }

    public String getMobileNumberP() {
        return mobileNumberP;
    }

    public String getOccupationP() {
        return occupationP;
    }

    public String getSocialOrganizationS() {
        return socialOrganizationS;
    }

    public String getMemberAsS() {
        return memberAsS;
    }

    public String getTownS() {
        return townS;
    }

    public String getStateS() {
        return stateS;
    }

    public String getCountryS() {
        return countryS;
    }

    public String getId() {
        return id;
    }
}
