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

public class ListFieldLevelEncryptionConfigs2019_03_26Result implements Serializable {
    /**
     * <p>
     * Returns a list of all field-level encryption configurations that have
     * been created in CloudFront for this account.
     * </p>
     */
    private FieldLevelEncryptionList fieldLevelEncryptionList;

    /**
     * <p>
     * Returns a list of all field-level encryption configurations that have
     * been created in CloudFront for this account.
     * </p>
     *
     * @return <p>
     *         Returns a list of all field-level encryption configurations that
     *         have been created in CloudFront for this account.
     *         </p>
     */
    public FieldLevelEncryptionList getFieldLevelEncryptionList() {
        return fieldLevelEncryptionList;
    }

    /**
     * <p>
     * Returns a list of all field-level encryption configurations that have
     * been created in CloudFront for this account.
     * </p>
     *
     * @param fieldLevelEncryptionList <p>
     *            Returns a list of all field-level encryption configurations
     *            that have been created in CloudFront for this account.
     *            </p>
     */
    public void setFieldLevelEncryptionList(FieldLevelEncryptionList fieldLevelEncryptionList) {
        this.fieldLevelEncryptionList = fieldLevelEncryptionList;
    }

    /**
     * <p>
     * Returns a list of all field-level encryption configurations that have
     * been created in CloudFront for this account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldLevelEncryptionList <p>
     *            Returns a list of all field-level encryption configurations
     *            that have been created in CloudFront for this account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFieldLevelEncryptionConfigs2019_03_26Result withFieldLevelEncryptionList(
            FieldLevelEncryptionList fieldLevelEncryptionList) {
        this.fieldLevelEncryptionList = fieldLevelEncryptionList;
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
        if (getFieldLevelEncryptionList() != null)
            sb.append("FieldLevelEncryptionList: " + getFieldLevelEncryptionList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFieldLevelEncryptionList() == null) ? 0 : getFieldLevelEncryptionList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFieldLevelEncryptionConfigs2019_03_26Result == false)
            return false;
        ListFieldLevelEncryptionConfigs2019_03_26Result other = (ListFieldLevelEncryptionConfigs2019_03_26Result) obj;

        if (other.getFieldLevelEncryptionList() == null
                ^ this.getFieldLevelEncryptionList() == null)
            return false;
        if (other.getFieldLevelEncryptionList() != null
                && other.getFieldLevelEncryptionList().equals(this.getFieldLevelEncryptionList()) == false)
            return false;
        return true;
    }
}
