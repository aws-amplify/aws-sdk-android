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

package com.amazonaws.services.sns.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for SetEndpointAttributesRequest
 */
public class SetEndpointAttributesRequestMarshaller implements
        Marshaller<Request<SetEndpointAttributesRequest>, SetEndpointAttributesRequest> {

    public Request<SetEndpointAttributesRequest> marshall(
            SetEndpointAttributesRequest setEndpointAttributesRequest) {
        if (setEndpointAttributesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetEndpointAttributesRequest)");
        }

        Request<SetEndpointAttributesRequest> request = new DefaultRequest<SetEndpointAttributesRequest>(
                setEndpointAttributesRequest, "AmazonSNS");
        request.addParameter("Action", "SetEndpointAttributes");
        request.addParameter("Version", "2010-03-31");

        String prefix;
        if (setEndpointAttributesRequest.getEndpointArn() != null) {
            prefix = "EndpointArn";
            String endpointArn = setEndpointAttributesRequest.getEndpointArn();
            request.addParameter(prefix, StringUtils.fromString(endpointArn));
        }
        if (setEndpointAttributesRequest.getAttributes() != null) {
            prefix = "Attributes";
            java.util.Map<String, String> attributes = setEndpointAttributesRequest.getAttributes();
            int attributesIndex = 1;
            String attributesPrefix = prefix + ".entry.";
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                prefix = attributesPrefix + attributesIndex;
                if (attributesEntry.getKey() != null) {
                    request.addParameter(prefix + ".key",
                            StringUtils.fromString(attributesEntry.getKey()));
                }
                prefix += ".value";
                if (attributesEntry.getValue() != null) {
                    String attributesValue = attributesEntry.getValue();
                    request.addParameter(prefix, StringUtils.fromString(attributesValue));
                }
                attributesIndex++;
            }
            prefix = attributesPrefix;
        }

        return request;
    }
}
