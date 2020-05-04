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
 * StAX marshaller for POJO S3SetObjectRetentionOperation
 */
class S3SetObjectRetentionOperationStaxMarshaller {

    public void marshall(S3SetObjectRetentionOperation _s3SetObjectRetentionOperation, Request<?> request, String _prefix) {
        String prefix;
        if (_s3SetObjectRetentionOperation.getBypassGovernanceRetention() != null) {
            prefix = _prefix + "BypassGovernanceRetention";
            Boolean bypassGovernanceRetention = _s3SetObjectRetentionOperation.getBypassGovernanceRetention();
            request.addParameter(prefix, StringUtils.fromBoolean(bypassGovernanceRetention));
        }
        if (_s3SetObjectRetentionOperation.getRetention() != null) {
            prefix = _prefix + "Retention";
            S3Retention retention = _s3SetObjectRetentionOperation.getRetention();
            S3RetentionStaxMarshaller.getInstance().marshall(retention, request, prefix + ".");
        }
    }

    private static S3SetObjectRetentionOperationStaxMarshaller instance;
    public static S3SetObjectRetentionOperationStaxMarshaller getInstance() {
        if (instance == null) instance = new S3SetObjectRetentionOperationStaxMarshaller();
        return instance;
    }
}
