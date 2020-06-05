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
 * StAX marshaller for POJO PublicKeySummary
 */
class PublicKeySummaryStaxMarshaller {

    public void marshall(PublicKeySummary _publicKeySummary, Request<?> request, String _prefix) {
        String prefix;
        if (_publicKeySummary.getId() != null) {
            prefix = _prefix + "Id";
            String id = _publicKeySummary.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_publicKeySummary.getName() != null) {
            prefix = _prefix + "Name";
            String name = _publicKeySummary.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_publicKeySummary.getCreatedTime() != null) {
            prefix = _prefix + "CreatedTime";
            java.util.Date createdTime = _publicKeySummary.getCreatedTime();
            request.addParameter(prefix, StringUtils.fromDate(createdTime));
        }
        if (_publicKeySummary.getEncodedKey() != null) {
            prefix = _prefix + "EncodedKey";
            String encodedKey = _publicKeySummary.getEncodedKey();
            request.addParameter(prefix, StringUtils.fromString(encodedKey));
        }
        if (_publicKeySummary.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _publicKeySummary.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
    }

    private static PublicKeySummaryStaxMarshaller instance;

    public static PublicKeySummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PublicKeySummaryStaxMarshaller();
        return instance;
    }
}
