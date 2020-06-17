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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ListTagsForResourcesRequest
 */
public class ListTagsForResourcesRequestMarshaller implements
        Marshaller<Request<ListTagsForResourcesRequest>, ListTagsForResourcesRequest> {

    public Request<ListTagsForResourcesRequest> marshall(
            ListTagsForResourcesRequest listTagsForResourcesRequest) {
        if (listTagsForResourcesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListTagsForResourcesRequest)");
        }

        Request<ListTagsForResourcesRequest> request = new DefaultRequest<ListTagsForResourcesRequest>(
                listTagsForResourcesRequest, "AmazonRoute53");
        request.addParameter("Action", "ListTagsForResources");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (listTagsForResourcesRequest.getResourceType() != null) {
            prefix = "ResourceType";
            String resourceType = listTagsForResourcesRequest.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (listTagsForResourcesRequest.getResourceIds() != null) {
            prefix = "ResourceIds";
            java.util.List<String> resourceIds = listTagsForResourcesRequest.getResourceIds();
            int resourceIdsIndex = 1;
            String resourceIdsPrefix = prefix;
            for (String resourceIdsItem : resourceIds) {
                prefix = resourceIdsPrefix + "." + resourceIdsIndex;
                if (resourceIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(resourceIdsItem));
                }
                resourceIdsIndex++;
            }
            prefix = resourceIdsPrefix;
        }

        return request;
    }
}
