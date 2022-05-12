package com.example.app.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app.R;
import com.example.app.adapter.ChatAdapter;
import com.example.app.model.ChatModel;

import java.util.ArrayList;

public class ChatFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ChatModel> list;


    public ChatFragment() {
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
        View view = inflater.inflate(R.layout.fragment_chat, container, false);


        recyclerView = view.findViewById(R.id.chatRv);

        list = new ArrayList<>();
        list.add(new ChatModel(R.drawable.aaronprofile,"The Need For Speed Movie", "Aaron Paul"));
        list.add(new ChatModel(R.drawable.bryan,"Watch Malcolm In The Middle", "Bryan Cranston"));
        list.add(new ChatModel(R.drawable.cody,"Jubliee", "Cody Ko"));
        list.add(new ChatModel(R.drawable.rhett,"Watch the latest GMM episode", "Rhett McLaughlin"));
        list.add(new ChatModel(R.drawable.linkprofile,"Mad Libs", "Link Neal"));
        list.add(new ChatModel(R.drawable.nigahiga,"Latest Podcast", "Ryan Higa"));
        list.add(new ChatModel(R.drawable.noel,"Haha", "Noel Miller"));


        ChatAdapter adapter = new ChatAdapter(list, getContext());
        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);


        return view;
    }
}