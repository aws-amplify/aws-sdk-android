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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReservedInstancesModification
 */
class ReservedInstancesModificationJsonMarshaller {

    public void marshall(ReservedInstancesModification reservedInstancesModification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (reservedInstancesModification.getClientToken() != null) {
            String clientToken = reservedInstancesModification.getClientToken();
            jsonWriter.name("ClientToken");
            jsonWriter.value(clientToken);
        }
        if (reservedInstancesModification.getCreateDate() != null) {
            java.util.Date createDate = reservedInstancesModification.getCreateDate();
            jsonWriter.name("CreateDate");
            jsonWriter.value(createDate);
        }
        if (reservedInstancesModification.getEffectiveDate() != null) {
            java.util.Date effectiveDate = reservedInstancesModification.getEffectiveDate();
            jsonWriter.name("EffectiveDate");
            jsonWriter.value(effectiveDate);
        }
        if (reservedInstancesModification.getModificationResults() != null) {
            java.util.List<ReservedInstancesModificationResult> modificationResults = reservedInstancesModification
                    .getModificationResults();
            jsonWriter.name("ModificationResults");
            jsonWriter.beginArray();
            for (ReservedInstancesModificationResult modificationResultsItem : modificationResults) {
                if (modificationResultsItem != null) {
                    ReservedInstancesModificationResultJsonMarshaller.getInstance().marshall(
                            modificationResultsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (reservedInstancesModification.getReservedInstancesIds() != null) {
            java.util.List<ReservedInstancesId> reservedInstancesIds = reservedInstancesModification
                    .getReservedInstancesIds();
            jsonWriter.name("ReservedInstancesIds");
            jsonWriter.beginArray();
            for (ReservedInstancesId reservedInstancesIdsItem : reservedInstancesIds) {
                if (reservedInstancesIdsItem != null) {
                    ReservedInstancesIdJsonMarshaller.getInstance().marshall(
                            reservedInstancesIdsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (reservedInstancesModification.getReservedInstancesModificationId() != null) {
            String reservedInstancesModificationId = reservedInstancesModification
                    .getReservedInstancesModificationId();
            jsonWriter.name("ReservedInstancesModificationId");
            jsonWriter.value(reservedInstancesModificationId);
        }
        if (reservedInstancesModification.getStatus() != null) {
            String status = reservedInstancesModification.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (reservedInstancesModification.getStatusMessage() != null) {
            String statusMessage = reservedInstancesModification.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (reservedInstancesModification.getUpdateDate() != null) {
            java.util.Date updateDate = reservedInstancesModification.getUpdateDate();
            jsonWriter.name("UpdateDate");
            jsonWriter.value(updateDate);
        }
        jsonWriter.endObject();
    }

    private static ReservedInstancesModificationJsonMarshaller instance;

    public static ReservedInstancesModificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstancesModificationJsonMarshaller();
        return instance;
    }
}
