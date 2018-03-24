package com.example.android.coffeeorder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by liam2 on 01.10.2017.
 */

public class Tab3 extends android.support.v4.app.Fragment{

    FCViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.type3, container, false);

        viewPager = (FCViewPager)getActivity().findViewById(R.id.container);


        final EditText firstname = (EditText)rootView.findViewById(R.id.name);
        final EditText lastname = (EditText)rootView.findViewById(R.id.Last_name);
        final EditText street = (EditText)rootView.findViewById(R.id.street);
        final EditText housenumber = (EditText)rootView.findViewById(R.id.housenumber);
        final EditText birth = (EditText)rootView.findViewById(R.id.birth);
        Button next = (Button)rootView.findViewById(R.id.next_button);

        //Check if every box is filled

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstname.getText().toString().matches("")) {
                    firstname.setHintTextColor(getResources().getColor(R.color.colorMissing));
                } else if (lastname.getText().toString().matches("")) {
                    lastname.setHintTextColor(getResources().getColor(R.color.colorMissing));
                } else if (street.getText().toString().matches("")) {
                    street.setHintTextColor(getResources().getColor(R.color.colorMissing));
                } else if (housenumber.getText().toString().matches("")) {
                    housenumber.setHintTextColor(getResources().getColor(R.color.colorMissing));
                } else if (birth.getText().toString().matches("")) {
                    birth.setHintTextColor(getResources().getColor(R.color.colorMissing));
                } else if (birth.getText().toString().length() != 10){
                    Toast toast = Toast.makeText(getActivity(), "A birth date has to look like this: xx.xx.xxxx", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    VarHelper.setFirstName(firstname.getText().toString());
                    VarHelper.setName(lastname.getText().toString());
                    VarHelper.setStreet(street.getText().toString());
                    VarHelper.setHouseNumber(housenumber.getText().toString());
                    VarHelper.setBirth(birth.getText().toString());
                    viewPager.setCurrentItem(3);
                }
            }
        });

        return rootView;
    }
}
