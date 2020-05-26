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
 * StAX marshaller for POJO ReplicationGroupPendingModifiedValues
 */
class ReplicationGroupPendingModifiedValuesStaxMarshaller {

    public void marshall(
            ReplicationGroupPendingModifiedValues _replicationGroupPendingModifiedValues,
            Request<?> request, String _prefix) {
        String prefix;
        if (_replicationGroupPendingModifiedValues.getPrimaryClusterId() != null) {
            prefix = _prefix + "PrimaryClusterId";
            String primaryClusterId = _replicationGroupPendingModifiedValues.getPrimaryClusterId();
            request.addParameter(prefix, StringUtils.fromString(primaryClusterId));
        }
        if (_replicationGroupPendingModifiedValues.getAutomaticFailoverStatus() != null) {
            prefix = _prefix + "AutomaticFailoverStatus";
            String automaticFailoverStatus = _replicationGroupPendingModifiedValues
                    .getAutomaticFailoverStatus();
            request.addParameter(prefix, StringUtils.fromString(automaticFailoverStatus));
        }
        if (_replicationGroupPendingModifiedValues.getResharding() != null) {
            prefix = _prefix + "Resharding";
            ReshardingStatus resharding = _replicationGroupPendingModifiedValues.getResharding();
            ReshardingStatusStaxMarshaller.getInstance()
                    .marshall(resharding, request, prefix + ".");
        }
        if (_replicationGroupPendingModifiedValues.getAuthTokenStatus() != null) {
            prefix = _prefix + "AuthTokenStatus";
            String authTokenStatus = _replicationGroupPendingModifiedValues.getAuthTokenStatus();
            request.addParameter(prefix, StringUtils.fromString(authTokenStatus));
        }
    }

    private static ReplicationGroupPendingModifiedValuesStaxMarshaller instance;

    public static ReplicationGroupPendingModifiedValuesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationGroupPendingModifiedValuesStaxMarshaller();
        return instance;
    }
}
