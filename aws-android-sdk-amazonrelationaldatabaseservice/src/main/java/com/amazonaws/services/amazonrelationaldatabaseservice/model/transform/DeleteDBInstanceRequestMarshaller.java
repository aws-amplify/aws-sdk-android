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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DeleteDBInstanceRequest
 */
public class DeleteDBInstanceRequestMarshaller implements
        Marshaller<Request<DeleteDBInstanceRequest>, DeleteDBInstanceRequest> {

    public Request<DeleteDBInstanceRequest> marshall(DeleteDBInstanceRequest deleteDBInstanceRequest) {
        if (deleteDBInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteDBInstanceRequest)");
        }

        Request<DeleteDBInstanceRequest> request = new DefaultRequest<DeleteDBInstanceRequest>(
                deleteDBInstanceRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DeleteDBInstance");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (deleteDBInstanceRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = deleteDBInstanceRequest.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (deleteDBInstanceRequest.getSkipFinalSnapshot() != null) {
            prefix = "SkipFinalSnapshot";
            Boolean skipFinalSnapshot = deleteDBInstanceRequest.getSkipFinalSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(skipFinalSnapshot));
        }
        if (deleteDBInstanceRequest.getFinalDBSnapshotIdentifier() != null) {
            prefix = "FinalDBSnapshotIdentifier";
            String finalDBSnapshotIdentifier = deleteDBInstanceRequest
                    .getFinalDBSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(finalDBSnapshotIdentifier));
        }
        if (deleteDBInstanceRequest.getDeleteAutomatedBackups() != null) {
            prefix = "DeleteAutomatedBackups";
            Boolean deleteAutomatedBackups = deleteDBInstanceRequest.getDeleteAutomatedBackups();
            request.addParameter(prefix, StringUtils.fromBoolean(deleteAutomatedBackups));
        }

        return request;
    }
}
