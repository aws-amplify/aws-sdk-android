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

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ListPoliciesGrantingServiceAccessEntry
 */
class ListPoliciesGrantingServiceAccessEntryStaxMarshaller {

    public void marshall(
            ListPoliciesGrantingServiceAccessEntry _listPoliciesGrantingServiceAccessEntry,
            Request<?> request, String _prefix) {
        String prefix;
        if (_listPoliciesGrantingServiceAccessEntry.getServiceNamespace() != null) {
            prefix = _prefix + "ServiceNamespace";
            String serviceNamespace = _listPoliciesGrantingServiceAccessEntry.getServiceNamespace();
            request.addParameter(prefix, StringUtils.fromString(serviceNamespace));
        }
        if (_listPoliciesGrantingServiceAccessEntry.getPolicies() != null) {
            prefix = _prefix + "Policies";
            java.util.List<PolicyGrantingServiceAccess> policies = _listPoliciesGrantingServiceAccessEntry
                    .getPolicies();
            int policiesIndex = 1;
            String policiesPrefix = prefix;
            for (PolicyGrantingServiceAccess policiesItem : policies) {
                prefix = policiesPrefix + ".member." + policiesIndex;
                if (policiesItem != null) {
                    PolicyGrantingServiceAccessStaxMarshaller.getInstance().marshall(policiesItem,
                            request, prefix + ".");
                }
                policiesIndex++;
            }
            prefix = policiesPrefix;
        }
    }

    private static ListPoliciesGrantingServiceAccessEntryStaxMarshaller instance;

    public static ListPoliciesGrantingServiceAccessEntryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ListPoliciesGrantingServiceAccessEntryStaxMarshaller();
        return instance;
    }
}
