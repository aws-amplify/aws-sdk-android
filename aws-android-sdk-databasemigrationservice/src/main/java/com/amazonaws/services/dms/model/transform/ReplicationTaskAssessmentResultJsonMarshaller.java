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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReplicationTaskAssessmentResult
 */
class ReplicationTaskAssessmentResultJsonMarshaller {

    public void marshall(ReplicationTaskAssessmentResult replicationTaskAssessmentResult,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (replicationTaskAssessmentResult.getReplicationTaskIdentifier() != null) {
            String replicationTaskIdentifier = replicationTaskAssessmentResult
                    .getReplicationTaskIdentifier();
            jsonWriter.name("ReplicationTaskIdentifier");
            jsonWriter.value(replicationTaskIdentifier);
        }
        if (replicationTaskAssessmentResult.getReplicationTaskArn() != null) {
            String replicationTaskArn = replicationTaskAssessmentResult.getReplicationTaskArn();
            jsonWriter.name("ReplicationTaskArn");
            jsonWriter.value(replicationTaskArn);
        }
        if (replicationTaskAssessmentResult.getReplicationTaskLastAssessmentDate() != null) {
            java.util.Date replicationTaskLastAssessmentDate = replicationTaskAssessmentResult
                    .getReplicationTaskLastAssessmentDate();
            jsonWriter.name("ReplicationTaskLastAssessmentDate");
            jsonWriter.value(replicationTaskLastAssessmentDate);
        }
        if (replicationTaskAssessmentResult.getAssessmentStatus() != null) {
            String assessmentStatus = replicationTaskAssessmentResult.getAssessmentStatus();
            jsonWriter.name("AssessmentStatus");
            jsonWriter.value(assessmentStatus);
        }
        if (replicationTaskAssessmentResult.getAssessmentResultsFile() != null) {
            String assessmentResultsFile = replicationTaskAssessmentResult
                    .getAssessmentResultsFile();
            jsonWriter.name("AssessmentResultsFile");
            jsonWriter.value(assessmentResultsFile);
        }
        if (replicationTaskAssessmentResult.getAssessmentResults() != null) {
            String assessmentResults = replicationTaskAssessmentResult.getAssessmentResults();
            jsonWriter.name("AssessmentResults");
            jsonWriter.value(assessmentResults);
        }
        if (replicationTaskAssessmentResult.getS3ObjectUrl() != null) {
            String s3ObjectUrl = replicationTaskAssessmentResult.getS3ObjectUrl();
            jsonWriter.name("S3ObjectUrl");
            jsonWriter.value(s3ObjectUrl);
        }
        jsonWriter.endObject();
    }

    private static ReplicationTaskAssessmentResultJsonMarshaller instance;

    public static ReplicationTaskAssessmentResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskAssessmentResultJsonMarshaller();
        return instance;
    }
}
