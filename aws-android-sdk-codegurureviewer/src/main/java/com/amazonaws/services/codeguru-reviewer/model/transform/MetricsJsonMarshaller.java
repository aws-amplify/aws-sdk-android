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
package com.amazonaws.services.codeguru-reviewer.model.transform;

import com.amazonaws.services.codeguru-reviewer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Metrics
 */
class MetricsJsonMarshaller {

    public void marshall(Metrics metrics, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (metrics.getMeteredLinesOfCodeCount() != null) {
            Long meteredLinesOfCodeCount = metrics.getMeteredLinesOfCodeCount();
            jsonWriter.name("MeteredLinesOfCodeCount");
            jsonWriter.value(meteredLinesOfCodeCount);
        }
        if (metrics.getFindingsCount() != null) {
            Long findingsCount = metrics.getFindingsCount();
            jsonWriter.name("FindingsCount");
            jsonWriter.value(findingsCount);
        }
        jsonWriter.endObject();
    }

    private static MetricsJsonMarshaller instance;
    public static MetricsJsonMarshaller getInstance() {
        if (instance == null) instance = new MetricsJsonMarshaller();
        return instance;
    }
}
