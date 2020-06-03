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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for GetContextKeysForPrincipalPolicyRequest
 */
public class GetContextKeysForPrincipalPolicyRequestMarshaller
        implements
        Marshaller<Request<GetContextKeysForPrincipalPolicyRequest>, GetContextKeysForPrincipalPolicyRequest> {

    public Request<GetContextKeysForPrincipalPolicyRequest> marshall(
            GetContextKeysForPrincipalPolicyRequest getContextKeysForPrincipalPolicyRequest) {
        if (getContextKeysForPrincipalPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetContextKeysForPrincipalPolicyRequest)");
        }

        Request<GetContextKeysForPrincipalPolicyRequest> request = new DefaultRequest<GetContextKeysForPrincipalPolicyRequest>(
                getContextKeysForPrincipalPolicyRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "GetContextKeysForPrincipalPolicy");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (getContextKeysForPrincipalPolicyRequest.getPolicySourceArn() != null) {
            prefix = "PolicySourceArn";
            String policySourceArn = getContextKeysForPrincipalPolicyRequest.getPolicySourceArn();
            request.addParameter(prefix, StringUtils.fromString(policySourceArn));
        }
        if (getContextKeysForPrincipalPolicyRequest.getPolicyInputList() != null) {
            prefix = "PolicyInputList";
            java.util.List<String> policyInputList = getContextKeysForPrincipalPolicyRequest
                    .getPolicyInputList();
            int policyInputListIndex = 1;
            String policyInputListPrefix = prefix;
            for (String policyInputListItem : policyInputList) {
                prefix = policyInputListPrefix + ".member." + policyInputListIndex;
                if (policyInputListItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(policyInputListItem));
                }
                policyInputListIndex++;
            }
            prefix = policyInputListPrefix;
        }

        return request;
    }
}
