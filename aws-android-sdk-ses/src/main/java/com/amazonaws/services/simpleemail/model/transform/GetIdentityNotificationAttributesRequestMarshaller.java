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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for GetIdentityNotificationAttributesRequest
 */
public class GetIdentityNotificationAttributesRequestMarshaller
        implements
        Marshaller<Request<GetIdentityNotificationAttributesRequest>, GetIdentityNotificationAttributesRequest> {

    public Request<GetIdentityNotificationAttributesRequest> marshall(
            GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest) {
        if (getIdentityNotificationAttributesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetIdentityNotificationAttributesRequest)");
        }

        Request<GetIdentityNotificationAttributesRequest> request = new DefaultRequest<GetIdentityNotificationAttributesRequest>(
                getIdentityNotificationAttributesRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "GetIdentityNotificationAttributes");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (getIdentityNotificationAttributesRequest.getIdentities() != null) {
            prefix = "Identities";
            java.util.List<String> identities = getIdentityNotificationAttributesRequest
                    .getIdentities();
            int identitiesIndex = 1;
            String identitiesPrefix = prefix;
            for (String identitiesItem : identities) {
                prefix = identitiesPrefix + ".member." + identitiesIndex;
                if (identitiesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(identitiesItem));
                }
                identitiesIndex++;
            }
            prefix = identitiesPrefix;
        }

        return request;
    }
}
