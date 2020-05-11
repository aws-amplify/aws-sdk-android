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
 * JSON unmarshaller for POJO SharePointConfiguration
 */
class SharePointConfigurationJsonUnmarshaller implements
        Unmarshaller<SharePointConfiguration, JsonUnmarshallerContext> {

    public SharePointConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SharePointConfiguration sharePointConfiguration = new SharePointConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SharePointVersion")) {
                sharePointConfiguration.setSharePointVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Urls")) {
                sharePointConfiguration.setUrls(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SecretArn")) {
                sharePointConfiguration.setSecretArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CrawlAttachments")) {
                sharePointConfiguration.setCrawlAttachments(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UseChangeLog")) {
                sharePointConfiguration.setUseChangeLog(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InclusionPatterns")) {
                sharePointConfiguration.setInclusionPatterns(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ExclusionPatterns")) {
                sharePointConfiguration.setExclusionPatterns(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VpcConfiguration")) {
                sharePointConfiguration
                        .setVpcConfiguration(DataSourceVpcConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("FieldMappings")) {
                sharePointConfiguration
                        .setFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                                DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DocumentTitleFieldName")) {
                sharePointConfiguration.setDocumentTitleFieldName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return sharePointConfiguration;
    }

    private static SharePointConfigurationJsonUnmarshaller instance;

    public static SharePointConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SharePointConfigurationJsonUnmarshaller();
        return instance;
    }
}
