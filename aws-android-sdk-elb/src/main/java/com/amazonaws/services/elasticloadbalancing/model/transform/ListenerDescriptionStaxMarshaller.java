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
 * StAX marshaller for POJO ListenerDescription
 */
class ListenerDescriptionStaxMarshaller {

    public void marshall(ListenerDescription _listenerDescription, Request<?> request,
            String _prefix) {
        String prefix;
        if (_listenerDescription.getListener() != null) {
            prefix = _prefix + "Listener";
            Listener listener = _listenerDescription.getListener();
            ListenerStaxMarshaller.getInstance().marshall(listener, request, prefix + ".");
        }
        if (_listenerDescription.getPolicyNames() != null) {
            prefix = _prefix + "PolicyNames";
            java.util.List<String> policyNames = _listenerDescription.getPolicyNames();
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
    }

    private static ListenerDescriptionStaxMarshaller instance;

    public static ListenerDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ListenerDescriptionStaxMarshaller();
        return instance;
    }
}
