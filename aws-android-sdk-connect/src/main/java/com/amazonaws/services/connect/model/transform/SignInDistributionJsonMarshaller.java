/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO SignInDistribution
 */
class SignInDistributionJsonMarshaller {

    public void marshall(SignInDistribution signInDistribution, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (signInDistribution.getRegion() != null) {
            String region = signInDistribution.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (signInDistribution.getEnabled() != null) {
            Boolean enabled = signInDistribution.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        jsonWriter.endObject();
    }

    private static SignInDistributionJsonMarshaller instance;

    public static SignInDistributionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SignInDistributionJsonMarshaller();
        return instance;
    }
}
