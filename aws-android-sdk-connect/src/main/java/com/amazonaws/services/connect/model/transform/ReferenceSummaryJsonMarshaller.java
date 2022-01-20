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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReferenceSummary
 */
class ReferenceSummaryJsonMarshaller {

    public void marshall(ReferenceSummary referenceSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (referenceSummary.getUrl() != null) {
            UrlReference url = referenceSummary.getUrl();
            jsonWriter.name("Url");
            UrlReferenceJsonMarshaller.getInstance().marshall(url, jsonWriter);
        }
        if (referenceSummary.getAttachment() != null) {
            AttachmentReference attachment = referenceSummary.getAttachment();
            jsonWriter.name("Attachment");
            AttachmentReferenceJsonMarshaller.getInstance().marshall(attachment, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReferenceSummaryJsonMarshaller instance;

    public static ReferenceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReferenceSummaryJsonMarshaller();
        return instance;
    }
}
