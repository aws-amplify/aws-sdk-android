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
 * StAX marshaller for POJO RoleUsageType
 */
class RoleUsageTypeStaxMarshaller {

    public void marshall(RoleUsageType _roleUsageType, Request<?> request, String _prefix) {
        String prefix;
        if (_roleUsageType.getRegion() != null) {
            prefix = _prefix + "Region";
            String region = _roleUsageType.getRegion();
            request.addParameter(prefix, StringUtils.fromString(region));
        }
        if (_roleUsageType.getResources() != null) {
            prefix = _prefix + "Resources";
            java.util.List<String> resources = _roleUsageType.getResources();
            int resourcesIndex = 1;
            String resourcesPrefix = prefix;
            for (String resourcesItem : resources) {
                prefix = resourcesPrefix + ".member." + resourcesIndex;
                if (resourcesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(resourcesItem));
                }
                resourcesIndex++;
            }
            prefix = resourcesPrefix;
        }
    }

    private static RoleUsageTypeStaxMarshaller instance;

    public static RoleUsageTypeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RoleUsageTypeStaxMarshaller();
        return instance;
    }
}
