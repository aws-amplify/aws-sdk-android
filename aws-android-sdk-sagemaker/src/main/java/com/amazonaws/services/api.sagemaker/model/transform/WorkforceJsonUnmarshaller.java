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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Workforce
 */
class WorkforceJsonUnmarshaller implements Unmarshaller<Workforce, JsonUnmarshallerContext> {

    public Workforce unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Workforce workforce = new Workforce();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WorkforceName")) {
                workforce.setWorkforceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WorkforceArn")) {
                workforce.setWorkforceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedDate")) {
                workforce.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceIpConfig")) {
                workforce.setSourceIpConfig(SourceIpConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return workforce;
    }

    private static WorkforceJsonUnmarshaller instance;

    public static WorkforceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkforceJsonUnmarshaller();
        return instance;
    }
}
