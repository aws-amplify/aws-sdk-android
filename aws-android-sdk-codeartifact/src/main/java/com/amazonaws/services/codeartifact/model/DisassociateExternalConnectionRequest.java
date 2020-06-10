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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes an existing external connection from a repository.
 * </p>
 */
public class DisassociateExternalConnectionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the domain that contains the repository from which to remove
     * the external repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     */
    private String domain;

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It
     * does not include dashes or spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String domainOwner;

    /**
     * <p>
     * The name of the repository from which the external connection will be
     * removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     */
    private String repository;

    /**
     * <p>
     * The name of the external connection to be removed from the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-:]{1,99}<br/>
     */
    private String externalConnection;

    /**
     * <p>
     * The name of the domain that contains the repository from which to remove
     * the external repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @return <p>
     *         The name of the domain that contains the repository from which to
     *         remove the external repository.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository from which to remove
     * the external repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domain <p>
     *            The name of the domain that contains the repository from which
     *            to remove the external repository.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository from which to remove
     * the external repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domain <p>
     *            The name of the domain that contains the repository from which
     *            to remove the external repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateExternalConnectionRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It
     * does not include dashes or spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>
     *         The 12-digit account number of the AWS account that owns the
     *         domain. It does not include dashes or spaces.
     *         </p>
     */
    public String getDomainOwner() {
        return domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It
     * does not include dashes or spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param domainOwner <p>
     *            The 12-digit account number of the AWS account that owns the
     *            domain. It does not include dashes or spaces.
     *            </p>
     */
    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It
     * does not include dashes or spaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param domainOwner <p>
     *            The 12-digit account number of the AWS account that owns the
     *            domain. It does not include dashes or spaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateExternalConnectionRequest withDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
        return this;
    }

    /**
     * <p>
     * The name of the repository from which the external connection will be
     * removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @return <p>
     *         The name of the repository from which the external connection
     *         will be removed.
     *         </p>
     */
    public String getRepository() {
        return repository;
    }

    /**
     * <p>
     * The name of the repository from which the external connection will be
     * removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @param repository <p>
     *            The name of the repository from which the external connection
     *            will be removed.
     *            </p>
     */
    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The name of the repository from which the external connection will be
     * removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @param repository <p>
     *            The name of the repository from which the external connection
     *            will be removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateExternalConnectionRequest withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * <p>
     * The name of the external connection to be removed from the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-:]{1,99}<br/>
     *
     * @return <p>
     *         The name of the external connection to be removed from the
     *         repository.
     *         </p>
     */
    public String getExternalConnection() {
        return externalConnection;
    }

    /**
     * <p>
     * The name of the external connection to be removed from the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-:]{1,99}<br/>
     *
     * @param externalConnection <p>
     *            The name of the external connection to be removed from the
     *            repository.
     *            </p>
     */
    public void setExternalConnection(String externalConnection) {
        this.externalConnection = externalConnection;
    }

    /**
     * <p>
     * The name of the external connection to be removed from the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-:]{1,99}<br/>
     *
     * @param externalConnection <p>
     *            The name of the external connection to be removed from the
     *            repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateExternalConnectionRequest withExternalConnection(String externalConnection) {
        this.externalConnection = externalConnection;
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
            sb.append("domain: " + getDomain() + ",");
        if (getDomainOwner() != null)
            sb.append("domainOwner: " + getDomainOwner() + ",");
        if (getRepository() != null)
            sb.append("repository: " + getRepository() + ",");
        if (getExternalConnection() != null)
            sb.append("externalConnection: " + getExternalConnection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode
                + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode
                + ((getExternalConnection() == null) ? 0 : getExternalConnection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateExternalConnectionRequest == false)
            return false;
        DisassociateExternalConnectionRequest other = (DisassociateExternalConnectionRequest) obj;

        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null
                && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null
                && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getExternalConnection() == null ^ this.getExternalConnection() == null)
            return false;
        if (other.getExternalConnection() != null
                && other.getExternalConnection().equals(this.getExternalConnection()) == false)
            return false;
        return true;
    }
}
