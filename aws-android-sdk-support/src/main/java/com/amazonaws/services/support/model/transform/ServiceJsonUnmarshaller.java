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

package com.amazonaws.services.support.model.transform;

import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Service
 */
class ServiceJsonUnmarshaller implements Unmarshaller<Service, JsonUnmarshallerContext> {

    public Service unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Service service = new Service();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("code")) {
                service.setCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                service.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("categories")) {
                service.setCategories(new ListUnmarshaller<Category>(CategoryJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return service;
    }

    private static ServiceJsonUnmarshaller instance;

    public static ServiceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonUnmarshaller();
        return instance;
    }
}
