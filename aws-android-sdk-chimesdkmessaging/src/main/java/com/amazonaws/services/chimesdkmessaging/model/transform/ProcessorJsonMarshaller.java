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
 * JSON marshaller for POJO Processor
 */
class ProcessorJsonMarshaller {

    public void marshall(Processor processor, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (processor.getName() != null) {
            String name = processor.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (processor.getConfiguration() != null) {
            ProcessorConfiguration configuration = processor.getConfiguration();
            jsonWriter.name("Configuration");
            ProcessorConfigurationJsonMarshaller.getInstance().marshall(configuration, jsonWriter);
        }
        if (processor.getExecutionOrder() != null) {
            Integer executionOrder = processor.getExecutionOrder();
            jsonWriter.name("ExecutionOrder");
            jsonWriter.value(executionOrder);
        }
        if (processor.getFallbackAction() != null) {
            String fallbackAction = processor.getFallbackAction();
            jsonWriter.name("FallbackAction");
            jsonWriter.value(fallbackAction);
        }
        jsonWriter.endObject();
    }

    private static ProcessorJsonMarshaller instance;

    public static ProcessorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessorJsonMarshaller();
        return instance;
    }
}
