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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NotebookInstanceSummary
 */
class NotebookInstanceSummaryJsonMarshaller {

    public void marshall(NotebookInstanceSummary notebookInstanceSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (notebookInstanceSummary.getNotebookInstanceName() != null) {
            String notebookInstanceName = notebookInstanceSummary.getNotebookInstanceName();
            jsonWriter.name("NotebookInstanceName");
            jsonWriter.value(notebookInstanceName);
        }
        if (notebookInstanceSummary.getNotebookInstanceArn() != null) {
            String notebookInstanceArn = notebookInstanceSummary.getNotebookInstanceArn();
            jsonWriter.name("NotebookInstanceArn");
            jsonWriter.value(notebookInstanceArn);
        }
        if (notebookInstanceSummary.getNotebookInstanceStatus() != null) {
            String notebookInstanceStatus = notebookInstanceSummary.getNotebookInstanceStatus();
            jsonWriter.name("NotebookInstanceStatus");
            jsonWriter.value(notebookInstanceStatus);
        }
        if (notebookInstanceSummary.getUrl() != null) {
            String url = notebookInstanceSummary.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        if (notebookInstanceSummary.getInstanceType() != null) {
            String instanceType = notebookInstanceSummary.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (notebookInstanceSummary.getCreationTime() != null) {
            java.util.Date creationTime = notebookInstanceSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (notebookInstanceSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = notebookInstanceSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (notebookInstanceSummary.getNotebookInstanceLifecycleConfigName() != null) {
            String notebookInstanceLifecycleConfigName = notebookInstanceSummary
                    .getNotebookInstanceLifecycleConfigName();
            jsonWriter.name("NotebookInstanceLifecycleConfigName");
            jsonWriter.value(notebookInstanceLifecycleConfigName);
        }
        if (notebookInstanceSummary.getDefaultCodeRepository() != null) {
            String defaultCodeRepository = notebookInstanceSummary.getDefaultCodeRepository();
            jsonWriter.name("DefaultCodeRepository");
            jsonWriter.value(defaultCodeRepository);
        }
        if (notebookInstanceSummary.getAdditionalCodeRepositories() != null) {
            java.util.List<String> additionalCodeRepositories = notebookInstanceSummary
                    .getAdditionalCodeRepositories();
            jsonWriter.name("AdditionalCodeRepositories");
            jsonWriter.beginArray();
            for (String additionalCodeRepositoriesItem : additionalCodeRepositories) {
                if (additionalCodeRepositoriesItem != null) {
                    jsonWriter.value(additionalCodeRepositoriesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static NotebookInstanceSummaryJsonMarshaller instance;

    public static NotebookInstanceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NotebookInstanceSummaryJsonMarshaller();
        return instance;
    }
}
