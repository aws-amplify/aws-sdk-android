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

package com.amazonaws.services.amazonec2containerregistry.model.transform;

import com.amazonaws.services.amazonec2containerregistry.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ImageScanFindings
 */
class ImageScanFindingsJsonUnmarshaller implements
        Unmarshaller<ImageScanFindings, JsonUnmarshallerContext> {

    public ImageScanFindings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImageScanFindings imageScanFindings = new ImageScanFindings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("imageScanCompletedAt")) {
                imageScanFindings.setImageScanCompletedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("vulnerabilitySourceUpdatedAt")) {
                imageScanFindings.setVulnerabilitySourceUpdatedAt(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("findings")) {
                imageScanFindings.setFindings(new ListUnmarshaller<ImageScanFinding>(
                        ImageScanFindingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("findingSeverityCounts")) {
                imageScanFindings.setFindingSeverityCounts(new MapUnmarshaller<Integer>(
                        IntegerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return imageScanFindings;
    }

    private static ImageScanFindingsJsonUnmarshaller instance;

    public static ImageScanFindingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageScanFindingsJsonUnmarshaller();
        return instance;
    }
}
