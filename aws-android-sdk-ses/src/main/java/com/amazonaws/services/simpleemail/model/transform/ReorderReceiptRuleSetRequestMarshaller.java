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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ReorderReceiptRuleSetRequest
 */
public class ReorderReceiptRuleSetRequestMarshaller implements
        Marshaller<Request<ReorderReceiptRuleSetRequest>, ReorderReceiptRuleSetRequest> {

    public Request<ReorderReceiptRuleSetRequest> marshall(
            ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest) {
        if (reorderReceiptRuleSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ReorderReceiptRuleSetRequest)");
        }

        Request<ReorderReceiptRuleSetRequest> request = new DefaultRequest<ReorderReceiptRuleSetRequest>(
                reorderReceiptRuleSetRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "ReorderReceiptRuleSet");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (reorderReceiptRuleSetRequest.getRuleSetName() != null) {
            prefix = "RuleSetName";
            String ruleSetName = reorderReceiptRuleSetRequest.getRuleSetName();
            request.addParameter(prefix, StringUtils.fromString(ruleSetName));
        }
        if (reorderReceiptRuleSetRequest.getRuleNames() != null) {
            prefix = "RuleNames";
            java.util.List<String> ruleNames = reorderReceiptRuleSetRequest.getRuleNames();
            int ruleNamesIndex = 1;
            String ruleNamesPrefix = prefix;
            for (String ruleNamesItem : ruleNames) {
                prefix = ruleNamesPrefix + ".member." + ruleNamesIndex;
                if (ruleNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(ruleNamesItem));
                }
                ruleNamesIndex++;
            }
            prefix = ruleNamesPrefix;
        }

        return request;
    }
}
