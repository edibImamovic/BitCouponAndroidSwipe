package com.project.bitcoupon.bitcoupon.controllers.FragmentsForCoupons;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.bitcoupon.bitcoupon.R;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPage1 extends Fragment {

    public static final String FRAG_ONE = "com.project.bitcoupon.bitcoupon.frag.one";

    public FragmentPage1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_fragment_page1, container, false);
        Bundle arguments = getArguments();
        int position = arguments.getInt(FRAG_ONE);


        //For picture

        String imgPath = arguments.getString("picture");
        String name = arguments.getString("name");

        ImageView mPicture = (ImageView) v.findViewById(R.id.imageview_singleCouponImage);
        String img = getString(R.string.image_path) + imgPath;
        img = img.replaceAll("\\\\","/");
        Picasso.with(getActivity()).load(img).into(mPicture);

        TextView  mName = (TextView) v.findViewById(R.id.textview_singleCouponName);
        mName.setText(name);

        return v;

    }


}
