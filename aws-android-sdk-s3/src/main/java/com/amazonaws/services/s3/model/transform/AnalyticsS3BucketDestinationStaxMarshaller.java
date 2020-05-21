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
 * StAX marshaller for POJO AnalyticsS3BucketDestination
 */
class AnalyticsS3BucketDestinationStaxMarshaller {

    public void marshall(AnalyticsS3BucketDestination _analyticsS3BucketDestination,
            Request<?> request, String _prefix) {
        String prefix;
        if (_analyticsS3BucketDestination.getFormat() != null) {
            prefix = _prefix + "Format";
            String format = _analyticsS3BucketDestination.getFormat();
            request.addParameter(prefix, StringUtils.fromString(format));
        }
        if (_analyticsS3BucketDestination.getBucketAccountId() != null) {
            prefix = _prefix + "BucketAccountId";
            String bucketAccountId = _analyticsS3BucketDestination.getBucketAccountId();
            request.addParameter(prefix, StringUtils.fromString(bucketAccountId));
        }
        if (_analyticsS3BucketDestination.getBucket() != null) {
            prefix = _prefix + "Bucket";
            String bucket = _analyticsS3BucketDestination.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (_analyticsS3BucketDestination.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _analyticsS3BucketDestination.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
    }

    private static AnalyticsS3BucketDestinationStaxMarshaller instance;

    public static AnalyticsS3BucketDestinationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AnalyticsS3BucketDestinationStaxMarshaller();
        return instance;
    }
}
