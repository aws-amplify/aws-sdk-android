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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SourceFileSpecifier
 */
class SourceFileSpecifierJsonMarshaller {

    public void marshall(SourceFileSpecifier sourceFileSpecifier, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sourceFileSpecifier.getFilePath() != null) {
            String filePath = sourceFileSpecifier.getFilePath();
            jsonWriter.name("filePath");
            jsonWriter.value(filePath);
        }
        if (sourceFileSpecifier.getIsMove() != null) {
            Boolean isMove = sourceFileSpecifier.getIsMove();
            jsonWriter.name("isMove");
            jsonWriter.value(isMove);
        }
        jsonWriter.endObject();
    }

    private static SourceFileSpecifierJsonMarshaller instance;

    public static SourceFileSpecifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SourceFileSpecifierJsonMarshaller();
        return instance;
    }
}
