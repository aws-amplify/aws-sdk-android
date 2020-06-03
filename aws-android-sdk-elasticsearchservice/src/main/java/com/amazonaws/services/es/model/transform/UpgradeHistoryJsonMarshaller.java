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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UpgradeHistory
 */
class UpgradeHistoryJsonMarshaller {

    public void marshall(UpgradeHistory upgradeHistory, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (upgradeHistory.getUpgradeName() != null) {
            String upgradeName = upgradeHistory.getUpgradeName();
            jsonWriter.name("UpgradeName");
            jsonWriter.value(upgradeName);
        }
        if (upgradeHistory.getStartTimestamp() != null) {
            java.util.Date startTimestamp = upgradeHistory.getStartTimestamp();
            jsonWriter.name("StartTimestamp");
            jsonWriter.value(startTimestamp);
        }
        if (upgradeHistory.getUpgradeStatus() != null) {
            String upgradeStatus = upgradeHistory.getUpgradeStatus();
            jsonWriter.name("UpgradeStatus");
            jsonWriter.value(upgradeStatus);
        }
        if (upgradeHistory.getStepsList() != null) {
            java.util.List<UpgradeStepItem> stepsList = upgradeHistory.getStepsList();
            jsonWriter.name("StepsList");
            jsonWriter.beginArray();
            for (UpgradeStepItem stepsListItem : stepsList) {
                if (stepsListItem != null) {
                    UpgradeStepItemJsonMarshaller.getInstance().marshall(stepsListItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static UpgradeHistoryJsonMarshaller instance;

    public static UpgradeHistoryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpgradeHistoryJsonMarshaller();
        return instance;
    }
}
