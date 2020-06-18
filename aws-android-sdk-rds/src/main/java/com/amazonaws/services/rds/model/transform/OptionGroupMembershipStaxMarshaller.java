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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO OptionGroupMembership
 */
class OptionGroupMembershipStaxMarshaller {

    public void marshall(OptionGroupMembership _optionGroupMembership, Request<?> request,
            String _prefix) {
        String prefix;
        if (_optionGroupMembership.getOptionGroupName() != null) {
            prefix = _prefix + "OptionGroupName";
            String optionGroupName = _optionGroupMembership.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (_optionGroupMembership.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _optionGroupMembership.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static OptionGroupMembershipStaxMarshaller instance;

    public static OptionGroupMembershipStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OptionGroupMembershipStaxMarshaller();
        return instance;
    }
}
