/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO QualityMetrics
 */
class QualityMetricsJsonMarshaller {

    public void marshall(QualityMetrics qualityMetrics, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (qualityMetrics.getAgent() != null) {
            AgentQualityMetrics agent = qualityMetrics.getAgent();
            jsonWriter.name("Agent");
            AgentQualityMetricsJsonMarshaller.getInstance().marshall(agent, jsonWriter);
        }
        if (qualityMetrics.getCustomer() != null) {
            CustomerQualityMetrics customer = qualityMetrics.getCustomer();
            jsonWriter.name("Customer");
            CustomerQualityMetricsJsonMarshaller.getInstance().marshall(customer, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static QualityMetricsJsonMarshaller instance;

    public static QualityMetricsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QualityMetricsJsonMarshaller();
        return instance;
    }
}
