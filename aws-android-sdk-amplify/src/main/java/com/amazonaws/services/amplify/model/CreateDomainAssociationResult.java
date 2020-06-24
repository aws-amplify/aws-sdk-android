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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * The result structure for the create domain association request.
 * </p>
 */
public class CreateDomainAssociationResult implements Serializable {
    /**
     * <p>
     * Describes the structure of a domain association, which associates a
     * custom domain with an Amplify app.
     * </p>
     */
    private DomainAssociation domainAssociation;

    /**
     * <p>
     * Describes the structure of a domain association, which associates a
     * custom domain with an Amplify app.
     * </p>
     *
     * @return <p>
     *         Describes the structure of a domain association, which associates
     *         a custom domain with an Amplify app.
     *         </p>
     */
    public DomainAssociation getDomainAssociation() {
        return domainAssociation;
    }

    /**
     * <p>
     * Describes the structure of a domain association, which associates a
     * custom domain with an Amplify app.
     * </p>
     *
     * @param domainAssociation <p>
     *            Describes the structure of a domain association, which
     *            associates a custom domain with an Amplify app.
     *            </p>
     */
    public void setDomainAssociation(DomainAssociation domainAssociation) {
        this.domainAssociation = domainAssociation;
    }

    /**
     * <p>
     * Describes the structure of a domain association, which associates a
     * custom domain with an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainAssociation <p>
     *            Describes the structure of a domain association, which
     *            associates a custom domain with an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainAssociationResult withDomainAssociation(DomainAssociation domainAssociation) {
        this.domainAssociation = domainAssociation;
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
        if (getDomainAssociation() != null)
            sb.append("domainAssociation: " + getDomainAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainAssociation() == null) ? 0 : getDomainAssociation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainAssociationResult == false)
            return false;
        CreateDomainAssociationResult other = (CreateDomainAssociationResult) obj;

        if (other.getDomainAssociation() == null ^ this.getDomainAssociation() == null)
            return false;
        if (other.getDomainAssociation() != null
                && other.getDomainAssociation().equals(this.getDomainAssociation()) == false)
            return false;
        return true;
    }
}
