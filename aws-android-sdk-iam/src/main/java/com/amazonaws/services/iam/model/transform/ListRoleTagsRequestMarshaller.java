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
 * StAX request marshaller for ListRoleTagsRequest
 */
public class ListRoleTagsRequestMarshaller implements
        Marshaller<Request<ListRoleTagsRequest>, ListRoleTagsRequest> {

    public Request<ListRoleTagsRequest> marshall(ListRoleTagsRequest listRoleTagsRequest) {
        if (listRoleTagsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListRoleTagsRequest)");
        }

        Request<ListRoleTagsRequest> request = new DefaultRequest<ListRoleTagsRequest>(
                listRoleTagsRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "ListRoleTags");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (listRoleTagsRequest.getRoleName() != null) {
            prefix = "RoleName";
            String roleName = listRoleTagsRequest.getRoleName();
            request.addParameter(prefix, StringUtils.fromString(roleName));
        }
        if (listRoleTagsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = listRoleTagsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (listRoleTagsRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = listRoleTagsRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }

        return request;
    }
}
