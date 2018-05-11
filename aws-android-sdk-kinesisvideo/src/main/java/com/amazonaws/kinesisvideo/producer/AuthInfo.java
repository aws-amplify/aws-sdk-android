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

//import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.nio.charset.Charset;

/**
 * Device Auth Info object.
 * <p>
 * NOTE: This object will be used by the native code and resembles AuthInfo structure in the native codebase.
 * <p>
 * NOTE: Suppressing Findbug error as this code will be accessed from native codebase.
 */
//@SuppressFBWarnings("EI_EXPOSE_REP")
public class AuthInfo {

    /**
     * Current version of the object as defined in the native code client/Include.h
     */
    private static final int AUTH_INFO_CURRENT_VERSION = 0;

    private final byte[] mData;
    private final long mExpiration;
    private final int mVersion;
    private final AuthInfoType mAuthType;

    /**
     * Public constructor
     * @param authType Authentication type
     * @param data String representation or NULL
     * @param expiration Expiration in absolute time in 100ns
     */
    public AuthInfo(@NonNull AuthInfoType authType, @Nullable final String data, long expiration) {
        this(authType, data == null ? null : data.getBytes(Charset.defaultCharset()), expiration);
    }

    /**
     * Public constructor
     * @param authType Authentication type
     * @param data Acual bits of the auth or NULL
     * @param expiration Expiration in absolute time in 100ns
     */
    public AuthInfo(@NonNull AuthInfoType authType, @Nullable final byte[] data, long expiration) {
        mAuthType = authType;
        mData = data;
        mExpiration = expiration;
        mVersion = AUTH_INFO_CURRENT_VERSION;
    }

    @NonNull
    public AuthInfoType getAuthType() {
        return mAuthType;
    }

    public int getIntAuthType() {
        return mAuthType.getIntType();
    }

    @Nullable
    public byte[] getData() {
        return mData;
    }

    public long getExpiration() {
        return mExpiration;
    }

    public int getVersion() {
        return mVersion;
    }
}
