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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IotSiteWiseAction
 */
class IotSiteWiseActionJsonMarshaller {

    public void marshall(IotSiteWiseAction iotSiteWiseAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (iotSiteWiseAction.getPutAssetPropertyValueEntries() != null) {
            java.util.List<PutAssetPropertyValueEntry> putAssetPropertyValueEntries = iotSiteWiseAction
                    .getPutAssetPropertyValueEntries();
            jsonWriter.name("putAssetPropertyValueEntries");
            jsonWriter.beginArray();
            for (PutAssetPropertyValueEntry putAssetPropertyValueEntriesItem : putAssetPropertyValueEntries) {
                if (putAssetPropertyValueEntriesItem != null) {
                    PutAssetPropertyValueEntryJsonMarshaller.getInstance().marshall(
                            putAssetPropertyValueEntriesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (iotSiteWiseAction.getRoleArn() != null) {
            String roleArn = iotSiteWiseAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static IotSiteWiseActionJsonMarshaller instance;

    public static IotSiteWiseActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IotSiteWiseActionJsonMarshaller();
        return instance;
    }
}
