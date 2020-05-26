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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO GlobalReplicationGroupMember
 */
class GlobalReplicationGroupMemberStaxMarshaller {

    public void marshall(GlobalReplicationGroupMember _globalReplicationGroupMember,
            Request<?> request, String _prefix) {
        String prefix;
        if (_globalReplicationGroupMember.getReplicationGroupId() != null) {
            prefix = _prefix + "ReplicationGroupId";
            String replicationGroupId = _globalReplicationGroupMember.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (_globalReplicationGroupMember.getReplicationGroupRegion() != null) {
            prefix = _prefix + "ReplicationGroupRegion";
            String replicationGroupRegion = _globalReplicationGroupMember
                    .getReplicationGroupRegion();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupRegion));
        }
        if (_globalReplicationGroupMember.getRole() != null) {
            prefix = _prefix + "Role";
            String role = _globalReplicationGroupMember.getRole();
            request.addParameter(prefix, StringUtils.fromString(role));
        }
        if (_globalReplicationGroupMember.getAutomaticFailover() != null) {
            prefix = _prefix + "AutomaticFailover";
            String automaticFailover = _globalReplicationGroupMember.getAutomaticFailover();
            request.addParameter(prefix, StringUtils.fromString(automaticFailover));
        }
        if (_globalReplicationGroupMember.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _globalReplicationGroupMember.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static GlobalReplicationGroupMemberStaxMarshaller instance;

    public static GlobalReplicationGroupMemberStaxMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalReplicationGroupMemberStaxMarshaller();
        return instance;
    }
}
