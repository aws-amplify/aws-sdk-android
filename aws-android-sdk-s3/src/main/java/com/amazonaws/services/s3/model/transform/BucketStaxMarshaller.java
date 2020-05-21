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
 * StAX marshaller for POJO Bucket
 */
class BucketStaxMarshaller {

    public void marshall(Bucket _bucket, Request<?> request, String _prefix) {
        String prefix;
        if (_bucket.getName() != null) {
            prefix = _prefix + "Name";
            String name = _bucket.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_bucket.getCreationDate() != null) {
            prefix = _prefix + "CreationDate";
            java.util.Date creationDate = _bucket.getCreationDate();
            request.addParameter(prefix, StringUtils.fromDate(creationDate));
        }
    }

    private static BucketStaxMarshaller instance;

    public static BucketStaxMarshaller getInstance() {
        if (instance == null)
            instance = new BucketStaxMarshaller();
        return instance;
    }
}
