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
 * StAX request marshaller for ListStreamingDistributions2019_03_26Request
 */
public class ListStreamingDistributions2019_03_26RequestMarshaller
        implements
        Marshaller<Request<ListStreamingDistributions2019_03_26Request>, ListStreamingDistributions2019_03_26Request> {

    public Request<ListStreamingDistributions2019_03_26Request> marshall(
            ListStreamingDistributions2019_03_26Request listStreamingDistributions2019_03_26Request) {
        if (listStreamingDistributions2019_03_26Request == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListStreamingDistributions2019_03_26Request)");
        }

        Request<ListStreamingDistributions2019_03_26Request> request = new DefaultRequest<ListStreamingDistributions2019_03_26Request>(
                listStreamingDistributions2019_03_26Request, "AmazonCloudFront");
        request.addParameter("Action", "ListStreamingDistributions2019_03_26");
        request.addParameter("Version", "2019-03-26");

        String prefix;
        if (listStreamingDistributions2019_03_26Request.getMarker() != null) {
            prefix = "Marker";
            String marker = listStreamingDistributions2019_03_26Request.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (listStreamingDistributions2019_03_26Request.getMaxItems() != null) {
            prefix = "MaxItems";
            String maxItems = listStreamingDistributions2019_03_26Request.getMaxItems();
            request.addParameter(prefix, StringUtils.fromString(maxItems));
        }

        return request;
    }
}
