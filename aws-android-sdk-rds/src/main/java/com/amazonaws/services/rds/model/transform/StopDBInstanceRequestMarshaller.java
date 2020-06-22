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
 * StAX request marshaller for StopDBInstanceRequest
 */
public class StopDBInstanceRequestMarshaller implements
        Marshaller<Request<StopDBInstanceRequest>, StopDBInstanceRequest> {

    public Request<StopDBInstanceRequest> marshall(StopDBInstanceRequest stopDBInstanceRequest) {
        if (stopDBInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StopDBInstanceRequest)");
        }

        Request<StopDBInstanceRequest> request = new DefaultRequest<StopDBInstanceRequest>(
                stopDBInstanceRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "StopDBInstance");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (stopDBInstanceRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = stopDBInstanceRequest.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (stopDBInstanceRequest.getDBSnapshotIdentifier() != null) {
            prefix = "DBSnapshotIdentifier";
            String dBSnapshotIdentifier = stopDBInstanceRequest.getDBSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBSnapshotIdentifier));
        }

        return request;
    }
}
