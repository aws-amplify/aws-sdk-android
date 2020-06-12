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
 * StAX marshaller for POJO StackResourceDetail
 */
class StackResourceDetailStaxMarshaller {

    public void marshall(StackResourceDetail _stackResourceDetail, Request<?> request,
            String _prefix) {
        String prefix;
        if (_stackResourceDetail.getStackName() != null) {
            prefix = _prefix + "StackName";
            String stackName = _stackResourceDetail.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (_stackResourceDetail.getStackId() != null) {
            prefix = _prefix + "StackId";
            String stackId = _stackResourceDetail.getStackId();
            request.addParameter(prefix, StringUtils.fromString(stackId));
        }
        if (_stackResourceDetail.getLogicalResourceId() != null) {
            prefix = _prefix + "LogicalResourceId";
            String logicalResourceId = _stackResourceDetail.getLogicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(logicalResourceId));
        }
        if (_stackResourceDetail.getPhysicalResourceId() != null) {
            prefix = _prefix + "PhysicalResourceId";
            String physicalResourceId = _stackResourceDetail.getPhysicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(physicalResourceId));
        }
        if (_stackResourceDetail.getResourceType() != null) {
            prefix = _prefix + "ResourceType";
            String resourceType = _stackResourceDetail.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (_stackResourceDetail.getLastUpdatedTimestamp() != null) {
            prefix = _prefix + "LastUpdatedTimestamp";
            java.util.Date lastUpdatedTimestamp = _stackResourceDetail.getLastUpdatedTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(lastUpdatedTimestamp));
        }
        if (_stackResourceDetail.getResourceStatus() != null) {
            prefix = _prefix + "ResourceStatus";
            String resourceStatus = _stackResourceDetail.getResourceStatus();
            request.addParameter(prefix, StringUtils.fromString(resourceStatus));
        }
        if (_stackResourceDetail.getResourceStatusReason() != null) {
            prefix = _prefix + "ResourceStatusReason";
            String resourceStatusReason = _stackResourceDetail.getResourceStatusReason();
            request.addParameter(prefix, StringUtils.fromString(resourceStatusReason));
        }
        if (_stackResourceDetail.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _stackResourceDetail.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_stackResourceDetail.getMetadata() != null) {
            prefix = _prefix + "Metadata";
            String metadata = _stackResourceDetail.getMetadata();
            request.addParameter(prefix, StringUtils.fromString(metadata));
        }
        if (_stackResourceDetail.getDriftInformation() != null) {
            prefix = _prefix + "DriftInformation";
            StackResourceDriftInformation driftInformation = _stackResourceDetail
                    .getDriftInformation();
            StackResourceDriftInformationStaxMarshaller.getInstance().marshall(driftInformation,
                    request, prefix + ".");
        }
    }

    private static StackResourceDetailStaxMarshaller instance;

    public static StackResourceDetailStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackResourceDetailStaxMarshaller();
        return instance;
    }
}
