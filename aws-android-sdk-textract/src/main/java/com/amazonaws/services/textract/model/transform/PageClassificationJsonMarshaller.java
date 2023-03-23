/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PageClassification
 */
class PageClassificationJsonMarshaller {

    public void marshall(PageClassification pageClassification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (pageClassification.getPageType() != null) {
            java.util.List<Prediction> pageType = pageClassification.getPageType();
            jsonWriter.name("PageType");
            jsonWriter.beginArray();
            for (Prediction pageTypeItem : pageType) {
                if (pageTypeItem != null) {
                    PredictionJsonMarshaller.getInstance().marshall(pageTypeItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (pageClassification.getPageNumber() != null) {
            java.util.List<Prediction> pageNumber = pageClassification.getPageNumber();
            jsonWriter.name("PageNumber");
            jsonWriter.beginArray();
            for (Prediction pageNumberItem : pageNumber) {
                if (pageNumberItem != null) {
                    PredictionJsonMarshaller.getInstance().marshall(pageNumberItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static PageClassificationJsonMarshaller instance;

    public static PageClassificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PageClassificationJsonMarshaller();
        return instance;
    }
}
