package com.project.bitcoupon.bitcoupon.controllers.FragmentsForCoupons;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.bitcoupon.bitcoupon.R;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPage2 extends Fragment {

    public static final String FRAG_TWO = "com.project.bitcoupon.bitcoupon.frag.two";
    public FragmentPage2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_page2, container, false);
        Bundle arguments = getArguments();
        int position = arguments.getInt(FRAG_TWO);


        //For picture

        String name = arguments.getString("name");
        TextView mName = (TextView) v.findViewById(R.id.textview_singleCouponName);
        mName.setText(name);


        String description = arguments.getString("description");
        TextView mDescription = (TextView) v.findViewById(R.id.textview_singleCouponDescription);
        mDescription.setText(description);

        String price = arguments.getString("price");
        TextView mPrice = (TextView) v.findViewById(R.id.textview_singleCouponPrice);
        mPrice.setText("Price: " + price + getString(R.string.currency));

        return v;
    }


}
