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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO S3Location
 */
class S3LocationStaxMarshaller {

    public void marshall(S3Location _s3Location, Request<?> request, String _prefix) {
        String prefix;
        if (_s3Location.getS3Bucket() != null) {
            prefix = _prefix + "S3Bucket";
            String s3Bucket = _s3Location.getS3Bucket();
            request.addParameter(prefix, StringUtils.fromString(s3Bucket));
        }
        if (_s3Location.getS3Key() != null) {
            prefix = _prefix + "S3Key";
            String s3Key = _s3Location.getS3Key();
            request.addParameter(prefix, StringUtils.fromString(s3Key));
        }
    }

    private static S3LocationStaxMarshaller instance;

    public static S3LocationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new S3LocationStaxMarshaller();
        return instance;
    }
}
