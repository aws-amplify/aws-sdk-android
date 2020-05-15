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
 * StAX marshaller for POJO StackResource
 */
class StackResourceStaxMarshaller {

    public void marshall(StackResource _stackResource, Request<?> request, String _prefix) {
        String prefix;
        if (_stackResource.getStackName() != null) {
            prefix = _prefix + "StackName";
            String stackName = _stackResource.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (_stackResource.getStackId() != null) {
            prefix = _prefix + "StackId";
            String stackId = _stackResource.getStackId();
            request.addParameter(prefix, StringUtils.fromString(stackId));
        }
        if (_stackResource.getLogicalResourceId() != null) {
            prefix = _prefix + "LogicalResourceId";
            String logicalResourceId = _stackResource.getLogicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(logicalResourceId));
        }
        if (_stackResource.getPhysicalResourceId() != null) {
            prefix = _prefix + "PhysicalResourceId";
            String physicalResourceId = _stackResource.getPhysicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(physicalResourceId));
        }
        if (_stackResource.getResourceType() != null) {
            prefix = _prefix + "ResourceType";
            String resourceType = _stackResource.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (_stackResource.getTimestamp() != null) {
            prefix = _prefix + "Timestamp";
            java.util.Date timestamp = _stackResource.getTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(timestamp));
        }
        if (_stackResource.getResourceStatus() != null) {
            prefix = _prefix + "ResourceStatus";
            String resourceStatus = _stackResource.getResourceStatus();
            request.addParameter(prefix, StringUtils.fromString(resourceStatus));
        }
        if (_stackResource.getResourceStatusReason() != null) {
            prefix = _prefix + "ResourceStatusReason";
            String resourceStatusReason = _stackResource.getResourceStatusReason();
            request.addParameter(prefix, StringUtils.fromString(resourceStatusReason));
        }
        if (_stackResource.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _stackResource.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_stackResource.getDriftInformation() != null) {
            prefix = _prefix + "DriftInformation";
            StackResourceDriftInformation driftInformation = _stackResource.getDriftInformation();
            StackResourceDriftInformationStaxMarshaller.getInstance().marshall(driftInformation,
                    request, prefix + ".");
        }
    }

    private static StackResourceStaxMarshaller instance;

    public static StackResourceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackResourceStaxMarshaller();
        return instance;
    }
}
