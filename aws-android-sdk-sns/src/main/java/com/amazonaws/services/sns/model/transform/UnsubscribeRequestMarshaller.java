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
 * StAX request marshaller for UnsubscribeRequest
 */
public class UnsubscribeRequestMarshaller implements
        Marshaller<Request<UnsubscribeRequest>, UnsubscribeRequest> {

    public Request<UnsubscribeRequest> marshall(UnsubscribeRequest unsubscribeRequest) {
        if (unsubscribeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UnsubscribeRequest)");
        }

        Request<UnsubscribeRequest> request = new DefaultRequest<UnsubscribeRequest>(
                unsubscribeRequest, "AmazonSNS");
        request.addParameter("Action", "Unsubscribe");
        request.addParameter("Version", "2010-03-31");

        String prefix;
        if (unsubscribeRequest.getSubscriptionArn() != null) {
            prefix = "SubscriptionArn";
            String subscriptionArn = unsubscribeRequest.getSubscriptionArn();
            request.addParameter(prefix, StringUtils.fromString(subscriptionArn));
        }

        return request;
    }
}
