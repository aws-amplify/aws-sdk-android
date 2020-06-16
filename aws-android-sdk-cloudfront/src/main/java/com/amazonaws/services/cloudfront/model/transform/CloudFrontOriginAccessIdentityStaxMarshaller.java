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
 * StAX marshaller for POJO CloudFrontOriginAccessIdentity
 */
class CloudFrontOriginAccessIdentityStaxMarshaller {

    public void marshall(CloudFrontOriginAccessIdentity _cloudFrontOriginAccessIdentity,
            Request<?> request, String _prefix) {
        String prefix;
        if (_cloudFrontOriginAccessIdentity.getId() != null) {
            prefix = _prefix + "Id";
            String id = _cloudFrontOriginAccessIdentity.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_cloudFrontOriginAccessIdentity.getS3CanonicalUserId() != null) {
            prefix = _prefix + "S3CanonicalUserId";
            String s3CanonicalUserId = _cloudFrontOriginAccessIdentity.getS3CanonicalUserId();
            request.addParameter(prefix, StringUtils.fromString(s3CanonicalUserId));
        }
        if (_cloudFrontOriginAccessIdentity.getCloudFrontOriginAccessIdentityConfig() != null) {
            prefix = _prefix + "CloudFrontOriginAccessIdentityConfig";
            CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig = _cloudFrontOriginAccessIdentity
                    .getCloudFrontOriginAccessIdentityConfig();
            CloudFrontOriginAccessIdentityConfigStaxMarshaller.getInstance().marshall(
                    cloudFrontOriginAccessIdentityConfig, request, prefix + ".");
        }
    }

    private static CloudFrontOriginAccessIdentityStaxMarshaller instance;

    public static CloudFrontOriginAccessIdentityStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CloudFrontOriginAccessIdentityStaxMarshaller();
        return instance;
    }
}
