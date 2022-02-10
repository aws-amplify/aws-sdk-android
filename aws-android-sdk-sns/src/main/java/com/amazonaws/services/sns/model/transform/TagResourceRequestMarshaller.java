/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for TagResourceRequest
 */
public class TagResourceRequestMarshaller implements
        Marshaller<Request<TagResourceRequest>, TagResourceRequest> {

    public Request<TagResourceRequest> marshall(TagResourceRequest tagResourceRequest) {
        if (tagResourceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(TagResourceRequest)");
        }

        Request<TagResourceRequest> request = new DefaultRequest<TagResourceRequest>(
                tagResourceRequest, "AmazonSNS");
        request.addParameter("Action", "TagResource");
        request.addParameter("Version", "2010-03-31");

        String prefix;
        if (tagResourceRequest.getResourceArn() != null) {
            prefix = "ResourceArn";
            String resourceArn = tagResourceRequest.getResourceArn();
            request.addParameter(prefix, StringUtils.fromString(resourceArn));
        }
        if (tagResourceRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = tagResourceRequest.getTags();
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
