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
 * StAX request marshaller for SimulateCustomPolicyRequest
 */
public class SimulateCustomPolicyRequestMarshaller implements
        Marshaller<Request<SimulateCustomPolicyRequest>, SimulateCustomPolicyRequest> {

    public Request<SimulateCustomPolicyRequest> marshall(
            SimulateCustomPolicyRequest simulateCustomPolicyRequest) {
        if (simulateCustomPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SimulateCustomPolicyRequest)");
        }

        Request<SimulateCustomPolicyRequest> request = new DefaultRequest<SimulateCustomPolicyRequest>(
                simulateCustomPolicyRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "SimulateCustomPolicy");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (simulateCustomPolicyRequest.getPolicyInputList() != null) {
            prefix = "PolicyInputList";
            java.util.List<String> policyInputList = simulateCustomPolicyRequest
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
        if (simulateCustomPolicyRequest.getPermissionsBoundaryPolicyInputList() != null) {
            prefix = "PermissionsBoundaryPolicyInputList";
            java.util.List<String> permissionsBoundaryPolicyInputList = simulateCustomPolicyRequest
                    .getPermissionsBoundaryPolicyInputList();
            int permissionsBoundaryPolicyInputListIndex = 1;
            String permissionsBoundaryPolicyInputListPrefix = prefix;
            for (String permissionsBoundaryPolicyInputListItem : permissionsBoundaryPolicyInputList) {
                prefix = permissionsBoundaryPolicyInputListPrefix + ".member."
                        + permissionsBoundaryPolicyInputListIndex;
                if (permissionsBoundaryPolicyInputListItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(permissionsBoundaryPolicyInputListItem));
                }
                permissionsBoundaryPolicyInputListIndex++;
            }
            prefix = permissionsBoundaryPolicyInputListPrefix;
        }
        if (simulateCustomPolicyRequest.getActionNames() != null) {
            prefix = "ActionNames";
            java.util.List<String> actionNames = simulateCustomPolicyRequest.getActionNames();
            int actionNamesIndex = 1;
            String actionNamesPrefix = prefix;
            for (String actionNamesItem : actionNames) {
                prefix = actionNamesPrefix + ".member." + actionNamesIndex;
                if (actionNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(actionNamesItem));
                }
                actionNamesIndex++;
            }
            prefix = actionNamesPrefix;
        }
        if (simulateCustomPolicyRequest.getResourceArns() != null) {
            prefix = "ResourceArns";
            java.util.List<String> resourceArns = simulateCustomPolicyRequest.getResourceArns();
            int resourceArnsIndex = 1;
            String resourceArnsPrefix = prefix;
            for (String resourceArnsItem : resourceArns) {
                prefix = resourceArnsPrefix + ".member." + resourceArnsIndex;
                if (resourceArnsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(resourceArnsItem));
                }
                resourceArnsIndex++;
            }
            prefix = resourceArnsPrefix;
        }
        if (simulateCustomPolicyRequest.getResourcePolicy() != null) {
            prefix = "ResourcePolicy";
            String resourcePolicy = simulateCustomPolicyRequest.getResourcePolicy();
            request.addParameter(prefix, StringUtils.fromString(resourcePolicy));
        }
        if (simulateCustomPolicyRequest.getResourceOwner() != null) {
            prefix = "ResourceOwner";
            String resourceOwner = simulateCustomPolicyRequest.getResourceOwner();
            request.addParameter(prefix, StringUtils.fromString(resourceOwner));
        }
        if (simulateCustomPolicyRequest.getCallerArn() != null) {
            prefix = "CallerArn";
            String callerArn = simulateCustomPolicyRequest.getCallerArn();
            request.addParameter(prefix, StringUtils.fromString(callerArn));
        }
        if (simulateCustomPolicyRequest.getContextEntries() != null) {
            prefix = "ContextEntries";
            java.util.List<ContextEntry> contextEntries = simulateCustomPolicyRequest
                    .getContextEntries();
            int contextEntriesIndex = 1;
            String contextEntriesPrefix = prefix;
            for (ContextEntry contextEntriesItem : contextEntries) {
                prefix = contextEntriesPrefix + ".member." + contextEntriesIndex;
                if (contextEntriesItem != null) {
                    ContextEntryStaxMarshaller.getInstance().marshall(contextEntriesItem, request,
                            prefix + ".");
                }
                contextEntriesIndex++;
            }
            prefix = contextEntriesPrefix;
        }
        if (simulateCustomPolicyRequest.getResourceHandlingOption() != null) {
            prefix = "ResourceHandlingOption";
            String resourceHandlingOption = simulateCustomPolicyRequest.getResourceHandlingOption();
            request.addParameter(prefix, StringUtils.fromString(resourceHandlingOption));
        }
        if (simulateCustomPolicyRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = simulateCustomPolicyRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }
        if (simulateCustomPolicyRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = simulateCustomPolicyRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
