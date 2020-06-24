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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KerberosAttributes
 */
class KerberosAttributesJsonMarshaller {

    public void marshall(KerberosAttributes kerberosAttributes, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (kerberosAttributes.getRealm() != null) {
            String realm = kerberosAttributes.getRealm();
            jsonWriter.name("Realm");
            jsonWriter.value(realm);
        }
        if (kerberosAttributes.getKdcAdminPassword() != null) {
            String kdcAdminPassword = kerberosAttributes.getKdcAdminPassword();
            jsonWriter.name("KdcAdminPassword");
            jsonWriter.value(kdcAdminPassword);
        }
        if (kerberosAttributes.getCrossRealmTrustPrincipalPassword() != null) {
            String crossRealmTrustPrincipalPassword = kerberosAttributes
                    .getCrossRealmTrustPrincipalPassword();
            jsonWriter.name("CrossRealmTrustPrincipalPassword");
            jsonWriter.value(crossRealmTrustPrincipalPassword);
        }
        if (kerberosAttributes.getADDomainJoinUser() != null) {
            String aDDomainJoinUser = kerberosAttributes.getADDomainJoinUser();
            jsonWriter.name("ADDomainJoinUser");
            jsonWriter.value(aDDomainJoinUser);
        }
        if (kerberosAttributes.getADDomainJoinPassword() != null) {
            String aDDomainJoinPassword = kerberosAttributes.getADDomainJoinPassword();
            jsonWriter.name("ADDomainJoinPassword");
            jsonWriter.value(aDDomainJoinPassword);
        }
        jsonWriter.endObject();
    }

    private static KerberosAttributesJsonMarshaller instance;

    public static KerberosAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KerberosAttributesJsonMarshaller();
        return instance;
    }
}
