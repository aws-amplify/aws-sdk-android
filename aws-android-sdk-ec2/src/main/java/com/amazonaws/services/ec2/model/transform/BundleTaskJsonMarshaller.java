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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BundleTask
 */
class BundleTaskJsonMarshaller {

    public void marshall(BundleTask bundleTask, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (bundleTask.getBundleId() != null) {
            String bundleId = bundleTask.getBundleId();
            jsonWriter.name("BundleId");
            jsonWriter.value(bundleId);
        }
        if (bundleTask.getBundleTaskError() != null) {
            BundleTaskError bundleTaskError = bundleTask.getBundleTaskError();
            jsonWriter.name("BundleTaskError");
            BundleTaskErrorJsonMarshaller.getInstance().marshall(bundleTaskError, jsonWriter);
        }
        if (bundleTask.getInstanceId() != null) {
            String instanceId = bundleTask.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (bundleTask.getProgress() != null) {
            String progress = bundleTask.getProgress();
            jsonWriter.name("Progress");
            jsonWriter.value(progress);
        }
        if (bundleTask.getStartTime() != null) {
            java.util.Date startTime = bundleTask.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (bundleTask.getState() != null) {
            String state = bundleTask.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (bundleTask.getStorage() != null) {
            Storage storage = bundleTask.getStorage();
            jsonWriter.name("Storage");
            StorageJsonMarshaller.getInstance().marshall(storage, jsonWriter);
        }
        if (bundleTask.getUpdateTime() != null) {
            java.util.Date updateTime = bundleTask.getUpdateTime();
            jsonWriter.name("UpdateTime");
            jsonWriter.value(updateTime);
        }
        jsonWriter.endObject();
    }

    private static BundleTaskJsonMarshaller instance;

    public static BundleTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BundleTaskJsonMarshaller();
        return instance;
    }
}
