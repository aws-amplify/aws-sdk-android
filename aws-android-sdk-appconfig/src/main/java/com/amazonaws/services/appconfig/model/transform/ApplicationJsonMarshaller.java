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

package com.amazonaws.services.appconfig.model.transform;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Application
 */
class ApplicationJsonMarshaller {

    public void marshall(Application application, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (application.getId() != null) {
            String id = application.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (application.getName() != null) {
            String name = application.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (application.getDescription() != null) {
            String description = application.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static ApplicationJsonMarshaller instance;

    public static ApplicationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationJsonMarshaller();
        return instance;
    }
}
