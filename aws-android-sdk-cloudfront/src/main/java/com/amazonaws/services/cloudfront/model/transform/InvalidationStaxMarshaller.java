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

package com.amazonaws.services.cloudfront.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Invalidation
 */
class InvalidationStaxMarshaller {

    public void marshall(Invalidation _invalidation, Request<?> request, String _prefix) {
        String prefix;
        if (_invalidation.getId() != null) {
            prefix = _prefix + "Id";
            String id = _invalidation.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_invalidation.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _invalidation.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_invalidation.getCreateTime() != null) {
            prefix = _prefix + "CreateTime";
            java.util.Date createTime = _invalidation.getCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(createTime));
        }
        if (_invalidation.getInvalidationBatch() != null) {
            prefix = _prefix + "InvalidationBatch";
            InvalidationBatch invalidationBatch = _invalidation.getInvalidationBatch();
            InvalidationBatchStaxMarshaller.getInstance().marshall(invalidationBatch, request,
                    prefix + ".");
        }
    }

    private static InvalidationStaxMarshaller instance;

    public static InvalidationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InvalidationStaxMarshaller();
        return instance;
    }
}
