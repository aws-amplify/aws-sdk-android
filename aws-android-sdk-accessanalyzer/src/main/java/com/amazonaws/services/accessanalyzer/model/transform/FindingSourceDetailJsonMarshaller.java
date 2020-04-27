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
 * JSON marshaller for POJO FindingSourceDetail
 */
class FindingSourceDetailJsonMarshaller {

    public void marshall(FindingSourceDetail findingSourceDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (findingSourceDetail.getAccessPointArn() != null) {
            String accessPointArn = findingSourceDetail.getAccessPointArn();
            jsonWriter.name("accessPointArn");
            jsonWriter.value(accessPointArn);
        }
        jsonWriter.endObject();
    }

    private static FindingSourceDetailJsonMarshaller instance;

    public static FindingSourceDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindingSourceDetailJsonMarshaller();
        return instance;
    }
}
