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
 * StAX marshaller for POJO ResourceToImport
 */
class ResourceToImportStaxMarshaller {

    public void marshall(ResourceToImport _resourceToImport, Request<?> request, String _prefix) {
        String prefix;
        if (_resourceToImport.getResourceType() != null) {
            prefix = _prefix + "ResourceType";
            String resourceType = _resourceToImport.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (_resourceToImport.getLogicalResourceId() != null) {
            prefix = _prefix + "LogicalResourceId";
            String logicalResourceId = _resourceToImport.getLogicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(logicalResourceId));
        }
        if (_resourceToImport.getResourceIdentifier() != null) {
            prefix = _prefix + "ResourceIdentifier";
            java.util.Map<String, String> resourceIdentifier = _resourceToImport
                    .getResourceIdentifier();
            int resourceIdentifierIndex = 1;
            String resourceIdentifierPrefix = prefix + ".entry.";
            for (java.util.Map.Entry<String, String> resourceIdentifierEntry : resourceIdentifier
                    .entrySet()) {
                prefix = resourceIdentifierPrefix + resourceIdentifierIndex;
                if (resourceIdentifierEntry.getKey() != null) {
                    request.addParameter(prefix + ".key",
                            StringUtils.fromString(resourceIdentifierEntry.getKey()));
                }
                prefix += ".value";
                if (resourceIdentifierEntry.getValue() != null) {
                    String resourceIdentifierValue = resourceIdentifierEntry.getValue();
                    request.addParameter(prefix, StringUtils.fromString(resourceIdentifierValue));
                }
                resourceIdentifierIndex++;
            }
            prefix = resourceIdentifierPrefix;
        }
    }

    private static ResourceToImportStaxMarshaller instance;

    public static ResourceToImportStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceToImportStaxMarshaller();
        return instance;
    }
}
