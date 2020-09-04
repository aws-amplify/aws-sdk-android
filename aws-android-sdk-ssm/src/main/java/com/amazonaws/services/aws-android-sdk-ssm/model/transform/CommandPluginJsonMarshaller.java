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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CommandPlugin
 */
class CommandPluginJsonMarshaller {

    public void marshall(CommandPlugin commandPlugin, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (commandPlugin.getName() != null) {
            String name = commandPlugin.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (commandPlugin.getStatus() != null) {
            String status = commandPlugin.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (commandPlugin.getStatusDetails() != null) {
            String statusDetails = commandPlugin.getStatusDetails();
            jsonWriter.name("StatusDetails");
            jsonWriter.value(statusDetails);
        }
        if (commandPlugin.getResponseCode() != null) {
            Integer responseCode = commandPlugin.getResponseCode();
            jsonWriter.name("ResponseCode");
            jsonWriter.value(responseCode);
        }
        if (commandPlugin.getResponseStartDateTime() != null) {
            java.util.Date responseStartDateTime = commandPlugin.getResponseStartDateTime();
            jsonWriter.name("ResponseStartDateTime");
            jsonWriter.value(responseStartDateTime);
        }
        if (commandPlugin.getResponseFinishDateTime() != null) {
            java.util.Date responseFinishDateTime = commandPlugin.getResponseFinishDateTime();
            jsonWriter.name("ResponseFinishDateTime");
            jsonWriter.value(responseFinishDateTime);
        }
        if (commandPlugin.getOutput() != null) {
            String output = commandPlugin.getOutput();
            jsonWriter.name("Output");
            jsonWriter.value(output);
        }
        if (commandPlugin.getStandardOutputUrl() != null) {
            String standardOutputUrl = commandPlugin.getStandardOutputUrl();
            jsonWriter.name("StandardOutputUrl");
            jsonWriter.value(standardOutputUrl);
        }
        if (commandPlugin.getStandardErrorUrl() != null) {
            String standardErrorUrl = commandPlugin.getStandardErrorUrl();
            jsonWriter.name("StandardErrorUrl");
            jsonWriter.value(standardErrorUrl);
        }
        if (commandPlugin.getOutputS3Region() != null) {
            String outputS3Region = commandPlugin.getOutputS3Region();
            jsonWriter.name("OutputS3Region");
            jsonWriter.value(outputS3Region);
        }
        if (commandPlugin.getOutputS3BucketName() != null) {
            String outputS3BucketName = commandPlugin.getOutputS3BucketName();
            jsonWriter.name("OutputS3BucketName");
            jsonWriter.value(outputS3BucketName);
        }
        if (commandPlugin.getOutputS3KeyPrefix() != null) {
            String outputS3KeyPrefix = commandPlugin.getOutputS3KeyPrefix();
            jsonWriter.name("OutputS3KeyPrefix");
            jsonWriter.value(outputS3KeyPrefix);
        }
        jsonWriter.endObject();
    }

    private static CommandPluginJsonMarshaller instance;
    public static CommandPluginJsonMarshaller getInstance() {
        if (instance == null) instance = new CommandPluginJsonMarshaller();
        return instance;
    }
}
