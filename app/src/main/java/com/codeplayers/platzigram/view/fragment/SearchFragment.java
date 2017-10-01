package com.codeplayers.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeplayers.platzigram.R;
import com.codeplayers.platzigram.adapter.PictureAdapterRecyclerView;
import com.codeplayers.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_search, container, false);

        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.searchFragment);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false);



        picturesRecycler.setLayoutManager(gridLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buidPictures(), R.layout.cardview_picture, getActivity());

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }


    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://novalandtours.com/images/guide/guilin.jpg", "Safe Ramirez", "4 días", "3 Me gusta"));
        pictures.add(new Picture("https://images.racc.es/agencia-viajes--trenes-768x480.jpg", "Juan Pablo", "3 días", "30 Me gusta"));
        pictures.add(new Picture("http://www.cdn.uolala.com/getimage.ashx?width=730&q=70&src=/event-covers/b-travesia-por-las-islas-griegas-en-velero-20160627082735373-e9d84b.jpg", "Anahi Salgado", "2 días", "9 Me gusta"));

        return pictures;
    }


}
