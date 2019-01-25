/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ElasticsearchAction
 */
class ElasticsearchActionJsonMarshaller {

    public void marshall(ElasticsearchAction elasticsearchAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (elasticsearchAction.getRoleArn() != null) {
            String roleArn = elasticsearchAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (elasticsearchAction.getEndpoint() != null) {
            String endpoint = elasticsearchAction.getEndpoint();
            jsonWriter.name("endpoint");
            jsonWriter.value(endpoint);
        }
        if (elasticsearchAction.getIndex() != null) {
            String index = elasticsearchAction.getIndex();
            jsonWriter.name("index");
            jsonWriter.value(index);
        }
        if (elasticsearchAction.getType() != null) {
            String type = elasticsearchAction.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (elasticsearchAction.getId() != null) {
            String id = elasticsearchAction.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        jsonWriter.endObject();
    }

    private static ElasticsearchActionJsonMarshaller instance;

    public static ElasticsearchActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchActionJsonMarshaller();
        return instance;
    }
}
