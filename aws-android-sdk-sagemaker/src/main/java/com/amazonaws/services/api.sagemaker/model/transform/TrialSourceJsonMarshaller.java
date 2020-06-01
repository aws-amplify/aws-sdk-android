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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrialSource
 */
class TrialSourceJsonMarshaller {

    public void marshall(TrialSource trialSource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trialSource.getSourceArn() != null) {
            String sourceArn = trialSource.getSourceArn();
            jsonWriter.name("SourceArn");
            jsonWriter.value(sourceArn);
        }
        if (trialSource.getSourceType() != null) {
            String sourceType = trialSource.getSourceType();
            jsonWriter.name("SourceType");
            jsonWriter.value(sourceType);
        }
        jsonWriter.endObject();
    }

    private static TrialSourceJsonMarshaller instance;

    public static TrialSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrialSourceJsonMarshaller();
        return instance;
    }
}
