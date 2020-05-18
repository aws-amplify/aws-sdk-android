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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Finding
 */
class FindingJsonUnmarshaller implements Unmarshaller<Finding, JsonUnmarshallerContext> {

    public Finding unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Finding finding = new Finding();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("accountId")) {
                finding.setAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("archived")) {
                finding.setArchived(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("category")) {
                finding.setCategory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("classificationDetails")) {
                finding.setClassificationDetails(ClassificationDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("count")) {
                finding.setCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                finding.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                finding.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("id")) {
                finding.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("partition")) {
                finding.setPartition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("policyDetails")) {
                finding.setPolicyDetails(PolicyDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                finding.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourcesAffected")) {
                finding.setResourcesAffected(ResourcesAffectedJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sample")) {
                finding.setSample(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("schemaVersion")) {
                finding.setSchemaVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("severity")) {
                finding.setSeverity(SeverityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("title")) {
                finding.setTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("type")) {
                finding.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("updatedAt")) {
                finding.setUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return finding;
    }

    private static FindingJsonUnmarshaller instance;

    public static FindingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FindingJsonUnmarshaller();
        return instance;
    }
}
