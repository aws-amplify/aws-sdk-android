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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobScopeTerm
 */
class JobScopeTermJsonMarshaller {

    public void marshall(JobScopeTerm jobScopeTerm, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobScopeTerm.getSimpleScopeTerm() != null) {
            SimpleScopeTerm simpleScopeTerm = jobScopeTerm.getSimpleScopeTerm();
            jsonWriter.name("simpleScopeTerm");
            SimpleScopeTermJsonMarshaller.getInstance().marshall(simpleScopeTerm, jsonWriter);
        }
        if (jobScopeTerm.getTagScopeTerm() != null) {
            TagScopeTerm tagScopeTerm = jobScopeTerm.getTagScopeTerm();
            jsonWriter.name("tagScopeTerm");
            TagScopeTermJsonMarshaller.getInstance().marshall(tagScopeTerm, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static JobScopeTermJsonMarshaller instance;

    public static JobScopeTermJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobScopeTermJsonMarshaller();
        return instance;
    }
}
