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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NotebookInstanceLifecycleConfigSummary
 */
class NotebookInstanceLifecycleConfigSummaryJsonMarshaller {

    public void marshall(
            NotebookInstanceLifecycleConfigSummary notebookInstanceLifecycleConfigSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (notebookInstanceLifecycleConfigSummary.getNotebookInstanceLifecycleConfigName() != null) {
            String notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigSummary
                    .getNotebookInstanceLifecycleConfigName();
            jsonWriter.name("NotebookInstanceLifecycleConfigName");
            jsonWriter.value(notebookInstanceLifecycleConfigName);
        }
        if (notebookInstanceLifecycleConfigSummary.getNotebookInstanceLifecycleConfigArn() != null) {
            String notebookInstanceLifecycleConfigArn = notebookInstanceLifecycleConfigSummary
                    .getNotebookInstanceLifecycleConfigArn();
            jsonWriter.name("NotebookInstanceLifecycleConfigArn");
            jsonWriter.value(notebookInstanceLifecycleConfigArn);
        }
        if (notebookInstanceLifecycleConfigSummary.getCreationTime() != null) {
            java.util.Date creationTime = notebookInstanceLifecycleConfigSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (notebookInstanceLifecycleConfigSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = notebookInstanceLifecycleConfigSummary
                    .getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        jsonWriter.endObject();
    }

    private static NotebookInstanceLifecycleConfigSummaryJsonMarshaller instance;

    public static NotebookInstanceLifecycleConfigSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NotebookInstanceLifecycleConfigSummaryJsonMarshaller();
        return instance;
    }
}
