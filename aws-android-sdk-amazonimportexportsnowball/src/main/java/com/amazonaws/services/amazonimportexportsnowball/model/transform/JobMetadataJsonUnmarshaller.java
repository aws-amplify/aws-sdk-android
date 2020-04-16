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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JobMetadata
 */
class JobMetadataJsonUnmarshaller implements Unmarshaller<JobMetadata, JsonUnmarshallerContext> {

    public JobMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobMetadata jobMetadata = new JobMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                jobMetadata.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobState")) {
                jobMetadata.setJobState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobType")) {
                jobMetadata.setJobType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnowballType")) {
                jobMetadata.setSnowballType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                jobMetadata.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Resources")) {
                jobMetadata.setResources(JobResourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                jobMetadata.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyARN")) {
                jobMetadata.setKmsKeyARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleARN")) {
                jobMetadata.setRoleARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AddressId")) {
                jobMetadata.setAddressId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShippingDetails")) {
                jobMetadata.setShippingDetails(ShippingDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnowballCapacityPreference")) {
                jobMetadata.setSnowballCapacityPreference(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Notification")) {
                jobMetadata.setNotification(NotificationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataTransferProgress")) {
                jobMetadata.setDataTransferProgress(DataTransferJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobLogInfo")) {
                jobMetadata.setJobLogInfo(JobLogsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClusterId")) {
                jobMetadata.setClusterId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ForwardingAddressId")) {
                jobMetadata.setForwardingAddressId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaxDocuments")) {
                jobMetadata.setTaxDocuments(TaxDocumentsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobMetadata;
    }

    private static JobMetadataJsonUnmarshaller instance;

    public static JobMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobMetadataJsonUnmarshaller();
        return instance;
    }
}
