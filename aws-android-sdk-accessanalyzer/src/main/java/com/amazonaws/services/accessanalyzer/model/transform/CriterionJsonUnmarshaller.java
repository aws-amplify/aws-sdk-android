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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Criterion
 */
class CriterionJsonUnmarshaller implements Unmarshaller<Criterion, JsonUnmarshallerContext> {

    public Criterion unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Criterion criterion = new Criterion();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("contains")) {
                criterion.setContains(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("eq")) {
                criterion.setEq(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("exists")) {
                criterion.setExists(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("neq")) {
                criterion.setNeq(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return criterion;
    }

    private static CriterionJsonUnmarshaller instance;

    public static CriterionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CriterionJsonUnmarshaller();
        return instance;
    }
}
