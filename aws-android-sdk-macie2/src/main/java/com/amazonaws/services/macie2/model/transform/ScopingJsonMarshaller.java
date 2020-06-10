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
 * JSON marshaller for POJO Scoping
 */
class ScopingJsonMarshaller {

    public void marshall(Scoping scoping, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scoping.getExcludes() != null) {
            JobScopingBlock excludes = scoping.getExcludes();
            jsonWriter.name("excludes");
            JobScopingBlockJsonMarshaller.getInstance().marshall(excludes, jsonWriter);
        }
        if (scoping.getIncludes() != null) {
            JobScopingBlock includes = scoping.getIncludes();
            jsonWriter.name("includes");
            JobScopingBlockJsonMarshaller.getInstance().marshall(includes, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ScopingJsonMarshaller instance;

    public static ScopingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScopingJsonMarshaller();
        return instance;
    }
}
