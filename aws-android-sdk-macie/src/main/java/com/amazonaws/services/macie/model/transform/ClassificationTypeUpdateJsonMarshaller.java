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

package com.amazonaws.services.macie.model.transform;

import com.amazonaws.services.macie.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClassificationTypeUpdate
 */
class ClassificationTypeUpdateJsonMarshaller {

    public void marshall(ClassificationTypeUpdate classificationTypeUpdate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (classificationTypeUpdate.getOneTime() != null) {
            String oneTime = classificationTypeUpdate.getOneTime();
            jsonWriter.name("oneTime");
            jsonWriter.value(oneTime);
        }
        if (classificationTypeUpdate.getContinuous() != null) {
            String continuous = classificationTypeUpdate.getContinuous();
            jsonWriter.name("continuous");
            jsonWriter.value(continuous);
        }
        jsonWriter.endObject();
    }

    private static ClassificationTypeUpdateJsonMarshaller instance;

    public static ClassificationTypeUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClassificationTypeUpdateJsonMarshaller();
        return instance;
    }
}
