package com.smedialink.abakarmagomedov.secretchat.presentation.user_list.adapter;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.smedialink.abakarmagomedov.secretchat.R;
import com.smedialink.abakarmagomedov.secretchat.domain.entity.UserEntity;

import java.util.List;

/**
 * Created by abakarmagomedov on 14/12/2017.
 */

public class UserListAdapter extends BaseQuickAdapter<UserEntity, BaseViewHolder> {

    public UserListAdapter(int layoutResId, @Nullable List<UserEntity> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, UserEntity item) {
        helper.setText(R.id.user_name, item.getLogin());
    }
}
