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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for UpdateTagsForResourceRequest
 */
public class UpdateTagsForResourceRequestMarshaller implements
        Marshaller<Request<UpdateTagsForResourceRequest>, UpdateTagsForResourceRequest> {

    public Request<UpdateTagsForResourceRequest> marshall(
            UpdateTagsForResourceRequest updateTagsForResourceRequest) {
        if (updateTagsForResourceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateTagsForResourceRequest)");
        }

        Request<UpdateTagsForResourceRequest> request = new DefaultRequest<UpdateTagsForResourceRequest>(
                updateTagsForResourceRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "UpdateTagsForResource");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (updateTagsForResourceRequest.getResourceArn() != null) {
            prefix = "ResourceArn";
            String resourceArn = updateTagsForResourceRequest.getResourceArn();
            request.addParameter(prefix, StringUtils.fromString(resourceArn));
        }
        if (updateTagsForResourceRequest.getTagsToAdd() != null) {
            prefix = "TagsToAdd";
            java.util.List<Tag> tagsToAdd = updateTagsForResourceRequest.getTagsToAdd();
            int tagsToAddIndex = 1;
            String tagsToAddPrefix = prefix;
            for (Tag tagsToAddItem : tagsToAdd) {
                prefix = tagsToAddPrefix + ".member." + tagsToAddIndex;
                if (tagsToAddItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsToAddItem, request, prefix + ".");
                }
                tagsToAddIndex++;
            }
            prefix = tagsToAddPrefix;
        }
        if (updateTagsForResourceRequest.getTagsToRemove() != null) {
            prefix = "TagsToRemove";
            java.util.List<String> tagsToRemove = updateTagsForResourceRequest.getTagsToRemove();
            int tagsToRemoveIndex = 1;
            String tagsToRemovePrefix = prefix;
            for (String tagsToRemoveItem : tagsToRemove) {
                prefix = tagsToRemovePrefix + ".member." + tagsToRemoveIndex;
                if (tagsToRemoveItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(tagsToRemoveItem));
                }
                tagsToRemoveIndex++;
            }
            prefix = tagsToRemovePrefix;
        }

        return request;
    }
}
