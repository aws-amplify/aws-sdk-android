/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO OTAUpdateInfo
 */
class OTAUpdateInfoJsonUnmarshaller implements Unmarshaller<OTAUpdateInfo, JsonUnmarshallerContext> {

    public OTAUpdateInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        OTAUpdateInfo oTAUpdateInfo = new OTAUpdateInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("otaUpdateId")) {
                oTAUpdateInfo.setOtaUpdateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("otaUpdateArn")) {
                oTAUpdateInfo.setOtaUpdateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                oTAUpdateInfo.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                oTAUpdateInfo.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                oTAUpdateInfo.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("targets")) {
                oTAUpdateInfo.setTargets(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("awsJobExecutionsRolloutConfig")) {
                oTAUpdateInfo
                        .setAwsJobExecutionsRolloutConfig(AwsJobExecutionsRolloutConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("targetSelection")) {
                oTAUpdateInfo.setTargetSelection(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("otaUpdateFiles")) {
                oTAUpdateInfo.setOtaUpdateFiles(new ListUnmarshaller<OTAUpdateFile>(
                        OTAUpdateFileJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("otaUpdateStatus")) {
                oTAUpdateInfo.setOtaUpdateStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsIotJobId")) {
                oTAUpdateInfo.setAwsIotJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsIotJobArn")) {
                oTAUpdateInfo.setAwsIotJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("errorInfo")) {
                oTAUpdateInfo.setErrorInfo(ErrorInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("additionalParameters")) {
                oTAUpdateInfo.setAdditionalParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return oTAUpdateInfo;
    }

    private static OTAUpdateInfoJsonUnmarshaller instance;

    public static OTAUpdateInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OTAUpdateInfoJsonUnmarshaller();
        return instance;
    }
}
