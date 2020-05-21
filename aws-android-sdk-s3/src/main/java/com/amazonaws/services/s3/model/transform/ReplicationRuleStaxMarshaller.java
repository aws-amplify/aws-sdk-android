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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ReplicationRule
 */
class ReplicationRuleStaxMarshaller {

    public void marshall(ReplicationRule _replicationRule, Request<?> request, String _prefix) {
        String prefix;
        if (_replicationRule.getID() != null) {
            prefix = _prefix + "ID";
            String iD = _replicationRule.getID();
            request.addParameter(prefix, StringUtils.fromString(iD));
        }
        if (_replicationRule.getPriority() != null) {
            prefix = _prefix + "Priority";
            Integer priority = _replicationRule.getPriority();
            request.addParameter(prefix, StringUtils.fromInteger(priority));
        }
        if (_replicationRule.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _replicationRule.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (_replicationRule.getFilter() != null) {
            prefix = _prefix + "Filter";
            ReplicationRuleFilter filter = _replicationRule.getFilter();
            ReplicationRuleFilterStaxMarshaller.getInstance().marshall(filter, request,
                    prefix + ".");
        }
        if (_replicationRule.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _replicationRule.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_replicationRule.getSourceSelectionCriteria() != null) {
            prefix = _prefix + "SourceSelectionCriteria";
            SourceSelectionCriteria sourceSelectionCriteria = _replicationRule
                    .getSourceSelectionCriteria();
            SourceSelectionCriteriaStaxMarshaller.getInstance().marshall(sourceSelectionCriteria,
                    request, prefix + ".");
        }
        if (_replicationRule.getExistingObjectReplication() != null) {
            prefix = _prefix + "ExistingObjectReplication";
            ExistingObjectReplication existingObjectReplication = _replicationRule
                    .getExistingObjectReplication();
            ExistingObjectReplicationStaxMarshaller.getInstance().marshall(
                    existingObjectReplication, request, prefix + ".");
        }
        if (_replicationRule.getDestination() != null) {
            prefix = _prefix + "Destination";
            Destination destination = _replicationRule.getDestination();
            DestinationStaxMarshaller.getInstance().marshall(destination, request, prefix + ".");
        }
        if (_replicationRule.getDeleteMarkerReplication() != null) {
            prefix = _prefix + "DeleteMarkerReplication";
            DeleteMarkerReplication deleteMarkerReplication = _replicationRule
                    .getDeleteMarkerReplication();
            DeleteMarkerReplicationStaxMarshaller.getInstance().marshall(deleteMarkerReplication,
                    request, prefix + ".");
        }
    }

    private static ReplicationRuleStaxMarshaller instance;

    public static ReplicationRuleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationRuleStaxMarshaller();
        return instance;
    }
}
