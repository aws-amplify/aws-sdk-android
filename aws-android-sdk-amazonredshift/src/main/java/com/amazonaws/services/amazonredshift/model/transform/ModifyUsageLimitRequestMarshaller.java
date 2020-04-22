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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ModifyUsageLimitRequest
 */
public class ModifyUsageLimitRequestMarshaller implements
        Marshaller<Request<ModifyUsageLimitRequest>, ModifyUsageLimitRequest> {

    public Request<ModifyUsageLimitRequest> marshall(ModifyUsageLimitRequest modifyUsageLimitRequest) {
        if (modifyUsageLimitRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyUsageLimitRequest)");
        }

        Request<ModifyUsageLimitRequest> request = new DefaultRequest<ModifyUsageLimitRequest>(
                modifyUsageLimitRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifyUsageLimit");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (modifyUsageLimitRequest.getUsageLimitId() != null) {
            prefix = "UsageLimitId";
            String usageLimitId = modifyUsageLimitRequest.getUsageLimitId();
            request.addParameter(prefix, StringUtils.fromString(usageLimitId));
        }
        if (modifyUsageLimitRequest.getAmount() != null) {
            prefix = "Amount";
            Long amount = modifyUsageLimitRequest.getAmount();
            request.addParameter(prefix, StringUtils.fromLong(amount));
        }
        if (modifyUsageLimitRequest.getBreachAction() != null) {
            prefix = "BreachAction";
            String breachAction = modifyUsageLimitRequest.getBreachAction();
            request.addParameter(prefix, StringUtils.fromString(breachAction));
        }

        return request;
    }
}
