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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Settings associated with S3 destination
 */
public class S3DestinationSettings implements Serializable {
    /**
     * Optional. Have MediaConvert automatically apply Amazon S3 access control
     * for the outputs in this output group. When you don't use this setting, S3
     * automatically applies the default access control list PRIVATE.
     */
    private S3DestinationAccessControl accessControl;

    /**
     * Settings for how your job outputs are encrypted as they are uploaded to
     * Amazon S3.
     */
    private S3EncryptionSettings encryption;

    /**
     * Optional. Have MediaConvert automatically apply Amazon S3 access control
     * for the outputs in this output group. When you don't use this setting, S3
     * automatically applies the default access control list PRIVATE.
     *
     * @return Optional. Have MediaConvert automatically apply Amazon S3 access
     *         control for the outputs in this output group. When you don't use
     *         this setting, S3 automatically applies the default access control
     *         list PRIVATE.
     */
    public S3DestinationAccessControl getAccessControl() {
        return accessControl;
    }

    /**
     * Optional. Have MediaConvert automatically apply Amazon S3 access control
     * for the outputs in this output group. When you don't use this setting, S3
     * automatically applies the default access control list PRIVATE.
     *
     * @param accessControl Optional. Have MediaConvert automatically apply
     *            Amazon S3 access control for the outputs in this output group.
     *            When you don't use this setting, S3 automatically applies the
     *            default access control list PRIVATE.
     */
    public void setAccessControl(S3DestinationAccessControl accessControl) {
        this.accessControl = accessControl;
    }

    /**
     * Optional. Have MediaConvert automatically apply Amazon S3 access control
     * for the outputs in this output group. When you don't use this setting, S3
     * automatically applies the default access control list PRIVATE.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessControl Optional. Have MediaConvert automatically apply
     *            Amazon S3 access control for the outputs in this output group.
     *            When you don't use this setting, S3 automatically applies the
     *            default access control list PRIVATE.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3DestinationSettings withAccessControl(S3DestinationAccessControl accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    /**
     * Settings for how your job outputs are encrypted as they are uploaded to
     * Amazon S3.
     *
     * @return Settings for how your job outputs are encrypted as they are
     *         uploaded to Amazon S3.
     */
    public S3EncryptionSettings getEncryption() {
        return encryption;
    }

    /**
     * Settings for how your job outputs are encrypted as they are uploaded to
     * Amazon S3.
     *
     * @param encryption Settings for how your job outputs are encrypted as they
     *            are uploaded to Amazon S3.
     */
    public void setEncryption(S3EncryptionSettings encryption) {
        this.encryption = encryption;
    }

    /**
     * Settings for how your job outputs are encrypted as they are uploaded to
     * Amazon S3.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryption Settings for how your job outputs are encrypted as they
     *            are uploaded to Amazon S3.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3DestinationSettings withEncryption(S3EncryptionSettings encryption) {
        this.encryption = encryption;
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
        if (getAccessControl() != null)
            sb.append("AccessControl: " + getAccessControl() + ",");
        if (getEncryption() != null)
            sb.append("Encryption: " + getEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessControl() == null) ? 0 : getAccessControl().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DestinationSettings == false)
            return false;
        S3DestinationSettings other = (S3DestinationSettings) obj;

        if (other.getAccessControl() == null ^ this.getAccessControl() == null)
            return false;
        if (other.getAccessControl() != null
                && other.getAccessControl().equals(this.getAccessControl()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null
                && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        return true;
    }
}
