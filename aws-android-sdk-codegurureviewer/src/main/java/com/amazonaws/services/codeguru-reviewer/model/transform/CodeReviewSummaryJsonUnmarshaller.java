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
package com.amazonaws.services.codeguru-reviewer.model.transform;

import com.amazonaws.services.codeguru-reviewer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO CodeReviewSummary
 */
class CodeReviewSummaryJsonUnmarshaller implements Unmarshaller<CodeReviewSummary, JsonUnmarshallerContext> {

    public CodeReviewSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CodeReviewSummary codeReviewSummary = new CodeReviewSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                codeReviewSummary.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CodeReviewArn")) {
                codeReviewSummary.setCodeReviewArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RepositoryName")) {
                codeReviewSummary.setRepositoryName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Owner")) {
                codeReviewSummary.setOwner(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ProviderType")) {
                codeReviewSummary.setProviderType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("State")) {
                codeReviewSummary.setState(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CreatedTimeStamp")) {
                codeReviewSummary.setCreatedTimeStamp(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastUpdatedTimeStamp")) {
                codeReviewSummary.setLastUpdatedTimeStamp(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Type")) {
                codeReviewSummary.setType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PullRequestId")) {
                codeReviewSummary.setPullRequestId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MetricsSummary")) {
                codeReviewSummary.setMetricsSummary(MetricsSummaryJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return codeReviewSummary;
    }

    private static CodeReviewSummaryJsonUnmarshaller instance;
    public static CodeReviewSummaryJsonUnmarshaller getInstance() {
        if (instance == null) instance = new CodeReviewSummaryJsonUnmarshaller();
        return instance;
    }
}
