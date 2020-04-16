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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataProcessing
 */
class DataProcessingJsonMarshaller {

    public void marshall(DataProcessing dataProcessing, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dataProcessing.getInputFilter() != null) {
            String inputFilter = dataProcessing.getInputFilter();
            jsonWriter.name("InputFilter");
            jsonWriter.value(inputFilter);
        }
        if (dataProcessing.getOutputFilter() != null) {
            String outputFilter = dataProcessing.getOutputFilter();
            jsonWriter.name("OutputFilter");
            jsonWriter.value(outputFilter);
        }
        if (dataProcessing.getJoinSource() != null) {
            String joinSource = dataProcessing.getJoinSource();
            jsonWriter.name("JoinSource");
            jsonWriter.value(joinSource);
        }
        jsonWriter.endObject();
    }

    private static DataProcessingJsonMarshaller instance;

    public static DataProcessingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataProcessingJsonMarshaller();
        return instance;
    }
}
