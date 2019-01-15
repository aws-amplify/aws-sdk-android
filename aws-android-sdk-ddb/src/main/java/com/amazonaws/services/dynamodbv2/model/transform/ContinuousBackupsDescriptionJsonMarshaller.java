/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ContinuousBackupsDescription
 */
class ContinuousBackupsDescriptionJsonMarshaller {

    public void marshall(ContinuousBackupsDescription continuousBackupsDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (continuousBackupsDescription.getContinuousBackupsStatus() != null) {
            String continuousBackupsStatus = continuousBackupsDescription
                    .getContinuousBackupsStatus();
            jsonWriter.name("ContinuousBackupsStatus");
            jsonWriter.value(continuousBackupsStatus);
        }
        if (continuousBackupsDescription.getPointInTimeRecoveryDescription() != null) {
            PointInTimeRecoveryDescription pointInTimeRecoveryDescription = continuousBackupsDescription
                    .getPointInTimeRecoveryDescription();
            jsonWriter.name("PointInTimeRecoveryDescription");
            PointInTimeRecoveryDescriptionJsonMarshaller.getInstance().marshall(
                    pointInTimeRecoveryDescription, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ContinuousBackupsDescriptionJsonMarshaller instance;

    public static ContinuousBackupsDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContinuousBackupsDescriptionJsonMarshaller();
        return instance;
    }
}
