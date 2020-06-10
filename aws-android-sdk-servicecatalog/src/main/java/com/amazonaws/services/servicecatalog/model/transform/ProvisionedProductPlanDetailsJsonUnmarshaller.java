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
 * JSON unmarshaller for POJO ProvisionedProductPlanDetails
 */
class ProvisionedProductPlanDetailsJsonUnmarshaller implements
        Unmarshaller<ProvisionedProductPlanDetails, JsonUnmarshallerContext> {

    public ProvisionedProductPlanDetails unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProvisionedProductPlanDetails provisionedProductPlanDetails = new ProvisionedProductPlanDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreatedTime")) {
                provisionedProductPlanDetails.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PathId")) {
                provisionedProductPlanDetails.setPathId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductId")) {
                provisionedProductPlanDetails.setProductId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PlanName")) {
                provisionedProductPlanDetails.setPlanName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PlanId")) {
                provisionedProductPlanDetails.setPlanId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisionProductId")) {
                provisionedProductPlanDetails.setProvisionProductId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisionProductName")) {
                provisionedProductPlanDetails.setProvisionProductName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PlanType")) {
                provisionedProductPlanDetails.setPlanType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisioningArtifactId")) {
                provisionedProductPlanDetails.setProvisioningArtifactId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                provisionedProductPlanDetails.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdatedTime")) {
                provisionedProductPlanDetails.setUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotificationArns")) {
                provisionedProductPlanDetails.setNotificationArns(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProvisioningParameters")) {
                provisionedProductPlanDetails
                        .setProvisioningParameters(new ListUnmarshaller<UpdateProvisioningParameter>(
                                UpdateProvisioningParameterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                provisionedProductPlanDetails.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                provisionedProductPlanDetails.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return provisionedProductPlanDetails;
    }

    private static ProvisionedProductPlanDetailsJsonUnmarshaller instance;

    public static ProvisionedProductPlanDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedProductPlanDetailsJsonUnmarshaller();
        return instance;
    }
}
