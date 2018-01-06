/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.s3.transfermanager;

import com.amazonaws.mobileconnectors.s3.transfermanager.exception.PauseException;
import com.amazonaws.services.s3.model.CryptoMode;
import com.amazonaws.services.s3.model.ObjectMetadata;

import java.io.IOException;

/**
 * Represents an asynchronous download from Amazon S3.
 * <p>
 * See {@link TransferManager} for more information about creating transfers.
 * </p>
 *
 * @see TransferManager#download(com.amazonaws.services.s3.model.GetObjectRequest)
 *      ;
 * @deprecated The Transfer Manager is now deprecated in favor of the
 *             {@link com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility}
 */
@Deprecated
public interface Download extends Transfer {

    /**
     * Returns the ObjectMetadata for the object being downloaded.
     *
     * @return The ObjectMetadata for the object being downloaded.
     */
    public ObjectMetadata getObjectMetadata();

    /**
     * The name of the bucket where the object is being downloaded from.
     *
     * @return The name of the bucket where the object is being downloaded from.
     */
    public String getBucketName();

    /**
     * The key under which this object was stored in Amazon S3.
     *
     * @return The key under which this object was stored in Amazon S3.
     */
    public String getKey();

    /**
     * Cancels this download.
     *
     * @throws IOException
     */
    public void abort() throws IOException;

    /**
     * Pause the current download operation and returns the information that can
     * be used to resume the download at a later time. Resuming a download would
     * not perform ETag check as range get is performed for downloading the
     * object's remaining contents. Resuming a download for an object encrypted
     * using {@link CryptoMode#StrictAuthenticatedEncryption} would result in
     * AmazonClientException as authenticity cannot be guaranteed for a range
     * get operation.
     *
     * @throws PauseException If any errors were encountered while trying to
     *             pause the download.
     */
    public PersistableDownload pause() throws PauseException;
}
