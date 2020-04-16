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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NumberFilter
 */
class NumberFilterJsonMarshaller {

    public void marshall(NumberFilter numberFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (numberFilter.getGte() != null) {
            Double gte = numberFilter.getGte();
            jsonWriter.name("Gte");
            jsonWriter.value(gte);
        }
        if (numberFilter.getLte() != null) {
            Double lte = numberFilter.getLte();
            jsonWriter.name("Lte");
            jsonWriter.value(lte);
        }
        if (numberFilter.getEq() != null) {
            Double eq = numberFilter.getEq();
            jsonWriter.name("Eq");
            jsonWriter.value(eq);
        }
        jsonWriter.endObject();
    }

    private static NumberFilterJsonMarshaller instance;

    public static NumberFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NumberFilterJsonMarshaller();
        return instance;
    }
}
