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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Create a field-level encryption profile.
 * </p>
 */
public class CreateFieldLevelEncryptionProfile2019_03_26Request extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The request to create a field-level encryption profile.
     * </p>
     */
    private FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig;

    /**
     * <p>
     * The request to create a field-level encryption profile.
     * </p>
     *
     * @return <p>
     *         The request to create a field-level encryption profile.
     *         </p>
     */
    public FieldLevelEncryptionProfileConfig getFieldLevelEncryptionProfileConfig() {
        return fieldLevelEncryptionProfileConfig;
    }

    /**
     * <p>
     * The request to create a field-level encryption profile.
     * </p>
     *
     * @param fieldLevelEncryptionProfileConfig <p>
     *            The request to create a field-level encryption profile.
     *            </p>
     */
    public void setFieldLevelEncryptionProfileConfig(
            FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig) {
        this.fieldLevelEncryptionProfileConfig = fieldLevelEncryptionProfileConfig;
    }

    /**
     * <p>
     * The request to create a field-level encryption profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldLevelEncryptionProfileConfig <p>
     *            The request to create a field-level encryption profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFieldLevelEncryptionProfile2019_03_26Request withFieldLevelEncryptionProfileConfig(
            FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig) {
        this.fieldLevelEncryptionProfileConfig = fieldLevelEncryptionProfileConfig;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFieldLevelEncryptionProfileConfig() != null)
            sb.append("FieldLevelEncryptionProfileConfig: "
                    + getFieldLevelEncryptionProfileConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFieldLevelEncryptionProfileConfig() == null) ? 0
                        : getFieldLevelEncryptionProfileConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFieldLevelEncryptionProfile2019_03_26Request == false)
            return false;
        CreateFieldLevelEncryptionProfile2019_03_26Request other = (CreateFieldLevelEncryptionProfile2019_03_26Request) obj;

        if (other.getFieldLevelEncryptionProfileConfig() == null
                ^ this.getFieldLevelEncryptionProfileConfig() == null)
            return false;
        if (other.getFieldLevelEncryptionProfileConfig() != null
                && other.getFieldLevelEncryptionProfileConfig().equals(
                        this.getFieldLevelEncryptionProfileConfig()) == false)
            return false;
        return true;
    }
}
