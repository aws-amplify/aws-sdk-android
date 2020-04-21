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
 * This operation registers a domain. Domains are registered either by Amazon
 * Registrar (for .com, .net, and .org domains) or by our registrar associate,
 * Gandi (for all other domains). For some top-level domains (TLDs), this
 * operation requires extra parameters.
 * </p>
 * <p>
 * When you register a domain, Amazon Route 53 does the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Creates a Route 53 hosted zone that has the same name as the domain. Route 53
 * assigns four name servers to your hosted zone and automatically updates your
 * domain registration with the names of these name servers.
 * </p>
 * </li>
 * <li>
 * <p>
 * Enables autorenew, so your domain registration will renew automatically each
 * year. We'll notify you in advance of the renewal date so you can choose
 * whether to renew the registration.
 * </p>
 * </li>
 * <li>
 * <p>
 * Optionally enables privacy protection, so WHOIS queries return contact
 * information either for Amazon Registrar (for .com, .net, and .org domains) or
 * for our registrar associate, Gandi (for all other TLDs). If you don't enable
 * privacy protection, WHOIS queries return the information that you entered for
 * the registrant, admin, and tech contacts.
 * </p>
 * </li>
 * <li>
 * <p>
 * If registration is successful, returns an operation ID that you can use to
 * track the progress and completion of the action. If the request is not
 * completed successfully, the domain registrant is notified by email.
 * </p>
 * </li>
 * <li>
 * <p>
 * Charges your AWS account an amount based on the top-level domain. For more
 * information, see <a href="http://aws.amazon.com/route53/pricing/">Amazon
 * Route 53 Pricing</a>.
 * </p>
 * </li>
 * </ul>
 */
public class RegisterDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The domain name that you want to register. The top-level domain (TLD),
     * such as .com, must be a TLD that Route 53 supports. For a list of
     * supported TLDs, see <a href=
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
     * Internationalized domain names are not supported for some top-level
     * domains. To determine whether the TLD that you want to use supports
     * internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-idns"
     * >Formatting Internationalized Domain Names</a>.
     * </p>
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
     * top-level domain. For the range of valid values for your domain, see <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
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
     * Indicates whether the domain will be automatically renewed (
     * <code>true</code>) or not (<code>false</code>). Autorenewal only takes
     * effect after the account is charged.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean autoRenew;

    /**
     * <p>
     * Provides detailed contact information. For information about the values
     * that you specify for each element, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     * >ContactDetail</a>.
     * </p>
     */
    private ContactDetail adminContact;

    /**
     * <p>
     * Provides detailed contact information. For information about the values
     * that you specify for each element, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     * >ContactDetail</a>.
     * </p>
     */
    private ContactDetail registrantContact;

    /**
     * <p>
     * Provides detailed contact information. For information about the values
     * that you specify for each element, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     * >ContactDetail</a>.
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
     * you entered for the registrant contact (the domain owner).
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
     * The domain name that you want to register. The top-level domain (TLD),
     * such as .com, must be a TLD that Route 53 supports. For a list of
     * supported TLDs, see <a href=
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
     * Internationalized domain names are not supported for some top-level
     * domains. To determine whether the TLD that you want to use supports
     * internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-idns"
     * >Formatting Internationalized Domain Names</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The domain name that you want to register. The top-level domain
     *         (TLD), such as .com, must be a TLD that Route 53 supports. For a
     *         list of supported TLDs, see <a href=
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
     *         <p>
     *         Internationalized domain names are not supported for some
     *         top-level domains. To determine whether the TLD that you want to
     *         use supports internationalized domain names, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *         >Domains that You Can Register with Amazon Route 53</a>. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-idns"
     *         >Formatting Internationalized Domain Names</a>.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name that you want to register. The top-level domain (TLD),
     * such as .com, must be a TLD that Route 53 supports. For a list of
     * supported TLDs, see <a href=
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
     * Internationalized domain names are not supported for some top-level
     * domains. To determine whether the TLD that you want to use supports
     * internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-idns"
     * >Formatting Internationalized Domain Names</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The domain name that you want to register. The top-level
     *            domain (TLD), such as .com, must be a TLD that Route 53
     *            supports. For a list of supported TLDs, see <a href=
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
     *            <p>
     *            Internationalized domain names are not supported for some
     *            top-level domains. To determine whether the TLD that you want
     *            to use supports internationalized domain names, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a>. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-idns"
     *            >Formatting Internationalized Domain Names</a>.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name that you want to register. The top-level domain (TLD),
     * such as .com, must be a TLD that Route 53 supports. For a list of
     * supported TLDs, see <a href=
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
     * Internationalized domain names are not supported for some top-level
     * domains. To determine whether the TLD that you want to use supports
     * internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-idns"
     * >Formatting Internationalized Domain Names</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The domain name that you want to register. The top-level
     *            domain (TLD), such as .com, must be a TLD that Route 53
     *            supports. For a list of supported TLDs, see <a href=
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
     *            <p>
     *            Internationalized domain names are not supported for some
     *            top-level domains. To determine whether the TLD that you want
     *            to use supports internationalized domain names, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a>. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html#domain-name-format-idns"
     *            >Formatting Internationalized Domain Names</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDomainRequest withDomainName(String domainName) {
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
    public RegisterDomainRequest withIdnLangCode(String idnLangCode) {
        this.idnLangCode = idnLangCode;
        return this;
    }

    /**
     * <p>
     * The number of years that you want to register the domain for. Domains are
     * registered for a minimum of one year. The maximum period depends on the
     * top-level domain. For the range of valid values for your domain, see <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
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
     *         period depends on the top-level domain. For the range of valid
     *         values for your domain, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *         >Domains that You Can Register with Amazon Route 53</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>.
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
     * top-level domain. For the range of valid values for your domain, see <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
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
     *            period depends on the top-level domain. For the range of valid
     *            values for your domain, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a> in the
     *            <i>Amazon Route 53 Developer Guide</i>.
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
     * top-level domain. For the range of valid values for your domain, see <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
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
     *            period depends on the top-level domain. For the range of valid
     *            values for your domain, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a> in the
     *            <i>Amazon Route 53 Developer Guide</i>.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDomainRequest withDurationInYears(Integer durationInYears) {
        this.durationInYears = durationInYears;
        return this;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (
     * <code>true</code>) or not (<code>false</code>). Autorenewal only takes
     * effect after the account is charged.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @return <p>
     *         Indicates whether the domain will be automatically renewed (
     *         <code>true</code>) or not (<code>false</code>). Autorenewal only
     *         takes effect after the account is charged.
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean isAutoRenew() {
        return autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (
     * <code>true</code>) or not (<code>false</code>). Autorenewal only takes
     * effect after the account is charged.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @return <p>
     *         Indicates whether the domain will be automatically renewed (
     *         <code>true</code>) or not (<code>false</code>). Autorenewal only
     *         takes effect after the account is charged.
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean getAutoRenew() {
        return autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (
     * <code>true</code>) or not (<code>false</code>). Autorenewal only takes
     * effect after the account is charged.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @param autoRenew <p>
     *            Indicates whether the domain will be automatically renewed (
     *            <code>true</code>) or not (<code>false</code>). Autorenewal
     *            only takes effect after the account is charged.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     */
    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (
     * <code>true</code>) or not (<code>false</code>). Autorenewal only takes
     * effect after the account is charged.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoRenew <p>
     *            Indicates whether the domain will be automatically renewed (
     *            <code>true</code>) or not (<code>false</code>). Autorenewal
     *            only takes effect after the account is charged.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDomainRequest withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information. For information about the values
     * that you specify for each element, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     * >ContactDetail</a>.
     * </p>
     *
     * @return <p>
     *         Provides detailed contact information. For information about the
     *         values that you specify for each element, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     *         >ContactDetail</a>.
     *         </p>
     */
    public ContactDetail getAdminContact() {
        return adminContact;
    }

    /**
     * <p>
     * Provides detailed contact information. For information about the values
     * that you specify for each element, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     * >ContactDetail</a>.
     * </p>
     *
     * @param adminContact <p>
     *            Provides detailed contact information. For information about
     *            the values that you specify for each element, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     *            >ContactDetail</a>.
     *            </p>
     */
    public void setAdminContact(ContactDetail adminContact) {
        this.adminContact = adminContact;
    }

    /**
     * <p>
     * Provides detailed contact information. For information about the values
     * that you specify for each element, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     * >ContactDetail</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminContact <p>
     *            Provides detailed contact information. For information about
     *            the values that you specify for each element, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     *            >ContactDetail</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDomainRequest withAdminContact(ContactDetail adminContact) {
        this.adminContact = adminContact;
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information. For information about the values
     * that you specify for each element, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     * >ContactDetail</a>.
     * </p>
     *
     * @return <p>
     *         Provides detailed contact information. For information about the
     *         values that you specify for each element, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     *         >ContactDetail</a>.
     *         </p>
     */
    public ContactDetail getRegistrantContact() {
        return registrantContact;
    }

    /**
     * <p>
     * Provides detailed contact information. For information about the values
     * that you specify for each element, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     * >ContactDetail</a>.
     * </p>
     *
     * @param registrantContact <p>
     *            Provides detailed contact information. For information about
     *            the values that you specify for each element, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     *            >ContactDetail</a>.
     *            </p>
     */
    public void setRegistrantContact(ContactDetail registrantContact) {
        this.registrantContact = registrantContact;
    }

    /**
     * <p>
     * Provides detailed contact information. For information about the values
     * that you specify for each element, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     * >ContactDetail</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registrantContact <p>
     *            Provides detailed contact information. For information about
     *            the values that you specify for each element, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     *            >ContactDetail</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDomainRequest withRegistrantContact(ContactDetail registrantContact) {
        this.registrantContact = registrantContact;
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information. For information about the values
     * that you specify for each element, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     * >ContactDetail</a>.
     * </p>
     *
     * @return <p>
     *         Provides detailed contact information. For information about the
     *         values that you specify for each element, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     *         >ContactDetail</a>.
     *         </p>
     */
    public ContactDetail getTechContact() {
        return techContact;
    }

    /**
     * <p>
     * Provides detailed contact information. For information about the values
     * that you specify for each element, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     * >ContactDetail</a>.
     * </p>
     *
     * @param techContact <p>
     *            Provides detailed contact information. For information about
     *            the values that you specify for each element, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     *            >ContactDetail</a>.
     *            </p>
     */
    public void setTechContact(ContactDetail techContact) {
        this.techContact = techContact;
    }

    /**
     * <p>
     * Provides detailed contact information. For information about the values
     * that you specify for each element, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     * >ContactDetail</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param techContact <p>
     *            Provides detailed contact information. For information about
     *            the values that you specify for each element, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html"
     *            >ContactDetail</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDomainRequest withTechContact(ContactDetail techContact) {
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
    public RegisterDomainRequest withPrivacyProtectAdminContact(Boolean privacyProtectAdminContact) {
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
     * you entered for the registrant contact (the domain owner).
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
     *         entered for the registrant contact (the domain owner).
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
     * you entered for the registrant contact (the domain owner).
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
     *         entered for the registrant contact (the domain owner).
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
     * you entered for the registrant contact (the domain owner).
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
     *            you entered for the registrant contact (the domain owner).
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
     * you entered for the registrant contact (the domain owner).
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
     *            you entered for the registrant contact (the domain owner).
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDomainRequest withPrivacyProtectRegistrantContact(
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
    public RegisterDomainRequest withPrivacyProtectTechContact(Boolean privacyProtectTechContact) {
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

        if (obj instanceof RegisterDomainRequest == false)
            return false;
        RegisterDomainRequest other = (RegisterDomainRequest) obj;

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
