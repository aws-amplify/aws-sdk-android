/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * StAX request marshaller for SetActiveReceiptRuleSetRequest
 */
public class SetActiveReceiptRuleSetRequestMarshaller implements
        Marshaller<Request<SetActiveReceiptRuleSetRequest>, SetActiveReceiptRuleSetRequest> {

    public Request<SetActiveReceiptRuleSetRequest> marshall(
            SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest) {
        if (setActiveReceiptRuleSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetActiveReceiptRuleSetRequest)");
        }

        Request<SetActiveReceiptRuleSetRequest> request = new DefaultRequest<SetActiveReceiptRuleSetRequest>(
                setActiveReceiptRuleSetRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SetActiveReceiptRuleSet");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (setActiveReceiptRuleSetRequest.getRuleSetName() != null) {
            prefix = "RuleSetName";
            String ruleSetName = setActiveReceiptRuleSetRequest.getRuleSetName();
            request.addParameter(prefix, StringUtils.fromString(ruleSetName));
        }

        return request;
    }
}
