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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UpdateCACertificateParams
 */
class UpdateCACertificateParamsJsonMarshaller {

    public void marshall(UpdateCACertificateParams updateCACertificateParams,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updateCACertificateParams.getAction() != null) {
            String action = updateCACertificateParams.getAction();
            jsonWriter.name("action");
            jsonWriter.value(action);
        }
        jsonWriter.endObject();
    }

    private static UpdateCACertificateParamsJsonMarshaller instance;

    public static UpdateCACertificateParamsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateCACertificateParamsJsonMarshaller();
        return instance;
    }
}
