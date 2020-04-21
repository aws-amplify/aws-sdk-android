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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EC2Specification
 */
class EC2SpecificationJsonMarshaller {

    public void marshall(EC2Specification eC2Specification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eC2Specification.getOfferingClass() != null) {
            String offeringClass = eC2Specification.getOfferingClass();
            jsonWriter.name("OfferingClass");
            jsonWriter.value(offeringClass);
        }
        jsonWriter.endObject();
    }

    private static EC2SpecificationJsonMarshaller instance;

    public static EC2SpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EC2SpecificationJsonMarshaller();
        return instance;
    }
}
