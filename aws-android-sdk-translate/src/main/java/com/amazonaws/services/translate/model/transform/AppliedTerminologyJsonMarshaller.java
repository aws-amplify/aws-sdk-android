/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AppliedTerminology
 */
class AppliedTerminologyJsonMarshaller {

    public void marshall(AppliedTerminology appliedTerminology, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (appliedTerminology.getName() != null) {
            String name = appliedTerminology.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (appliedTerminology.getTerms() != null) {
            java.util.List<Term> terms = appliedTerminology.getTerms();
            jsonWriter.name("Terms");
            jsonWriter.beginArray();
            for (Term termsItem : terms) {
                if (termsItem != null) {
                    TermJsonMarshaller.getInstance().marshall(termsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AppliedTerminologyJsonMarshaller instance;

    public static AppliedTerminologyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AppliedTerminologyJsonMarshaller();
        return instance;
    }
}
