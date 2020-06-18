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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DelegationSet
 */
class DelegationSetStaxMarshaller {

    public void marshall(DelegationSet _delegationSet, Request<?> request, String _prefix) {
        String prefix;
        if (_delegationSet.getId() != null) {
            prefix = _prefix + "Id";
            String id = _delegationSet.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_delegationSet.getCallerReference() != null) {
            prefix = _prefix + "CallerReference";
            String callerReference = _delegationSet.getCallerReference();
            request.addParameter(prefix, StringUtils.fromString(callerReference));
        }
        if (_delegationSet.getNameServers() != null) {
            prefix = _prefix + "NameServers";
            java.util.List<String> nameServers = _delegationSet.getNameServers();
            int nameServersIndex = 1;
            String nameServersPrefix = prefix;
            for (String nameServersItem : nameServers) {
                prefix = nameServersPrefix + "." + nameServersIndex;
                if (nameServersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(nameServersItem));
                }
                nameServersIndex++;
            }
            prefix = nameServersPrefix;
        }
    }

    private static DelegationSetStaxMarshaller instance;

    public static DelegationSetStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DelegationSetStaxMarshaller();
        return instance;
    }
}
