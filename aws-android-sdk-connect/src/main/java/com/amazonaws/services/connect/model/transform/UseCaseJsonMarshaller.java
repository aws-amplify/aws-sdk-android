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
 * JSON marshaller for POJO UseCase
 */
class UseCaseJsonMarshaller {

    public void marshall(UseCase useCase, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (useCase.getUseCaseId() != null) {
            String useCaseId = useCase.getUseCaseId();
            jsonWriter.name("UseCaseId");
            jsonWriter.value(useCaseId);
        }
        if (useCase.getUseCaseArn() != null) {
            String useCaseArn = useCase.getUseCaseArn();
            jsonWriter.name("UseCaseArn");
            jsonWriter.value(useCaseArn);
        }
        if (useCase.getUseCaseType() != null) {
            String useCaseType = useCase.getUseCaseType();
            jsonWriter.name("UseCaseType");
            jsonWriter.value(useCaseType);
        }
        jsonWriter.endObject();
    }

    private static UseCaseJsonMarshaller instance;

    public static UseCaseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UseCaseJsonMarshaller();
        return instance;
    }
}
