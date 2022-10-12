/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.s3.transferutility;

import static com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility.MINIMUM_UPLOAD_PART_SIZE;
import static com.amazonaws.services.s3.internal.Constants.MB;

import java.io.Serializable;

/**
 * Configuration information used by the {@link TransferUtility}
 * and {@link TransferService}
 *
 * <pre>
 * Create TransferUtilityOptions and pass it to {@link TransferUtility}.
 * 
 * TransferUtilityOptions tuOptions = new TransferUtilityOptions();
 * tuOptions.setTransferThreadPoolSize(10); // 10 threads for upload and download operations.
 *
 * // Initializes TransferUtility
 * TransferUtility transferUtility = TransferUtility
 *     .builder()
 *     .s3Client(s3Client)
 *     .context(getApplicationContext())
 *     .transferUtilityConfiguration(tuOptions)
 *     .build();
 * </pre>
 *
 */
public class TransferUtilityOptions implements Serializable {

    /**
     * Default serial versionID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Milliseconds in a minute.
     */
    private static final int MILLIS_IN_MINUTE = 60 * 1000;

    /**
     * TransferService checks for the transfers that are waiting or in progress
     * and restarts the transfer for every time interval in milliseconds.
     *
     * @deprecated This feature is deprecated since {@code TransferService} is
     * changed to only support network connectivity changes.
     */
    @Deprecated
    private long transferServiceCheckTimeInterval;
    
    /**
     * Number of threads in the pool for the all the transfers.
     */
    private int transferThreadPoolSize;

    /**
     * Minimum part size for upload parts. Anything below this will use a
     * single upload
     */
    private int minimumUploadPartSize;

    /**
     * Type of connection to use for transfers.
     */
    protected TransferNetworkConnectionType transferNetworkConnectionType;
    
    /**
     * Constructor that sets the options to the
     * default values.
     */
    public TransferUtilityOptions() {
        super();
        this.transferServiceCheckTimeInterval = getDefaultCheckTimeInterval();
        this.transferThreadPoolSize = getDefaultThreadPoolSize();
        this.transferNetworkConnectionType = getDefaultTransferNetworkConnectionType();
        this.minimumUploadPartSize = MINIMUM_UPLOAD_PART_SIZE;
    }

    /**
     * Constructor that sets the options to the
     * default values.
     *
     * @param transferThreadPoolSize number of threads in the pool
     * @param transferNetworkConnectionType type of network connection
     */
    public TransferUtilityOptions(int transferThreadPoolSize, 
                                  TransferNetworkConnectionType transferNetworkConnectionType) {
        super();
        this.transferServiceCheckTimeInterval = getDefaultCheckTimeInterval();
        this.transferThreadPoolSize = transferThreadPoolSize;
        this.transferNetworkConnectionType = transferNetworkConnectionType;
        this.minimumUploadPartSize = MINIMUM_UPLOAD_PART_SIZE;
    }

    /**
     * Retrieve the transfer service check time interval.
     * 
     * @return the transferServiceCheckTimeInterval
     *
     * @deprecated This feature is deprecated since {@code TransferService} is
     * changed to only support network connectivity changes.
     */
    @Deprecated
    public long getTransferServiceCheckTimeInterval() {
        return transferServiceCheckTimeInterval;
    }

    /**
     * Set the transfer service check time interval.
     * 
     * @param transferServiceCheckTimeInterval the transferServiceCheckTimeInterval to set
     *
     * @deprecated This feature is deprecated since {@code TransferService} is
     * changed to only support network connectivity changes.
     */
    @Deprecated
    public void setTransferServiceCheckTimeInterval(final long transferServiceCheckTimeInterval) {

    }

    /**
     * Retrieve the transfer thread pool size.
     * 
     * @return the transferThreadPoolSize
     */
    public int getTransferThreadPoolSize() {
        return transferThreadPoolSize;
    }

    /**
     * Set the transfer thread pool size. If it's negative, then
     * set the default value.
     * 
     * @param transferThreadPoolSize the transferThreadPoolSize to set
     */
    public void setTransferThreadPoolSize(final int transferThreadPoolSize) {
        if (transferThreadPoolSize < 0) {
            this.transferThreadPoolSize = getDefaultThreadPoolSize();
        } else {
            this.transferThreadPoolSize = transferThreadPoolSize;
        }
    }

    /**
     * Retrieve the transfer connection type.
     *
     * @return the TransferNetworkConnectionType
     */
    public TransferNetworkConnectionType getTransferNetworkConnectionType() {
        return transferNetworkConnectionType;
    }

    /**
     * Return the default thread pool size.
     * 
     * @return 2 * (Number of available processors + 1)
     */
    static int getDefaultThreadPoolSize() {
        return 2 * (Runtime.getRuntime().availableProcessors() + 1);
    }

    /**
     * Retrieve minimum part size for upload parts.
     * @return the minimum upload part size
     */
    public int getMinimumUploadPartSize() {
        return minimumUploadPartSize;
    }

    /**
     * Set the minimum part size for upload parts.
     * @param minimumUploadPartSize the minimum part size to set. Anything below this value
     *                              use a single upload
     */
    public void setMinimumUploadPartSize(final int minimumUploadPartSize) {
        this.minimumUploadPartSize = Math.max(minimumUploadPartSize, MINIMUM_UPLOAD_PART_SIZE);
    }

    /**
     * Return the default check time interval.
     * 
     * @return The default check time interval in milliseconds.
     *
     * @deprecated This feature is deprecated since {@code TransferService} is
     * changed to only support network connectivity changes.
     */
    @Deprecated
    static long getDefaultCheckTimeInterval() {
        return 1 * MILLIS_IN_MINUTE;
    }

    /**
     * Return the default connection type.
     *
     * @return The default connection type.
     */
    static TransferNetworkConnectionType getDefaultTransferNetworkConnectionType() {
        return TransferNetworkConnectionType.ANY;
    }
}
