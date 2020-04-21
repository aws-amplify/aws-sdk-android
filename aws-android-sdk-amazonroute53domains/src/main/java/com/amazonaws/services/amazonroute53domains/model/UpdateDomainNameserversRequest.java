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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This operation replaces the current set of name servers for the domain with
 * the specified set of name servers. If you use Amazon Route 53 as your DNS
 * service, specify the four name servers in the delegation set for the hosted
 * zone for the domain.
 * </p>
 * <p>
 * If successful, this operation returns an operation ID that you can use to
 * track the progress and completion of the action. If the request is not
 * completed successfully, the domain registrant will be notified by email.
 * </p>
 */
public class UpdateDomainNameserversRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the domain that you want to change name servers for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * The authorization key for .fi domains
     * </p>
     */
    private String fIAuthKey;

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     */
    private java.util.List<Nameserver> nameservers;

    /**
     * <p>
     * The name of the domain that you want to change name servers for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the domain that you want to change name servers for.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to change name servers for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to change name servers
     *            for.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to change name servers for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to change name servers
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainNameserversRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The authorization key for .fi domains
     * </p>
     *
     * @return <p>
     *         The authorization key for .fi domains
     *         </p>
     */
    public String getFIAuthKey() {
        return fIAuthKey;
    }

    /**
     * <p>
     * The authorization key for .fi domains
     * </p>
     *
     * @param fIAuthKey <p>
     *            The authorization key for .fi domains
     *            </p>
     */
    public void setFIAuthKey(String fIAuthKey) {
        this.fIAuthKey = fIAuthKey;
    }

    /**
     * <p>
     * The authorization key for .fi domains
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fIAuthKey <p>
     *            The authorization key for .fi domains
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainNameserversRequest withFIAuthKey(String fIAuthKey) {
        this.fIAuthKey = fIAuthKey;
        return this;
    }

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     *
     * @return <p>
     *         A list of new name servers for the domain.
     *         </p>
     */
    public java.util.List<Nameserver> getNameservers() {
        return nameservers;
    }

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     *
     * @param nameservers <p>
     *            A list of new name servers for the domain.
     *            </p>
     */
    public void setNameservers(java.util.Collection<Nameserver> nameservers) {
        if (nameservers == null) {
            this.nameservers = null;
            return;
        }

        this.nameservers = new java.util.ArrayList<Nameserver>(nameservers);
    }

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameservers <p>
     *            A list of new name servers for the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainNameserversRequest withNameservers(Nameserver... nameservers) {
        if (getNameservers() == null) {
            this.nameservers = new java.util.ArrayList<Nameserver>(nameservers.length);
        }
        for (Nameserver value : nameservers) {
            this.nameservers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameservers <p>
     *            A list of new name servers for the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainNameserversRequest withNameservers(
            java.util.Collection<Nameserver> nameservers) {
        setNameservers(nameservers);
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getFIAuthKey() != null)
            sb.append("FIAuthKey: " + getFIAuthKey() + ",");
        if (getNameservers() != null)
            sb.append("Nameservers: " + getNameservers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getFIAuthKey() == null) ? 0 : getFIAuthKey().hashCode());
        hashCode = prime * hashCode
                + ((getNameservers() == null) ? 0 : getNameservers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainNameserversRequest == false)
            return false;
        UpdateDomainNameserversRequest other = (UpdateDomainNameserversRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getFIAuthKey() == null ^ this.getFIAuthKey() == null)
            return false;
        if (other.getFIAuthKey() != null
                && other.getFIAuthKey().equals(this.getFIAuthKey()) == false)
            return false;
        if (other.getNameservers() == null ^ this.getNameservers() == null)
            return false;
        if (other.getNameservers() != null
                && other.getNameservers().equals(this.getNameservers()) == false)
            return false;
        return true;
    }
}
