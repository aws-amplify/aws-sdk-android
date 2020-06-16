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
 * StAX request marshaller for ListPublicKeys2019_03_26Request
 */
public class ListPublicKeys2019_03_26RequestMarshaller implements
        Marshaller<Request<ListPublicKeys2019_03_26Request>, ListPublicKeys2019_03_26Request> {

    public Request<ListPublicKeys2019_03_26Request> marshall(
            ListPublicKeys2019_03_26Request listPublicKeys2019_03_26Request) {
        if (listPublicKeys2019_03_26Request == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListPublicKeys2019_03_26Request)");
        }

        Request<ListPublicKeys2019_03_26Request> request = new DefaultRequest<ListPublicKeys2019_03_26Request>(
                listPublicKeys2019_03_26Request, "AmazonCloudFront");
        request.addParameter("Action", "ListPublicKeys2019_03_26");
        request.addParameter("Version", "2019-03-26");

        String prefix;
        if (listPublicKeys2019_03_26Request.getMarker() != null) {
            prefix = "Marker";
            String marker = listPublicKeys2019_03_26Request.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (listPublicKeys2019_03_26Request.getMaxItems() != null) {
            prefix = "MaxItems";
            String maxItems = listPublicKeys2019_03_26Request.getMaxItems();
            request.addParameter(prefix, StringUtils.fromString(maxItems));
        }

        return request;
    }
}
