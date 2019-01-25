/**
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Listener interface for transfer state and progress changes. All callbacks
 * will be invoked on the main thread.
 */
public interface TransferListener {
    /**
     * Called when the state of the transfer is changed.
     *
     * @param id The id of the transfer record.
     * @param state The new state of the transfer.
     */
    public void onStateChanged(int id, TransferState state);

    /**
     * Called when more bytes are transferred.
     *
     * @param id The id of the transfer record.
     * @param bytesCurrent Bytes transferred currently.
     * @param bytesTotal The total bytes to be transferred.
     */
    public void onProgressChanged(int id, long bytesCurrent, long bytesTotal);

    /**
     * Called when an exception happens.
     *
     * @param id The id of the transfer record.
     * @param ex An exception object.
     */
    public void onError(int id, Exception ex);
}
