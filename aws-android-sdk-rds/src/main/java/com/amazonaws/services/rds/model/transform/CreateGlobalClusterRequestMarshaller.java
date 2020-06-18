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
 * StAX request marshaller for CreateGlobalClusterRequest
 */
public class CreateGlobalClusterRequestMarshaller implements
        Marshaller<Request<CreateGlobalClusterRequest>, CreateGlobalClusterRequest> {

    public Request<CreateGlobalClusterRequest> marshall(
            CreateGlobalClusterRequest createGlobalClusterRequest) {
        if (createGlobalClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateGlobalClusterRequest)");
        }

        Request<CreateGlobalClusterRequest> request = new DefaultRequest<CreateGlobalClusterRequest>(
                createGlobalClusterRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CreateGlobalCluster");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (createGlobalClusterRequest.getGlobalClusterIdentifier() != null) {
            prefix = "GlobalClusterIdentifier";
            String globalClusterIdentifier = createGlobalClusterRequest
                    .getGlobalClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(globalClusterIdentifier));
        }
        if (createGlobalClusterRequest.getSourceDBClusterIdentifier() != null) {
            prefix = "SourceDBClusterIdentifier";
            String sourceDBClusterIdentifier = createGlobalClusterRequest
                    .getSourceDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceDBClusterIdentifier));
        }
        if (createGlobalClusterRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = createGlobalClusterRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (createGlobalClusterRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = createGlobalClusterRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (createGlobalClusterRequest.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = createGlobalClusterRequest.getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (createGlobalClusterRequest.getDatabaseName() != null) {
            prefix = "DatabaseName";
            String databaseName = createGlobalClusterRequest.getDatabaseName();
            request.addParameter(prefix, StringUtils.fromString(databaseName));
        }
        if (createGlobalClusterRequest.getStorageEncrypted() != null) {
            prefix = "StorageEncrypted";
            Boolean storageEncrypted = createGlobalClusterRequest.getStorageEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(storageEncrypted));
        }

        return request;
    }
}
