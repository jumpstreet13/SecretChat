package com.smedialink.abakarmagomedov.secretchat.custom.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.smedialink.abakarmagomedov.secretchat.R;

import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by abakarmagomedov on 14/12/2017.
 */

public class AvatarView extends FrameLayout {

    private CircleImageView avatar, avatarPicker;


    public AvatarView(@NonNull Context context) {
        super(context);
        init();
    }

    public AvatarView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AvatarView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void setAvatar(Drawable image) {
        avatar.setImageDrawable(image);
    }


    private void init() {
        inflate(getContext(), R.layout.avatar_view, this);
        ButterKnife.bind(this);
    }

}
