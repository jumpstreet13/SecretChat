package com.smedialink.abakarmagomedov.secretchat.data.datasource.factory;


import com.smedialink.abakarmagomedov.secretchat.data.datasource.impl.DiskUserModelStore;

import javax.inject.Inject;

import dagger.Lazy;

public class UserModelStoreFactory {

    private Lazy<DiskUserModelStore> diskDataSourceProvider;

    @Inject
    public UserModelStoreFactory(Lazy<DiskUserModelStore> diskDataSourceProvider) {
        this.diskDataSourceProvider = diskDataSourceProvider;
    }

    public DiskUserModelStore getDiskUserModelSource() {
        return diskDataSourceProvider.get();
    }
}