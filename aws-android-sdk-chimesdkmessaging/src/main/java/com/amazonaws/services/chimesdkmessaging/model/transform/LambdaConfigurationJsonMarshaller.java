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
 * JSON marshaller for POJO LambdaConfiguration
 */
class LambdaConfigurationJsonMarshaller {

    public void marshall(LambdaConfiguration lambdaConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lambdaConfiguration.getResourceArn() != null) {
            String resourceArn = lambdaConfiguration.getResourceArn();
            jsonWriter.name("ResourceArn");
            jsonWriter.value(resourceArn);
        }
        if (lambdaConfiguration.getInvocationType() != null) {
            String invocationType = lambdaConfiguration.getInvocationType();
            jsonWriter.name("InvocationType");
            jsonWriter.value(invocationType);
        }
        jsonWriter.endObject();
    }

    private static LambdaConfigurationJsonMarshaller instance;

    public static LambdaConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LambdaConfigurationJsonMarshaller();
        return instance;
    }
}
