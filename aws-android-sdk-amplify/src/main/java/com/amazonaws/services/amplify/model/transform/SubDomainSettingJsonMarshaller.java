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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SubDomainSetting
 */
class SubDomainSettingJsonMarshaller {

    public void marshall(SubDomainSetting subDomainSetting, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (subDomainSetting.getPrefix() != null) {
            String prefix = subDomainSetting.getPrefix();
            jsonWriter.name("prefix");
            jsonWriter.value(prefix);
        }
        if (subDomainSetting.getBranchName() != null) {
            String branchName = subDomainSetting.getBranchName();
            jsonWriter.name("branchName");
            jsonWriter.value(branchName);
        }
        jsonWriter.endObject();
    }

    private static SubDomainSettingJsonMarshaller instance;

    public static SubDomainSettingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SubDomainSettingJsonMarshaller();
        return instance;
    }
}
