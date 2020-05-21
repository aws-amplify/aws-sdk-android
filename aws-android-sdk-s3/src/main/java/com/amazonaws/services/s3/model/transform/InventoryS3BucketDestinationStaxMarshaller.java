/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO InventoryS3BucketDestination
 */
class InventoryS3BucketDestinationStaxMarshaller {

    public void marshall(InventoryS3BucketDestination _inventoryS3BucketDestination,
            Request<?> request, String _prefix) {
        String prefix;
        if (_inventoryS3BucketDestination.getAccountId() != null) {
            prefix = _prefix + "AccountId";
            String accountId = _inventoryS3BucketDestination.getAccountId();
            request.addParameter(prefix, StringUtils.fromString(accountId));
        }
        if (_inventoryS3BucketDestination.getBucket() != null) {
            prefix = _prefix + "Bucket";
            String bucket = _inventoryS3BucketDestination.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (_inventoryS3BucketDestination.getFormat() != null) {
            prefix = _prefix + "Format";
            String format = _inventoryS3BucketDestination.getFormat();
            request.addParameter(prefix, StringUtils.fromString(format));
        }
        if (_inventoryS3BucketDestination.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _inventoryS3BucketDestination.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (_inventoryS3BucketDestination.getEncryption() != null) {
            prefix = _prefix + "Encryption";
            InventoryEncryption encryption = _inventoryS3BucketDestination.getEncryption();
            InventoryEncryptionStaxMarshaller.getInstance().marshall(encryption, request,
                    prefix + ".");
        }
    }

    private static InventoryS3BucketDestinationStaxMarshaller instance;

    public static InventoryS3BucketDestinationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InventoryS3BucketDestinationStaxMarshaller();
        return instance;
    }
}
