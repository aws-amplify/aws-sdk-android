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
 * StAX request marshaller for PurchaseReservedDBInstancesOfferingRequest
 */
public class PurchaseReservedDBInstancesOfferingRequestMarshaller
        implements
        Marshaller<Request<PurchaseReservedDBInstancesOfferingRequest>, PurchaseReservedDBInstancesOfferingRequest> {

    public Request<PurchaseReservedDBInstancesOfferingRequest> marshall(
            PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest) {
        if (purchaseReservedDBInstancesOfferingRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PurchaseReservedDBInstancesOfferingRequest)");
        }

        Request<PurchaseReservedDBInstancesOfferingRequest> request = new DefaultRequest<PurchaseReservedDBInstancesOfferingRequest>(
                purchaseReservedDBInstancesOfferingRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "PurchaseReservedDBInstancesOffering");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (purchaseReservedDBInstancesOfferingRequest.getReservedDBInstancesOfferingId() != null) {
            prefix = "ReservedDBInstancesOfferingId";
            String reservedDBInstancesOfferingId = purchaseReservedDBInstancesOfferingRequest
                    .getReservedDBInstancesOfferingId();
            request.addParameter(prefix, StringUtils.fromString(reservedDBInstancesOfferingId));
        }
        if (purchaseReservedDBInstancesOfferingRequest.getReservedDBInstanceId() != null) {
            prefix = "ReservedDBInstanceId";
            String reservedDBInstanceId = purchaseReservedDBInstancesOfferingRequest
                    .getReservedDBInstanceId();
            request.addParameter(prefix, StringUtils.fromString(reservedDBInstanceId));
        }
        if (purchaseReservedDBInstancesOfferingRequest.getDBInstanceCount() != null) {
            prefix = "DBInstanceCount";
            Integer dBInstanceCount = purchaseReservedDBInstancesOfferingRequest
                    .getDBInstanceCount();
            request.addParameter(prefix, StringUtils.fromInteger(dBInstanceCount));
        }
        if (purchaseReservedDBInstancesOfferingRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = purchaseReservedDBInstancesOfferingRequest.getTags();
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
