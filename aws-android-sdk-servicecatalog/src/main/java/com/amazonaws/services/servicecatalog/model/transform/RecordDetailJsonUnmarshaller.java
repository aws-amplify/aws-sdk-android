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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RecordDetail
 */
class RecordDetailJsonUnmarshaller implements Unmarshaller<RecordDetail, JsonUnmarshallerContext> {

    public RecordDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RecordDetail recordDetail = new RecordDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RecordId")) {
                recordDetail.setRecordId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisionedProductName")) {
                recordDetail.setProvisionedProductName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                recordDetail.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                recordDetail.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdatedTime")) {
                recordDetail.setUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisionedProductType")) {
                recordDetail.setProvisionedProductType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecordType")) {
                recordDetail.setRecordType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisionedProductId")) {
                recordDetail.setProvisionedProductId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductId")) {
                recordDetail.setProductId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisioningArtifactId")) {
                recordDetail.setProvisioningArtifactId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PathId")) {
                recordDetail.setPathId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecordErrors")) {
                recordDetail.setRecordErrors(new ListUnmarshaller<RecordError>(
                        RecordErrorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RecordTags")) {
                recordDetail.setRecordTags(new ListUnmarshaller<RecordTag>(
                        RecordTagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return recordDetail;
    }

    private static RecordDetailJsonUnmarshaller instance;

    public static RecordDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecordDetailJsonUnmarshaller();
        return instance;
    }
}
