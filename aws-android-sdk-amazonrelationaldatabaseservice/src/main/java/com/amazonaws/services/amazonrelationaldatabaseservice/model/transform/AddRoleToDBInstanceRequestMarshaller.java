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
 * StAX request marshaller for AddRoleToDBInstanceRequest
 */
public class AddRoleToDBInstanceRequestMarshaller implements
        Marshaller<Request<AddRoleToDBInstanceRequest>, AddRoleToDBInstanceRequest> {

    public Request<AddRoleToDBInstanceRequest> marshall(
            AddRoleToDBInstanceRequest addRoleToDBInstanceRequest) {
        if (addRoleToDBInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AddRoleToDBInstanceRequest)");
        }

        Request<AddRoleToDBInstanceRequest> request = new DefaultRequest<AddRoleToDBInstanceRequest>(
                addRoleToDBInstanceRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "AddRoleToDBInstance");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (addRoleToDBInstanceRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = addRoleToDBInstanceRequest.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (addRoleToDBInstanceRequest.getRoleArn() != null) {
            prefix = "RoleArn";
            String roleArn = addRoleToDBInstanceRequest.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (addRoleToDBInstanceRequest.getFeatureName() != null) {
            prefix = "FeatureName";
            String featureName = addRoleToDBInstanceRequest.getFeatureName();
            request.addParameter(prefix, StringUtils.fromString(featureName));
        }

        return request;
    }
}
