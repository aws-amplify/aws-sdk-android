/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;
import java.io.Serializable;

/**
 * @deprecated See {@link com.amazonaws.services.s3.AmazonS3EncryptionClient}
 *             for further details.
 */
@Deprecated
public class KMSEncryptionMaterialsProvider extends StaticEncryptionMaterialsProvider implements Serializable {
    public KMSEncryptionMaterialsProvider(String defaultCustomerMasterKeyId) {
        this(new KMSEncryptionMaterials(defaultCustomerMasterKeyId));
    }

    public KMSEncryptionMaterialsProvider(KMSEncryptionMaterials materials) {
        super(materials);
    }
}
