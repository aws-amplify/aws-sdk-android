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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UpgradeStepItem
 */
class UpgradeStepItemJsonMarshaller {

    public void marshall(UpgradeStepItem upgradeStepItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (upgradeStepItem.getUpgradeStep() != null) {
            String upgradeStep = upgradeStepItem.getUpgradeStep();
            jsonWriter.name("UpgradeStep");
            jsonWriter.value(upgradeStep);
        }
        if (upgradeStepItem.getUpgradeStepStatus() != null) {
            String upgradeStepStatus = upgradeStepItem.getUpgradeStepStatus();
            jsonWriter.name("UpgradeStepStatus");
            jsonWriter.value(upgradeStepStatus);
        }
        if (upgradeStepItem.getIssues() != null) {
            java.util.List<String> issues = upgradeStepItem.getIssues();
            jsonWriter.name("Issues");
            jsonWriter.beginArray();
            for (String issuesItem : issues) {
                if (issuesItem != null) {
                    jsonWriter.value(issuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (upgradeStepItem.getProgressPercent() != null) {
            Double progressPercent = upgradeStepItem.getProgressPercent();
            jsonWriter.name("ProgressPercent");
            jsonWriter.value(progressPercent);
        }
        jsonWriter.endObject();
    }

    private static UpgradeStepItemJsonMarshaller instance;

    public static UpgradeStepItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpgradeStepItemJsonMarshaller();
        return instance;
    }
}
