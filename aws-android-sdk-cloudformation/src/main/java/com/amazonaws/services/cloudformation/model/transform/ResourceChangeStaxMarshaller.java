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
 * StAX marshaller for POJO ResourceChange
 */
class ResourceChangeStaxMarshaller {

    public void marshall(ResourceChange _resourceChange, Request<?> request, String _prefix) {
        String prefix;
        if (_resourceChange.getAction() != null) {
            prefix = _prefix + "Action";
            String action = _resourceChange.getAction();
            request.addParameter(prefix, StringUtils.fromString(action));
        }
        if (_resourceChange.getLogicalResourceId() != null) {
            prefix = _prefix + "LogicalResourceId";
            String logicalResourceId = _resourceChange.getLogicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(logicalResourceId));
        }
        if (_resourceChange.getPhysicalResourceId() != null) {
            prefix = _prefix + "PhysicalResourceId";
            String physicalResourceId = _resourceChange.getPhysicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(physicalResourceId));
        }
        if (_resourceChange.getResourceType() != null) {
            prefix = _prefix + "ResourceType";
            String resourceType = _resourceChange.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (_resourceChange.getReplacement() != null) {
            prefix = _prefix + "Replacement";
            String replacement = _resourceChange.getReplacement();
            request.addParameter(prefix, StringUtils.fromString(replacement));
        }
        if (_resourceChange.getScope() != null) {
            prefix = _prefix + "Scope";
            java.util.List<String> scope = _resourceChange.getScope();
            int scopeIndex = 1;
            String scopePrefix = prefix;
            for (String scopeItem : scope) {
                prefix = scopePrefix + ".member." + scopeIndex;
                if (scopeItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(scopeItem));
                }
                scopeIndex++;
            }
            prefix = scopePrefix;
        }
        if (_resourceChange.getDetails() != null) {
            prefix = _prefix + "Details";
            java.util.List<ResourceChangeDetail> details = _resourceChange.getDetails();
            int detailsIndex = 1;
            String detailsPrefix = prefix;
            for (ResourceChangeDetail detailsItem : details) {
                prefix = detailsPrefix + ".member." + detailsIndex;
                if (detailsItem != null) {
                    ResourceChangeDetailStaxMarshaller.getInstance().marshall(detailsItem, request,
                            prefix + ".");
                }
                detailsIndex++;
            }
            prefix = detailsPrefix;
        }
    }

    private static ResourceChangeStaxMarshaller instance;

    public static ResourceChangeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceChangeStaxMarshaller();
        return instance;
    }
}
