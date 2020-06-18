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
 * StAX request marshaller for RebootDBInstanceRequest
 */
public class RebootDBInstanceRequestMarshaller implements
        Marshaller<Request<RebootDBInstanceRequest>, RebootDBInstanceRequest> {

    public Request<RebootDBInstanceRequest> marshall(RebootDBInstanceRequest rebootDBInstanceRequest) {
        if (rebootDBInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RebootDBInstanceRequest)");
        }

        Request<RebootDBInstanceRequest> request = new DefaultRequest<RebootDBInstanceRequest>(
                rebootDBInstanceRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "RebootDBInstance");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (rebootDBInstanceRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = rebootDBInstanceRequest.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (rebootDBInstanceRequest.getForceFailover() != null) {
            prefix = "ForceFailover";
            Boolean forceFailover = rebootDBInstanceRequest.getForceFailover();
            request.addParameter(prefix, StringUtils.fromBoolean(forceFailover));
        }

        return request;
    }
}
