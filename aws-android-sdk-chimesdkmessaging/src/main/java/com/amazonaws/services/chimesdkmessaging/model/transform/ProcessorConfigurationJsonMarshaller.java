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

package com.amazonaws.services.chimesdkmessaging.model.transform;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProcessorConfiguration
 */
class ProcessorConfigurationJsonMarshaller {

    public void marshall(ProcessorConfiguration processorConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (processorConfiguration.getLambda() != null) {
            LambdaConfiguration lambda = processorConfiguration.getLambda();
            jsonWriter.name("Lambda");
            LambdaConfigurationJsonMarshaller.getInstance().marshall(lambda, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ProcessorConfigurationJsonMarshaller instance;

    public static ProcessorConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessorConfigurationJsonMarshaller();
        return instance;
    }
}
