package com.smedialink.abakarmagomedov.secretchat.presentation.avatar_choosing;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.os.Bundle;
import android.widget.Toast;

import com.hannesdorfmann.mosby3.mvp.MvpActivity;
import com.smedialink.abakarmagomedov.secretchat.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;
import de.hdodenhof.circleimageview.CircleImageView;
import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.RuntimePermissions;

@RuntimePermissions
public class AvatarActivity extends MvpActivity<AvatarView, AvatarPresenter> implements AvatarView {
    private static final int RESULT_LOAD_IMG = 1;

    @BindView(R.id.avatar) CircleImageView avatar;
    @Inject AvatarPresenter presenter;

    @OnClick(R.id.avatar)
    void onAvatarClicker() {
        AvatarActivityPermissionsDispatcher.openGalleryWithPermissionCheck(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);
        ButterKnife.bind(this);
    }

    @NonNull
    @Override
    public AvatarPresenter createPresenter() {
        return presenter;
    }

    @NeedsPermission(Manifest.permission.CAMERA)
    void openGallery() {
        Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
        photoPickerIntent.setType("image/*");
        startActivityForResult(photoPickerIntent, RESULT_LOAD_IMG);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            final Uri imageUri = data.getData();
            avatar.setImageURI(imageUri);
            //presenter.setUserAvatar(imageUri);
        } else {
            Toast.makeText(AvatarActivity.this, "You haven't picked Image", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void showSucces() {

    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show();
    }
}












