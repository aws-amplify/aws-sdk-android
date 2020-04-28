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

package com.amazonaws.services.amazonroute53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ResourceTagSet
 */
class ResourceTagSetStaxMarshaller {

    public void marshall(ResourceTagSet _resourceTagSet, Request<?> request, String _prefix) {
        String prefix;
        if (_resourceTagSet.getResourceType() != null) {
            prefix = _prefix + "ResourceType";
            String resourceType = _resourceTagSet.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (_resourceTagSet.getResourceId() != null) {
            prefix = _prefix + "ResourceId";
            String resourceId = _resourceTagSet.getResourceId();
            request.addParameter(prefix, StringUtils.fromString(resourceId));
        }
        if (_resourceTagSet.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _resourceTagSet.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }
    }

    private static ResourceTagSetStaxMarshaller instance;

    public static ResourceTagSetStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceTagSetStaxMarshaller();
        return instance;
    }
}
