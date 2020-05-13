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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsService
 */
class AwsServiceJsonMarshaller {

    public void marshall(AwsService awsService, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsService.getInvokedBy() != null) {
            String invokedBy = awsService.getInvokedBy();
            jsonWriter.name("invokedBy");
            jsonWriter.value(invokedBy);
        }
        jsonWriter.endObject();
    }

    private static AwsServiceJsonMarshaller instance;

    public static AwsServiceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsServiceJsonMarshaller();
        return instance;
    }
}
