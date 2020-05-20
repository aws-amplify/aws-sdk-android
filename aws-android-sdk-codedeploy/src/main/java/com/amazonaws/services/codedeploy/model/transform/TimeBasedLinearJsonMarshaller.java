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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TimeBasedLinear
 */
class TimeBasedLinearJsonMarshaller {

    public void marshall(TimeBasedLinear timeBasedLinear, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (timeBasedLinear.getLinearPercentage() != null) {
            Integer linearPercentage = timeBasedLinear.getLinearPercentage();
            jsonWriter.name("linearPercentage");
            jsonWriter.value(linearPercentage);
        }
        if (timeBasedLinear.getLinearInterval() != null) {
            Integer linearInterval = timeBasedLinear.getLinearInterval();
            jsonWriter.name("linearInterval");
            jsonWriter.value(linearInterval);
        }
        jsonWriter.endObject();
    }

    private static TimeBasedLinearJsonMarshaller instance;

    public static TimeBasedLinearJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TimeBasedLinearJsonMarshaller();
        return instance;
    }
}
