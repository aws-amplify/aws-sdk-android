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
 * StAX request marshaller for CancelResizeRequest
 */
public class CancelResizeRequestMarshaller implements
        Marshaller<Request<CancelResizeRequest>, CancelResizeRequest> {

    public Request<CancelResizeRequest> marshall(CancelResizeRequest cancelResizeRequest) {
        if (cancelResizeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CancelResizeRequest)");
        }

        Request<CancelResizeRequest> request = new DefaultRequest<CancelResizeRequest>(
                cancelResizeRequest, "AmazonRedshift");
        request.addParameter("Action", "CancelResize");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (cancelResizeRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = cancelResizeRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }

        return request;
    }
}
