/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for PutDataProtectionPolicyRequest
 */
public class PutDataProtectionPolicyRequestMarshaller implements
        Marshaller<Request<PutDataProtectionPolicyRequest>, PutDataProtectionPolicyRequest> {

    public Request<PutDataProtectionPolicyRequest> marshall(
            PutDataProtectionPolicyRequest putDataProtectionPolicyRequest) {
        if (putDataProtectionPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutDataProtectionPolicyRequest)");
        }

        Request<PutDataProtectionPolicyRequest> request = new DefaultRequest<PutDataProtectionPolicyRequest>(
                putDataProtectionPolicyRequest, "AmazonSNS");
        request.addParameter("Action", "PutDataProtectionPolicy");
        request.addParameter("Version", "2010-03-31");

        String prefix;
        if (putDataProtectionPolicyRequest.getResourceArn() != null) {
            prefix = "ResourceArn";
            String resourceArn = putDataProtectionPolicyRequest.getResourceArn();
            request.addParameter(prefix, StringUtils.fromString(resourceArn));
        }
        if (putDataProtectionPolicyRequest.getDataProtectionPolicy() != null) {
            prefix = "DataProtectionPolicy";
            String dataProtectionPolicy = putDataProtectionPolicyRequest.getDataProtectionPolicy();
            request.addParameter(prefix, StringUtils.fromString(dataProtectionPolicy));
        }

        return request;
    }
}
