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

package com.amazonaws.services.accessanalyzer.model.transform;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FindingSource
 */
class FindingSourceJsonMarshaller {

    public void marshall(FindingSource findingSource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (findingSource.getDetail() != null) {
            FindingSourceDetail detail = findingSource.getDetail();
            jsonWriter.name("detail");
            FindingSourceDetailJsonMarshaller.getInstance().marshall(detail, jsonWriter);
        }
        if (findingSource.getType() != null) {
            String type = findingSource.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static FindingSourceJsonMarshaller instance;

    public static FindingSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindingSourceJsonMarshaller();
        return instance;
    }
}
