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
 * StAX marshaller for POJO PolicyTypeDescription
 */
class PolicyTypeDescriptionStaxMarshaller {

    public void marshall(PolicyTypeDescription _policyTypeDescription, Request<?> request,
            String _prefix) {
        String prefix;
        if (_policyTypeDescription.getPolicyTypeName() != null) {
            prefix = _prefix + "PolicyTypeName";
            String policyTypeName = _policyTypeDescription.getPolicyTypeName();
            request.addParameter(prefix, StringUtils.fromString(policyTypeName));
        }
        if (_policyTypeDescription.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _policyTypeDescription.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_policyTypeDescription.getPolicyAttributeTypeDescriptions() != null) {
            prefix = _prefix + "PolicyAttributeTypeDescriptions";
            java.util.List<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions = _policyTypeDescription
                    .getPolicyAttributeTypeDescriptions();
            int policyAttributeTypeDescriptionsIndex = 1;
            String policyAttributeTypeDescriptionsPrefix = prefix;
            for (PolicyAttributeTypeDescription policyAttributeTypeDescriptionsItem : policyAttributeTypeDescriptions) {
                prefix = policyAttributeTypeDescriptionsPrefix + ".member."
                        + policyAttributeTypeDescriptionsIndex;
                if (policyAttributeTypeDescriptionsItem != null) {
                    PolicyAttributeTypeDescriptionStaxMarshaller.getInstance().marshall(
                            policyAttributeTypeDescriptionsItem, request, prefix + ".");
                }
                policyAttributeTypeDescriptionsIndex++;
            }
            prefix = policyAttributeTypeDescriptionsPrefix;
        }
    }

    private static PolicyTypeDescriptionStaxMarshaller instance;

    public static PolicyTypeDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyTypeDescriptionStaxMarshaller();
        return instance;
    }
}
