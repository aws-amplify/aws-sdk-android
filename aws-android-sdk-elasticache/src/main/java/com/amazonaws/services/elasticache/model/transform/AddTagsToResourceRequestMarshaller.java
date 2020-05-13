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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for AddTagsToResourceRequest
 */
public class AddTagsToResourceRequestMarshaller implements
        Marshaller<Request<AddTagsToResourceRequest>, AddTagsToResourceRequest> {

    public Request<AddTagsToResourceRequest> marshall(
            AddTagsToResourceRequest addTagsToResourceRequest) {
        if (addTagsToResourceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AddTagsToResourceRequest)");
        }

        Request<AddTagsToResourceRequest> request = new DefaultRequest<AddTagsToResourceRequest>(
                addTagsToResourceRequest, "AmazonElastiCache");
        request.addParameter("Action", "AddTagsToResource");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (addTagsToResourceRequest.getResourceName() != null) {
            prefix = "ResourceName";
            String resourceName = addTagsToResourceRequest.getResourceName();
            request.addParameter(prefix, StringUtils.fromString(resourceName));
        }
        if (addTagsToResourceRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = addTagsToResourceRequest.getTags();
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

        return request;
    }
}
