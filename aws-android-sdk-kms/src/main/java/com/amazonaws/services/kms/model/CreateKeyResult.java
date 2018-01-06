/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

public class CreateKeyResult implements Serializable {
    /**
     * <p>
     * Metadata associated with the CMK.
     * </p>
     */
    private KeyMetadata keyMetadata;

    /**
     * <p>
     * Metadata associated with the CMK.
     * </p>
     *
     * @return <p>
     *         Metadata associated with the CMK.
     *         </p>
     */
    public KeyMetadata getKeyMetadata() {
        return keyMetadata;
    }

    /**
     * <p>
     * Metadata associated with the CMK.
     * </p>
     *
     * @param keyMetadata <p>
     *            Metadata associated with the CMK.
     *            </p>
     */
    public void setKeyMetadata(KeyMetadata keyMetadata) {
        this.keyMetadata = keyMetadata;
    }

    /**
     * <p>
     * Metadata associated with the CMK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyMetadata <p>
     *            Metadata associated with the CMK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyResult withKeyMetadata(KeyMetadata keyMetadata) {
        this.keyMetadata = keyMetadata;
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
        if (getKeyMetadata() != null)
            sb.append("KeyMetadata: " + getKeyMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyMetadata() == null) ? 0 : getKeyMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyResult == false)
            return false;
        CreateKeyResult other = (CreateKeyResult) obj;

        if (other.getKeyMetadata() == null ^ this.getKeyMetadata() == null)
            return false;
        if (other.getKeyMetadata() != null
                && other.getKeyMetadata().equals(this.getKeyMetadata()) == false)
            return false;
        return true;
    }
}
