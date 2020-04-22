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
 * StAX request marshaller for GetClusterCredentialsRequest
 */
public class GetClusterCredentialsRequestMarshaller implements
        Marshaller<Request<GetClusterCredentialsRequest>, GetClusterCredentialsRequest> {

    public Request<GetClusterCredentialsRequest> marshall(
            GetClusterCredentialsRequest getClusterCredentialsRequest) {
        if (getClusterCredentialsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetClusterCredentialsRequest)");
        }

        Request<GetClusterCredentialsRequest> request = new DefaultRequest<GetClusterCredentialsRequest>(
                getClusterCredentialsRequest, "AmazonRedshift");
        request.addParameter("Action", "GetClusterCredentials");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (getClusterCredentialsRequest.getDbUser() != null) {
            prefix = "DbUser";
            String dbUser = getClusterCredentialsRequest.getDbUser();
            request.addParameter(prefix, StringUtils.fromString(dbUser));
        }
        if (getClusterCredentialsRequest.getDbName() != null) {
            prefix = "DbName";
            String dbName = getClusterCredentialsRequest.getDbName();
            request.addParameter(prefix, StringUtils.fromString(dbName));
        }
        if (getClusterCredentialsRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = getClusterCredentialsRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (getClusterCredentialsRequest.getDurationSeconds() != null) {
            prefix = "DurationSeconds";
            Integer durationSeconds = getClusterCredentialsRequest.getDurationSeconds();
            request.addParameter(prefix, StringUtils.fromInteger(durationSeconds));
        }
        if (getClusterCredentialsRequest.getAutoCreate() != null) {
            prefix = "AutoCreate";
            Boolean autoCreate = getClusterCredentialsRequest.getAutoCreate();
            request.addParameter(prefix, StringUtils.fromBoolean(autoCreate));
        }
        if (getClusterCredentialsRequest.getDbGroups() != null) {
            prefix = "DbGroups";
            java.util.List<String> dbGroups = getClusterCredentialsRequest.getDbGroups();
            int dbGroupsIndex = 1;
            String dbGroupsPrefix = prefix;
            for (String dbGroupsItem : dbGroups) {
                prefix = dbGroupsPrefix + "." + dbGroupsIndex;
                if (dbGroupsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(dbGroupsItem));
                }
                dbGroupsIndex++;
            }
            prefix = dbGroupsPrefix;
        }

        return request;
    }
}
