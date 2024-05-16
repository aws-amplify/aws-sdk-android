/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RealTimeContactAnalysisSegmentIssues
 */
class RealTimeContactAnalysisSegmentIssuesJsonMarshaller {

    public void marshall(RealTimeContactAnalysisSegmentIssues realTimeContactAnalysisSegmentIssues,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (realTimeContactAnalysisSegmentIssues.getIssuesDetected() != null) {
            java.util.List<RealTimeContactAnalysisIssueDetected> issuesDetected = realTimeContactAnalysisSegmentIssues
                    .getIssuesDetected();
            jsonWriter.name("IssuesDetected");
            jsonWriter.beginArray();
            for (RealTimeContactAnalysisIssueDetected issuesDetectedItem : issuesDetected) {
                if (issuesDetectedItem != null) {
                    RealTimeContactAnalysisIssueDetectedJsonMarshaller.getInstance().marshall(
                            issuesDetectedItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RealTimeContactAnalysisSegmentIssuesJsonMarshaller instance;

    public static RealTimeContactAnalysisSegmentIssuesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisSegmentIssuesJsonMarshaller();
        return instance;
    }
}
