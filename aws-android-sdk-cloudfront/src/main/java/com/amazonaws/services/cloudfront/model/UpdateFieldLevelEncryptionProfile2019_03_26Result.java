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

public class UpdateFieldLevelEncryptionProfile2019_03_26Result implements Serializable {
    /**
     * <p>
     * Return the results of updating the profile.
     * </p>
     */
    private FieldLevelEncryptionProfile fieldLevelEncryptionProfile;

    /**
     * <p>
     * The result of the field-level encryption profile request.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Return the results of updating the profile.
     * </p>
     *
     * @return <p>
     *         Return the results of updating the profile.
     *         </p>
     */
    public FieldLevelEncryptionProfile getFieldLevelEncryptionProfile() {
        return fieldLevelEncryptionProfile;
    }

    /**
     * <p>
     * Return the results of updating the profile.
     * </p>
     *
     * @param fieldLevelEncryptionProfile <p>
     *            Return the results of updating the profile.
     *            </p>
     */
    public void setFieldLevelEncryptionProfile(
            FieldLevelEncryptionProfile fieldLevelEncryptionProfile) {
        this.fieldLevelEncryptionProfile = fieldLevelEncryptionProfile;
    }

    /**
     * <p>
     * Return the results of updating the profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldLevelEncryptionProfile <p>
     *            Return the results of updating the profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFieldLevelEncryptionProfile2019_03_26Result withFieldLevelEncryptionProfile(
            FieldLevelEncryptionProfile fieldLevelEncryptionProfile) {
        this.fieldLevelEncryptionProfile = fieldLevelEncryptionProfile;
        return this;
    }

    /**
     * <p>
     * The result of the field-level encryption profile request.
     * </p>
     *
     * @return <p>
     *         The result of the field-level encryption profile request.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * The result of the field-level encryption profile request.
     * </p>
     *
     * @param eTag <p>
     *            The result of the field-level encryption profile request.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The result of the field-level encryption profile request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            The result of the field-level encryption profile request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFieldLevelEncryptionProfile2019_03_26Result withETag(String eTag) {
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
        if (getFieldLevelEncryptionProfile() != null)
            sb.append("FieldLevelEncryptionProfile: " + getFieldLevelEncryptionProfile() + ",");
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
                + ((getFieldLevelEncryptionProfile() == null) ? 0
                        : getFieldLevelEncryptionProfile().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFieldLevelEncryptionProfile2019_03_26Result == false)
            return false;
        UpdateFieldLevelEncryptionProfile2019_03_26Result other = (UpdateFieldLevelEncryptionProfile2019_03_26Result) obj;

        if (other.getFieldLevelEncryptionProfile() == null
                ^ this.getFieldLevelEncryptionProfile() == null)
            return false;
        if (other.getFieldLevelEncryptionProfile() != null
                && other.getFieldLevelEncryptionProfile().equals(
                        this.getFieldLevelEncryptionProfile()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }
}
