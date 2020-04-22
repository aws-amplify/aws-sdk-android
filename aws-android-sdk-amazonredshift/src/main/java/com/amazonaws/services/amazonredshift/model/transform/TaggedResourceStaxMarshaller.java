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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO TaggedResource
 */
class TaggedResourceStaxMarshaller {

    public void marshall(TaggedResource _taggedResource, Request<?> request, String _prefix) {
        String prefix;
        if (_taggedResource.getTag() != null) {
            prefix = _prefix + "Tag";
            Tag tag = _taggedResource.getTag();
            TagStaxMarshaller.getInstance().marshall(tag, request, prefix + ".");
        }
        if (_taggedResource.getResourceName() != null) {
            prefix = _prefix + "ResourceName";
            String resourceName = _taggedResource.getResourceName();
            request.addParameter(prefix, StringUtils.fromString(resourceName));
        }
        if (_taggedResource.getResourceType() != null) {
            prefix = _prefix + "ResourceType";
            String resourceType = _taggedResource.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
    }

    private static TaggedResourceStaxMarshaller instance;

    public static TaggedResourceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TaggedResourceStaxMarshaller();
        return instance;
    }
}
