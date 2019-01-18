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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for RemoveTagsRequest
 */
public class RemoveTagsRequestMarshaller implements
        Marshaller<Request<RemoveTagsRequest>, RemoveTagsRequest> {

    public Request<RemoveTagsRequest> marshall(RemoveTagsRequest removeTagsRequest) {
        if (removeTagsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RemoveTagsRequest)");
        }

        Request<RemoveTagsRequest> request = new DefaultRequest<RemoveTagsRequest>(
                removeTagsRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "RemoveTags");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (removeTagsRequest.getLoadBalancerNames() != null) {
            prefix = "LoadBalancerNames";
            java.util.List<String> loadBalancerNames = removeTagsRequest.getLoadBalancerNames();
            int loadBalancerNamesIndex = 1;
            String loadBalancerNamesPrefix = prefix;
            for (String loadBalancerNamesItem : loadBalancerNames) {
                prefix = loadBalancerNamesPrefix + ".member." + loadBalancerNamesIndex;
                if (loadBalancerNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(loadBalancerNamesItem));
                }
                loadBalancerNamesIndex++;
            }
            prefix = loadBalancerNamesPrefix;
        }
        if (removeTagsRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<TagKeyOnly> tags = removeTagsRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (TagKeyOnly tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
                if (tagsItem != null) {
                    TagKeyOnlyStaxMarshaller.getInstance()
                            .marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
