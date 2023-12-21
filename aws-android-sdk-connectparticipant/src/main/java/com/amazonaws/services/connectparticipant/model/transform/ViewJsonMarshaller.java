/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model.transform;

import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO View
 */
class ViewJsonMarshaller {

    public void marshall(View view, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (view.getId() != null) {
            String id = view.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (view.getArn() != null) {
            String arn = view.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (view.getName() != null) {
            String name = view.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (view.getVersion() != null) {
            Integer version = view.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (view.getContent() != null) {
            ViewContent content = view.getContent();
            jsonWriter.name("Content");
            ViewContentJsonMarshaller.getInstance().marshall(content, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ViewJsonMarshaller instance;

    public static ViewJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ViewJsonMarshaller();
        return instance;
    }
}
