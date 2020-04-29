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

package com.amazonaws.services.awscloudmap.model.transform;

import com.amazonaws.services.awscloudmap.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NamespaceProperties
 */
class NamespacePropertiesJsonMarshaller {

    public void marshall(NamespaceProperties namespaceProperties, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (namespaceProperties.getDnsProperties() != null) {
            DnsProperties dnsProperties = namespaceProperties.getDnsProperties();
            jsonWriter.name("DnsProperties");
            DnsPropertiesJsonMarshaller.getInstance().marshall(dnsProperties, jsonWriter);
        }
        if (namespaceProperties.getHttpProperties() != null) {
            HttpProperties httpProperties = namespaceProperties.getHttpProperties();
            jsonWriter.name("HttpProperties");
            HttpPropertiesJsonMarshaller.getInstance().marshall(httpProperties, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static NamespacePropertiesJsonMarshaller instance;

    public static NamespacePropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NamespacePropertiesJsonMarshaller();
        return instance;
    }
}
