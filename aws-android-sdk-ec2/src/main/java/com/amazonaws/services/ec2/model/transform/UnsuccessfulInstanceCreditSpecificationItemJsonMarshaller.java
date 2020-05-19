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
 * JSON marshaller for POJO UnsuccessfulInstanceCreditSpecificationItem
 */
class UnsuccessfulInstanceCreditSpecificationItemJsonMarshaller {

    public void marshall(
            UnsuccessfulInstanceCreditSpecificationItem unsuccessfulInstanceCreditSpecificationItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (unsuccessfulInstanceCreditSpecificationItem.getInstanceId() != null) {
            String instanceId = unsuccessfulInstanceCreditSpecificationItem.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (unsuccessfulInstanceCreditSpecificationItem.getError() != null) {
            UnsuccessfulInstanceCreditSpecificationItemError error = unsuccessfulInstanceCreditSpecificationItem
                    .getError();
            jsonWriter.name("Error");
            UnsuccessfulInstanceCreditSpecificationItemErrorJsonMarshaller.getInstance().marshall(
                    error, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UnsuccessfulInstanceCreditSpecificationItemJsonMarshaller instance;

    public static UnsuccessfulInstanceCreditSpecificationItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UnsuccessfulInstanceCreditSpecificationItemJsonMarshaller();
        return instance;
    }
}
