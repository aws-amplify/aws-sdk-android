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

package com.amazonaws.services.comprehendmedical.model.transform;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RxNormTrait
 */
class RxNormTraitJsonMarshaller {

    public void marshall(RxNormTrait rxNormTrait, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rxNormTrait.getName() != null) {
            String name = rxNormTrait.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (rxNormTrait.getScore() != null) {
            Float score = rxNormTrait.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        jsonWriter.endObject();
    }

    private static RxNormTraitJsonMarshaller instance;

    public static RxNormTraitJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RxNormTraitJsonMarshaller();
        return instance;
    }
}
