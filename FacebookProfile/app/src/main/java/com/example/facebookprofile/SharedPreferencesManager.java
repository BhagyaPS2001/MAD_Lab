package com.example.facebookprofile;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {

    private SharedPreferences sharedPreferences;
    private static final String PREF_NAME = "UserPref";
    private static final String KEY_NAME = "name";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_GENDER = "gender";
    private static final String KEY_DATE = "dateOfBirth";
    private static final String KEY_PASS = "pwd";

    public SharedPreferencesManager(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }
    public void saveUser(String name, String email,String gender,String dateOfBirth,String pwd) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_NAME, name);
        editor.putString(KEY_EMAIL, email);
        editor.putString(KEY_GENDER, gender);
        editor.putString(KEY_DATE, dateOfBirth);
        editor.putString(KEY_PASS, pwd);

        editor.apply();
    }
    public String getName() {
        return sharedPreferences.getString(KEY_NAME, null);
    }

    public String getEmail() {

        return sharedPreferences.getString(KEY_EMAIL, null);
    }

    public String getGender() {
        return sharedPreferences.getString(KEY_GENDER, null);
    }

    public String getDate() {
        return sharedPreferences.getString(KEY_DATE, null);
    }

    public String getPass() {
        return sharedPreferences.getString(KEY_PASS, null);
    }

}
