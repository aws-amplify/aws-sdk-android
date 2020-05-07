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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO QueryInfo
 */
class QueryInfoJsonMarshaller {

    public void marshall(QueryInfo queryInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (queryInfo.getQueryId() != null) {
            String queryId = queryInfo.getQueryId();
            jsonWriter.name("queryId");
            jsonWriter.value(queryId);
        }
        if (queryInfo.getQueryString() != null) {
            String queryString = queryInfo.getQueryString();
            jsonWriter.name("queryString");
            jsonWriter.value(queryString);
        }
        if (queryInfo.getStatus() != null) {
            String status = queryInfo.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (queryInfo.getCreateTime() != null) {
            Long createTime = queryInfo.getCreateTime();
            jsonWriter.name("createTime");
            jsonWriter.value(createTime);
        }
        if (queryInfo.getLogGroupName() != null) {
            String logGroupName = queryInfo.getLogGroupName();
            jsonWriter.name("logGroupName");
            jsonWriter.value(logGroupName);
        }
        jsonWriter.endObject();
    }

    private static QueryInfoJsonMarshaller instance;

    public static QueryInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueryInfoJsonMarshaller();
        return instance;
    }
}
