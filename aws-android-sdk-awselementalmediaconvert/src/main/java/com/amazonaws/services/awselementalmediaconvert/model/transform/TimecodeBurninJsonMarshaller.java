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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TimecodeBurnin
 */
class TimecodeBurninJsonMarshaller {

    public void marshall(TimecodeBurnin timecodeBurnin, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (timecodeBurnin.getFontSize() != null) {
            Integer fontSize = timecodeBurnin.getFontSize();
            jsonWriter.name("FontSize");
            jsonWriter.value(fontSize);
        }
        if (timecodeBurnin.getPosition() != null) {
            String position = timecodeBurnin.getPosition();
            jsonWriter.name("Position");
            jsonWriter.value(position);
        }
        if (timecodeBurnin.getPrefix() != null) {
            String prefix = timecodeBurnin.getPrefix();
            jsonWriter.name("Prefix");
            jsonWriter.value(prefix);
        }
        jsonWriter.endObject();
    }

    private static TimecodeBurninJsonMarshaller instance;

    public static TimecodeBurninJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TimecodeBurninJsonMarshaller();
        return instance;
    }
}
