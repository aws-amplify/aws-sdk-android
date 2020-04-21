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

/**
 * <p>
 * The GetDomainDetail response includes the following elements.
 * </p>
 */
public class GetDomainDetailResult implements Serializable {
    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private java.util.List<Nameserver> nameservers;

    /**
     * <p>
     * Specifies whether the domain registration is set to renew automatically.
     * </p>
     */
    private Boolean autoRenew;

    /**
     * <p>
     * Provides details about the domain administrative contact.
     * </p>
     */
    private ContactDetail adminContact;

    /**
     * <p>
     * Provides details about the domain registrant.
     * </p>
     */
    private ContactDetail registrantContact;

    /**
     * <p>
     * Provides details about the domain technical contact.
     * </p>
     */
    private ContactDetail techContact;

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the admin contact.
     * </p>
     */
    private Boolean adminPrivacy;

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the registrant contact (domain owner).
     * </p>
     */
    private Boolean registrantPrivacy;

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the technical contact.
     * </p>
     */
    private Boolean techPrivacy;

    /**
     * <p>
     * Name of the registrar of the domain as identified in the registry.
     * Domains with a .com, .net, or .org TLD are registered by Amazon
     * Registrar. All other domains are registered by our registrar associate,
     * Gandi. The value for domains that are registered by Gandi is
     * <code>"GANDI SAS"</code>.
     * </p>
     */
    private String registrarName;

    /**
     * <p>
     * The fully qualified name of the WHOIS server that can answer the WHOIS
     * query for the domain.
     * </p>
     */
    private String whoIsServer;

    /**
     * <p>
     * Web address of the registrar.
     * </p>
     */
    private String registrarUrl;

    /**
     * <p>
     * Email address to contact to report incorrect contact information for a
     * domain, to report that the domain is being used to send spam, to report
     * that someone is cybersquatting on a domain name, or report some other
     * type of abuse.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     */
    private String abuseContactEmail;

    /**
     * <p>
     * Phone number for reporting abuse.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 30<br/>
     */
    private String abuseContactPhone;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String registryDomainId;

    /**
     * <p>
     * The date when the domain was created as found in the response to a WHOIS
     * query. The date and time is in Unix time format and Coordinated Universal
     * time (UTC).
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The last updated date of the domain as found in the response to a WHOIS
     * query. The date and time is in Unix time format and Coordinated Universal
     * time (UTC).
     * </p>
     */
    private java.util.Date updatedDate;

    /**
     * <p>
     * The date when the registration for the domain is set to expire. The date
     * and time is in Unix time format and Coordinated Universal time (UTC).
     * </p>
     */
    private java.util.Date expirationDate;

    /**
     * <p>
     * Reseller of the domain. Domains registered or transferred using Route 53
     * domains will have <code>"Amazon"</code> as the reseller.
     * </p>
     */
    private String reseller;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String dnsSec;

    /**
     * <p>
     * An array of domain name status codes, also known as Extensible
     * Provisioning Protocol (EPP) status codes.
     * </p>
     * <p>
     * ICANN, the organization that maintains a central database of domain
     * names, has developed a set of domain name status codes that tell you the
     * status of a variety of operations on a domain name, for example,
     * registering a domain name, transferring a domain name to another
     * registrar, renewing the registration for a domain name, and so on. All
     * registrars use this same set of status codes.
     * </p>
     * <p>
     * For a current list of domain name status codes and an explanation of what
     * each code means, go to the <a href="https://www.icann.org/">ICANN
     * website</a> and search for <code>epp status codes</code>. (Search on the
     * ICANN website; web searches sometimes return an old version of the
     * document.)
     * </p>
     */
    private java.util.List<String> statusList;

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of a domain.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of a domain.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of a domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     *
     * @return <p>
     *         The name of the domain.
     *         </p>
     */
    public java.util.List<Nameserver> getNameservers() {
        return nameservers;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     *
     * @param nameservers <p>
     *            The name of the domain.
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
     * The name of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameservers <p>
     *            The name of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withNameservers(Nameserver... nameservers) {
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
     * The name of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameservers <p>
     *            The name of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withNameservers(java.util.Collection<Nameserver> nameservers) {
        setNameservers(nameservers);
        return this;
    }

    /**
     * <p>
     * Specifies whether the domain registration is set to renew automatically.
     * </p>
     *
     * @return <p>
     *         Specifies whether the domain registration is set to renew
     *         automatically.
     *         </p>
     */
    public Boolean isAutoRenew() {
        return autoRenew;
    }

    /**
     * <p>
     * Specifies whether the domain registration is set to renew automatically.
     * </p>
     *
     * @return <p>
     *         Specifies whether the domain registration is set to renew
     *         automatically.
     *         </p>
     */
    public Boolean getAutoRenew() {
        return autoRenew;
    }

    /**
     * <p>
     * Specifies whether the domain registration is set to renew automatically.
     * </p>
     *
     * @param autoRenew <p>
     *            Specifies whether the domain registration is set to renew
     *            automatically.
     *            </p>
     */
    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * Specifies whether the domain registration is set to renew automatically.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoRenew <p>
     *            Specifies whether the domain registration is set to renew
     *            automatically.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * <p>
     * Provides details about the domain administrative contact.
     * </p>
     *
     * @return <p>
     *         Provides details about the domain administrative contact.
     *         </p>
     */
    public ContactDetail getAdminContact() {
        return adminContact;
    }

    /**
     * <p>
     * Provides details about the domain administrative contact.
     * </p>
     *
     * @param adminContact <p>
     *            Provides details about the domain administrative contact.
     *            </p>
     */
    public void setAdminContact(ContactDetail adminContact) {
        this.adminContact = adminContact;
    }

    /**
     * <p>
     * Provides details about the domain administrative contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminContact <p>
     *            Provides details about the domain administrative contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withAdminContact(ContactDetail adminContact) {
        this.adminContact = adminContact;
        return this;
    }

    /**
     * <p>
     * Provides details about the domain registrant.
     * </p>
     *
     * @return <p>
     *         Provides details about the domain registrant.
     *         </p>
     */
    public ContactDetail getRegistrantContact() {
        return registrantContact;
    }

    /**
     * <p>
     * Provides details about the domain registrant.
     * </p>
     *
     * @param registrantContact <p>
     *            Provides details about the domain registrant.
     *            </p>
     */
    public void setRegistrantContact(ContactDetail registrantContact) {
        this.registrantContact = registrantContact;
    }

    /**
     * <p>
     * Provides details about the domain registrant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registrantContact <p>
     *            Provides details about the domain registrant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withRegistrantContact(ContactDetail registrantContact) {
        this.registrantContact = registrantContact;
        return this;
    }

    /**
     * <p>
     * Provides details about the domain technical contact.
     * </p>
     *
     * @return <p>
     *         Provides details about the domain technical contact.
     *         </p>
     */
    public ContactDetail getTechContact() {
        return techContact;
    }

    /**
     * <p>
     * Provides details about the domain technical contact.
     * </p>
     *
     * @param techContact <p>
     *            Provides details about the domain technical contact.
     *            </p>
     */
    public void setTechContact(ContactDetail techContact) {
        this.techContact = techContact;
    }

    /**
     * <p>
     * Provides details about the domain technical contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param techContact <p>
     *            Provides details about the domain technical contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withTechContact(ContactDetail techContact) {
        this.techContact = techContact;
        return this;
    }

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the admin contact.
     * </p>
     *
     * @return <p>
     *         Specifies whether contact information is concealed from WHOIS
     *         queries. If the value is <code>true</code>, WHOIS ("who is")
     *         queries return contact information either for Amazon Registrar
     *         (for .com, .net, and .org domains) or for our registrar
     *         associate, Gandi (for all other TLDs). If the value is
     *         <code>false</code>, WHOIS queries return the information that you
     *         entered for the admin contact.
     *         </p>
     */
    public Boolean isAdminPrivacy() {
        return adminPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the admin contact.
     * </p>
     *
     * @return <p>
     *         Specifies whether contact information is concealed from WHOIS
     *         queries. If the value is <code>true</code>, WHOIS ("who is")
     *         queries return contact information either for Amazon Registrar
     *         (for .com, .net, and .org domains) or for our registrar
     *         associate, Gandi (for all other TLDs). If the value is
     *         <code>false</code>, WHOIS queries return the information that you
     *         entered for the admin contact.
     *         </p>
     */
    public Boolean getAdminPrivacy() {
        return adminPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the admin contact.
     * </p>
     *
     * @param adminPrivacy <p>
     *            Specifies whether contact information is concealed from WHOIS
     *            queries. If the value is <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If the value is
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the admin contact.
     *            </p>
     */
    public void setAdminPrivacy(Boolean adminPrivacy) {
        this.adminPrivacy = adminPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the admin contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminPrivacy <p>
     *            Specifies whether contact information is concealed from WHOIS
     *            queries. If the value is <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If the value is
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the admin contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withAdminPrivacy(Boolean adminPrivacy) {
        this.adminPrivacy = adminPrivacy;
        return this;
    }

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the registrant contact (domain owner).
     * </p>
     *
     * @return <p>
     *         Specifies whether contact information is concealed from WHOIS
     *         queries. If the value is <code>true</code>, WHOIS ("who is")
     *         queries return contact information either for Amazon Registrar
     *         (for .com, .net, and .org domains) or for our registrar
     *         associate, Gandi (for all other TLDs). If the value is
     *         <code>false</code>, WHOIS queries return the information that you
     *         entered for the registrant contact (domain owner).
     *         </p>
     */
    public Boolean isRegistrantPrivacy() {
        return registrantPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the registrant contact (domain owner).
     * </p>
     *
     * @return <p>
     *         Specifies whether contact information is concealed from WHOIS
     *         queries. If the value is <code>true</code>, WHOIS ("who is")
     *         queries return contact information either for Amazon Registrar
     *         (for .com, .net, and .org domains) or for our registrar
     *         associate, Gandi (for all other TLDs). If the value is
     *         <code>false</code>, WHOIS queries return the information that you
     *         entered for the registrant contact (domain owner).
     *         </p>
     */
    public Boolean getRegistrantPrivacy() {
        return registrantPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the registrant contact (domain owner).
     * </p>
     *
     * @param registrantPrivacy <p>
     *            Specifies whether contact information is concealed from WHOIS
     *            queries. If the value is <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If the value is
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the registrant contact (domain owner).
     *            </p>
     */
    public void setRegistrantPrivacy(Boolean registrantPrivacy) {
        this.registrantPrivacy = registrantPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the registrant contact (domain owner).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registrantPrivacy <p>
     *            Specifies whether contact information is concealed from WHOIS
     *            queries. If the value is <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If the value is
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the registrant contact (domain owner).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withRegistrantPrivacy(Boolean registrantPrivacy) {
        this.registrantPrivacy = registrantPrivacy;
        return this;
    }

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the technical contact.
     * </p>
     *
     * @return <p>
     *         Specifies whether contact information is concealed from WHOIS
     *         queries. If the value is <code>true</code>, WHOIS ("who is")
     *         queries return contact information either for Amazon Registrar
     *         (for .com, .net, and .org domains) or for our registrar
     *         associate, Gandi (for all other TLDs). If the value is
     *         <code>false</code>, WHOIS queries return the information that you
     *         entered for the technical contact.
     *         </p>
     */
    public Boolean isTechPrivacy() {
        return techPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the technical contact.
     * </p>
     *
     * @return <p>
     *         Specifies whether contact information is concealed from WHOIS
     *         queries. If the value is <code>true</code>, WHOIS ("who is")
     *         queries return contact information either for Amazon Registrar
     *         (for .com, .net, and .org domains) or for our registrar
     *         associate, Gandi (for all other TLDs). If the value is
     *         <code>false</code>, WHOIS queries return the information that you
     *         entered for the technical contact.
     *         </p>
     */
    public Boolean getTechPrivacy() {
        return techPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the technical contact.
     * </p>
     *
     * @param techPrivacy <p>
     *            Specifies whether contact information is concealed from WHOIS
     *            queries. If the value is <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If the value is
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the technical contact.
     *            </p>
     */
    public void setTechPrivacy(Boolean techPrivacy) {
        this.techPrivacy = techPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information is concealed from WHOIS queries. If
     * the value is <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * the value is <code>false</code>, WHOIS queries return the information
     * that you entered for the technical contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param techPrivacy <p>
     *            Specifies whether contact information is concealed from WHOIS
     *            queries. If the value is <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If the value is
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the technical contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withTechPrivacy(Boolean techPrivacy) {
        this.techPrivacy = techPrivacy;
        return this;
    }

    /**
     * <p>
     * Name of the registrar of the domain as identified in the registry.
     * Domains with a .com, .net, or .org TLD are registered by Amazon
     * Registrar. All other domains are registered by our registrar associate,
     * Gandi. The value for domains that are registered by Gandi is
     * <code>"GANDI SAS"</code>.
     * </p>
     *
     * @return <p>
     *         Name of the registrar of the domain as identified in the
     *         registry. Domains with a .com, .net, or .org TLD are registered
     *         by Amazon Registrar. All other domains are registered by our
     *         registrar associate, Gandi. The value for domains that are
     *         registered by Gandi is <code>"GANDI SAS"</code>.
     *         </p>
     */
    public String getRegistrarName() {
        return registrarName;
    }

    /**
     * <p>
     * Name of the registrar of the domain as identified in the registry.
     * Domains with a .com, .net, or .org TLD are registered by Amazon
     * Registrar. All other domains are registered by our registrar associate,
     * Gandi. The value for domains that are registered by Gandi is
     * <code>"GANDI SAS"</code>.
     * </p>
     *
     * @param registrarName <p>
     *            Name of the registrar of the domain as identified in the
     *            registry. Domains with a .com, .net, or .org TLD are
     *            registered by Amazon Registrar. All other domains are
     *            registered by our registrar associate, Gandi. The value for
     *            domains that are registered by Gandi is
     *            <code>"GANDI SAS"</code>.
     *            </p>
     */
    public void setRegistrarName(String registrarName) {
        this.registrarName = registrarName;
    }

    /**
     * <p>
     * Name of the registrar of the domain as identified in the registry.
     * Domains with a .com, .net, or .org TLD are registered by Amazon
     * Registrar. All other domains are registered by our registrar associate,
     * Gandi. The value for domains that are registered by Gandi is
     * <code>"GANDI SAS"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registrarName <p>
     *            Name of the registrar of the domain as identified in the
     *            registry. Domains with a .com, .net, or .org TLD are
     *            registered by Amazon Registrar. All other domains are
     *            registered by our registrar associate, Gandi. The value for
     *            domains that are registered by Gandi is
     *            <code>"GANDI SAS"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withRegistrarName(String registrarName) {
        this.registrarName = registrarName;
        return this;
    }

    /**
     * <p>
     * The fully qualified name of the WHOIS server that can answer the WHOIS
     * query for the domain.
     * </p>
     *
     * @return <p>
     *         The fully qualified name of the WHOIS server that can answer the
     *         WHOIS query for the domain.
     *         </p>
     */
    public String getWhoIsServer() {
        return whoIsServer;
    }

    /**
     * <p>
     * The fully qualified name of the WHOIS server that can answer the WHOIS
     * query for the domain.
     * </p>
     *
     * @param whoIsServer <p>
     *            The fully qualified name of the WHOIS server that can answer
     *            the WHOIS query for the domain.
     *            </p>
     */
    public void setWhoIsServer(String whoIsServer) {
        this.whoIsServer = whoIsServer;
    }

    /**
     * <p>
     * The fully qualified name of the WHOIS server that can answer the WHOIS
     * query for the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param whoIsServer <p>
     *            The fully qualified name of the WHOIS server that can answer
     *            the WHOIS query for the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withWhoIsServer(String whoIsServer) {
        this.whoIsServer = whoIsServer;
        return this;
    }

    /**
     * <p>
     * Web address of the registrar.
     * </p>
     *
     * @return <p>
     *         Web address of the registrar.
     *         </p>
     */
    public String getRegistrarUrl() {
        return registrarUrl;
    }

    /**
     * <p>
     * Web address of the registrar.
     * </p>
     *
     * @param registrarUrl <p>
     *            Web address of the registrar.
     *            </p>
     */
    public void setRegistrarUrl(String registrarUrl) {
        this.registrarUrl = registrarUrl;
    }

    /**
     * <p>
     * Web address of the registrar.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registrarUrl <p>
     *            Web address of the registrar.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withRegistrarUrl(String registrarUrl) {
        this.registrarUrl = registrarUrl;
        return this;
    }

    /**
     * <p>
     * Email address to contact to report incorrect contact information for a
     * domain, to report that the domain is being used to send spam, to report
     * that someone is cybersquatting on a domain name, or report some other
     * type of abuse.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @return <p>
     *         Email address to contact to report incorrect contact information
     *         for a domain, to report that the domain is being used to send
     *         spam, to report that someone is cybersquatting on a domain name,
     *         or report some other type of abuse.
     *         </p>
     */
    public String getAbuseContactEmail() {
        return abuseContactEmail;
    }

    /**
     * <p>
     * Email address to contact to report incorrect contact information for a
     * domain, to report that the domain is being used to send spam, to report
     * that someone is cybersquatting on a domain name, or report some other
     * type of abuse.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @param abuseContactEmail <p>
     *            Email address to contact to report incorrect contact
     *            information for a domain, to report that the domain is being
     *            used to send spam, to report that someone is cybersquatting on
     *            a domain name, or report some other type of abuse.
     *            </p>
     */
    public void setAbuseContactEmail(String abuseContactEmail) {
        this.abuseContactEmail = abuseContactEmail;
    }

    /**
     * <p>
     * Email address to contact to report incorrect contact information for a
     * domain, to report that the domain is being used to send spam, to report
     * that someone is cybersquatting on a domain name, or report some other
     * type of abuse.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @param abuseContactEmail <p>
     *            Email address to contact to report incorrect contact
     *            information for a domain, to report that the domain is being
     *            used to send spam, to report that someone is cybersquatting on
     *            a domain name, or report some other type of abuse.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withAbuseContactEmail(String abuseContactEmail) {
        this.abuseContactEmail = abuseContactEmail;
        return this;
    }

    /**
     * <p>
     * Phone number for reporting abuse.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 30<br/>
     *
     * @return <p>
     *         Phone number for reporting abuse.
     *         </p>
     */
    public String getAbuseContactPhone() {
        return abuseContactPhone;
    }

    /**
     * <p>
     * Phone number for reporting abuse.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 30<br/>
     *
     * @param abuseContactPhone <p>
     *            Phone number for reporting abuse.
     *            </p>
     */
    public void setAbuseContactPhone(String abuseContactPhone) {
        this.abuseContactPhone = abuseContactPhone;
    }

    /**
     * <p>
     * Phone number for reporting abuse.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 30<br/>
     *
     * @param abuseContactPhone <p>
     *            Phone number for reporting abuse.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withAbuseContactPhone(String abuseContactPhone) {
        this.abuseContactPhone = abuseContactPhone;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getRegistryDomainId() {
        return registryDomainId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param registryDomainId <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setRegistryDomainId(String registryDomainId) {
        this.registryDomainId = registryDomainId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registryDomainId <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withRegistryDomainId(String registryDomainId) {
        this.registryDomainId = registryDomainId;
        return this;
    }

    /**
     * <p>
     * The date when the domain was created as found in the response to a WHOIS
     * query. The date and time is in Unix time format and Coordinated Universal
     * time (UTC).
     * </p>
     *
     * @return <p>
     *         The date when the domain was created as found in the response to
     *         a WHOIS query. The date and time is in Unix time format and
     *         Coordinated Universal time (UTC).
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date when the domain was created as found in the response to a WHOIS
     * query. The date and time is in Unix time format and Coordinated Universal
     * time (UTC).
     * </p>
     *
     * @param creationDate <p>
     *            The date when the domain was created as found in the response
     *            to a WHOIS query. The date and time is in Unix time format and
     *            Coordinated Universal time (UTC).
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the domain was created as found in the response to a WHOIS
     * query. The date and time is in Unix time format and Coordinated Universal
     * time (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date when the domain was created as found in the response
     *            to a WHOIS query. The date and time is in Unix time format and
     *            Coordinated Universal time (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The last updated date of the domain as found in the response to a WHOIS
     * query. The date and time is in Unix time format and Coordinated Universal
     * time (UTC).
     * </p>
     *
     * @return <p>
     *         The last updated date of the domain as found in the response to a
     *         WHOIS query. The date and time is in Unix time format and
     *         Coordinated Universal time (UTC).
     *         </p>
     */
    public java.util.Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * <p>
     * The last updated date of the domain as found in the response to a WHOIS
     * query. The date and time is in Unix time format and Coordinated Universal
     * time (UTC).
     * </p>
     *
     * @param updatedDate <p>
     *            The last updated date of the domain as found in the response
     *            to a WHOIS query. The date and time is in Unix time format and
     *            Coordinated Universal time (UTC).
     *            </p>
     */
    public void setUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * <p>
     * The last updated date of the domain as found in the response to a WHOIS
     * query. The date and time is in Unix time format and Coordinated Universal
     * time (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedDate <p>
     *            The last updated date of the domain as found in the response
     *            to a WHOIS query. The date and time is in Unix time format and
     *            Coordinated Universal time (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    /**
     * <p>
     * The date when the registration for the domain is set to expire. The date
     * and time is in Unix time format and Coordinated Universal time (UTC).
     * </p>
     *
     * @return <p>
     *         The date when the registration for the domain is set to expire.
     *         The date and time is in Unix time format and Coordinated
     *         Universal time (UTC).
     *         </p>
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * <p>
     * The date when the registration for the domain is set to expire. The date
     * and time is in Unix time format and Coordinated Universal time (UTC).
     * </p>
     *
     * @param expirationDate <p>
     *            The date when the registration for the domain is set to
     *            expire. The date and time is in Unix time format and
     *            Coordinated Universal time (UTC).
     *            </p>
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date when the registration for the domain is set to expire. The date
     * and time is in Unix time format and Coordinated Universal time (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expirationDate <p>
     *            The date when the registration for the domain is set to
     *            expire. The date and time is in Unix time format and
     *            Coordinated Universal time (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * <p>
     * Reseller of the domain. Domains registered or transferred using Route 53
     * domains will have <code>"Amazon"</code> as the reseller.
     * </p>
     *
     * @return <p>
     *         Reseller of the domain. Domains registered or transferred using
     *         Route 53 domains will have <code>"Amazon"</code> as the reseller.
     *         </p>
     */
    public String getReseller() {
        return reseller;
    }

    /**
     * <p>
     * Reseller of the domain. Domains registered or transferred using Route 53
     * domains will have <code>"Amazon"</code> as the reseller.
     * </p>
     *
     * @param reseller <p>
     *            Reseller of the domain. Domains registered or transferred
     *            using Route 53 domains will have <code>"Amazon"</code> as the
     *            reseller.
     *            </p>
     */
    public void setReseller(String reseller) {
        this.reseller = reseller;
    }

    /**
     * <p>
     * Reseller of the domain. Domains registered or transferred using Route 53
     * domains will have <code>"Amazon"</code> as the reseller.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reseller <p>
     *            Reseller of the domain. Domains registered or transferred
     *            using Route 53 domains will have <code>"Amazon"</code> as the
     *            reseller.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withReseller(String reseller) {
        this.reseller = reseller;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getDnsSec() {
        return dnsSec;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param dnsSec <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setDnsSec(String dnsSec) {
        this.dnsSec = dnsSec;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsSec <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withDnsSec(String dnsSec) {
        this.dnsSec = dnsSec;
        return this;
    }

    /**
     * <p>
     * An array of domain name status codes, also known as Extensible
     * Provisioning Protocol (EPP) status codes.
     * </p>
     * <p>
     * ICANN, the organization that maintains a central database of domain
     * names, has developed a set of domain name status codes that tell you the
     * status of a variety of operations on a domain name, for example,
     * registering a domain name, transferring a domain name to another
     * registrar, renewing the registration for a domain name, and so on. All
     * registrars use this same set of status codes.
     * </p>
     * <p>
     * For a current list of domain name status codes and an explanation of what
     * each code means, go to the <a href="https://www.icann.org/">ICANN
     * website</a> and search for <code>epp status codes</code>. (Search on the
     * ICANN website; web searches sometimes return an old version of the
     * document.)
     * </p>
     *
     * @return <p>
     *         An array of domain name status codes, also known as Extensible
     *         Provisioning Protocol (EPP) status codes.
     *         </p>
     *         <p>
     *         ICANN, the organization that maintains a central database of
     *         domain names, has developed a set of domain name status codes
     *         that tell you the status of a variety of operations on a domain
     *         name, for example, registering a domain name, transferring a
     *         domain name to another registrar, renewing the registration for a
     *         domain name, and so on. All registrars use this same set of
     *         status codes.
     *         </p>
     *         <p>
     *         For a current list of domain name status codes and an explanation
     *         of what each code means, go to the <a
     *         href="https://www.icann.org/">ICANN website</a> and search for
     *         <code>epp status codes</code>. (Search on the ICANN website; web
     *         searches sometimes return an old version of the document.)
     *         </p>
     */
    public java.util.List<String> getStatusList() {
        return statusList;
    }

    /**
     * <p>
     * An array of domain name status codes, also known as Extensible
     * Provisioning Protocol (EPP) status codes.
     * </p>
     * <p>
     * ICANN, the organization that maintains a central database of domain
     * names, has developed a set of domain name status codes that tell you the
     * status of a variety of operations on a domain name, for example,
     * registering a domain name, transferring a domain name to another
     * registrar, renewing the registration for a domain name, and so on. All
     * registrars use this same set of status codes.
     * </p>
     * <p>
     * For a current list of domain name status codes and an explanation of what
     * each code means, go to the <a href="https://www.icann.org/">ICANN
     * website</a> and search for <code>epp status codes</code>. (Search on the
     * ICANN website; web searches sometimes return an old version of the
     * document.)
     * </p>
     *
     * @param statusList <p>
     *            An array of domain name status codes, also known as Extensible
     *            Provisioning Protocol (EPP) status codes.
     *            </p>
     *            <p>
     *            ICANN, the organization that maintains a central database of
     *            domain names, has developed a set of domain name status codes
     *            that tell you the status of a variety of operations on a
     *            domain name, for example, registering a domain name,
     *            transferring a domain name to another registrar, renewing the
     *            registration for a domain name, and so on. All registrars use
     *            this same set of status codes.
     *            </p>
     *            <p>
     *            For a current list of domain name status codes and an
     *            explanation of what each code means, go to the <a
     *            href="https://www.icann.org/">ICANN website</a> and search for
     *            <code>epp status codes</code>. (Search on the ICANN website;
     *            web searches sometimes return an old version of the document.)
     *            </p>
     */
    public void setStatusList(java.util.Collection<String> statusList) {
        if (statusList == null) {
            this.statusList = null;
            return;
        }

        this.statusList = new java.util.ArrayList<String>(statusList);
    }

    /**
     * <p>
     * An array of domain name status codes, also known as Extensible
     * Provisioning Protocol (EPP) status codes.
     * </p>
     * <p>
     * ICANN, the organization that maintains a central database of domain
     * names, has developed a set of domain name status codes that tell you the
     * status of a variety of operations on a domain name, for example,
     * registering a domain name, transferring a domain name to another
     * registrar, renewing the registration for a domain name, and so on. All
     * registrars use this same set of status codes.
     * </p>
     * <p>
     * For a current list of domain name status codes and an explanation of what
     * each code means, go to the <a href="https://www.icann.org/">ICANN
     * website</a> and search for <code>epp status codes</code>. (Search on the
     * ICANN website; web searches sometimes return an old version of the
     * document.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusList <p>
     *            An array of domain name status codes, also known as Extensible
     *            Provisioning Protocol (EPP) status codes.
     *            </p>
     *            <p>
     *            ICANN, the organization that maintains a central database of
     *            domain names, has developed a set of domain name status codes
     *            that tell you the status of a variety of operations on a
     *            domain name, for example, registering a domain name,
     *            transferring a domain name to another registrar, renewing the
     *            registration for a domain name, and so on. All registrars use
     *            this same set of status codes.
     *            </p>
     *            <p>
     *            For a current list of domain name status codes and an
     *            explanation of what each code means, go to the <a
     *            href="https://www.icann.org/">ICANN website</a> and search for
     *            <code>epp status codes</code>. (Search on the ICANN website;
     *            web searches sometimes return an old version of the document.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withStatusList(String... statusList) {
        if (getStatusList() == null) {
            this.statusList = new java.util.ArrayList<String>(statusList.length);
        }
        for (String value : statusList) {
            this.statusList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of domain name status codes, also known as Extensible
     * Provisioning Protocol (EPP) status codes.
     * </p>
     * <p>
     * ICANN, the organization that maintains a central database of domain
     * names, has developed a set of domain name status codes that tell you the
     * status of a variety of operations on a domain name, for example,
     * registering a domain name, transferring a domain name to another
     * registrar, renewing the registration for a domain name, and so on. All
     * registrars use this same set of status codes.
     * </p>
     * <p>
     * For a current list of domain name status codes and an explanation of what
     * each code means, go to the <a href="https://www.icann.org/">ICANN
     * website</a> and search for <code>epp status codes</code>. (Search on the
     * ICANN website; web searches sometimes return an old version of the
     * document.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusList <p>
     *            An array of domain name status codes, also known as Extensible
     *            Provisioning Protocol (EPP) status codes.
     *            </p>
     *            <p>
     *            ICANN, the organization that maintains a central database of
     *            domain names, has developed a set of domain name status codes
     *            that tell you the status of a variety of operations on a
     *            domain name, for example, registering a domain name,
     *            transferring a domain name to another registrar, renewing the
     *            registration for a domain name, and so on. All registrars use
     *            this same set of status codes.
     *            </p>
     *            <p>
     *            For a current list of domain name status codes and an
     *            explanation of what each code means, go to the <a
     *            href="https://www.icann.org/">ICANN website</a> and search for
     *            <code>epp status codes</code>. (Search on the ICANN website;
     *            web searches sometimes return an old version of the document.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainDetailResult withStatusList(java.util.Collection<String> statusList) {
        setStatusList(statusList);
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
        if (getNameservers() != null)
            sb.append("Nameservers: " + getNameservers() + ",");
        if (getAutoRenew() != null)
            sb.append("AutoRenew: " + getAutoRenew() + ",");
        if (getAdminContact() != null)
            sb.append("AdminContact: " + getAdminContact() + ",");
        if (getRegistrantContact() != null)
            sb.append("RegistrantContact: " + getRegistrantContact() + ",");
        if (getTechContact() != null)
            sb.append("TechContact: " + getTechContact() + ",");
        if (getAdminPrivacy() != null)
            sb.append("AdminPrivacy: " + getAdminPrivacy() + ",");
        if (getRegistrantPrivacy() != null)
            sb.append("RegistrantPrivacy: " + getRegistrantPrivacy() + ",");
        if (getTechPrivacy() != null)
            sb.append("TechPrivacy: " + getTechPrivacy() + ",");
        if (getRegistrarName() != null)
            sb.append("RegistrarName: " + getRegistrarName() + ",");
        if (getWhoIsServer() != null)
            sb.append("WhoIsServer: " + getWhoIsServer() + ",");
        if (getRegistrarUrl() != null)
            sb.append("RegistrarUrl: " + getRegistrarUrl() + ",");
        if (getAbuseContactEmail() != null)
            sb.append("AbuseContactEmail: " + getAbuseContactEmail() + ",");
        if (getAbuseContactPhone() != null)
            sb.append("AbuseContactPhone: " + getAbuseContactPhone() + ",");
        if (getRegistryDomainId() != null)
            sb.append("RegistryDomainId: " + getRegistryDomainId() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getUpdatedDate() != null)
            sb.append("UpdatedDate: " + getUpdatedDate() + ",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: " + getExpirationDate() + ",");
        if (getReseller() != null)
            sb.append("Reseller: " + getReseller() + ",");
        if (getDnsSec() != null)
            sb.append("DnsSec: " + getDnsSec() + ",");
        if (getStatusList() != null)
            sb.append("StatusList: " + getStatusList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getNameservers() == null) ? 0 : getNameservers().hashCode());
        hashCode = prime * hashCode + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        hashCode = prime * hashCode
                + ((getAdminContact() == null) ? 0 : getAdminContact().hashCode());
        hashCode = prime * hashCode
                + ((getRegistrantContact() == null) ? 0 : getRegistrantContact().hashCode());
        hashCode = prime * hashCode
                + ((getTechContact() == null) ? 0 : getTechContact().hashCode());
        hashCode = prime * hashCode
                + ((getAdminPrivacy() == null) ? 0 : getAdminPrivacy().hashCode());
        hashCode = prime * hashCode
                + ((getRegistrantPrivacy() == null) ? 0 : getRegistrantPrivacy().hashCode());
        hashCode = prime * hashCode
                + ((getTechPrivacy() == null) ? 0 : getTechPrivacy().hashCode());
        hashCode = prime * hashCode
                + ((getRegistrarName() == null) ? 0 : getRegistrarName().hashCode());
        hashCode = prime * hashCode
                + ((getWhoIsServer() == null) ? 0 : getWhoIsServer().hashCode());
        hashCode = prime * hashCode
                + ((getRegistrarUrl() == null) ? 0 : getRegistrarUrl().hashCode());
        hashCode = prime * hashCode
                + ((getAbuseContactEmail() == null) ? 0 : getAbuseContactEmail().hashCode());
        hashCode = prime * hashCode
                + ((getAbuseContactPhone() == null) ? 0 : getAbuseContactPhone().hashCode());
        hashCode = prime * hashCode
                + ((getRegistryDomainId() == null) ? 0 : getRegistryDomainId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedDate() == null) ? 0 : getUpdatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getReseller() == null) ? 0 : getReseller().hashCode());
        hashCode = prime * hashCode + ((getDnsSec() == null) ? 0 : getDnsSec().hashCode());
        hashCode = prime * hashCode + ((getStatusList() == null) ? 0 : getStatusList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainDetailResult == false)
            return false;
        GetDomainDetailResult other = (GetDomainDetailResult) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getNameservers() == null ^ this.getNameservers() == null)
            return false;
        if (other.getNameservers() != null
                && other.getNameservers().equals(this.getNameservers()) == false)
            return false;
        if (other.getAutoRenew() == null ^ this.getAutoRenew() == null)
            return false;
        if (other.getAutoRenew() != null
                && other.getAutoRenew().equals(this.getAutoRenew()) == false)
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
        if (other.getRegistrarName() == null ^ this.getRegistrarName() == null)
            return false;
        if (other.getRegistrarName() != null
                && other.getRegistrarName().equals(this.getRegistrarName()) == false)
            return false;
        if (other.getWhoIsServer() == null ^ this.getWhoIsServer() == null)
            return false;
        if (other.getWhoIsServer() != null
                && other.getWhoIsServer().equals(this.getWhoIsServer()) == false)
            return false;
        if (other.getRegistrarUrl() == null ^ this.getRegistrarUrl() == null)
            return false;
        if (other.getRegistrarUrl() != null
                && other.getRegistrarUrl().equals(this.getRegistrarUrl()) == false)
            return false;
        if (other.getAbuseContactEmail() == null ^ this.getAbuseContactEmail() == null)
            return false;
        if (other.getAbuseContactEmail() != null
                && other.getAbuseContactEmail().equals(this.getAbuseContactEmail()) == false)
            return false;
        if (other.getAbuseContactPhone() == null ^ this.getAbuseContactPhone() == null)
            return false;
        if (other.getAbuseContactPhone() != null
                && other.getAbuseContactPhone().equals(this.getAbuseContactPhone()) == false)
            return false;
        if (other.getRegistryDomainId() == null ^ this.getRegistryDomainId() == null)
            return false;
        if (other.getRegistryDomainId() != null
                && other.getRegistryDomainId().equals(this.getRegistryDomainId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getUpdatedDate() == null ^ this.getUpdatedDate() == null)
            return false;
        if (other.getUpdatedDate() != null
                && other.getUpdatedDate().equals(this.getUpdatedDate()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null
                && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getReseller() == null ^ this.getReseller() == null)
            return false;
        if (other.getReseller() != null && other.getReseller().equals(this.getReseller()) == false)
            return false;
        if (other.getDnsSec() == null ^ this.getDnsSec() == null)
            return false;
        if (other.getDnsSec() != null && other.getDnsSec().equals(this.getDnsSec()) == false)
            return false;
        if (other.getStatusList() == null ^ this.getStatusList() == null)
            return false;
        if (other.getStatusList() != null
                && other.getStatusList().equals(this.getStatusList()) == false)
            return false;
        return true;
    }
}
