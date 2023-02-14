package day1;

import java.util.List;

    public class BankAccount {

        // States

        // account Number
        String accountNumber;
        // routing number
        String routingNumber;
        // balance
        double balance;

        // Transactions
        List<Transaction> transactions;

        // account type
        AccountType accountType;

        // account status
        AccountStatus accountStatus;

        // is card blocked
        boolean isCardBlocked;

        //Address
        Address address;

        // cards
        List<Card> cards;

        // mobile number
        String mobileNumber;

        // user id
        String userID;

        // password
        String password; //store it in char later

        // account holder name
        String customerName;

        // account holder dob
        String dateOfBirth;

        // relationship status
        String relationshipStatus;

        // social security number
        String SSN;

        // beneficiaries
        Beneficiary beneficiaries;


        // bank name
        final String BANK_NAME = "Sanima Bank";

        // Behaviour

        // deposit
        // withdraw
        // transfer
        // update kyc
        // check balance
        // card request
        // change password
        // block card
    }

