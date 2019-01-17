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
 * StAX request marshaller for DescribeReceiptRuleRequest
 */
public class DescribeReceiptRuleRequestMarshaller implements
        Marshaller<Request<DescribeReceiptRuleRequest>, DescribeReceiptRuleRequest> {

    public Request<DescribeReceiptRuleRequest> marshall(
            DescribeReceiptRuleRequest describeReceiptRuleRequest) {
        if (describeReceiptRuleRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeReceiptRuleRequest)");
        }

        Request<DescribeReceiptRuleRequest> request = new DefaultRequest<DescribeReceiptRuleRequest>(
                describeReceiptRuleRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "DescribeReceiptRule");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (describeReceiptRuleRequest.getRuleSetName() != null) {
            prefix = "RuleSetName";
            String ruleSetName = describeReceiptRuleRequest.getRuleSetName();
            request.addParameter(prefix, StringUtils.fromString(ruleSetName));
        }
        if (describeReceiptRuleRequest.getRuleName() != null) {
            prefix = "RuleName";
            String ruleName = describeReceiptRuleRequest.getRuleName();
            request.addParameter(prefix, StringUtils.fromString(ruleName));
        }

        return request;
    }
}
