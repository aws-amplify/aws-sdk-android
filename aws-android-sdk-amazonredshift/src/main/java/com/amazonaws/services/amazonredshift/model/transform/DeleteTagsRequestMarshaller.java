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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DeleteTagsRequest
 */
public class DeleteTagsRequestMarshaller implements
        Marshaller<Request<DeleteTagsRequest>, DeleteTagsRequest> {

    public Request<DeleteTagsRequest> marshall(DeleteTagsRequest deleteTagsRequest) {
        if (deleteTagsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteTagsRequest)");
        }

        Request<DeleteTagsRequest> request = new DefaultRequest<DeleteTagsRequest>(
                deleteTagsRequest, "AmazonRedshift");
        request.addParameter("Action", "DeleteTags");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (deleteTagsRequest.getResourceName() != null) {
            prefix = "ResourceName";
            String resourceName = deleteTagsRequest.getResourceName();
            request.addParameter(prefix, StringUtils.fromString(resourceName));
        }
        if (deleteTagsRequest.getTagKeys() != null) {
            prefix = "TagKeys";
            java.util.List<String> tagKeys = deleteTagsRequest.getTagKeys();
            int tagKeysIndex = 1;
            String tagKeysPrefix = prefix;
            for (String tagKeysItem : tagKeys) {
                prefix = tagKeysPrefix + "." + tagKeysIndex;
                if (tagKeysItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(tagKeysItem));
                }
                tagKeysIndex++;
            }
            prefix = tagKeysPrefix;
        }

        return request;
    }
}
