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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for StartMigrationRequest
 */
public class StartMigrationRequestMarshaller implements
        Marshaller<Request<StartMigrationRequest>, StartMigrationRequest> {

    public Request<StartMigrationRequest> marshall(StartMigrationRequest startMigrationRequest) {
        if (startMigrationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartMigrationRequest)");
        }

        Request<StartMigrationRequest> request = new DefaultRequest<StartMigrationRequest>(
                startMigrationRequest, "AmazonElastiCache");
        request.addParameter("Action", "StartMigration");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (startMigrationRequest.getReplicationGroupId() != null) {
            prefix = "ReplicationGroupId";
            String replicationGroupId = startMigrationRequest.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (startMigrationRequest.getCustomerNodeEndpointList() != null) {
            prefix = "CustomerNodeEndpointList";
            java.util.List<CustomerNodeEndpoint> customerNodeEndpointList = startMigrationRequest
                    .getCustomerNodeEndpointList();
            int customerNodeEndpointListIndex = 1;
            String customerNodeEndpointListPrefix = prefix;
            for (CustomerNodeEndpoint customerNodeEndpointListItem : customerNodeEndpointList) {
                prefix = customerNodeEndpointListPrefix + ".member."
                        + customerNodeEndpointListIndex;
                if (customerNodeEndpointListItem != null) {
                    CustomerNodeEndpointStaxMarshaller.getInstance().marshall(
                            customerNodeEndpointListItem, request, prefix + ".");
                }
                customerNodeEndpointListIndex++;
            }
            prefix = customerNodeEndpointListPrefix;
        }

        return request;
    }
}
