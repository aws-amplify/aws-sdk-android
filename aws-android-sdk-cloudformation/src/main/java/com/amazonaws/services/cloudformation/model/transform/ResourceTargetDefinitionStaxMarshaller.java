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
 * StAX marshaller for POJO ResourceTargetDefinition
 */
class ResourceTargetDefinitionStaxMarshaller {

    public void marshall(ResourceTargetDefinition _resourceTargetDefinition, Request<?> request,
            String _prefix) {
        String prefix;
        if (_resourceTargetDefinition.getAttribute() != null) {
            prefix = _prefix + "Attribute";
            String attribute = _resourceTargetDefinition.getAttribute();
            request.addParameter(prefix, StringUtils.fromString(attribute));
        }
        if (_resourceTargetDefinition.getName() != null) {
            prefix = _prefix + "Name";
            String name = _resourceTargetDefinition.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_resourceTargetDefinition.getRequiresRecreation() != null) {
            prefix = _prefix + "RequiresRecreation";
            String requiresRecreation = _resourceTargetDefinition.getRequiresRecreation();
            request.addParameter(prefix, StringUtils.fromString(requiresRecreation));
        }
    }

    private static ResourceTargetDefinitionStaxMarshaller instance;

    public static ResourceTargetDefinitionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceTargetDefinitionStaxMarshaller();
        return instance;
    }
}
