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

package com.amazonaws.services.worklink.model;

import java.io.Serializable;

public class AssociateWebsiteCertificateAuthorityResult implements Serializable {
    /**
     * <p>
     * A unique identifier for the CA.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String websiteCaId;

    /**
     * <p>
     * A unique identifier for the CA.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A unique identifier for the CA.
     *         </p>
     */
    public String getWebsiteCaId() {
        return websiteCaId;
    }

    /**
     * <p>
     * A unique identifier for the CA.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param websiteCaId <p>
     *            A unique identifier for the CA.
     *            </p>
     */
    public void setWebsiteCaId(String websiteCaId) {
        this.websiteCaId = websiteCaId;
    }

    /**
     * <p>
     * A unique identifier for the CA.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param websiteCaId <p>
     *            A unique identifier for the CA.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateWebsiteCertificateAuthorityResult withWebsiteCaId(String websiteCaId) {
        this.websiteCaId = websiteCaId;
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
        if (getWebsiteCaId() != null)
            sb.append("WebsiteCaId: " + getWebsiteCaId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWebsiteCaId() == null) ? 0 : getWebsiteCaId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateWebsiteCertificateAuthorityResult == false)
            return false;
        AssociateWebsiteCertificateAuthorityResult other = (AssociateWebsiteCertificateAuthorityResult) obj;

        if (other.getWebsiteCaId() == null ^ this.getWebsiteCaId() == null)
            return false;
        if (other.getWebsiteCaId() != null
                && other.getWebsiteCaId().equals(this.getWebsiteCaId()) == false)
            return false;
        return true;
    }
}
