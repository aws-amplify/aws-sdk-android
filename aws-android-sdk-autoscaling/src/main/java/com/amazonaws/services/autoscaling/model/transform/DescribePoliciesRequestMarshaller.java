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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribePoliciesRequest
 */
public class DescribePoliciesRequestMarshaller implements
        Marshaller<Request<DescribePoliciesRequest>, DescribePoliciesRequest> {

    public Request<DescribePoliciesRequest> marshall(DescribePoliciesRequest describePoliciesRequest) {
        if (describePoliciesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribePoliciesRequest)");
        }

        Request<DescribePoliciesRequest> request = new DefaultRequest<DescribePoliciesRequest>(
                describePoliciesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribePolicies");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (describePoliciesRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = describePoliciesRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (describePoliciesRequest.getPolicyNames() != null) {
            prefix = "PolicyNames";
            java.util.List<String> policyNames = describePoliciesRequest.getPolicyNames();
            int policyNamesIndex = 1;
            String policyNamesPrefix = prefix;
            for (String policyNamesItem : policyNames) {
                prefix = policyNamesPrefix + ".member." + policyNamesIndex;
                if (policyNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(policyNamesItem));
                }
                policyNamesIndex++;
            }
            prefix = policyNamesPrefix;
        }
        if (describePoliciesRequest.getPolicyTypes() != null) {
            prefix = "PolicyTypes";
            java.util.List<String> policyTypes = describePoliciesRequest.getPolicyTypes();
            int policyTypesIndex = 1;
            String policyTypesPrefix = prefix;
            for (String policyTypesItem : policyTypes) {
                prefix = policyTypesPrefix + ".member." + policyTypesIndex;
                if (policyTypesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(policyTypesItem));
                }
                policyTypesIndex++;
            }
            prefix = policyTypesPrefix;
        }
        if (describePoliciesRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describePoliciesRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (describePoliciesRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describePoliciesRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }

        return request;
    }
}
