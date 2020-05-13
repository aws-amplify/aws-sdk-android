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

package com.amazonaws.services.macie2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * The type of finding. Valid values are:
 * </p>
 */
public enum FindingType {

    SensitiveDataS3ObjectMultiple("SensitiveData:S3Object/Multiple"),
    SensitiveDataS3ObjectFinancial("SensitiveData:S3Object/Financial"),
    SensitiveDataS3ObjectPersonal("SensitiveData:S3Object/Personal"),
    SensitiveDataS3ObjectCredentials("SensitiveData:S3Object/Credentials"),
    SensitiveDataS3ObjectCustomIdentifier("SensitiveData:S3Object/CustomIdentifier"),
    PolicyIAMUserS3BucketPublic("Policy:IAMUser/S3BucketPublic"),
    PolicyIAMUserS3BucketSharedExternally("Policy:IAMUser/S3BucketSharedExternally"),
    PolicyIAMUserS3BucketReplicatedExternally("Policy:IAMUser/S3BucketReplicatedExternally"),
    PolicyIAMUserS3BucketEncryptionDisabled("Policy:IAMUser/S3BucketEncryptionDisabled"),
    PolicyIAMUserS3BlockPublicAccessDisabled("Policy:IAMUser/S3BlockPublicAccessDisabled");

    private String value;

    private FindingType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, FindingType> enumMap;
    static {
        enumMap = new HashMap<String, FindingType>();
        enumMap.put("SensitiveData:S3Object/Multiple", SensitiveDataS3ObjectMultiple);
        enumMap.put("SensitiveData:S3Object/Financial", SensitiveDataS3ObjectFinancial);
        enumMap.put("SensitiveData:S3Object/Personal", SensitiveDataS3ObjectPersonal);
        enumMap.put("SensitiveData:S3Object/Credentials", SensitiveDataS3ObjectCredentials);
        enumMap.put("SensitiveData:S3Object/CustomIdentifier",
                SensitiveDataS3ObjectCustomIdentifier);
        enumMap.put("Policy:IAMUser/S3BucketPublic", PolicyIAMUserS3BucketPublic);
        enumMap.put("Policy:IAMUser/S3BucketSharedExternally",
                PolicyIAMUserS3BucketSharedExternally);
        enumMap.put("Policy:IAMUser/S3BucketReplicatedExternally",
                PolicyIAMUserS3BucketReplicatedExternally);
        enumMap.put("Policy:IAMUser/S3BucketEncryptionDisabled",
                PolicyIAMUserS3BucketEncryptionDisabled);
        enumMap.put("Policy:IAMUser/S3BlockPublicAccessDisabled",
                PolicyIAMUserS3BlockPublicAccessDisabled);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return FindingType corresponding to the value
     */
    public static FindingType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
