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

package com.amazonaws.services.cloudfront.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for TagResource2019_03_26Request
 */
public class TagResource2019_03_26RequestMarshaller implements
        Marshaller<Request<TagResource2019_03_26Request>, TagResource2019_03_26Request> {

    public Request<TagResource2019_03_26Request> marshall(
            TagResource2019_03_26Request tagResource2019_03_26Request) {
        if (tagResource2019_03_26Request == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(TagResource2019_03_26Request)");
        }

        Request<TagResource2019_03_26Request> request = new DefaultRequest<TagResource2019_03_26Request>(
                tagResource2019_03_26Request, "AmazonCloudFront");
        request.addParameter("Action", "TagResource2019_03_26");
        request.addParameter("Version", "2019-03-26");

        String prefix;
        if (tagResource2019_03_26Request.getResource() != null) {
            prefix = "Resource";
            String resource = tagResource2019_03_26Request.getResource();
            request.addParameter(prefix, StringUtils.fromString(resource));
        }
        if (tagResource2019_03_26Request.getTags() != null) {
            prefix = "Tags";
            Tags tags = tagResource2019_03_26Request.getTags();
            TagsStaxMarshaller.getInstance().marshall(tags, request, prefix + ".");
        }

        return request;
    }
}
