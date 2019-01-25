/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO S3Action
 */
class S3ActionStaxMarshaller {

    public void marshall(S3Action _s3Action, Request<?> request, String _prefix) {
        String prefix;
        if (_s3Action.getTopicArn() != null) {
            prefix = _prefix + "TopicArn";
            String topicArn = _s3Action.getTopicArn();
            request.addParameter(prefix, StringUtils.fromString(topicArn));
        }
        if (_s3Action.getBucketName() != null) {
            prefix = _prefix + "BucketName";
            String bucketName = _s3Action.getBucketName();
            request.addParameter(prefix, StringUtils.fromString(bucketName));
        }
        if (_s3Action.getObjectKeyPrefix() != null) {
            prefix = _prefix + "ObjectKeyPrefix";
            String objectKeyPrefix = _s3Action.getObjectKeyPrefix();
            request.addParameter(prefix, StringUtils.fromString(objectKeyPrefix));
        }
        if (_s3Action.getKmsKeyArn() != null) {
            prefix = _prefix + "KmsKeyArn";
            String kmsKeyArn = _s3Action.getKmsKeyArn();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyArn));
        }
    }

    private static S3ActionStaxMarshaller instance;

    public static S3ActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new S3ActionStaxMarshaller();
        return instance;
    }
}
