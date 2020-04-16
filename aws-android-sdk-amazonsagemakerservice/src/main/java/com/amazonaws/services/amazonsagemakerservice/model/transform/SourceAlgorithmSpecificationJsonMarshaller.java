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
 * JSON marshaller for POJO SourceAlgorithmSpecification
 */
class SourceAlgorithmSpecificationJsonMarshaller {

    public void marshall(SourceAlgorithmSpecification sourceAlgorithmSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sourceAlgorithmSpecification.getSourceAlgorithms() != null) {
            java.util.List<SourceAlgorithm> sourceAlgorithms = sourceAlgorithmSpecification
                    .getSourceAlgorithms();
            jsonWriter.name("SourceAlgorithms");
            jsonWriter.beginArray();
            for (SourceAlgorithm sourceAlgorithmsItem : sourceAlgorithms) {
                if (sourceAlgorithmsItem != null) {
                    SourceAlgorithmJsonMarshaller.getInstance().marshall(sourceAlgorithmsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SourceAlgorithmSpecificationJsonMarshaller instance;

    public static SourceAlgorithmSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SourceAlgorithmSpecificationJsonMarshaller();
        return instance;
    }
}
