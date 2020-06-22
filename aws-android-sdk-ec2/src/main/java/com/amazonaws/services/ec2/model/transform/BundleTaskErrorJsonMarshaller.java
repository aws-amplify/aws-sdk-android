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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BundleTaskError
 */
class BundleTaskErrorJsonMarshaller {

    public void marshall(BundleTaskError bundleTaskError, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (bundleTaskError.getCode() != null) {
            String code = bundleTaskError.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        if (bundleTaskError.getMessage() != null) {
            String message = bundleTaskError.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static BundleTaskErrorJsonMarshaller instance;

    public static BundleTaskErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BundleTaskErrorJsonMarshaller();
        return instance;
    }
}
