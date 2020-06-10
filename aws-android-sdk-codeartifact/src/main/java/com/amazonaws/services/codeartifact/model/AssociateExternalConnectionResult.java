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

public class AssociateExternalConnectionResult implements Serializable {
    /**
     * <p>
     * Information about the connected repository after processing the request.
     * </p>
     */
    private RepositoryDescription repository;

    /**
     * <p>
     * Information about the connected repository after processing the request.
     * </p>
     *
     * @return <p>
     *         Information about the connected repository after processing the
     *         request.
     *         </p>
     */
    public RepositoryDescription getRepository() {
        return repository;
    }

    /**
     * <p>
     * Information about the connected repository after processing the request.
     * </p>
     *
     * @param repository <p>
     *            Information about the connected repository after processing
     *            the request.
     *            </p>
     */
    public void setRepository(RepositoryDescription repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * Information about the connected repository after processing the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repository <p>
     *            Information about the connected repository after processing
     *            the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateExternalConnectionResult withRepository(RepositoryDescription repository) {
        this.repository = repository;
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
        if (getRepository() != null)
            sb.append("repository: " + getRepository());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateExternalConnectionResult == false)
            return false;
        AssociateExternalConnectionResult other = (AssociateExternalConnectionResult) obj;

        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null
                && other.getRepository().equals(this.getRepository()) == false)
            return false;
        return true;
    }
}
