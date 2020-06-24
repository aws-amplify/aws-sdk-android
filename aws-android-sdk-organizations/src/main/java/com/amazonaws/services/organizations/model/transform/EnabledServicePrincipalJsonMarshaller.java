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

package com.amazonaws.services.organizations.model.transform;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EnabledServicePrincipal
 */
class EnabledServicePrincipalJsonMarshaller {

    public void marshall(EnabledServicePrincipal enabledServicePrincipal, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (enabledServicePrincipal.getServicePrincipal() != null) {
            String servicePrincipal = enabledServicePrincipal.getServicePrincipal();
            jsonWriter.name("ServicePrincipal");
            jsonWriter.value(servicePrincipal);
        }
        if (enabledServicePrincipal.getDateEnabled() != null) {
            java.util.Date dateEnabled = enabledServicePrincipal.getDateEnabled();
            jsonWriter.name("DateEnabled");
            jsonWriter.value(dateEnabled);
        }
        jsonWriter.endObject();
    }

    private static EnabledServicePrincipalJsonMarshaller instance;

    public static EnabledServicePrincipalJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EnabledServicePrincipalJsonMarshaller();
        return instance;
    }
}
