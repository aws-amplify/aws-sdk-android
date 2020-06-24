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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RepositoryTrigger
 */
class RepositoryTriggerJsonMarshaller {

    public void marshall(RepositoryTrigger repositoryTrigger, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (repositoryTrigger.getName() != null) {
            String name = repositoryTrigger.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (repositoryTrigger.getDestinationArn() != null) {
            String destinationArn = repositoryTrigger.getDestinationArn();
            jsonWriter.name("destinationArn");
            jsonWriter.value(destinationArn);
        }
        if (repositoryTrigger.getCustomData() != null) {
            String customData = repositoryTrigger.getCustomData();
            jsonWriter.name("customData");
            jsonWriter.value(customData);
        }
        if (repositoryTrigger.getBranches() != null) {
            java.util.List<String> branches = repositoryTrigger.getBranches();
            jsonWriter.name("branches");
            jsonWriter.beginArray();
            for (String branchesItem : branches) {
                if (branchesItem != null) {
                    jsonWriter.value(branchesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (repositoryTrigger.getEvents() != null) {
            java.util.List<String> events = repositoryTrigger.getEvents();
            jsonWriter.name("events");
            jsonWriter.beginArray();
            for (String eventsItem : events) {
                if (eventsItem != null) {
                    jsonWriter.value(eventsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RepositoryTriggerJsonMarshaller instance;

    public static RepositoryTriggerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryTriggerJsonMarshaller();
        return instance;
    }
}
