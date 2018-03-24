package com.example.android.coffeeorder;

/**
 * Created by liam2 on 06.10.2017.
 */

public class VarHelper {

    private static double mPrice = 2.50;
    private static int mQuantity= 1;
    private static boolean mWhippedCream = false;
    private static boolean mChocolate = false;
    private static String mFirstName = "";
    private static String mName = "";
    private static String mStreet = "";
    private static String mHouseNumber = "";
    private static String mBirth = "";


    public static double getPrice() {
        return mPrice;
    }
    public static double setPrice(double price) {
        return mPrice = price;
    }

    public static int getQuantity() {
        return mQuantity;
    }
    public static int setQuantity(int quantity) {
        return mQuantity = quantity;
    }

    public static boolean getWhippedCream() { return mWhippedCream; }
    public static boolean setWhippedCream(boolean whipped_cream) { return mWhippedCream = whipped_cream; }

    public static boolean getChocolate() { return mChocolate; }
    public static boolean setChocolate(boolean chocolate) { return mChocolate = chocolate; }

    public static String setFirstName(String name) { return mFirstName = name; }
    public static String getFirstName() { return mFirstName; }

    public static String setName(String name) { return mName = name; }
    public static String getName() { return mName; }

    public static String setStreet(String street) { return mStreet = street; }
    public static String getStreet() { return mStreet; }

    public static String setHouseNumber(String number) { return mHouseNumber = number; }
    public static String getHouseNumber() {return mHouseNumber; }

    public static String setBirth(String birth) { return mBirth = birth; }
    public static String getBirth() { return mBirth; }

    public VarHelper(double price, int quantity, boolean WhippedCream, boolean Chocolate, String FirstName,
                     String Name, String Street, String HouseNumber, String Birth) {
        mPrice = price;
        mQuantity = quantity;
        mWhippedCream = WhippedCream;
        mChocolate = Chocolate;
        mFirstName = FirstName;
        mName = Name;
        mStreet = Street;
        mHouseNumber = HouseNumber;
        mBirth = Birth;
    }

    public static void resetItems() {
        mPrice = 2.50;
        mQuantity= 1;
        mWhippedCream = false;
        mChocolate = false;
        mFirstName = "";
        mName = "";
        mStreet = "";
        mHouseNumber = "";
        mBirth = "";
    }

}
