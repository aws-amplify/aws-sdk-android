/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model.transform;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TextTranslationJobFilter
 */
class TextTranslationJobFilterJsonMarshaller {

    public void marshall(TextTranslationJobFilter textTranslationJobFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (textTranslationJobFilter.getJobName() != null) {
            String jobName = textTranslationJobFilter.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (textTranslationJobFilter.getJobStatus() != null) {
            String jobStatus = textTranslationJobFilter.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (textTranslationJobFilter.getSubmittedBeforeTime() != null) {
            java.util.Date submittedBeforeTime = textTranslationJobFilter.getSubmittedBeforeTime();
            jsonWriter.name("SubmittedBeforeTime");
            jsonWriter.value(submittedBeforeTime);
        }
        if (textTranslationJobFilter.getSubmittedAfterTime() != null) {
            java.util.Date submittedAfterTime = textTranslationJobFilter.getSubmittedAfterTime();
            jsonWriter.name("SubmittedAfterTime");
            jsonWriter.value(submittedAfterTime);
        }
        jsonWriter.endObject();
    }

    private static TextTranslationJobFilterJsonMarshaller instance;

    public static TextTranslationJobFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TextTranslationJobFilterJsonMarshaller();
        return instance;
    }
}
