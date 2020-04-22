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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ClusterSecurityGroupMembership
 */
class ClusterSecurityGroupMembershipStaxMarshaller {

    public void marshall(ClusterSecurityGroupMembership _clusterSecurityGroupMembership,
            Request<?> request, String _prefix) {
        String prefix;
        if (_clusterSecurityGroupMembership.getClusterSecurityGroupName() != null) {
            prefix = _prefix + "ClusterSecurityGroupName";
            String clusterSecurityGroupName = _clusterSecurityGroupMembership
                    .getClusterSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterSecurityGroupName));
        }
        if (_clusterSecurityGroupMembership.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _clusterSecurityGroupMembership.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static ClusterSecurityGroupMembershipStaxMarshaller instance;

    public static ClusterSecurityGroupMembershipStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterSecurityGroupMembershipStaxMarshaller();
        return instance;
    }
}
