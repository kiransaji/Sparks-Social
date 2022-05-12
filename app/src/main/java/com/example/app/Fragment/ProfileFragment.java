package com.example.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.R;
import com.example.app.adapter.FriendAdapter;
import com.example.app.model.FriendModel;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<FriendModel> list;





    public ProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        recyclerView = view.findViewById(R.id.friendRv);

        list = new ArrayList<>();

        list.add(new FriendModel(R.drawable.aaronprofile));
        list.add(new FriendModel(R.drawable.mike));
        list.add(new FriendModel(R.drawable.link));
        list.add(new FriendModel(R.drawable.rhett));
        list.add(new FriendModel(R.drawable.bryan));

        FriendAdapter adapter = new FriendAdapter(list,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(adapter);

        return view;
    }
}