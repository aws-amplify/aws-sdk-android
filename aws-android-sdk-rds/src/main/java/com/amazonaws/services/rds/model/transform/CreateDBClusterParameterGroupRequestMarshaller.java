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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateDBClusterParameterGroupRequest
 */
public class CreateDBClusterParameterGroupRequestMarshaller
        implements
        Marshaller<Request<CreateDBClusterParameterGroupRequest>, CreateDBClusterParameterGroupRequest> {

    public Request<CreateDBClusterParameterGroupRequest> marshall(
            CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest) {
        if (createDBClusterParameterGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDBClusterParameterGroupRequest)");
        }

        Request<CreateDBClusterParameterGroupRequest> request = new DefaultRequest<CreateDBClusterParameterGroupRequest>(
                createDBClusterParameterGroupRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CreateDBClusterParameterGroup");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (createDBClusterParameterGroupRequest.getDBClusterParameterGroupName() != null) {
            prefix = "DBClusterParameterGroupName";
            String dBClusterParameterGroupName = createDBClusterParameterGroupRequest
                    .getDBClusterParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBClusterParameterGroupName));
        }
        if (createDBClusterParameterGroupRequest.getDBParameterGroupFamily() != null) {
            prefix = "DBParameterGroupFamily";
            String dBParameterGroupFamily = createDBClusterParameterGroupRequest
                    .getDBParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupFamily));
        }
        if (createDBClusterParameterGroupRequest.getDescription() != null) {
            prefix = "Description";
            String description = createDBClusterParameterGroupRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createDBClusterParameterGroupRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createDBClusterParameterGroupRequest.getTags();
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
