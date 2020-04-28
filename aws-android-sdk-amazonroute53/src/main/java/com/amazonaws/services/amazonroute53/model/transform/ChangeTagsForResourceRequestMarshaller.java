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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ChangeTagsForResourceRequest
 */
public class ChangeTagsForResourceRequestMarshaller implements
        Marshaller<Request<ChangeTagsForResourceRequest>, ChangeTagsForResourceRequest> {

    public Request<ChangeTagsForResourceRequest> marshall(
            ChangeTagsForResourceRequest changeTagsForResourceRequest) {
        if (changeTagsForResourceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ChangeTagsForResourceRequest)");
        }

        Request<ChangeTagsForResourceRequest> request = new DefaultRequest<ChangeTagsForResourceRequest>(
                changeTagsForResourceRequest, "AmazonRoute53");
        request.addParameter("Action", "ChangeTagsForResource");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (changeTagsForResourceRequest.getResourceType() != null) {
            prefix = "ResourceType";
            String resourceType = changeTagsForResourceRequest.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (changeTagsForResourceRequest.getResourceId() != null) {
            prefix = "ResourceId";
            String resourceId = changeTagsForResourceRequest.getResourceId();
            request.addParameter(prefix, StringUtils.fromString(resourceId));
        }
        if (changeTagsForResourceRequest.getAddTags() != null) {
            prefix = "AddTags";
            java.util.List<Tag> addTags = changeTagsForResourceRequest.getAddTags();
            int addTagsIndex = 1;
            String addTagsPrefix = prefix;
            for (Tag addTagsItem : addTags) {
                prefix = addTagsPrefix + "." + addTagsIndex;
                if (addTagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(addTagsItem, request, prefix + ".");
                }
                addTagsIndex++;
            }
            prefix = addTagsPrefix;
        }
        if (changeTagsForResourceRequest.getRemoveTagKeys() != null) {
            prefix = "RemoveTagKeys";
            java.util.List<String> removeTagKeys = changeTagsForResourceRequest.getRemoveTagKeys();
            int removeTagKeysIndex = 1;
            String removeTagKeysPrefix = prefix;
            for (String removeTagKeysItem : removeTagKeys) {
                prefix = removeTagKeysPrefix + "." + removeTagKeysIndex;
                if (removeTagKeysItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(removeTagKeysItem));
                }
                removeTagKeysIndex++;
            }
            prefix = removeTagKeysPrefix;
        }

        return request;
    }
}
