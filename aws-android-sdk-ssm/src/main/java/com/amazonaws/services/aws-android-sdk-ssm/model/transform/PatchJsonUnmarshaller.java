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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO Patch
 */
class PatchJsonUnmarshaller implements Unmarshaller<Patch, JsonUnmarshallerContext> {

    public Patch unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Patch patch = new Patch();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                patch.setId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ReleaseDate")) {
                patch.setReleaseDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Title")) {
                patch.setTitle(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Description")) {
                patch.setDescription(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ContentUrl")) {
                patch.setContentUrl(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Vendor")) {
                patch.setVendor(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ProductFamily")) {
                patch.setProductFamily(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Product")) {
                patch.setProduct(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Classification")) {
                patch.setClassification(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MsrcSeverity")) {
                patch.setMsrcSeverity(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("KbNumber")) {
                patch.setKbNumber(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MsrcNumber")) {
                patch.setMsrcNumber(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Language")) {
                patch.setLanguage(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return patch;
    }

    private static PatchJsonUnmarshaller instance;
    public static PatchJsonUnmarshaller getInstance() {
        if (instance == null) instance = new PatchJsonUnmarshaller();
        return instance;
    }
}
