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
 * StAX marshaller for POJO StackEvent
 */
class StackEventStaxMarshaller {

    public void marshall(StackEvent _stackEvent, Request<?> request, String _prefix) {
        String prefix;
        if (_stackEvent.getStackId() != null) {
            prefix = _prefix + "StackId";
            String stackId = _stackEvent.getStackId();
            request.addParameter(prefix, StringUtils.fromString(stackId));
        }
        if (_stackEvent.getEventId() != null) {
            prefix = _prefix + "EventId";
            String eventId = _stackEvent.getEventId();
            request.addParameter(prefix, StringUtils.fromString(eventId));
        }
        if (_stackEvent.getStackName() != null) {
            prefix = _prefix + "StackName";
            String stackName = _stackEvent.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (_stackEvent.getLogicalResourceId() != null) {
            prefix = _prefix + "LogicalResourceId";
            String logicalResourceId = _stackEvent.getLogicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(logicalResourceId));
        }
        if (_stackEvent.getPhysicalResourceId() != null) {
            prefix = _prefix + "PhysicalResourceId";
            String physicalResourceId = _stackEvent.getPhysicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(physicalResourceId));
        }
        if (_stackEvent.getResourceType() != null) {
            prefix = _prefix + "ResourceType";
            String resourceType = _stackEvent.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (_stackEvent.getTimestamp() != null) {
            prefix = _prefix + "Timestamp";
            java.util.Date timestamp = _stackEvent.getTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(timestamp));
        }
        if (_stackEvent.getResourceStatus() != null) {
            prefix = _prefix + "ResourceStatus";
            String resourceStatus = _stackEvent.getResourceStatus();
            request.addParameter(prefix, StringUtils.fromString(resourceStatus));
        }
        if (_stackEvent.getResourceStatusReason() != null) {
            prefix = _prefix + "ResourceStatusReason";
            String resourceStatusReason = _stackEvent.getResourceStatusReason();
            request.addParameter(prefix, StringUtils.fromString(resourceStatusReason));
        }
        if (_stackEvent.getResourceProperties() != null) {
            prefix = _prefix + "ResourceProperties";
            String resourceProperties = _stackEvent.getResourceProperties();
            request.addParameter(prefix, StringUtils.fromString(resourceProperties));
        }
        if (_stackEvent.getClientRequestToken() != null) {
            prefix = _prefix + "ClientRequestToken";
            String clientRequestToken = _stackEvent.getClientRequestToken();
            request.addParameter(prefix, StringUtils.fromString(clientRequestToken));
        }
    }

    private static StackEventStaxMarshaller instance;

    public static StackEventStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackEventStaxMarshaller();
        return instance;
    }
}
