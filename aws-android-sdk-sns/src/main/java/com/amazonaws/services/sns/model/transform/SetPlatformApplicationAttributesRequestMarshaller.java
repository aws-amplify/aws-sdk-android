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
 * StAX request marshaller for SetPlatformApplicationAttributesRequest
 */
public class SetPlatformApplicationAttributesRequestMarshaller
        implements
        Marshaller<Request<SetPlatformApplicationAttributesRequest>, SetPlatformApplicationAttributesRequest> {

    public Request<SetPlatformApplicationAttributesRequest> marshall(
            SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest) {
        if (setPlatformApplicationAttributesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetPlatformApplicationAttributesRequest)");
        }

        Request<SetPlatformApplicationAttributesRequest> request = new DefaultRequest<SetPlatformApplicationAttributesRequest>(
                setPlatformApplicationAttributesRequest, "AmazonSNS");
        request.addParameter("Action", "SetPlatformApplicationAttributes");
        request.addParameter("Version", "2010-03-31");

        String prefix;
        if (setPlatformApplicationAttributesRequest.getPlatformApplicationArn() != null) {
            prefix = "PlatformApplicationArn";
            String platformApplicationArn = setPlatformApplicationAttributesRequest
                    .getPlatformApplicationArn();
            request.addParameter(prefix, StringUtils.fromString(platformApplicationArn));
        }
        if (setPlatformApplicationAttributesRequest.getAttributes() != null) {
            prefix = "Attributes";
            java.util.Map<String, String> attributes = setPlatformApplicationAttributesRequest
                    .getAttributes();
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
