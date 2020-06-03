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
 * StAX marshaller for POJO DeletionTaskFailureReasonType
 */
class DeletionTaskFailureReasonTypeStaxMarshaller {

    public void marshall(DeletionTaskFailureReasonType _deletionTaskFailureReasonType,
            Request<?> request, String _prefix) {
        String prefix;
        if (_deletionTaskFailureReasonType.getReason() != null) {
            prefix = _prefix + "Reason";
            String reason = _deletionTaskFailureReasonType.getReason();
            request.addParameter(prefix, StringUtils.fromString(reason));
        }
        if (_deletionTaskFailureReasonType.getRoleUsageList() != null) {
            prefix = _prefix + "RoleUsageList";
            java.util.List<RoleUsageType> roleUsageList = _deletionTaskFailureReasonType
                    .getRoleUsageList();
            int roleUsageListIndex = 1;
            String roleUsageListPrefix = prefix;
            for (RoleUsageType roleUsageListItem : roleUsageList) {
                prefix = roleUsageListPrefix + ".member." + roleUsageListIndex;
                if (roleUsageListItem != null) {
                    RoleUsageTypeStaxMarshaller.getInstance().marshall(roleUsageListItem, request,
                            prefix + ".");
                }
                roleUsageListIndex++;
            }
            prefix = roleUsageListPrefix;
        }
    }

    private static DeletionTaskFailureReasonTypeStaxMarshaller instance;

    public static DeletionTaskFailureReasonTypeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DeletionTaskFailureReasonTypeStaxMarshaller();
        return instance;
    }
}
