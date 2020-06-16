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
 * StAX marshaller for POJO CloudFrontOriginAccessIdentityConfig
 */
class CloudFrontOriginAccessIdentityConfigStaxMarshaller {

    public void marshall(
            CloudFrontOriginAccessIdentityConfig _cloudFrontOriginAccessIdentityConfig,
            Request<?> request, String _prefix) {
        String prefix;
        if (_cloudFrontOriginAccessIdentityConfig.getCallerReference() != null) {
            prefix = _prefix + "CallerReference";
            String callerReference = _cloudFrontOriginAccessIdentityConfig.getCallerReference();
            request.addParameter(prefix, StringUtils.fromString(callerReference));
        }
        if (_cloudFrontOriginAccessIdentityConfig.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _cloudFrontOriginAccessIdentityConfig.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
    }

    private static CloudFrontOriginAccessIdentityConfigStaxMarshaller instance;

    public static CloudFrontOriginAccessIdentityConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CloudFrontOriginAccessIdentityConfigStaxMarshaller();
        return instance;
    }
}
