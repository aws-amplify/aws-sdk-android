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
 * StAX request marshaller for SimulatePrincipalPolicyRequest
 */
public class SimulatePrincipalPolicyRequestMarshaller implements
        Marshaller<Request<SimulatePrincipalPolicyRequest>, SimulatePrincipalPolicyRequest> {

    public Request<SimulatePrincipalPolicyRequest> marshall(
            SimulatePrincipalPolicyRequest simulatePrincipalPolicyRequest) {
        if (simulatePrincipalPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SimulatePrincipalPolicyRequest)");
        }

        Request<SimulatePrincipalPolicyRequest> request = new DefaultRequest<SimulatePrincipalPolicyRequest>(
                simulatePrincipalPolicyRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "SimulatePrincipalPolicy");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (simulatePrincipalPolicyRequest.getPolicySourceArn() != null) {
            prefix = "PolicySourceArn";
            String policySourceArn = simulatePrincipalPolicyRequest.getPolicySourceArn();
            request.addParameter(prefix, StringUtils.fromString(policySourceArn));
        }
        if (simulatePrincipalPolicyRequest.getPolicyInputList() != null) {
            prefix = "PolicyInputList";
            java.util.List<String> policyInputList = simulatePrincipalPolicyRequest
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
        if (simulatePrincipalPolicyRequest.getPermissionsBoundaryPolicyInputList() != null) {
            prefix = "PermissionsBoundaryPolicyInputList";
            java.util.List<String> permissionsBoundaryPolicyInputList = simulatePrincipalPolicyRequest
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
        if (simulatePrincipalPolicyRequest.getActionNames() != null) {
            prefix = "ActionNames";
            java.util.List<String> actionNames = simulatePrincipalPolicyRequest.getActionNames();
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
        if (simulatePrincipalPolicyRequest.getResourceArns() != null) {
            prefix = "ResourceArns";
            java.util.List<String> resourceArns = simulatePrincipalPolicyRequest.getResourceArns();
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
        if (simulatePrincipalPolicyRequest.getResourcePolicy() != null) {
            prefix = "ResourcePolicy";
            String resourcePolicy = simulatePrincipalPolicyRequest.getResourcePolicy();
            request.addParameter(prefix, StringUtils.fromString(resourcePolicy));
        }
        if (simulatePrincipalPolicyRequest.getResourceOwner() != null) {
            prefix = "ResourceOwner";
            String resourceOwner = simulatePrincipalPolicyRequest.getResourceOwner();
            request.addParameter(prefix, StringUtils.fromString(resourceOwner));
        }
        if (simulatePrincipalPolicyRequest.getCallerArn() != null) {
            prefix = "CallerArn";
            String callerArn = simulatePrincipalPolicyRequest.getCallerArn();
            request.addParameter(prefix, StringUtils.fromString(callerArn));
        }
        if (simulatePrincipalPolicyRequest.getContextEntries() != null) {
            prefix = "ContextEntries";
            java.util.List<ContextEntry> contextEntries = simulatePrincipalPolicyRequest
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
        if (simulatePrincipalPolicyRequest.getResourceHandlingOption() != null) {
            prefix = "ResourceHandlingOption";
            String resourceHandlingOption = simulatePrincipalPolicyRequest
                    .getResourceHandlingOption();
            request.addParameter(prefix, StringUtils.fromString(resourceHandlingOption));
        }
        if (simulatePrincipalPolicyRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = simulatePrincipalPolicyRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }
        if (simulatePrincipalPolicyRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = simulatePrincipalPolicyRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
