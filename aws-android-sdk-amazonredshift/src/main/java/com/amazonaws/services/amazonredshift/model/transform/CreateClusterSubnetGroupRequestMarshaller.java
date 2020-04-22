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
 * StAX request marshaller for CreateClusterSubnetGroupRequest
 */
public class CreateClusterSubnetGroupRequestMarshaller implements
        Marshaller<Request<CreateClusterSubnetGroupRequest>, CreateClusterSubnetGroupRequest> {

    public Request<CreateClusterSubnetGroupRequest> marshall(
            CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest) {
        if (createClusterSubnetGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateClusterSubnetGroupRequest)");
        }

        Request<CreateClusterSubnetGroupRequest> request = new DefaultRequest<CreateClusterSubnetGroupRequest>(
                createClusterSubnetGroupRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateClusterSubnetGroup");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (createClusterSubnetGroupRequest.getClusterSubnetGroupName() != null) {
            prefix = "ClusterSubnetGroupName";
            String clusterSubnetGroupName = createClusterSubnetGroupRequest
                    .getClusterSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterSubnetGroupName));
        }
        if (createClusterSubnetGroupRequest.getDescription() != null) {
            prefix = "Description";
            String description = createClusterSubnetGroupRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createClusterSubnetGroupRequest.getSubnetIds() != null) {
            prefix = "SubnetIds";
            java.util.List<String> subnetIds = createClusterSubnetGroupRequest.getSubnetIds();
            int subnetIdsIndex = 1;
            String subnetIdsPrefix = prefix;
            for (String subnetIdsItem : subnetIds) {
                prefix = subnetIdsPrefix + "." + subnetIdsIndex;
                if (subnetIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(subnetIdsItem));
                }
                subnetIdsIndex++;
            }
            prefix = subnetIdsPrefix;
        }
        if (createClusterSubnetGroupRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createClusterSubnetGroupRequest.getTags();
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
