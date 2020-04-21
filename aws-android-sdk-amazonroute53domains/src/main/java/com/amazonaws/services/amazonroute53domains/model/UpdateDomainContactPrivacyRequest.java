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
 * This operation updates the specified domain contact's privacy setting. When
 * privacy protection is enabled, contact information such as email address is
 * replaced either with contact information for Amazon Registrar (for .com,
 * .net, and .org domains) or with contact information for our registrar
 * associate, Gandi.
 * </p>
 * <p>
 * This operation affects only the contact information for the specified contact
 * type (registrant, administrator, or tech). If the request succeeds, Amazon
 * Route 53 returns an operation ID that you can use with <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
 * >GetOperationDetail</a> to track the progress and completion of the action.
 * If the request doesn't complete successfully, the domain registrant will be
 * notified by email.
 * </p>
 * <important>
 * <p>
 * By disabling the privacy service via API, you consent to the publication of
 * the contact information provided for this domain via the public WHOIS
 * database. You certify that you are the registrant of this domain name and
 * have the authority to make this decision. You may withdraw your consent at
 * any time by enabling privacy protection using either
 * <code>UpdateDomainContactPrivacy</code> or the Route 53 console. Enabling
 * privacy protection removes the contact information provided for this domain
 * from the WHOIS database. For more information on our privacy practices, see
 * <a
 * href="https://aws.amazon.com/privacy/">https://aws.amazon.com/privacy/</a>.
 * </p>
 * </important>
 */
public class UpdateDomainContactPrivacyRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the domain that you want to update the privacy setting for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the admin contact.
     * </p>
     */
    private Boolean adminPrivacy;

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the registrant contact (domain owner).
     * </p>
     */
    private Boolean registrantPrivacy;

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the technical contact.
     * </p>
     */
    private Boolean techPrivacy;

    /**
     * <p>
     * The name of the domain that you want to update the privacy setting for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the domain that you want to update the privacy
     *         setting for.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to update the privacy setting for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to update the privacy
     *            setting for.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to update the privacy setting for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to update the privacy
     *            setting for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainContactPrivacyRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the admin contact.
     * </p>
     *
     * @return <p>
     *         Whether you want to conceal contact information from WHOIS
     *         queries. If you specify <code>true</code>, WHOIS ("who is")
     *         queries return contact information either for Amazon Registrar
     *         (for .com, .net, and .org domains) or for our registrar
     *         associate, Gandi (for all other TLDs). If you specify
     *         <code>false</code>, WHOIS queries return the information that you
     *         entered for the admin contact.
     *         </p>
     */
    public Boolean isAdminPrivacy() {
        return adminPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the admin contact.
     * </p>
     *
     * @return <p>
     *         Whether you want to conceal contact information from WHOIS
     *         queries. If you specify <code>true</code>, WHOIS ("who is")
     *         queries return contact information either for Amazon Registrar
     *         (for .com, .net, and .org domains) or for our registrar
     *         associate, Gandi (for all other TLDs). If you specify
     *         <code>false</code>, WHOIS queries return the information that you
     *         entered for the admin contact.
     *         </p>
     */
    public Boolean getAdminPrivacy() {
        return adminPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the admin contact.
     * </p>
     *
     * @param adminPrivacy <p>
     *            Whether you want to conceal contact information from WHOIS
     *            queries. If you specify <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If you specify
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the admin contact.
     *            </p>
     */
    public void setAdminPrivacy(Boolean adminPrivacy) {
        this.adminPrivacy = adminPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the admin contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminPrivacy <p>
     *            Whether you want to conceal contact information from WHOIS
     *            queries. If you specify <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If you specify
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the admin contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainContactPrivacyRequest withAdminPrivacy(Boolean adminPrivacy) {
        this.adminPrivacy = adminPrivacy;
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the registrant contact (domain owner).
     * </p>
     *
     * @return <p>
     *         Whether you want to conceal contact information from WHOIS
     *         queries. If you specify <code>true</code>, WHOIS ("who is")
     *         queries return contact information either for Amazon Registrar
     *         (for .com, .net, and .org domains) or for our registrar
     *         associate, Gandi (for all other TLDs). If you specify
     *         <code>false</code>, WHOIS queries return the information that you
     *         entered for the registrant contact (domain owner).
     *         </p>
     */
    public Boolean isRegistrantPrivacy() {
        return registrantPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the registrant contact (domain owner).
     * </p>
     *
     * @return <p>
     *         Whether you want to conceal contact information from WHOIS
     *         queries. If you specify <code>true</code>, WHOIS ("who is")
     *         queries return contact information either for Amazon Registrar
     *         (for .com, .net, and .org domains) or for our registrar
     *         associate, Gandi (for all other TLDs). If you specify
     *         <code>false</code>, WHOIS queries return the information that you
     *         entered for the registrant contact (domain owner).
     *         </p>
     */
    public Boolean getRegistrantPrivacy() {
        return registrantPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the registrant contact (domain owner).
     * </p>
     *
     * @param registrantPrivacy <p>
     *            Whether you want to conceal contact information from WHOIS
     *            queries. If you specify <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If you specify
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the registrant contact (domain owner).
     *            </p>
     */
    public void setRegistrantPrivacy(Boolean registrantPrivacy) {
        this.registrantPrivacy = registrantPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the registrant contact (domain owner).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registrantPrivacy <p>
     *            Whether you want to conceal contact information from WHOIS
     *            queries. If you specify <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If you specify
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the registrant contact (domain owner).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainContactPrivacyRequest withRegistrantPrivacy(Boolean registrantPrivacy) {
        this.registrantPrivacy = registrantPrivacy;
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the technical contact.
     * </p>
     *
     * @return <p>
     *         Whether you want to conceal contact information from WHOIS
     *         queries. If you specify <code>true</code>, WHOIS ("who is")
     *         queries return contact information either for Amazon Registrar
     *         (for .com, .net, and .org domains) or for our registrar
     *         associate, Gandi (for all other TLDs). If you specify
     *         <code>false</code>, WHOIS queries return the information that you
     *         entered for the technical contact.
     *         </p>
     */
    public Boolean isTechPrivacy() {
        return techPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the technical contact.
     * </p>
     *
     * @return <p>
     *         Whether you want to conceal contact information from WHOIS
     *         queries. If you specify <code>true</code>, WHOIS ("who is")
     *         queries return contact information either for Amazon Registrar
     *         (for .com, .net, and .org domains) or for our registrar
     *         associate, Gandi (for all other TLDs). If you specify
     *         <code>false</code>, WHOIS queries return the information that you
     *         entered for the technical contact.
     *         </p>
     */
    public Boolean getTechPrivacy() {
        return techPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the technical contact.
     * </p>
     *
     * @param techPrivacy <p>
     *            Whether you want to conceal contact information from WHOIS
     *            queries. If you specify <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If you specify
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the technical contact.
     *            </p>
     */
    public void setTechPrivacy(Boolean techPrivacy) {
        this.techPrivacy = techPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the technical contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param techPrivacy <p>
     *            Whether you want to conceal contact information from WHOIS
     *            queries. If you specify <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If you specify
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the technical contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainContactPrivacyRequest withTechPrivacy(Boolean techPrivacy) {
        this.techPrivacy = techPrivacy;
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
        if (getAdminPrivacy() != null)
            sb.append("AdminPrivacy: " + getAdminPrivacy() + ",");
        if (getRegistrantPrivacy() != null)
            sb.append("RegistrantPrivacy: " + getRegistrantPrivacy() + ",");
        if (getTechPrivacy() != null)
            sb.append("TechPrivacy: " + getTechPrivacy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getAdminPrivacy() == null) ? 0 : getAdminPrivacy().hashCode());
        hashCode = prime * hashCode
                + ((getRegistrantPrivacy() == null) ? 0 : getRegistrantPrivacy().hashCode());
        hashCode = prime * hashCode
                + ((getTechPrivacy() == null) ? 0 : getTechPrivacy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainContactPrivacyRequest == false)
            return false;
        UpdateDomainContactPrivacyRequest other = (UpdateDomainContactPrivacyRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAdminPrivacy() == null ^ this.getAdminPrivacy() == null)
            return false;
        if (other.getAdminPrivacy() != null
                && other.getAdminPrivacy().equals(this.getAdminPrivacy()) == false)
            return false;
        if (other.getRegistrantPrivacy() == null ^ this.getRegistrantPrivacy() == null)
            return false;
        if (other.getRegistrantPrivacy() != null
                && other.getRegistrantPrivacy().equals(this.getRegistrantPrivacy()) == false)
            return false;
        if (other.getTechPrivacy() == null ^ this.getTechPrivacy() == null)
            return false;
        if (other.getTechPrivacy() != null
                && other.getTechPrivacy().equals(this.getTechPrivacy()) == false)
            return false;
        return true;
    }
}
