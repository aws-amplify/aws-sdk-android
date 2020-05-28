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

package com.amazonaws.services.workmail.model.transform;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FolderConfiguration
 */
class FolderConfigurationJsonMarshaller {

    public void marshall(FolderConfiguration folderConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (folderConfiguration.getName() != null) {
            String name = folderConfiguration.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (folderConfiguration.getAction() != null) {
            String action = folderConfiguration.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (folderConfiguration.getPeriod() != null) {
            Integer period = folderConfiguration.getPeriod();
            jsonWriter.name("Period");
            jsonWriter.value(period);
        }
        jsonWriter.endObject();
    }

    private static FolderConfigurationJsonMarshaller instance;

    public static FolderConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FolderConfigurationJsonMarshaller();
        return instance;
    }
}
