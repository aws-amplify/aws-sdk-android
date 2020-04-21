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
 * Transfers a domain from another registrar to Amazon Route 53. When the
 * transfer is complete, the domain is registered either with Amazon Registrar
 * (for .com, .net, and .org domains) or with our registrar associate, Gandi
 * (for all other TLDs).
 * </p>
 * <p>
 * For more information about transferring domains, see the following topics:
 * </p>
 * <ul>
 * <li>
 * <p>
 * For transfer requirements, a detailed procedure, and information about
 * viewing the status of a domain that you're transferring to Route 53, see <a
 * href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-transfer-to-route-53.html"
 * >Transferring Registration for a Domain to Amazon Route 53</a> in the
 * <i>Amazon Route 53 Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For information about how to transfer a domain from one AWS account to
 * another, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
 * >TransferDomainToAnotherAwsAccount</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For information about how to transfer a domain to another domain registrar,
 * see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-transfer-from-route-53.html"
 * >Transferring a Domain from Amazon Route 53 to Another Registrar</a> in the
 * <i>Amazon Route 53 Developer Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If the registrar for your domain is also the DNS service provider for the
 * domain, we highly recommend that you transfer your DNS service to Route 53 or
 * to another DNS service provider before you transfer your registration. Some
 * registrars provide free DNS service when you purchase a domain registration.
 * When you transfer the registration, the previous registrar will not renew
 * your domain registration and could end your DNS service at any time.
 * </p>
 * <important>
 * <p>
 * If the registrar for your domain is also the DNS service provider for the
 * domain and you don't transfer DNS service to another provider, your website,
 * email, and the web applications associated with the domain might become
 * unavailable.
 * </p>
 * </important>
 * <p>
 * If the transfer is successful, this method returns an operation ID that you
 * can use to track the progress and completion of the action. If the transfer
 * doesn't complete successfully, the domain registrant will be notified by
 * email.
 * </p>
 */
public class TransferDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the domain that you want to transfer to Route 53. The
     * top-level domain (TLD), such as .com, must be a TLD that Route 53
     * supports. For a list of supported TLDs, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * The domain name can contain only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Letters a through z. Domain names are not case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers 0 through 9.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyphen (-). You can't specify a hyphen at the beginning or end of a
     * label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Period (.) to separate the labels in the name, such as the <code>.</code>
     * in <code>example.com</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3<br/>
     */
    private String idnLangCode;

    /**
     * <p>
     * The number of years that you want to register the domain for. Domains are
     * registered for a minimum of one year. The maximum period depends on the
     * top-level domain.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer durationInYears;

    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     */
    private java.util.List<Nameserver> nameservers;

    /**
     * <p>
     * The authorization code for the domain. You get this value from the
     * current registrar.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String authCode;

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not
     * (false). Autorenewal only takes effect after the account is charged.
     * </p>
     * <p>
     * Default: true
     * </p>
     */
    private Boolean autoRenew;

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
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify <code>true</code>, WHOIS ("who is") queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you specify <code>false</code>, WHOIS queries return the information that
     * you entered for the admin contact.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean privacyProtectAdminContact;

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
     * Default: <code>true</code>
     * </p>
     */
    private Boolean privacyProtectRegistrantContact;

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
     * Default: <code>true</code>
     * </p>
     */
    private Boolean privacyProtectTechContact;

    /**
     * <p>
     * The name of the domain that you want to transfer to Route 53. The
     * top-level domain (TLD), such as .com, must be a TLD that Route 53
     * supports. For a list of supported TLDs, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * The domain name can contain only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Letters a through z. Domain names are not case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers 0 through 9.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyphen (-). You can't specify a hyphen at the beginning or end of a
     * label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Period (.) to separate the labels in the name, such as the <code>.</code>
     * in <code>example.com</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the domain that you want to transfer to Route 53. The
     *         top-level domain (TLD), such as .com, must be a TLD that Route 53
     *         supports. For a list of supported TLDs, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *         >Domains that You Can Register with Amazon Route 53</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         <p>
     *         The domain name can contain only the following characters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Letters a through z. Domain names are not case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Numbers 0 through 9.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Hyphen (-). You can't specify a hyphen at the beginning or end of
     *         a label.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Period (.) to separate the labels in the name, such as the
     *         <code>.</code> in <code>example.com</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to transfer to Route 53. The
     * top-level domain (TLD), such as .com, must be a TLD that Route 53
     * supports. For a list of supported TLDs, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * The domain name can contain only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Letters a through z. Domain names are not case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers 0 through 9.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyphen (-). You can't specify a hyphen at the beginning or end of a
     * label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Period (.) to separate the labels in the name, such as the <code>.</code>
     * in <code>example.com</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to transfer to Route 53.
     *            The top-level domain (TLD), such as .com, must be a TLD that
     *            Route 53 supports. For a list of supported TLDs, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a> in the
     *            <i>Amazon Route 53 Developer Guide</i>.
     *            </p>
     *            <p>
     *            The domain name can contain only the following characters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Letters a through z. Domain names are not case sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Numbers 0 through 9.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Hyphen (-). You can't specify a hyphen at the beginning or end
     *            of a label.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Period (.) to separate the labels in the name, such as the
     *            <code>.</code> in <code>example.com</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to transfer to Route 53. The
     * top-level domain (TLD), such as .com, must be a TLD that Route 53
     * supports. For a list of supported TLDs, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * The domain name can contain only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Letters a through z. Domain names are not case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers 0 through 9.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyphen (-). You can't specify a hyphen at the beginning or end of a
     * label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Period (.) to separate the labels in the name, such as the <code>.</code>
     * in <code>example.com</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to transfer to Route 53.
     *            The top-level domain (TLD), such as .com, must be a TLD that
     *            Route 53 supports. For a list of supported TLDs, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a> in the
     *            <i>Amazon Route 53 Developer Guide</i>.
     *            </p>
     *            <p>
     *            The domain name can contain only the following characters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Letters a through z. Domain names are not case sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Numbers 0 through 9.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Hyphen (-). You can't specify a hyphen at the beginning or end
     *            of a label.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Period (.) to separate the labels in the name, such as the
     *            <code>.</code> in <code>example.com</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3<br/>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getIdnLangCode() {
        return idnLangCode;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3<br/>
     *
     * @param idnLangCode <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setIdnLangCode(String idnLangCode) {
        this.idnLangCode = idnLangCode;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3<br/>
     *
     * @param idnLangCode <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainRequest withIdnLangCode(String idnLangCode) {
        this.idnLangCode = idnLangCode;
        return this;
    }

    /**
     * <p>
     * The number of years that you want to register the domain for. Domains are
     * registered for a minimum of one year. The maximum period depends on the
     * top-level domain.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         The number of years that you want to register the domain for.
     *         Domains are registered for a minimum of one year. The maximum
     *         period depends on the top-level domain.
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     */
    public Integer getDurationInYears() {
        return durationInYears;
    }

    /**
     * <p>
     * The number of years that you want to register the domain for. Domains are
     * registered for a minimum of one year. The maximum period depends on the
     * top-level domain.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param durationInYears <p>
     *            The number of years that you want to register the domain for.
     *            Domains are registered for a minimum of one year. The maximum
     *            period depends on the top-level domain.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     */
    public void setDurationInYears(Integer durationInYears) {
        this.durationInYears = durationInYears;
    }

    /**
     * <p>
     * The number of years that you want to register the domain for. Domains are
     * registered for a minimum of one year. The maximum period depends on the
     * top-level domain.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param durationInYears <p>
     *            The number of years that you want to register the domain for.
     *            Domains are registered for a minimum of one year. The maximum
     *            period depends on the top-level domain.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainRequest withDurationInYears(Integer durationInYears) {
        this.durationInYears = durationInYears;
        return this;
    }

    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     *
     * @return <p>
     *         Contains details for the host and glue IP addresses.
     *         </p>
     */
    public java.util.List<Nameserver> getNameservers() {
        return nameservers;
    }

    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     *
     * @param nameservers <p>
     *            Contains details for the host and glue IP addresses.
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
     * Contains details for the host and glue IP addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameservers <p>
     *            Contains details for the host and glue IP addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainRequest withNameservers(Nameserver... nameservers) {
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
     * Contains details for the host and glue IP addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameservers <p>
     *            Contains details for the host and glue IP addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainRequest withNameservers(java.util.Collection<Nameserver> nameservers) {
        setNameservers(nameservers);
        return this;
    }

    /**
     * <p>
     * The authorization code for the domain. You get this value from the
     * current registrar.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The authorization code for the domain. You get this value from
     *         the current registrar.
     *         </p>
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * <p>
     * The authorization code for the domain. You get this value from the
     * current registrar.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param authCode <p>
     *            The authorization code for the domain. You get this value from
     *            the current registrar.
     *            </p>
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * <p>
     * The authorization code for the domain. You get this value from the
     * current registrar.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param authCode <p>
     *            The authorization code for the domain. You get this value from
     *            the current registrar.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainRequest withAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not
     * (false). Autorenewal only takes effect after the account is charged.
     * </p>
     * <p>
     * Default: true
     * </p>
     *
     * @return <p>
     *         Indicates whether the domain will be automatically renewed (true)
     *         or not (false). Autorenewal only takes effect after the account
     *         is charged.
     *         </p>
     *         <p>
     *         Default: true
     *         </p>
     */
    public Boolean isAutoRenew() {
        return autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not
     * (false). Autorenewal only takes effect after the account is charged.
     * </p>
     * <p>
     * Default: true
     * </p>
     *
     * @return <p>
     *         Indicates whether the domain will be automatically renewed (true)
     *         or not (false). Autorenewal only takes effect after the account
     *         is charged.
     *         </p>
     *         <p>
     *         Default: true
     *         </p>
     */
    public Boolean getAutoRenew() {
        return autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not
     * (false). Autorenewal only takes effect after the account is charged.
     * </p>
     * <p>
     * Default: true
     * </p>
     *
     * @param autoRenew <p>
     *            Indicates whether the domain will be automatically renewed
     *            (true) or not (false). Autorenewal only takes effect after the
     *            account is charged.
     *            </p>
     *            <p>
     *            Default: true
     *            </p>
     */
    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not
     * (false). Autorenewal only takes effect after the account is charged.
     * </p>
     * <p>
     * Default: true
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoRenew <p>
     *            Indicates whether the domain will be automatically renewed
     *            (true) or not (false). Autorenewal only takes effect after the
     *            account is charged.
     *            </p>
     *            <p>
     *            Default: true
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainRequest withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
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
    public TransferDomainRequest withAdminContact(ContactDetail adminContact) {
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
    public TransferDomainRequest withRegistrantContact(ContactDetail registrantContact) {
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
    public TransferDomainRequest withTechContact(ContactDetail techContact) {
        this.techContact = techContact;
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
     * <p>
     * Default: <code>true</code>
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
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean isPrivacyProtectAdminContact() {
        return privacyProtectAdminContact;
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
     * Default: <code>true</code>
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
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean getPrivacyProtectAdminContact() {
        return privacyProtectAdminContact;
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
     * Default: <code>true</code>
     * </p>
     *
     * @param privacyProtectAdminContact <p>
     *            Whether you want to conceal contact information from WHOIS
     *            queries. If you specify <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If you specify
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the admin contact.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     */
    public void setPrivacyProtectAdminContact(Boolean privacyProtectAdminContact) {
        this.privacyProtectAdminContact = privacyProtectAdminContact;
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
     * Default: <code>true</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privacyProtectAdminContact <p>
     *            Whether you want to conceal contact information from WHOIS
     *            queries. If you specify <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If you specify
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the admin contact.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainRequest withPrivacyProtectAdminContact(Boolean privacyProtectAdminContact) {
        this.privacyProtectAdminContact = privacyProtectAdminContact;
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
     * <p>
     * Default: <code>true</code>
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
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean isPrivacyProtectRegistrantContact() {
        return privacyProtectRegistrantContact;
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
     * Default: <code>true</code>
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
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean getPrivacyProtectRegistrantContact() {
        return privacyProtectRegistrantContact;
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
     * Default: <code>true</code>
     * </p>
     *
     * @param privacyProtectRegistrantContact <p>
     *            Whether you want to conceal contact information from WHOIS
     *            queries. If you specify <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If you specify
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the registrant contact (domain owner).
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     */
    public void setPrivacyProtectRegistrantContact(Boolean privacyProtectRegistrantContact) {
        this.privacyProtectRegistrantContact = privacyProtectRegistrantContact;
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
     * Default: <code>true</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privacyProtectRegistrantContact <p>
     *            Whether you want to conceal contact information from WHOIS
     *            queries. If you specify <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If you specify
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the registrant contact (domain owner).
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainRequest withPrivacyProtectRegistrantContact(
            Boolean privacyProtectRegistrantContact) {
        this.privacyProtectRegistrantContact = privacyProtectRegistrantContact;
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
     * <p>
     * Default: <code>true</code>
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
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean isPrivacyProtectTechContact() {
        return privacyProtectTechContact;
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
     * Default: <code>true</code>
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
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean getPrivacyProtectTechContact() {
        return privacyProtectTechContact;
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
     * Default: <code>true</code>
     * </p>
     *
     * @param privacyProtectTechContact <p>
     *            Whether you want to conceal contact information from WHOIS
     *            queries. If you specify <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If you specify
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the technical contact.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     */
    public void setPrivacyProtectTechContact(Boolean privacyProtectTechContact) {
        this.privacyProtectTechContact = privacyProtectTechContact;
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
     * Default: <code>true</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privacyProtectTechContact <p>
     *            Whether you want to conceal contact information from WHOIS
     *            queries. If you specify <code>true</code>, WHOIS ("who is")
     *            queries return contact information either for Amazon Registrar
     *            (for .com, .net, and .org domains) or for our registrar
     *            associate, Gandi (for all other TLDs). If you specify
     *            <code>false</code>, WHOIS queries return the information that
     *            you entered for the technical contact.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainRequest withPrivacyProtectTechContact(Boolean privacyProtectTechContact) {
        this.privacyProtectTechContact = privacyProtectTechContact;
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
        if (getIdnLangCode() != null)
            sb.append("IdnLangCode: " + getIdnLangCode() + ",");
        if (getDurationInYears() != null)
            sb.append("DurationInYears: " + getDurationInYears() + ",");
        if (getNameservers() != null)
            sb.append("Nameservers: " + getNameservers() + ",");
        if (getAuthCode() != null)
            sb.append("AuthCode: " + getAuthCode() + ",");
        if (getAutoRenew() != null)
            sb.append("AutoRenew: " + getAutoRenew() + ",");
        if (getAdminContact() != null)
            sb.append("AdminContact: " + getAdminContact() + ",");
        if (getRegistrantContact() != null)
            sb.append("RegistrantContact: " + getRegistrantContact() + ",");
        if (getTechContact() != null)
            sb.append("TechContact: " + getTechContact() + ",");
        if (getPrivacyProtectAdminContact() != null)
            sb.append("PrivacyProtectAdminContact: " + getPrivacyProtectAdminContact() + ",");
        if (getPrivacyProtectRegistrantContact() != null)
            sb.append("PrivacyProtectRegistrantContact: " + getPrivacyProtectRegistrantContact()
                    + ",");
        if (getPrivacyProtectTechContact() != null)
            sb.append("PrivacyProtectTechContact: " + getPrivacyProtectTechContact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getIdnLangCode() == null) ? 0 : getIdnLangCode().hashCode());
        hashCode = prime * hashCode
                + ((getDurationInYears() == null) ? 0 : getDurationInYears().hashCode());
        hashCode = prime * hashCode
                + ((getNameservers() == null) ? 0 : getNameservers().hashCode());
        hashCode = prime * hashCode + ((getAuthCode() == null) ? 0 : getAuthCode().hashCode());
        hashCode = prime * hashCode + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        hashCode = prime * hashCode
                + ((getAdminContact() == null) ? 0 : getAdminContact().hashCode());
        hashCode = prime * hashCode
                + ((getRegistrantContact() == null) ? 0 : getRegistrantContact().hashCode());
        hashCode = prime * hashCode
                + ((getTechContact() == null) ? 0 : getTechContact().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivacyProtectAdminContact() == null) ? 0 : getPrivacyProtectAdminContact()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivacyProtectRegistrantContact() == null) ? 0
                        : getPrivacyProtectRegistrantContact().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivacyProtectTechContact() == null) ? 0 : getPrivacyProtectTechContact()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferDomainRequest == false)
            return false;
        TransferDomainRequest other = (TransferDomainRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getIdnLangCode() == null ^ this.getIdnLangCode() == null)
            return false;
        if (other.getIdnLangCode() != null
                && other.getIdnLangCode().equals(this.getIdnLangCode()) == false)
            return false;
        if (other.getDurationInYears() == null ^ this.getDurationInYears() == null)
            return false;
        if (other.getDurationInYears() != null
                && other.getDurationInYears().equals(this.getDurationInYears()) == false)
            return false;
        if (other.getNameservers() == null ^ this.getNameservers() == null)
            return false;
        if (other.getNameservers() != null
                && other.getNameservers().equals(this.getNameservers()) == false)
            return false;
        if (other.getAuthCode() == null ^ this.getAuthCode() == null)
            return false;
        if (other.getAuthCode() != null && other.getAuthCode().equals(this.getAuthCode()) == false)
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
        if (other.getPrivacyProtectAdminContact() == null
                ^ this.getPrivacyProtectAdminContact() == null)
            return false;
        if (other.getPrivacyProtectAdminContact() != null
                && other.getPrivacyProtectAdminContact().equals(
                        this.getPrivacyProtectAdminContact()) == false)
            return false;
        if (other.getPrivacyProtectRegistrantContact() == null
                ^ this.getPrivacyProtectRegistrantContact() == null)
            return false;
        if (other.getPrivacyProtectRegistrantContact() != null
                && other.getPrivacyProtectRegistrantContact().equals(
                        this.getPrivacyProtectRegistrantContact()) == false)
            return false;
        if (other.getPrivacyProtectTechContact() == null
                ^ this.getPrivacyProtectTechContact() == null)
            return false;
        if (other.getPrivacyProtectTechContact() != null
                && other.getPrivacyProtectTechContact().equals(this.getPrivacyProtectTechContact()) == false)
            return false;
        return true;
    }
}
