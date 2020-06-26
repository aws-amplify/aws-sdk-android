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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO StackResourceSummary
 */
class StackResourceSummaryStaxMarshaller {

    public void marshall(StackResourceSummary _stackResourceSummary, Request<?> request,
            String _prefix) {
        String prefix;
        if (_stackResourceSummary.getLogicalResourceId() != null) {
            prefix = _prefix + "LogicalResourceId";
            String logicalResourceId = _stackResourceSummary.getLogicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(logicalResourceId));
        }
        if (_stackResourceSummary.getPhysicalResourceId() != null) {
            prefix = _prefix + "PhysicalResourceId";
            String physicalResourceId = _stackResourceSummary.getPhysicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(physicalResourceId));
        }
        if (_stackResourceSummary.getResourceType() != null) {
            prefix = _prefix + "ResourceType";
            String resourceType = _stackResourceSummary.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (_stackResourceSummary.getLastUpdatedTimestamp() != null) {
            prefix = _prefix + "LastUpdatedTimestamp";
            java.util.Date lastUpdatedTimestamp = _stackResourceSummary.getLastUpdatedTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(lastUpdatedTimestamp));
        }
        if (_stackResourceSummary.getResourceStatus() != null) {
            prefix = _prefix + "ResourceStatus";
            String resourceStatus = _stackResourceSummary.getResourceStatus();
            request.addParameter(prefix, StringUtils.fromString(resourceStatus));
        }
        if (_stackResourceSummary.getResourceStatusReason() != null) {
            prefix = _prefix + "ResourceStatusReason";
            String resourceStatusReason = _stackResourceSummary.getResourceStatusReason();
            request.addParameter(prefix, StringUtils.fromString(resourceStatusReason));
        }
        if (_stackResourceSummary.getDriftInformation() != null) {
            prefix = _prefix + "DriftInformation";
            StackResourceDriftInformationSummary driftInformation = _stackResourceSummary
                    .getDriftInformation();
            StackResourceDriftInformationSummaryStaxMarshaller.getInstance().marshall(
                    driftInformation, request, prefix + ".");
        }
    }

    private static StackResourceSummaryStaxMarshaller instance;

    public static StackResourceSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackResourceSummaryStaxMarshaller();
        return instance;
    }
}
