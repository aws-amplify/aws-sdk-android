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
 * StAX marshaller for POJO CreateBucketConfiguration
 */
class CreateBucketConfigurationStaxMarshaller {

    public void marshall(CreateBucketConfiguration _createBucketConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_createBucketConfiguration.getLocationConstraint() != null) {
            prefix = _prefix + "LocationConstraint";
            String locationConstraint = _createBucketConfiguration.getLocationConstraint();
            request.addParameter(prefix, StringUtils.fromString(locationConstraint));
        }
    }

    private static CreateBucketConfigurationStaxMarshaller instance;

    public static CreateBucketConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CreateBucketConfigurationStaxMarshaller();
        return instance;
    }
}
