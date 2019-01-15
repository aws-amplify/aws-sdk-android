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
 * StAX marshaller for POJO Tag
 */
class TagStaxMarshaller {

    public void marshall(Tag _tag, Request<?> request, String _prefix) {
        String prefix;
        if (_tag.getResourceId() != null) {
            prefix = _prefix + "ResourceId";
            String resourceId = _tag.getResourceId();
            request.addParameter(prefix, StringUtils.fromString(resourceId));
        }
        if (_tag.getResourceType() != null) {
            prefix = _prefix + "ResourceType";
            String resourceType = _tag.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (_tag.getKey() != null) {
            prefix = _prefix + "Key";
            String key = _tag.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (_tag.getValue() != null) {
            prefix = _prefix + "Value";
            String value = _tag.getValue();
            request.addParameter(prefix, StringUtils.fromString(value));
        }
        if (_tag.getPropagateAtLaunch() != null) {
            prefix = _prefix + "PropagateAtLaunch";
            Boolean propagateAtLaunch = _tag.getPropagateAtLaunch();
            request.addParameter(prefix, StringUtils.fromBoolean(propagateAtLaunch));
        }
    }

    private static TagStaxMarshaller instance;

    public static TagStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TagStaxMarshaller();
        return instance;
    }
}
