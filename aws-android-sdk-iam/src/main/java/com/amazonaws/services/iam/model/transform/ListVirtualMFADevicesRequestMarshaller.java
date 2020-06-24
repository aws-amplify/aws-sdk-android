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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ListVirtualMFADevicesRequest
 */
public class ListVirtualMFADevicesRequestMarshaller implements
        Marshaller<Request<ListVirtualMFADevicesRequest>, ListVirtualMFADevicesRequest> {

    public Request<ListVirtualMFADevicesRequest> marshall(
            ListVirtualMFADevicesRequest listVirtualMFADevicesRequest) {
        if (listVirtualMFADevicesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListVirtualMFADevicesRequest)");
        }

        Request<ListVirtualMFADevicesRequest> request = new DefaultRequest<ListVirtualMFADevicesRequest>(
                listVirtualMFADevicesRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "ListVirtualMFADevices");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (listVirtualMFADevicesRequest.getAssignmentStatus() != null) {
            prefix = "AssignmentStatus";
            String assignmentStatus = listVirtualMFADevicesRequest.getAssignmentStatus();
            request.addParameter(prefix, StringUtils.fromString(assignmentStatus));
        }
        if (listVirtualMFADevicesRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = listVirtualMFADevicesRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (listVirtualMFADevicesRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = listVirtualMFADevicesRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }

        return request;
    }
}
