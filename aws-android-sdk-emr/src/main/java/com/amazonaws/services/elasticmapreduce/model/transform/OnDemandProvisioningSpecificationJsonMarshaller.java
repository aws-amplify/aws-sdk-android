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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OnDemandProvisioningSpecification
 */
class OnDemandProvisioningSpecificationJsonMarshaller {

    public void marshall(OnDemandProvisioningSpecification onDemandProvisioningSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (onDemandProvisioningSpecification.getAllocationStrategy() != null) {
            String allocationStrategy = onDemandProvisioningSpecification.getAllocationStrategy();
            jsonWriter.name("AllocationStrategy");
            jsonWriter.value(allocationStrategy);
        }
        jsonWriter.endObject();
    }

    private static OnDemandProvisioningSpecificationJsonMarshaller instance;

    public static OnDemandProvisioningSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OnDemandProvisioningSpecificationJsonMarshaller();
        return instance;
    }
}
