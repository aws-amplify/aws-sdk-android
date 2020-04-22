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
 * StAX request marshaller for ModifyClusterMaintenanceRequest
 */
public class ModifyClusterMaintenanceRequestMarshaller implements
        Marshaller<Request<ModifyClusterMaintenanceRequest>, ModifyClusterMaintenanceRequest> {

    public Request<ModifyClusterMaintenanceRequest> marshall(
            ModifyClusterMaintenanceRequest modifyClusterMaintenanceRequest) {
        if (modifyClusterMaintenanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyClusterMaintenanceRequest)");
        }

        Request<ModifyClusterMaintenanceRequest> request = new DefaultRequest<ModifyClusterMaintenanceRequest>(
                modifyClusterMaintenanceRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifyClusterMaintenance");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (modifyClusterMaintenanceRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = modifyClusterMaintenanceRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (modifyClusterMaintenanceRequest.getDeferMaintenance() != null) {
            prefix = "DeferMaintenance";
            Boolean deferMaintenance = modifyClusterMaintenanceRequest.getDeferMaintenance();
            request.addParameter(prefix, StringUtils.fromBoolean(deferMaintenance));
        }
        if (modifyClusterMaintenanceRequest.getDeferMaintenanceIdentifier() != null) {
            prefix = "DeferMaintenanceIdentifier";
            String deferMaintenanceIdentifier = modifyClusterMaintenanceRequest
                    .getDeferMaintenanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(deferMaintenanceIdentifier));
        }
        if (modifyClusterMaintenanceRequest.getDeferMaintenanceStartTime() != null) {
            prefix = "DeferMaintenanceStartTime";
            java.util.Date deferMaintenanceStartTime = modifyClusterMaintenanceRequest
                    .getDeferMaintenanceStartTime();
            request.addParameter(prefix, StringUtils.fromDate(deferMaintenanceStartTime));
        }
        if (modifyClusterMaintenanceRequest.getDeferMaintenanceEndTime() != null) {
            prefix = "DeferMaintenanceEndTime";
            java.util.Date deferMaintenanceEndTime = modifyClusterMaintenanceRequest
                    .getDeferMaintenanceEndTime();
            request.addParameter(prefix, StringUtils.fromDate(deferMaintenanceEndTime));
        }
        if (modifyClusterMaintenanceRequest.getDeferMaintenanceDuration() != null) {
            prefix = "DeferMaintenanceDuration";
            Integer deferMaintenanceDuration = modifyClusterMaintenanceRequest
                    .getDeferMaintenanceDuration();
            request.addParameter(prefix, StringUtils.fromInteger(deferMaintenanceDuration));
        }

        return request;
    }
}
