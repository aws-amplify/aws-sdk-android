/**
 * COPYRIGHT:
 * <p>
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.kinesisvideo.producer;

import com.amazonaws.kinesisvideo.internal.producer.jni.NativeKinesisVideoProducerJni;
//import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;

/**
 * Device information object.
 *
 * NOTE: This should follow the structure defined in /client/Include.h
 *
 * NOTE: Suppressing Findbug error as this code will be accessed from native codebase.
 */
//@SuppressFBWarnings("EI_EXPOSE_REP")
public class DeviceInfo {
    /**
     * Current version for the structure as defined in the native code
     */
    public static final int DEVICE_INFO_CURRENT_VERSION = 1;

    private final int mVersion;
    private final String mName;
    private final StorageInfo mStorageInfo;
    private final int mStreamCount;
    private final Tag[] mTags;
    private final String mClientId;
    private final ClientInfo mClientInfo;

    public DeviceInfo(int version, @Nullable final String name, @NonNull final StorageInfo storageInfo,
            int streamCount, @Nullable final Tag[] tags) {
        this(version, name, storageInfo, streamCount, tags,
                "JNI " + NativeKinesisVideoProducerJni.EXPECTED_LIBRARY_VERSION, new ClientInfo());
    }

    public DeviceInfo(int version, @Nullable final String name, @NonNull final StorageInfo storageInfo,
                      int streamCount, @Nullable final Tag[] tags, @NonNull final String clientId,
                      @NonNull final ClientInfo clientInfo) {
        mStorageInfo = Preconditions.checkNotNull(storageInfo);
        mName = name;
        mTags = tags;
        mVersion = version;
        mStreamCount = streamCount;
        mClientId = clientId;
        mClientInfo = clientInfo;
    }

    public int getVersion() {
        return mVersion;
    }

    public String getName() {
        return mName;
    }

    @NonNull
    public StorageInfo getStorageInfo() {
        return mStorageInfo;
    }

    public int getStreamCount() {
        return mStreamCount;
    }

    public int getStorageInfoVersion() {
        return mStorageInfo.getVersion();
    }

    public int getDeviceStorageType() {
        return mStorageInfo.getDeviceStorageType();
    }

    public long getStorageSize() {
        return mStorageInfo.getStorageSize();
    }

    public int getSpillRatio() {
        return mStorageInfo.getSpillRatio();
    }

    @Nullable
    public String getRootDirectory() {
        return mStorageInfo.getRootDirectory();
    }

    @Nullable
    public Tag[] getTags() {
        return mTags;
    }

    @NonNull
    public String getClientId() {
        return mClientId;
    }

    @NonNull
    public ClientInfo getClientInfo() {
        return mClientInfo;
    }
}
