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

package com.amazonaws.services.amazoncodegurureviewer.model.transform;

import com.amazonaws.services.amazoncodegurureviewer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CodeReview
 */
class CodeReviewJsonUnmarshaller implements Unmarshaller<CodeReview, JsonUnmarshallerContext> {

    public CodeReview unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CodeReview codeReview = new CodeReview();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                codeReview.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodeReviewArn")) {
                codeReview.setCodeReviewArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RepositoryName")) {
                codeReview.setRepositoryName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Owner")) {
                codeReview.setOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProviderType")) {
                codeReview.setProviderType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                codeReview.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StateReason")) {
                codeReview.setStateReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTimeStamp")) {
                codeReview.setCreatedTimeStamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTimeStamp")) {
                codeReview.setLastUpdatedTimeStamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                codeReview.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PullRequestId")) {
                codeReview.setPullRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceCodeType")) {
                codeReview.setSourceCodeType(SourceCodeTypeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Metrics")) {
                codeReview.setMetrics(MetricsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return codeReview;
    }

    private static CodeReviewJsonUnmarshaller instance;

    public static CodeReviewJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodeReviewJsonUnmarshaller();
        return instance;
    }
}
