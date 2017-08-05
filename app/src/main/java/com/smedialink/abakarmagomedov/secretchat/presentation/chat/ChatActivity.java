package com.smedialink.abakarmagomedov.secretchat.presentation.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qiscus.sdk.data.model.QiscusChatRoom;
import com.qiscus.sdk.data.model.QiscusComment;
import com.qiscus.sdk.presenter.QiscusChatPresenter;
import com.qiscus.sdk.presenter.QiscusPresenter;
import com.smedialink.abakarmagomedov.secretchat.BaseActivity;
import com.smedialink.abakarmagomedov.secretchat.R;

import java.io.File;
import java.util.List;

public class ChatActivity extends BaseActivity implements QiscusChatPresenter.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }


    @Override
    public void showLoadMoreLoading() {

    }

    @Override
    public void initRoomData(QiscusChatRoom qiscusChatRoom, List<QiscusComment> comments) {

    }

    @Override
    public void showComments(List<QiscusComment> qiscusComments) {

    }

    @Override
    public void onLoadMore(List<QiscusComment> qiscusComments) {

    }

    @Override
    public void onSendingComment(QiscusComment qiscusComment) {

    }

    @Override
    public void onSuccessSendComment(QiscusComment qiscusComment) {

    }

    @Override
    public void onFailedSendComment(QiscusComment qiscusComment) {

    }

    @Override
    public void onNewComment(QiscusComment qiscusComment) {

    }

    @Override
    public void onCommentDeleted(QiscusComment qiscusComment) {

    }

    @Override
    public void refreshComment(QiscusComment qiscusComment) {

    }

    @Override
    public void updateLastDeliveredComment(int lastDeliveredCommentId) {

    }

    @Override
    public void updateLastReadComment(int lastReadCommentId) {

    }

    @Override
    public void onFileDownloaded(File file, String mimeType) {

    }

    @Override
    public void startPhotoViewer(QiscusComment qiscusComment) {

    }

    @Override
    public void onUserTyping(String user, boolean typing) {

    }

    @Override
    public void showCommentsAndScrollToTop(List<QiscusComment> qiscusComments) {

    }

    @Override
    public void onRealtimeStatusChanged(boolean connected) {

    }

    @Override
    public void showError(String errorMessage) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }
}
