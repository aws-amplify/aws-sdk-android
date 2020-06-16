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
 * StAX request marshaller for ListTagsForResource2019_03_26Request
 */
public class ListTagsForResource2019_03_26RequestMarshaller
        implements
        Marshaller<Request<ListTagsForResource2019_03_26Request>, ListTagsForResource2019_03_26Request> {

    public Request<ListTagsForResource2019_03_26Request> marshall(
            ListTagsForResource2019_03_26Request listTagsForResource2019_03_26Request) {
        if (listTagsForResource2019_03_26Request == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListTagsForResource2019_03_26Request)");
        }

        Request<ListTagsForResource2019_03_26Request> request = new DefaultRequest<ListTagsForResource2019_03_26Request>(
                listTagsForResource2019_03_26Request, "AmazonCloudFront");
        request.addParameter("Action", "ListTagsForResource2019_03_26");
        request.addParameter("Version", "2019-03-26");

        String prefix;
        if (listTagsForResource2019_03_26Request.getResource() != null) {
            prefix = "Resource";
            String resource = listTagsForResource2019_03_26Request.getResource();
            request.addParameter(prefix, StringUtils.fromString(resource));
        }

        return request;
    }
}
