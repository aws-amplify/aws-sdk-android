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
 * This operation updates the contact information for a particular domain. You
 * must specify information for at least one contact: registrant, administrator,
 * or technical.
 * </p>
 * <p>
 * If the update is successful, this method returns an operation ID that you can
 * use to track the progress and completion of the action. If the request is not
 * completed successfully, the domain registrant will be notified by email.
 * </p>
 */
public class UpdateDomainContactRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the domain that you want to update contact information for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     */
    private ContactDetail adminContact;

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     */
    private ContactDetail registrantContact;

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     */
    private ContactDetail techContact;

    /**
     * <p>
     * The name of the domain that you want to update contact information for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the domain that you want to update contact
     *         information for.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to update contact information for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to update contact
     *            information for.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to update contact information for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to update contact
     *            information for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainContactRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     *
     * @return <p>
     *         Provides detailed contact information.
     *         </p>
     */
    public ContactDetail getAdminContact() {
        return adminContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     *
     * @param adminContact <p>
     *            Provides detailed contact information.
     *            </p>
     */
    public void setAdminContact(ContactDetail adminContact) {
        this.adminContact = adminContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminContact <p>
     *            Provides detailed contact information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainContactRequest withAdminContact(ContactDetail adminContact) {
        this.adminContact = adminContact;
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     *
     * @return <p>
     *         Provides detailed contact information.
     *         </p>
     */
    public ContactDetail getRegistrantContact() {
        return registrantContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     *
     * @param registrantContact <p>
     *            Provides detailed contact information.
     *            </p>
     */
    public void setRegistrantContact(ContactDetail registrantContact) {
        this.registrantContact = registrantContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registrantContact <p>
     *            Provides detailed contact information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainContactRequest withRegistrantContact(ContactDetail registrantContact) {
        this.registrantContact = registrantContact;
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     *
     * @return <p>
     *         Provides detailed contact information.
     *         </p>
     */
    public ContactDetail getTechContact() {
        return techContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     *
     * @param techContact <p>
     *            Provides detailed contact information.
     *            </p>
     */
    public void setTechContact(ContactDetail techContact) {
        this.techContact = techContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param techContact <p>
     *            Provides detailed contact information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainContactRequest withTechContact(ContactDetail techContact) {
        this.techContact = techContact;
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
        if (getAdminContact() != null)
            sb.append("AdminContact: " + getAdminContact() + ",");
        if (getRegistrantContact() != null)
            sb.append("RegistrantContact: " + getRegistrantContact() + ",");
        if (getTechContact() != null)
            sb.append("TechContact: " + getTechContact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getAdminContact() == null) ? 0 : getAdminContact().hashCode());
        hashCode = prime * hashCode
                + ((getRegistrantContact() == null) ? 0 : getRegistrantContact().hashCode());
        hashCode = prime * hashCode
                + ((getTechContact() == null) ? 0 : getTechContact().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainContactRequest == false)
            return false;
        UpdateDomainContactRequest other = (UpdateDomainContactRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAdminContact() == null ^ this.getAdminContact() == null)
            return false;
        if (other.getAdminContact() != null
                && other.getAdminContact().equals(this.getAdminContact()) == false)
            return false;
        if (other.getRegistrantContact() == null ^ this.getRegistrantContact() == null)
            return false;
        if (other.getRegistrantContact() != null
                && other.getRegistrantContact().equals(this.getRegistrantContact()) == false)
            return false;
        if (other.getTechContact() == null ^ this.getTechContact() == null)
            return false;
        if (other.getTechContact() != null
                && other.getTechContact().equals(this.getTechContact()) == false)
            return false;
        return true;
    }
}
