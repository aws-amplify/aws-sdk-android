/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateOrUpdateTagsRequest
 */
public class CreateOrUpdateTagsRequestMarshaller implements
        Marshaller<Request<CreateOrUpdateTagsRequest>, CreateOrUpdateTagsRequest> {

    public Request<CreateOrUpdateTagsRequest> marshall(
            CreateOrUpdateTagsRequest createOrUpdateTagsRequest) {
        if (createOrUpdateTagsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateOrUpdateTagsRequest)");
        }

        Request<CreateOrUpdateTagsRequest> request = new DefaultRequest<CreateOrUpdateTagsRequest>(
                createOrUpdateTagsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "CreateOrUpdateTags");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (createOrUpdateTagsRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createOrUpdateTagsRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
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
