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
 * StAX marshaller for POJO StackResourceDrift
 */
class StackResourceDriftStaxMarshaller {

    public void marshall(StackResourceDrift _stackResourceDrift, Request<?> request, String _prefix) {
        String prefix;
        if (_stackResourceDrift.getStackId() != null) {
            prefix = _prefix + "StackId";
            String stackId = _stackResourceDrift.getStackId();
            request.addParameter(prefix, StringUtils.fromString(stackId));
        }
        if (_stackResourceDrift.getLogicalResourceId() != null) {
            prefix = _prefix + "LogicalResourceId";
            String logicalResourceId = _stackResourceDrift.getLogicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(logicalResourceId));
        }
        if (_stackResourceDrift.getPhysicalResourceId() != null) {
            prefix = _prefix + "PhysicalResourceId";
            String physicalResourceId = _stackResourceDrift.getPhysicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(physicalResourceId));
        }
        if (_stackResourceDrift.getPhysicalResourceIdContext() != null) {
            prefix = _prefix + "PhysicalResourceIdContext";
            java.util.List<PhysicalResourceIdContextKeyValuePair> physicalResourceIdContext = _stackResourceDrift
                    .getPhysicalResourceIdContext();
            int physicalResourceIdContextIndex = 1;
            String physicalResourceIdContextPrefix = prefix;
            for (PhysicalResourceIdContextKeyValuePair physicalResourceIdContextItem : physicalResourceIdContext) {
                prefix = physicalResourceIdContextPrefix + ".member."
                        + physicalResourceIdContextIndex;
                if (physicalResourceIdContextItem != null) {
                    PhysicalResourceIdContextKeyValuePairStaxMarshaller.getInstance().marshall(
                            physicalResourceIdContextItem, request, prefix + ".");
                }
                physicalResourceIdContextIndex++;
            }
            prefix = physicalResourceIdContextPrefix;
        }
        if (_stackResourceDrift.getResourceType() != null) {
            prefix = _prefix + "ResourceType";
            String resourceType = _stackResourceDrift.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (_stackResourceDrift.getExpectedProperties() != null) {
            prefix = _prefix + "ExpectedProperties";
            String expectedProperties = _stackResourceDrift.getExpectedProperties();
            request.addParameter(prefix, StringUtils.fromString(expectedProperties));
        }
        if (_stackResourceDrift.getActualProperties() != null) {
            prefix = _prefix + "ActualProperties";
            String actualProperties = _stackResourceDrift.getActualProperties();
            request.addParameter(prefix, StringUtils.fromString(actualProperties));
        }
        if (_stackResourceDrift.getPropertyDifferences() != null) {
            prefix = _prefix + "PropertyDifferences";
            java.util.List<PropertyDifference> propertyDifferences = _stackResourceDrift
                    .getPropertyDifferences();
            int propertyDifferencesIndex = 1;
            String propertyDifferencesPrefix = prefix;
            for (PropertyDifference propertyDifferencesItem : propertyDifferences) {
                prefix = propertyDifferencesPrefix + ".member." + propertyDifferencesIndex;
                if (propertyDifferencesItem != null) {
                    PropertyDifferenceStaxMarshaller.getInstance().marshall(
                            propertyDifferencesItem, request, prefix + ".");
                }
                propertyDifferencesIndex++;
            }
            prefix = propertyDifferencesPrefix;
        }
        if (_stackResourceDrift.getStackResourceDriftStatus() != null) {
            prefix = _prefix + "StackResourceDriftStatus";
            String stackResourceDriftStatus = _stackResourceDrift.getStackResourceDriftStatus();
            request.addParameter(prefix, StringUtils.fromString(stackResourceDriftStatus));
        }
        if (_stackResourceDrift.getTimestamp() != null) {
            prefix = _prefix + "Timestamp";
            java.util.Date timestamp = _stackResourceDrift.getTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(timestamp));
        }
    }

    private static StackResourceDriftStaxMarshaller instance;

    public static StackResourceDriftStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackResourceDriftStaxMarshaller();
        return instance;
    }
}
