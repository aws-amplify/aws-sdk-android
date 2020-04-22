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
 * StAX request marshaller for DescribeClusterTracksRequest
 */
public class DescribeClusterTracksRequestMarshaller implements
        Marshaller<Request<DescribeClusterTracksRequest>, DescribeClusterTracksRequest> {

    public Request<DescribeClusterTracksRequest> marshall(
            DescribeClusterTracksRequest describeClusterTracksRequest) {
        if (describeClusterTracksRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeClusterTracksRequest)");
        }

        Request<DescribeClusterTracksRequest> request = new DefaultRequest<DescribeClusterTracksRequest>(
                describeClusterTracksRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeClusterTracks");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeClusterTracksRequest.getMaintenanceTrackName() != null) {
            prefix = "MaintenanceTrackName";
            String maintenanceTrackName = describeClusterTracksRequest.getMaintenanceTrackName();
            request.addParameter(prefix, StringUtils.fromString(maintenanceTrackName));
        }
        if (describeClusterTracksRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeClusterTracksRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeClusterTracksRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeClusterTracksRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
