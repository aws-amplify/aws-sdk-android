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
 * StAX marshaller for POJO ResourceIdentifierSummary
 */
class ResourceIdentifierSummaryStaxMarshaller {

    public void marshall(ResourceIdentifierSummary _resourceIdentifierSummary, Request<?> request,
            String _prefix) {
        String prefix;
        if (_resourceIdentifierSummary.getResourceType() != null) {
            prefix = _prefix + "ResourceType";
            String resourceType = _resourceIdentifierSummary.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (_resourceIdentifierSummary.getLogicalResourceIds() != null) {
            prefix = _prefix + "LogicalResourceIds";
            java.util.List<String> logicalResourceIds = _resourceIdentifierSummary
                    .getLogicalResourceIds();
            int logicalResourceIdsIndex = 1;
            String logicalResourceIdsPrefix = prefix;
            for (String logicalResourceIdsItem : logicalResourceIds) {
                prefix = logicalResourceIdsPrefix + ".member." + logicalResourceIdsIndex;
                if (logicalResourceIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(logicalResourceIdsItem));
                }
                logicalResourceIdsIndex++;
            }
            prefix = logicalResourceIdsPrefix;
        }
        if (_resourceIdentifierSummary.getResourceIdentifiers() != null) {
            prefix = _prefix + "ResourceIdentifiers";
            java.util.List<String> resourceIdentifiers = _resourceIdentifierSummary
                    .getResourceIdentifiers();
            int resourceIdentifiersIndex = 1;
            String resourceIdentifiersPrefix = prefix;
            for (String resourceIdentifiersItem : resourceIdentifiers) {
                prefix = resourceIdentifiersPrefix + ".member." + resourceIdentifiersIndex;
                if (resourceIdentifiersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(resourceIdentifiersItem));
                }
                resourceIdentifiersIndex++;
            }
            prefix = resourceIdentifiersPrefix;
        }
    }

    private static ResourceIdentifierSummaryStaxMarshaller instance;

    public static ResourceIdentifierSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceIdentifierSummaryStaxMarshaller();
        return instance;
    }
}
