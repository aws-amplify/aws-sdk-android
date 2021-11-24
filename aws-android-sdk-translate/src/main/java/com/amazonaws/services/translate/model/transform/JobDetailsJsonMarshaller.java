/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO JobDetails
 */
class JobDetailsJsonMarshaller {

    public void marshall(JobDetails jobDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobDetails.getTranslatedDocumentsCount() != null) {
            Integer translatedDocumentsCount = jobDetails.getTranslatedDocumentsCount();
            jsonWriter.name("TranslatedDocumentsCount");
            jsonWriter.value(translatedDocumentsCount);
        }
        if (jobDetails.getDocumentsWithErrorsCount() != null) {
            Integer documentsWithErrorsCount = jobDetails.getDocumentsWithErrorsCount();
            jsonWriter.name("DocumentsWithErrorsCount");
            jsonWriter.value(documentsWithErrorsCount);
        }
        if (jobDetails.getInputDocumentsCount() != null) {
            Integer inputDocumentsCount = jobDetails.getInputDocumentsCount();
            jsonWriter.name("InputDocumentsCount");
            jsonWriter.value(inputDocumentsCount);
        }
        jsonWriter.endObject();
    }

    private static JobDetailsJsonMarshaller instance;

    public static JobDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobDetailsJsonMarshaller();
        return instance;
    }
}
