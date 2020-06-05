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
 * StAX marshaller for POJO InvalidationSummary
 */
class InvalidationSummaryStaxMarshaller {

    public void marshall(InvalidationSummary _invalidationSummary, Request<?> request,
            String _prefix) {
        String prefix;
        if (_invalidationSummary.getId() != null) {
            prefix = _prefix + "Id";
            String id = _invalidationSummary.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_invalidationSummary.getCreateTime() != null) {
            prefix = _prefix + "CreateTime";
            java.util.Date createTime = _invalidationSummary.getCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(createTime));
        }
        if (_invalidationSummary.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _invalidationSummary.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static InvalidationSummaryStaxMarshaller instance;

    public static InvalidationSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InvalidationSummaryStaxMarshaller();
        return instance;
    }
}
