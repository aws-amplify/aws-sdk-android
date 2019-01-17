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
 * Represents if a transfer is an upload or download
 */
public enum TransferType {
    /**
     * An Upload operation.
     */
    UPLOAD,
    /**
     * An Downlaod operation.
     */
    DOWNLOAD,
    /**
     * Upload and Download operation.
     */
    ANY;

    /**
     * Returns type of transfer.
     *
     * @param type the transfer type as String.
     * @return the transfer type.
     */
    public static TransferType getType(String type) {
        if (type.equalsIgnoreCase(UPLOAD.toString())) {
            return TransferType.UPLOAD;
        }
        if (type.equalsIgnoreCase(DOWNLOAD.toString())) {
            return TransferType.DOWNLOAD;
        }
        if (type.equalsIgnoreCase(ANY.toString())) {
            return TransferType.ANY;
        }

        throw new IllegalArgumentException("Type " + type + " is not a recognized type");
    }
}
