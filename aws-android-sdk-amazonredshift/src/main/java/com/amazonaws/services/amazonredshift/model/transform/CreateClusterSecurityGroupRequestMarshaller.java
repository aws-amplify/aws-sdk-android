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
 * StAX request marshaller for CreateClusterSecurityGroupRequest
 */
public class CreateClusterSecurityGroupRequestMarshaller implements
        Marshaller<Request<CreateClusterSecurityGroupRequest>, CreateClusterSecurityGroupRequest> {

    public Request<CreateClusterSecurityGroupRequest> marshall(
            CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest) {
        if (createClusterSecurityGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateClusterSecurityGroupRequest)");
        }

        Request<CreateClusterSecurityGroupRequest> request = new DefaultRequest<CreateClusterSecurityGroupRequest>(
                createClusterSecurityGroupRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateClusterSecurityGroup");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (createClusterSecurityGroupRequest.getClusterSecurityGroupName() != null) {
            prefix = "ClusterSecurityGroupName";
            String clusterSecurityGroupName = createClusterSecurityGroupRequest
                    .getClusterSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterSecurityGroupName));
        }
        if (createClusterSecurityGroupRequest.getDescription() != null) {
            prefix = "Description";
            String description = createClusterSecurityGroupRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createClusterSecurityGroupRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createClusterSecurityGroupRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
