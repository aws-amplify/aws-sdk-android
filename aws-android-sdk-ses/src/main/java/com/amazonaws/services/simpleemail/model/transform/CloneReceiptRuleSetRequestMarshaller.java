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
 * StAX request marshaller for CloneReceiptRuleSetRequest
 */
public class CloneReceiptRuleSetRequestMarshaller implements
        Marshaller<Request<CloneReceiptRuleSetRequest>, CloneReceiptRuleSetRequest> {

    public Request<CloneReceiptRuleSetRequest> marshall(
            CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest) {
        if (cloneReceiptRuleSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CloneReceiptRuleSetRequest)");
        }

        Request<CloneReceiptRuleSetRequest> request = new DefaultRequest<CloneReceiptRuleSetRequest>(
                cloneReceiptRuleSetRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "CloneReceiptRuleSet");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (cloneReceiptRuleSetRequest.getRuleSetName() != null) {
            prefix = "RuleSetName";
            String ruleSetName = cloneReceiptRuleSetRequest.getRuleSetName();
            request.addParameter(prefix, StringUtils.fromString(ruleSetName));
        }
        if (cloneReceiptRuleSetRequest.getOriginalRuleSetName() != null) {
            prefix = "OriginalRuleSetName";
            String originalRuleSetName = cloneReceiptRuleSetRequest.getOriginalRuleSetName();
            request.addParameter(prefix, StringUtils.fromString(originalRuleSetName));
        }

        return request;
    }
}
