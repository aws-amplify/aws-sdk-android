/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.producer;

import androidx.annotation.NonNull;

/**
 * Storage info class.
 *
 * NOTE: This structure should follow the one defined in /client/Include.h
 */
public class StorageInfo {
    /**
     * Current version for the structure as defined in the native code
     */
    public static final int STORAGE_INFO_CURRENT_VERSION = 0;

    public enum DeviceStorageType {
        /**
         * In-memory storage type
         */
        DEVICE_STORAGE_TYPE_IN_MEM(0),

        /**
         * File based storage type
         */
        DEVICE_STORAGE_TYPE_HYBRID_FILE(1);

        private int value;

        private DeviceStorageType(int i) {
            this.value = i;
        }

        public int getIntValue() {
            return this.value;
        }
    }

    private final int mVersion;
    private final DeviceStorageType mDeviceStorageType;
    private final long mStorageSize;
    private final int mSpillRatio;
    private final String mRootDirectory;

    public StorageInfo(int version, DeviceStorageType deviceStorageType, long storageSize, int spillRatio,
            @NonNull String rootDirectory) {
        mVersion = version;
        mDeviceStorageType = deviceStorageType;
        mStorageSize = storageSize;
        mSpillRatio = spillRatio;
        mRootDirectory = rootDirectory;
    }

    public int getVersion() {
        return mVersion;
    }

    public int getDeviceStorageType() {
        return mDeviceStorageType.getIntValue();
    }

    public long getStorageSize() {
        return mStorageSize;
    }

    public int getSpillRatio() {
        return mSpillRatio;
    }

    @NonNull
    public String getRootDirectory() {
        return mRootDirectory;
    }
}
