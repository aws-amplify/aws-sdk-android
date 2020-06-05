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
 * StAX marshaller for POJO S3Origin
 */
class S3OriginStaxMarshaller {

    public void marshall(S3Origin _s3Origin, Request<?> request, String _prefix) {
        String prefix;
        if (_s3Origin.getDomainName() != null) {
            prefix = _prefix + "DomainName";
            String domainName = _s3Origin.getDomainName();
            request.addParameter(prefix, StringUtils.fromString(domainName));
        }
        if (_s3Origin.getOriginAccessIdentity() != null) {
            prefix = _prefix + "OriginAccessIdentity";
            String originAccessIdentity = _s3Origin.getOriginAccessIdentity();
            request.addParameter(prefix, StringUtils.fromString(originAccessIdentity));
        }
    }

    private static S3OriginStaxMarshaller instance;

    public static S3OriginStaxMarshaller getInstance() {
        if (instance == null)
            instance = new S3OriginStaxMarshaller();
        return instance;
    }
}
