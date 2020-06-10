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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

public class DeleteDomainResult implements Serializable {
    /**
     * <p>
     * Contains information about the deleted domain after processing the
     * request.
     * </p>
     */
    private DomainDescription domain;

    /**
     * <p>
     * Contains information about the deleted domain after processing the
     * request.
     * </p>
     *
     * @return <p>
     *         Contains information about the deleted domain after processing
     *         the request.
     *         </p>
     */
    public DomainDescription getDomain() {
        return domain;
    }

    /**
     * <p>
     * Contains information about the deleted domain after processing the
     * request.
     * </p>
     *
     * @param domain <p>
     *            Contains information about the deleted domain after processing
     *            the request.
     *            </p>
     */
    public void setDomain(DomainDescription domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Contains information about the deleted domain after processing the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domain <p>
     *            Contains information about the deleted domain after processing
     *            the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDomainResult withDomain(DomainDescription domain) {
        this.domain = domain;
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
        if (getDomain() != null)
            sb.append("domain: " + getDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDomainResult == false)
            return false;
        DeleteDomainResult other = (DeleteDomainResult) obj;

        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        return true;
    }
}
