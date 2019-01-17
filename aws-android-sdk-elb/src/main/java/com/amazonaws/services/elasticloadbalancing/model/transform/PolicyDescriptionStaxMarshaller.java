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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO PolicyDescription
 */
class PolicyDescriptionStaxMarshaller {

    public void marshall(PolicyDescription _policyDescription, Request<?> request, String _prefix) {
        String prefix;
        if (_policyDescription.getPolicyName() != null) {
            prefix = _prefix + "PolicyName";
            String policyName = _policyDescription.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (_policyDescription.getPolicyTypeName() != null) {
            prefix = _prefix + "PolicyTypeName";
            String policyTypeName = _policyDescription.getPolicyTypeName();
            request.addParameter(prefix, StringUtils.fromString(policyTypeName));
        }
        if (_policyDescription.getPolicyAttributeDescriptions() != null) {
            prefix = _prefix + "PolicyAttributeDescriptions";
            java.util.List<PolicyAttributeDescription> policyAttributeDescriptions = _policyDescription
                    .getPolicyAttributeDescriptions();
            int policyAttributeDescriptionsIndex = 1;
            String policyAttributeDescriptionsPrefix = prefix;
            for (PolicyAttributeDescription policyAttributeDescriptionsItem : policyAttributeDescriptions) {
                prefix = policyAttributeDescriptionsPrefix + ".member."
                        + policyAttributeDescriptionsIndex;
                if (policyAttributeDescriptionsItem != null) {
                    PolicyAttributeDescriptionStaxMarshaller.getInstance().marshall(
                            policyAttributeDescriptionsItem, request, prefix + ".");
                }
                policyAttributeDescriptionsIndex++;
            }
            prefix = policyAttributeDescriptionsPrefix;
        }
    }

    private static PolicyDescriptionStaxMarshaller instance;

    public static PolicyDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyDescriptionStaxMarshaller();
        return instance;
    }
}
