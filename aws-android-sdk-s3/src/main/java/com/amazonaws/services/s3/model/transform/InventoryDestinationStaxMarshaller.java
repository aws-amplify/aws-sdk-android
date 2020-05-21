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
 * StAX marshaller for POJO InventoryDestination
 */
class InventoryDestinationStaxMarshaller {

    public void marshall(InventoryDestination _inventoryDestination, Request<?> request,
            String _prefix) {
        String prefix;
        if (_inventoryDestination.getS3BucketDestination() != null) {
            prefix = _prefix + "S3BucketDestination";
            InventoryS3BucketDestination s3BucketDestination = _inventoryDestination
                    .getS3BucketDestination();
            InventoryS3BucketDestinationStaxMarshaller.getInstance().marshall(s3BucketDestination,
                    request, prefix + ".");
        }
    }

    private static InventoryDestinationStaxMarshaller instance;

    public static InventoryDestinationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InventoryDestinationStaxMarshaller();
        return instance;
    }
}
