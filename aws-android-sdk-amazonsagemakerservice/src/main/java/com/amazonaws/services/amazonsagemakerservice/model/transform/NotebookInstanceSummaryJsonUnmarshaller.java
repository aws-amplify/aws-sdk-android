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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NotebookInstanceSummary
 */
class NotebookInstanceSummaryJsonUnmarshaller implements
        Unmarshaller<NotebookInstanceSummary, JsonUnmarshallerContext> {

    public NotebookInstanceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NotebookInstanceSummary notebookInstanceSummary = new NotebookInstanceSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NotebookInstanceName")) {
                notebookInstanceSummary.setNotebookInstanceName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotebookInstanceArn")) {
                notebookInstanceSummary.setNotebookInstanceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotebookInstanceStatus")) {
                notebookInstanceSummary.setNotebookInstanceStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Url")) {
                notebookInstanceSummary.setUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                notebookInstanceSummary.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                notebookInstanceSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                notebookInstanceSummary.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotebookInstanceLifecycleConfigName")) {
                notebookInstanceSummary
                        .setNotebookInstanceLifecycleConfigName(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DefaultCodeRepository")) {
                notebookInstanceSummary.setDefaultCodeRepository(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdditionalCodeRepositories")) {
                notebookInstanceSummary.setAdditionalCodeRepositories(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return notebookInstanceSummary;
    }

    private static NotebookInstanceSummaryJsonUnmarshaller instance;

    public static NotebookInstanceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NotebookInstanceSummaryJsonUnmarshaller();
        return instance;
    }
}
