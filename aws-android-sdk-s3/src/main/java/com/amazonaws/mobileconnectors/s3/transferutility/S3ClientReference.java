/**
 * Copyright 2015-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://aws.amazon.com/apache2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import android.util.Log;
import com.amazonaws.services.s3.AmazonS3;

/**
 * A holder of S3 clients for {@link TransferUtility} to pass a reference of
 * AmazonS3 to {@link TransferService}. Usually objects are passed to a service
 * via intent in a parcelable form. A S3 client has too many elements to
 * capture. Instead, this serves as an alternative approach, not ideal though.
 */
class S3ClientReference {

    private static final String TAG = S3ClientReference.class.getSimpleName();

    private static AmazonS3 amazonS3 = null;

    private static final Object lock = new Object();

    /**
     * Retrieves the AmazonS3 client
     *
     * @return an AmazonS3 instance, or null
     */
    public static AmazonS3 get(Context ctx) {
        if (amazonS3 == null && TransferUtility.clientRetrieve != null) {
            synchronized (lock) {
                try {
                    Log.w(TAG, "S3 client's retrieval attempt");
                    amazonS3 = TransferUtility.clientRetrieve.call(ctx);
                } catch (final Exception ex) {
                    Log.e(TAG, "Failed to retrieve s3 client", ex);
                }
            }
        }
        if (TransferUtility.clientRetrieve == null) {
            Log.e(TAG," TransferUtility.clientRetrieve is NULL");
        }
        return amazonS3;
    }

    /**
     * Clears all references.
     */
    public static void clear() {
        amazonS3 = null;
    }
}
