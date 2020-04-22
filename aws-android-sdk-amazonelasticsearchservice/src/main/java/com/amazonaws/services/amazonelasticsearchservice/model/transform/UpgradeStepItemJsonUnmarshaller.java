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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO UpgradeStepItem
 */
class UpgradeStepItemJsonUnmarshaller implements
        Unmarshaller<UpgradeStepItem, JsonUnmarshallerContext> {

    public UpgradeStepItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UpgradeStepItem upgradeStepItem = new UpgradeStepItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UpgradeStep")) {
                upgradeStepItem.setUpgradeStep(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpgradeStepStatus")) {
                upgradeStepItem.setUpgradeStepStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Issues")) {
                upgradeStepItem.setIssues(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProgressPercent")) {
                upgradeStepItem.setProgressPercent(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return upgradeStepItem;
    }

    private static UpgradeStepItemJsonUnmarshaller instance;

    public static UpgradeStepItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpgradeStepItemJsonUnmarshaller();
        return instance;
    }
}
