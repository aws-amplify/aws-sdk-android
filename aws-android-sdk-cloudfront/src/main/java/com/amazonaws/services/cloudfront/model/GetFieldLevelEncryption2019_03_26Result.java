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

public class GetFieldLevelEncryption2019_03_26Result implements Serializable {
    /**
     * <p>
     * Return the field-level encryption configuration information.
     * </p>
     */
    private FieldLevelEncryption fieldLevelEncryption;

    /**
     * <p>
     * The current version of the field level encryption configuration. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Return the field-level encryption configuration information.
     * </p>
     *
     * @return <p>
     *         Return the field-level encryption configuration information.
     *         </p>
     */
    public FieldLevelEncryption getFieldLevelEncryption() {
        return fieldLevelEncryption;
    }

    /**
     * <p>
     * Return the field-level encryption configuration information.
     * </p>
     *
     * @param fieldLevelEncryption <p>
     *            Return the field-level encryption configuration information.
     *            </p>
     */
    public void setFieldLevelEncryption(FieldLevelEncryption fieldLevelEncryption) {
        this.fieldLevelEncryption = fieldLevelEncryption;
    }

    /**
     * <p>
     * Return the field-level encryption configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldLevelEncryption <p>
     *            Return the field-level encryption configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFieldLevelEncryption2019_03_26Result withFieldLevelEncryption(
            FieldLevelEncryption fieldLevelEncryption) {
        this.fieldLevelEncryption = fieldLevelEncryption;
        return this;
    }

    /**
     * <p>
     * The current version of the field level encryption configuration. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @return <p>
     *         The current version of the field level encryption configuration.
     *         For example: <code>E2QWRUHAPOMQZL</code>.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * The current version of the field level encryption configuration. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @param eTag <p>
     *            The current version of the field level encryption
     *            configuration. For example: <code>E2QWRUHAPOMQZL</code>.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the field level encryption configuration. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            The current version of the field level encryption
     *            configuration. For example: <code>E2QWRUHAPOMQZL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFieldLevelEncryption2019_03_26Result withETag(String eTag) {
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
        if (getFieldLevelEncryption() != null)
            sb.append("FieldLevelEncryption: " + getFieldLevelEncryption() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFieldLevelEncryption() == null) ? 0 : getFieldLevelEncryption().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFieldLevelEncryption2019_03_26Result == false)
            return false;
        GetFieldLevelEncryption2019_03_26Result other = (GetFieldLevelEncryption2019_03_26Result) obj;

        if (other.getFieldLevelEncryption() == null ^ this.getFieldLevelEncryption() == null)
            return false;
        if (other.getFieldLevelEncryption() != null
                && other.getFieldLevelEncryption().equals(this.getFieldLevelEncryption()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }
}
