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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LoadBalancerInfo
 */
class LoadBalancerInfoJsonMarshaller {

    public void marshall(LoadBalancerInfo loadBalancerInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (loadBalancerInfo.getElbInfoList() != null) {
            java.util.List<ELBInfo> elbInfoList = loadBalancerInfo.getElbInfoList();
            jsonWriter.name("elbInfoList");
            jsonWriter.beginArray();
            for (ELBInfo elbInfoListItem : elbInfoList) {
                if (elbInfoListItem != null) {
                    ELBInfoJsonMarshaller.getInstance().marshall(elbInfoListItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (loadBalancerInfo.getTargetGroupInfoList() != null) {
            java.util.List<TargetGroupInfo> targetGroupInfoList = loadBalancerInfo
                    .getTargetGroupInfoList();
            jsonWriter.name("targetGroupInfoList");
            jsonWriter.beginArray();
            for (TargetGroupInfo targetGroupInfoListItem : targetGroupInfoList) {
                if (targetGroupInfoListItem != null) {
                    TargetGroupInfoJsonMarshaller.getInstance().marshall(targetGroupInfoListItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (loadBalancerInfo.getTargetGroupPairInfoList() != null) {
            java.util.List<TargetGroupPairInfo> targetGroupPairInfoList = loadBalancerInfo
                    .getTargetGroupPairInfoList();
            jsonWriter.name("targetGroupPairInfoList");
            jsonWriter.beginArray();
            for (TargetGroupPairInfo targetGroupPairInfoListItem : targetGroupPairInfoList) {
                if (targetGroupPairInfoListItem != null) {
                    TargetGroupPairInfoJsonMarshaller.getInstance().marshall(
                            targetGroupPairInfoListItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LoadBalancerInfoJsonMarshaller instance;

    public static LoadBalancerInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerInfoJsonMarshaller();
        return instance;
    }
}
