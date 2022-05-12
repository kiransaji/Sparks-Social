package com.example.app.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app.R;
import com.example.app.adapter.NotificationAdapter;
import com.example.app.model.NotificationModel;

import java.util.ArrayList;


public class Notifications2Fragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<NotificationModel> list;



    public Notifications2Fragment() {
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
        View view = inflater.inflate(R.layout.fragment_notifications2, container, false);

        recyclerView = view.findViewById(R.id.notifications2Rv);

        list = new ArrayList<>();

        list.add(new NotificationModel(R.drawable.nigahiga,"<b>Ryan Higa</b> is going live.", "2mins ago"));
        list.add(new NotificationModel(R.drawable.aaronprofile,"<b>Aaron Paul</b> mentioned you in a comment", "5mins ago"));
        list.add(new NotificationModel(R.drawable.bryan,"<b>Bryan Cranston</b> mentioned you in a comment", "6mins ago"));
        list.add(new NotificationModel(R.drawable.mike,"<b>Mike Shinoda</b> mentioned you in a comment", "10mins ago"));
        list.add(new NotificationModel(R.drawable.rhett,"<b>Rhett McLaughlin</b> mentioned you in a comment", "20mins ago"));
        list.add(new NotificationModel(R.drawable.link,"<b>Link Neal</b> tagged you in a photo.", "37mins ago"));
        list.add(new NotificationModel(R.drawable.chester,"<b>Chester Benningtonl</b> is going live.", "47mins ago"));
        list.add(new NotificationModel(R.drawable.cody,"<b>Cody Ko</b> mentioned you in a comment.", "1 hour ago"));
        list.add(new NotificationModel(R.drawable.noel,"<b>Noel Miller</b> tagged you in a photo.", "1 hour ago"));

        NotificationAdapter adapter = new NotificationAdapter(list, getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }
}