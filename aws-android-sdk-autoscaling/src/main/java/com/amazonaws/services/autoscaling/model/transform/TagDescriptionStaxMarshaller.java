/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO TagDescription
 */
class TagDescriptionStaxMarshaller {

    public void marshall(TagDescription _tagDescription, Request<?> request, String _prefix) {
        String prefix;
        if (_tagDescription.getResourceId() != null) {
            prefix = _prefix + "ResourceId";
            String resourceId = _tagDescription.getResourceId();
            request.addParameter(prefix, StringUtils.fromString(resourceId));
        }
        if (_tagDescription.getResourceType() != null) {
            prefix = _prefix + "ResourceType";
            String resourceType = _tagDescription.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (_tagDescription.getKey() != null) {
            prefix = _prefix + "Key";
            String key = _tagDescription.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (_tagDescription.getValue() != null) {
            prefix = _prefix + "Value";
            String value = _tagDescription.getValue();
            request.addParameter(prefix, StringUtils.fromString(value));
        }
        if (_tagDescription.getPropagateAtLaunch() != null) {
            prefix = _prefix + "PropagateAtLaunch";
            Boolean propagateAtLaunch = _tagDescription.getPropagateAtLaunch();
            request.addParameter(prefix, StringUtils.fromBoolean(propagateAtLaunch));
        }
    }

    private static TagDescriptionStaxMarshaller instance;

    public static TagDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TagDescriptionStaxMarshaller();
        return instance;
    }
}
