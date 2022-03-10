/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.securitytoken.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for GetAccessKeyInfoRequest
 */
public class GetAccessKeyInfoRequestMarshaller implements
        Marshaller<Request<GetAccessKeyInfoRequest>, GetAccessKeyInfoRequest> {

    public Request<GetAccessKeyInfoRequest> marshall(GetAccessKeyInfoRequest getAccessKeyInfoRequest) {
        if (getAccessKeyInfoRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetAccessKeyInfoRequest)");
        }

        Request<GetAccessKeyInfoRequest> request = new DefaultRequest<GetAccessKeyInfoRequest>(
                getAccessKeyInfoRequest, "AWSSecurityTokenService");
        request.addParameter("Action", "GetAccessKeyInfo");
        request.addParameter("Version", "2011-06-15");

        String prefix;
        if (getAccessKeyInfoRequest.getAccessKeyId() != null) {
            prefix = "AccessKeyId";
            String accessKeyId = getAccessKeyInfoRequest.getAccessKeyId();
            request.addParameter(prefix, StringUtils.fromString(accessKeyId));
        }

        return request;
    }
}
