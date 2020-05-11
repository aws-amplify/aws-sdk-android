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
package com.amazonaws.services.codeguru-reviewer.model;

import java.io.Serializable;


public class DisassociateRepositoryResult implements Serializable {
    /**
     * <p>Information about the disassociated repository.</p>
     */
    private RepositoryAssociation repositoryAssociation;

    /**
     * <p>Information about the disassociated repository.</p>
     *
     * @return <p>Information about the disassociated repository.</p>
     */
    public RepositoryAssociation getRepositoryAssociation() {
        return repositoryAssociation;
    }

    /**
     * <p>Information about the disassociated repository.</p>
     *
     * @param repositoryAssociation <p>Information about the disassociated repository.</p>
     */
    public void setRepositoryAssociation(RepositoryAssociation repositoryAssociation) {
        this.repositoryAssociation = repositoryAssociation;
    }

    /**
     * <p>Information about the disassociated repository.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param repositoryAssociation <p>Information about the disassociated repository.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DisassociateRepositoryResult withRepositoryAssociation(RepositoryAssociation repositoryAssociation) {
        this.repositoryAssociation = repositoryAssociation;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRepositoryAssociation() != null) sb.append("RepositoryAssociation: " + getRepositoryAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryAssociation() == null) ? 0 : getRepositoryAssociation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DisassociateRepositoryResult == false) return false;
        DisassociateRepositoryResult other = (DisassociateRepositoryResult)obj;

        if (other.getRepositoryAssociation() == null ^ this.getRepositoryAssociation() == null) return false;
        if (other.getRepositoryAssociation() != null && other.getRepositoryAssociation().equals(this.getRepositoryAssociation()) == false) return false;
        return true;
    }
}
