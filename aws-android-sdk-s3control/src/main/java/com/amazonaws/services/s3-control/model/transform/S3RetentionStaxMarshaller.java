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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO S3Retention
 */
class S3RetentionStaxMarshaller {

    public void marshall(S3Retention _s3Retention, Request<?> request, String _prefix) {
        String prefix;
        if (_s3Retention.getRetainUntilDate() != null) {
            prefix = _prefix + "RetainUntilDate";
            java.util.Date retainUntilDate = _s3Retention.getRetainUntilDate();
            request.addParameter(prefix, StringUtils.fromDate(retainUntilDate));
        }
        if (_s3Retention.getMode() != null) {
            prefix = _prefix + "Mode";
            String mode = _s3Retention.getMode();
            request.addParameter(prefix, StringUtils.fromString(mode));
        }
    }

    private static S3RetentionStaxMarshaller instance;
    public static S3RetentionStaxMarshaller getInstance() {
        if (instance == null) instance = new S3RetentionStaxMarshaller();
        return instance;
    }
}
