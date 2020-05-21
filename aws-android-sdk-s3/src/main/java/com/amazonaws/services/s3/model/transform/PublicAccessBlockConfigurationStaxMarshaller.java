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
 * StAX marshaller for POJO PublicAccessBlockConfiguration
 */
class PublicAccessBlockConfigurationStaxMarshaller {

    public void marshall(PublicAccessBlockConfiguration _publicAccessBlockConfiguration,
            Request<?> request, String _prefix) {
        String prefix;
        if (_publicAccessBlockConfiguration.getBlockPublicAcls() != null) {
            prefix = _prefix + "BlockPublicAcls";
            Boolean blockPublicAcls = _publicAccessBlockConfiguration.getBlockPublicAcls();
            request.addParameter(prefix, StringUtils.fromBoolean(blockPublicAcls));
        }
        if (_publicAccessBlockConfiguration.getIgnorePublicAcls() != null) {
            prefix = _prefix + "IgnorePublicAcls";
            Boolean ignorePublicAcls = _publicAccessBlockConfiguration.getIgnorePublicAcls();
            request.addParameter(prefix, StringUtils.fromBoolean(ignorePublicAcls));
        }
        if (_publicAccessBlockConfiguration.getBlockPublicPolicy() != null) {
            prefix = _prefix + "BlockPublicPolicy";
            Boolean blockPublicPolicy = _publicAccessBlockConfiguration.getBlockPublicPolicy();
            request.addParameter(prefix, StringUtils.fromBoolean(blockPublicPolicy));
        }
        if (_publicAccessBlockConfiguration.getRestrictPublicBuckets() != null) {
            prefix = _prefix + "RestrictPublicBuckets";
            Boolean restrictPublicBuckets = _publicAccessBlockConfiguration
                    .getRestrictPublicBuckets();
            request.addParameter(prefix, StringUtils.fromBoolean(restrictPublicBuckets));
        }
    }

    private static PublicAccessBlockConfigurationStaxMarshaller instance;

    public static PublicAccessBlockConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PublicAccessBlockConfigurationStaxMarshaller();
        return instance;
    }
}
