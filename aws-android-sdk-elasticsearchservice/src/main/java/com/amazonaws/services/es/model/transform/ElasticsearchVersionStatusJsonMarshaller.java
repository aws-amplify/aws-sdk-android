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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ElasticsearchVersionStatus
 */
class ElasticsearchVersionStatusJsonMarshaller {

    public void marshall(ElasticsearchVersionStatus elasticsearchVersionStatus,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (elasticsearchVersionStatus.getOptions() != null) {
            String options = elasticsearchVersionStatus.getOptions();
            jsonWriter.name("Options");
            jsonWriter.value(options);
        }
        if (elasticsearchVersionStatus.getStatus() != null) {
            OptionStatus status = elasticsearchVersionStatus.getStatus();
            jsonWriter.name("Status");
            OptionStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ElasticsearchVersionStatusJsonMarshaller instance;

    public static ElasticsearchVersionStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchVersionStatusJsonMarshaller();
        return instance;
    }
}
