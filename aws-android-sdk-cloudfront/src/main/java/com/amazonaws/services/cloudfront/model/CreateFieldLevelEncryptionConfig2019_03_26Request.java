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
 * Create a new field-level encryption configuration.
 * </p>
 */
public class CreateFieldLevelEncryptionConfig2019_03_26Request extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The request to create a new field-level encryption configuration.
     * </p>
     */
    private FieldLevelEncryptionConfig fieldLevelEncryptionConfig;

    /**
     * <p>
     * The request to create a new field-level encryption configuration.
     * </p>
     *
     * @return <p>
     *         The request to create a new field-level encryption configuration.
     *         </p>
     */
    public FieldLevelEncryptionConfig getFieldLevelEncryptionConfig() {
        return fieldLevelEncryptionConfig;
    }

    /**
     * <p>
     * The request to create a new field-level encryption configuration.
     * </p>
     *
     * @param fieldLevelEncryptionConfig <p>
     *            The request to create a new field-level encryption
     *            configuration.
     *            </p>
     */
    public void setFieldLevelEncryptionConfig(FieldLevelEncryptionConfig fieldLevelEncryptionConfig) {
        this.fieldLevelEncryptionConfig = fieldLevelEncryptionConfig;
    }

    /**
     * <p>
     * The request to create a new field-level encryption configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldLevelEncryptionConfig <p>
     *            The request to create a new field-level encryption
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFieldLevelEncryptionConfig2019_03_26Request withFieldLevelEncryptionConfig(
            FieldLevelEncryptionConfig fieldLevelEncryptionConfig) {
        this.fieldLevelEncryptionConfig = fieldLevelEncryptionConfig;
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
        if (getFieldLevelEncryptionConfig() != null)
            sb.append("FieldLevelEncryptionConfig: " + getFieldLevelEncryptionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFieldLevelEncryptionConfig() == null) ? 0 : getFieldLevelEncryptionConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFieldLevelEncryptionConfig2019_03_26Request == false)
            return false;
        CreateFieldLevelEncryptionConfig2019_03_26Request other = (CreateFieldLevelEncryptionConfig2019_03_26Request) obj;

        if (other.getFieldLevelEncryptionConfig() == null
                ^ this.getFieldLevelEncryptionConfig() == null)
            return false;
        if (other.getFieldLevelEncryptionConfig() != null
                && other.getFieldLevelEncryptionConfig().equals(
                        this.getFieldLevelEncryptionConfig()) == false)
            return false;
        return true;
    }
}
