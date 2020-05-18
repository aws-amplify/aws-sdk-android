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
 * JSON marshaller for POJO CoipAddressUsage
 */
class CoipAddressUsageJsonMarshaller {

    public void marshall(CoipAddressUsage coipAddressUsage, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (coipAddressUsage.getAllocationId() != null) {
            String allocationId = coipAddressUsage.getAllocationId();
            jsonWriter.name("AllocationId");
            jsonWriter.value(allocationId);
        }
        if (coipAddressUsage.getAwsAccountId() != null) {
            String awsAccountId = coipAddressUsage.getAwsAccountId();
            jsonWriter.name("AwsAccountId");
            jsonWriter.value(awsAccountId);
        }
        if (coipAddressUsage.getAwsService() != null) {
            String awsService = coipAddressUsage.getAwsService();
            jsonWriter.name("AwsService");
            jsonWriter.value(awsService);
        }
        if (coipAddressUsage.getCoIp() != null) {
            String coIp = coipAddressUsage.getCoIp();
            jsonWriter.name("CoIp");
            jsonWriter.value(coIp);
        }
        jsonWriter.endObject();
    }

    private static CoipAddressUsageJsonMarshaller instance;

    public static CoipAddressUsageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CoipAddressUsageJsonMarshaller();
        return instance;
    }
}
