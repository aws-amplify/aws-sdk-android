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

public class GetFieldLevelEncryptionProfileConfig2019_03_26Result implements Serializable {
    /**
     * <p>
     * Return the field-level encryption profile configuration information.
     * </p>
     */
    private FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig;

    /**
     * <p>
     * The current version of the field-level encryption profile configuration
     * result. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Return the field-level encryption profile configuration information.
     * </p>
     *
     * @return <p>
     *         Return the field-level encryption profile configuration
     *         information.
     *         </p>
     */
    public FieldLevelEncryptionProfileConfig getFieldLevelEncryptionProfileConfig() {
        return fieldLevelEncryptionProfileConfig;
    }

    /**
     * <p>
     * Return the field-level encryption profile configuration information.
     * </p>
     *
     * @param fieldLevelEncryptionProfileConfig <p>
     *            Return the field-level encryption profile configuration
     *            information.
     *            </p>
     */
    public void setFieldLevelEncryptionProfileConfig(
            FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig) {
        this.fieldLevelEncryptionProfileConfig = fieldLevelEncryptionProfileConfig;
    }

    /**
     * <p>
     * Return the field-level encryption profile configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldLevelEncryptionProfileConfig <p>
     *            Return the field-level encryption profile configuration
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFieldLevelEncryptionProfileConfig2019_03_26Result withFieldLevelEncryptionProfileConfig(
            FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig) {
        this.fieldLevelEncryptionProfileConfig = fieldLevelEncryptionProfileConfig;
        return this;
    }

    /**
     * <p>
     * The current version of the field-level encryption profile configuration
     * result. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @return <p>
     *         The current version of the field-level encryption profile
     *         configuration result. For example: <code>E2QWRUHAPOMQZL</code>.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * The current version of the field-level encryption profile configuration
     * result. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @param eTag <p>
     *            The current version of the field-level encryption profile
     *            configuration result. For example: <code>E2QWRUHAPOMQZL</code>
     *            .
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the field-level encryption profile configuration
     * result. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            The current version of the field-level encryption profile
     *            configuration result. For example: <code>E2QWRUHAPOMQZL</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFieldLevelEncryptionProfileConfig2019_03_26Result withETag(String eTag) {
        this.eTag = eTag;
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
                    + getFieldLevelEncryptionProfileConfig() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag());
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
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFieldLevelEncryptionProfileConfig2019_03_26Result == false)
            return false;
        GetFieldLevelEncryptionProfileConfig2019_03_26Result other = (GetFieldLevelEncryptionProfileConfig2019_03_26Result) obj;

        if (other.getFieldLevelEncryptionProfileConfig() == null
                ^ this.getFieldLevelEncryptionProfileConfig() == null)
            return false;
        if (other.getFieldLevelEncryptionProfileConfig() != null
                && other.getFieldLevelEncryptionProfileConfig().equals(
                        this.getFieldLevelEncryptionProfileConfig()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }
}
