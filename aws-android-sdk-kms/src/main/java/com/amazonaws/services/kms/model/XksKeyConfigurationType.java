/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about the <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-external-key"
 * >external key </a>that is associated with a KMS key in an external key store.
 * </p>
 * <p>
 * This element appears in a <a>CreateKey</a> or <a>DescribeKey</a> response
 * only for a KMS key in an external key store.
 * </p>
 * <p>
 * The <i>external key</i> is a symmetric encryption key that is hosted by an
 * external key manager outside of Amazon Web Services. When you use the KMS key
 * in an external key store in a cryptographic operation, the cryptographic
 * operation is performed in the external key manager using the specified
 * external key. For more information, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-external-key"
 * >External key</a> in the <i>Key Management Service Developer Guide</i>.
 * </p>
 */
public class XksKeyConfigurationType implements Serializable {
    /**
     * <p>
     * The ID of the external key in its external key manager. This is the ID
     * that the external key store proxy uses to identify the external key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_.]+$<br/>
     */
    private String id;

    /**
     * <p>
     * The ID of the external key in its external key manager. This is the ID
     * that the external key store proxy uses to identify the external key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_.]+$<br/>
     *
     * @return <p>
     *         The ID of the external key in its external key manager. This is
     *         the ID that the external key store proxy uses to identify the
     *         external key.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the external key in its external key manager. This is the ID
     * that the external key store proxy uses to identify the external key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_.]+$<br/>
     *
     * @param id <p>
     *            The ID of the external key in its external key manager. This
     *            is the ID that the external key store proxy uses to identify
     *            the external key.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the external key in its external key manager. This is the ID
     * that the external key store proxy uses to identify the external key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_.]+$<br/>
     *
     * @param id <p>
     *            The ID of the external key in its external key manager. This
     *            is the ID that the external key store proxy uses to identify
     *            the external key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public XksKeyConfigurationType withId(String id) {
        this.id = id;
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
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof XksKeyConfigurationType == false)
            return false;
        XksKeyConfigurationType other = (XksKeyConfigurationType) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
