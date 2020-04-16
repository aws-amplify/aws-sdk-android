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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for AddSourceIdentifierToSubscriptionRequest
 */
public class AddSourceIdentifierToSubscriptionRequestMarshaller
        implements
        Marshaller<Request<AddSourceIdentifierToSubscriptionRequest>, AddSourceIdentifierToSubscriptionRequest> {

    public Request<AddSourceIdentifierToSubscriptionRequest> marshall(
            AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest) {
        if (addSourceIdentifierToSubscriptionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AddSourceIdentifierToSubscriptionRequest)");
        }

        Request<AddSourceIdentifierToSubscriptionRequest> request = new DefaultRequest<AddSourceIdentifierToSubscriptionRequest>(
                addSourceIdentifierToSubscriptionRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "AddSourceIdentifierToSubscription");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (addSourceIdentifierToSubscriptionRequest.getSubscriptionName() != null) {
            prefix = "SubscriptionName";
            String subscriptionName = addSourceIdentifierToSubscriptionRequest
                    .getSubscriptionName();
            request.addParameter(prefix, StringUtils.fromString(subscriptionName));
        }
        if (addSourceIdentifierToSubscriptionRequest.getSourceIdentifier() != null) {
            prefix = "SourceIdentifier";
            String sourceIdentifier = addSourceIdentifierToSubscriptionRequest
                    .getSourceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceIdentifier));
        }

        return request;
    }
}
