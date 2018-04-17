package com.opendatadelaware.deldot.paratransit.model;

import java.util.Date;

public class User {

    boolean isCurrentRider;
    boolean isNewApplicant;
    Gender userGender;
    boolean isMailingAddressDifferent;
    String userName;
    Address userAddress;
    Address mailingAddress;
    String phoneNumber;
    Date dateOfBirth;
    String disabilityDescription;
    boolean isTemporary;

}
