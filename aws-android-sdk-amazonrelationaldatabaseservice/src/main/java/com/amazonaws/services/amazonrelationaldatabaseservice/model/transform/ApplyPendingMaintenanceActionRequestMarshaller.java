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
 * StAX request marshaller for ApplyPendingMaintenanceActionRequest
 */
public class ApplyPendingMaintenanceActionRequestMarshaller
        implements
        Marshaller<Request<ApplyPendingMaintenanceActionRequest>, ApplyPendingMaintenanceActionRequest> {

    public Request<ApplyPendingMaintenanceActionRequest> marshall(
            ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest) {
        if (applyPendingMaintenanceActionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ApplyPendingMaintenanceActionRequest)");
        }

        Request<ApplyPendingMaintenanceActionRequest> request = new DefaultRequest<ApplyPendingMaintenanceActionRequest>(
                applyPendingMaintenanceActionRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ApplyPendingMaintenanceAction");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (applyPendingMaintenanceActionRequest.getResourceIdentifier() != null) {
            prefix = "ResourceIdentifier";
            String resourceIdentifier = applyPendingMaintenanceActionRequest
                    .getResourceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(resourceIdentifier));
        }
        if (applyPendingMaintenanceActionRequest.getApplyAction() != null) {
            prefix = "ApplyAction";
            String applyAction = applyPendingMaintenanceActionRequest.getApplyAction();
            request.addParameter(prefix, StringUtils.fromString(applyAction));
        }
        if (applyPendingMaintenanceActionRequest.getOptInType() != null) {
            prefix = "OptInType";
            String optInType = applyPendingMaintenanceActionRequest.getOptInType();
            request.addParameter(prefix, StringUtils.fromString(optInType));
        }

        return request;
    }
}
