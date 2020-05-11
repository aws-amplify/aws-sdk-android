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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SalesforceConfiguration
 */
class SalesforceConfigurationJsonUnmarshaller implements
        Unmarshaller<SalesforceConfiguration, JsonUnmarshallerContext> {

    public SalesforceConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SalesforceConfiguration salesforceConfiguration = new SalesforceConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ServerUrl")) {
                salesforceConfiguration.setServerUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecretArn")) {
                salesforceConfiguration.setSecretArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StandardObjectConfigurations")) {
                salesforceConfiguration
                        .setStandardObjectConfigurations(new ListUnmarshaller<SalesforceStandardObjectConfiguration>(
                                SalesforceStandardObjectConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("KnowledgeArticleConfiguration")) {
                salesforceConfiguration
                        .setKnowledgeArticleConfiguration(SalesforceKnowledgeArticleConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ChatterFeedConfiguration")) {
                salesforceConfiguration
                        .setChatterFeedConfiguration(SalesforceChatterFeedConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CrawlAttachments")) {
                salesforceConfiguration.setCrawlAttachments(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StandardObjectAttachmentConfiguration")) {
                salesforceConfiguration
                        .setStandardObjectAttachmentConfiguration(SalesforceStandardObjectAttachmentConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("IncludeAttachmentFilePatterns")) {
                salesforceConfiguration
                        .setIncludeAttachmentFilePatterns(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ExcludeAttachmentFilePatterns")) {
                salesforceConfiguration
                        .setExcludeAttachmentFilePatterns(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return salesforceConfiguration;
    }

    private static SalesforceConfigurationJsonUnmarshaller instance;

    public static SalesforceConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SalesforceConfigurationJsonUnmarshaller();
        return instance;
    }
}
