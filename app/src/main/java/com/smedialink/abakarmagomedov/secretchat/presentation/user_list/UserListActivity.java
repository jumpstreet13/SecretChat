package com.smedialink.abakarmagomedov.secretchat.presentation.user_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.smedialink.abakarmagomedov.secretchat.R;
import com.smedialink.abakarmagomedov.secretchat.domain.entity.UserEntity;
import com.smedialink.abakarmagomedov.secretchat.presentation.user_list.adapter.DividerItemDecoration;
import com.smedialink.abakarmagomedov.secretchat.presentation.user_list.adapter.UserListAdapter;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public class UserListActivity extends AppCompatActivity {

    @BindView(R.id.user_list) RecyclerView recyclerView;
    private UserListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
        ButterKnife.bind(this);
        RecyclerView.ItemDecoration dividerItemDecoration = new DividerItemDecoration(getResources().getDrawable(R.drawable.divider_blue));
        adapter = new UserListAdapter(R.layout.user_item, Arrays.asList(new UserEntity("user1", "user1"),
                new UserEntity("user2", "user2"),
                new UserEntity("user3", "user3"),
                new UserEntity("user4", "user2"),
                new UserEntity("user5", "user2"),
                new UserEntity("user6", "user2"),
                new UserEntity("user7", "user2"),
                new UserEntity("user8", "user2"),
                new UserEntity("user9", "user2"),
                new UserEntity("user10", "user2"),
                new UserEntity("user11", "user2")));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(adapter);
    }


}
