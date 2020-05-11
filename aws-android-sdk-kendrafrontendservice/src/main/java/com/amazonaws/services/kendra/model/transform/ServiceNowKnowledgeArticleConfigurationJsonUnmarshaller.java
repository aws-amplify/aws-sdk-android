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
 * JSON unmarshaller for POJO ServiceNowKnowledgeArticleConfiguration
 */
class ServiceNowKnowledgeArticleConfigurationJsonUnmarshaller implements
        Unmarshaller<ServiceNowKnowledgeArticleConfiguration, JsonUnmarshallerContext> {

    public ServiceNowKnowledgeArticleConfiguration unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ServiceNowKnowledgeArticleConfiguration serviceNowKnowledgeArticleConfiguration = new ServiceNowKnowledgeArticleConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CrawlAttachments")) {
                serviceNowKnowledgeArticleConfiguration.setCrawlAttachments(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IncludeAttachmentFilePatterns")) {
                serviceNowKnowledgeArticleConfiguration
                        .setIncludeAttachmentFilePatterns(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ExcludeAttachmentFilePatterns")) {
                serviceNowKnowledgeArticleConfiguration
                        .setExcludeAttachmentFilePatterns(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DocumentDataFieldName")) {
                serviceNowKnowledgeArticleConfiguration
                        .setDocumentDataFieldName(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("DocumentTitleFieldName")) {
                serviceNowKnowledgeArticleConfiguration
                        .setDocumentTitleFieldName(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("FieldMappings")) {
                serviceNowKnowledgeArticleConfiguration
                        .setFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                                DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return serviceNowKnowledgeArticleConfiguration;
    }

    private static ServiceNowKnowledgeArticleConfigurationJsonUnmarshaller instance;

    public static ServiceNowKnowledgeArticleConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceNowKnowledgeArticleConfigurationJsonUnmarshaller();
        return instance;
    }
}
