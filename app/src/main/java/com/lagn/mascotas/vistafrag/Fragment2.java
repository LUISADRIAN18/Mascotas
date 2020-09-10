package com.lagn.mascotas.vistafrag;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.lagn.mascotas.CardView;
import com.lagn.mascotas.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {
    private CardView car;
    private RecyclerView recyclerView;
    private ImageView imagen, imagen2;
private Fragment frmht;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment2() {
        // Required empty public constructor
    }

    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_2, container, false);



        GridLayoutManager GDR= new GridLayoutManager(getActivity(),2);
      imagen=v.findViewById(R.id.fotorazadal);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.dalmata);
        RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
       roundedBitmapDrawable.setCircular(true);
       imagen.setImageDrawable(roundedBitmapDrawable);
        imagen2=v.findViewById(R.id.fotorrrazablanco);
        Bitmap bitmap1= BitmapFactory.decodeResource(getResources(),R.drawable.samoyedo);
        RoundedBitmapDrawable roundedBitmapDrawable1= RoundedBitmapDrawableFactory.create(getResources(),bitmap1);
        roundedBitmapDrawable1.setCircular(true);
        imagen2.setImageDrawable(roundedBitmapDrawable1);
        return v;
    }
}