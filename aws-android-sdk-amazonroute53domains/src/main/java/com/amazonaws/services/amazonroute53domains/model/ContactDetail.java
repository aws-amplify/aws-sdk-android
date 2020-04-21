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
 * ContactDetail includes the following elements.
 * </p>
 */
public class ContactDetail implements Serializable {
    /**
     * <p>
     * First name of contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String firstName;

    /**
     * <p>
     * Last name of contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String lastName;

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or
     * public organization. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value other than <code>PERSON</code>, you must also
     * specify a value for <code>OrganizationName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For some TLDs, the privacy protection available depends on the value that
     * you specify for <code>Contact Type</code>. For the privacy protection
     * settings for your TLD, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For .es domains, if you specify <code>PERSON</code>, you must specify
     * <code>INDIVIDUAL</code> for the value of <code>ES_LEGAL_FORM</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY,
     * RESELLER
     */
    private String contactType;

    /**
     * <p>
     * Name of the organization for contact types other than <code>PERSON</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String organizationName;

    /**
     * <p>
     * First line of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String addressLine1;

    /**
     * <p>
     * Second line of contact's address, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String addressLine2;

    /**
     * <p>
     * The city of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String city;

    /**
     * <p>
     * The state or province of the contact's city.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String state;

    /**
     * <p>
     * Code for the country of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS,
     * AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR,
     * BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR,
     * CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI,
     * FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU,
     * GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO,
     * JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR,
     * LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP,
     * MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR,
     * NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO,
     * RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST,
     * SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ,
     * UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM,
     * ZW
     */
    private String countryCode;

    /**
     * <p>
     * The zip or postal code of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String zipCode;

    /**
     * <p>
     * The phone number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code&gt;]". For
     * example, a US phone number might appear as <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 30<br/>
     */
    private String phoneNumber;

    /**
     * <p>
     * Email address of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     */
    private String email;

    /**
     * <p>
     * Fax number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For example,
     * a US phone number might appear as <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 30<br/>
     */
    private String fax;

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level
     * domains.
     * </p>
     */
    private java.util.List<ExtraParam> extraParams;

    /**
     * <p>
     * First name of contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         First name of contact.
     *         </p>
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * <p>
     * First name of contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param firstName <p>
     *            First name of contact.
     *            </p>
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * First name of contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param firstName <p>
     *            First name of contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * <p>
     * Last name of contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         Last name of contact.
     *         </p>
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * <p>
     * Last name of contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param lastName <p>
     *            Last name of contact.
     *            </p>
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * Last name of contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param lastName <p>
     *            Last name of contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or
     * public organization. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value other than <code>PERSON</code>, you must also
     * specify a value for <code>OrganizationName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For some TLDs, the privacy protection available depends on the value that
     * you specify for <code>Contact Type</code>. For the privacy protection
     * settings for your TLD, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For .es domains, if you specify <code>PERSON</code>, you must specify
     * <code>INDIVIDUAL</code> for the value of <code>ES_LEGAL_FORM</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY,
     * RESELLER
     *
     * @return <p>
     *         Indicates whether the contact is a person, company, association,
     *         or public organization. Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify a value other than <code>PERSON</code>, you must
     *         also specify a value for <code>OrganizationName</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For some TLDs, the privacy protection available depends on the
     *         value that you specify for <code>Contact Type</code>. For the
     *         privacy protection settings for your TLD, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *         >Domains that You Can Register with Amazon Route 53</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For .es domains, if you specify <code>PERSON</code>, you must
     *         specify <code>INDIVIDUAL</code> for the value of
     *         <code>ES_LEGAL_FORM</code>.
     *         </p>
     *         </li>
     *         </ul>
     * @see ContactType
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or
     * public organization. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value other than <code>PERSON</code>, you must also
     * specify a value for <code>OrganizationName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For some TLDs, the privacy protection available depends on the value that
     * you specify for <code>Contact Type</code>. For the privacy protection
     * settings for your TLD, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For .es domains, if you specify <code>PERSON</code>, you must specify
     * <code>INDIVIDUAL</code> for the value of <code>ES_LEGAL_FORM</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY,
     * RESELLER
     *
     * @param contactType <p>
     *            Indicates whether the contact is a person, company,
     *            association, or public organization. Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify a value other than <code>PERSON</code>, you
     *            must also specify a value for <code>OrganizationName</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For some TLDs, the privacy protection available depends on the
     *            value that you specify for <code>Contact Type</code>. For the
     *            privacy protection settings for your TLD, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a> in the
     *            <i>Amazon Route 53 Developer Guide</i>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For .es domains, if you specify <code>PERSON</code>, you must
     *            specify <code>INDIVIDUAL</code> for the value of
     *            <code>ES_LEGAL_FORM</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see ContactType
     */
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or
     * public organization. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value other than <code>PERSON</code>, you must also
     * specify a value for <code>OrganizationName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For some TLDs, the privacy protection available depends on the value that
     * you specify for <code>Contact Type</code>. For the privacy protection
     * settings for your TLD, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For .es domains, if you specify <code>PERSON</code>, you must specify
     * <code>INDIVIDUAL</code> for the value of <code>ES_LEGAL_FORM</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY,
     * RESELLER
     *
     * @param contactType <p>
     *            Indicates whether the contact is a person, company,
     *            association, or public organization. Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify a value other than <code>PERSON</code>, you
     *            must also specify a value for <code>OrganizationName</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For some TLDs, the privacy protection available depends on the
     *            value that you specify for <code>Contact Type</code>. For the
     *            privacy protection settings for your TLD, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a> in the
     *            <i>Amazon Route 53 Developer Guide</i>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For .es domains, if you specify <code>PERSON</code>, you must
     *            specify <code>INDIVIDUAL</code> for the value of
     *            <code>ES_LEGAL_FORM</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactType
     */
    public ContactDetail withContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or
     * public organization. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value other than <code>PERSON</code>, you must also
     * specify a value for <code>OrganizationName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For some TLDs, the privacy protection available depends on the value that
     * you specify for <code>Contact Type</code>. For the privacy protection
     * settings for your TLD, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For .es domains, if you specify <code>PERSON</code>, you must specify
     * <code>INDIVIDUAL</code> for the value of <code>ES_LEGAL_FORM</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY,
     * RESELLER
     *
     * @param contactType <p>
     *            Indicates whether the contact is a person, company,
     *            association, or public organization. Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify a value other than <code>PERSON</code>, you
     *            must also specify a value for <code>OrganizationName</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For some TLDs, the privacy protection available depends on the
     *            value that you specify for <code>Contact Type</code>. For the
     *            privacy protection settings for your TLD, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a> in the
     *            <i>Amazon Route 53 Developer Guide</i>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For .es domains, if you specify <code>PERSON</code>, you must
     *            specify <code>INDIVIDUAL</code> for the value of
     *            <code>ES_LEGAL_FORM</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see ContactType
     */
    public void setContactType(ContactType contactType) {
        this.contactType = contactType.toString();
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or
     * public organization. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value other than <code>PERSON</code>, you must also
     * specify a value for <code>OrganizationName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For some TLDs, the privacy protection available depends on the value that
     * you specify for <code>Contact Type</code>. For the privacy protection
     * settings for your TLD, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For .es domains, if you specify <code>PERSON</code>, you must specify
     * <code>INDIVIDUAL</code> for the value of <code>ES_LEGAL_FORM</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY,
     * RESELLER
     *
     * @param contactType <p>
     *            Indicates whether the contact is a person, company,
     *            association, or public organization. Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify a value other than <code>PERSON</code>, you
     *            must also specify a value for <code>OrganizationName</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For some TLDs, the privacy protection available depends on the
     *            value that you specify for <code>Contact Type</code>. For the
     *            privacy protection settings for your TLD, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a> in the
     *            <i>Amazon Route 53 Developer Guide</i>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For .es domains, if you specify <code>PERSON</code>, you must
     *            specify <code>INDIVIDUAL</code> for the value of
     *            <code>ES_LEGAL_FORM</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactType
     */
    public ContactDetail withContactType(ContactType contactType) {
        this.contactType = contactType.toString();
        return this;
    }

    /**
     * <p>
     * Name of the organization for contact types other than <code>PERSON</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         Name of the organization for contact types other than
     *         <code>PERSON</code>.
     *         </p>
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * <p>
     * Name of the organization for contact types other than <code>PERSON</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param organizationName <p>
     *            Name of the organization for contact types other than
     *            <code>PERSON</code>.
     *            </p>
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * <p>
     * Name of the organization for contact types other than <code>PERSON</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param organizationName <p>
     *            Name of the organization for contact types other than
     *            <code>PERSON</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * <p>
     * First line of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         First line of the contact's address.
     *         </p>
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * <p>
     * First line of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param addressLine1 <p>
     *            First line of the contact's address.
     *            </p>
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * <p>
     * First line of the contact's address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param addressLine1 <p>
     *            First line of the contact's address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * <p>
     * Second line of contact's address, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         Second line of contact's address, if any.
     *         </p>
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * <p>
     * Second line of contact's address, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param addressLine2 <p>
     *            Second line of contact's address, if any.
     *            </p>
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * <p>
     * Second line of contact's address, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param addressLine2 <p>
     *            Second line of contact's address, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * <p>
     * The city of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The city of the contact's address.
     *         </p>
     */
    public String getCity() {
        return city;
    }

    /**
     * <p>
     * The city of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param city <p>
     *            The city of the contact's address.
     *            </p>
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The city of the contact's address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param city <p>
     *            The city of the contact's address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * <p>
     * The state or province of the contact's city.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The state or province of the contact's city.
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state or province of the contact's city.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param state <p>
     *            The state or province of the contact's city.
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state or province of the contact's city.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param state <p>
     *            The state or province of the contact's city.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * Code for the country of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS,
     * AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR,
     * BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR,
     * CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI,
     * FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU,
     * GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO,
     * JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR,
     * LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP,
     * MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR,
     * NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO,
     * RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST,
     * SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ,
     * UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM,
     * ZW
     *
     * @return <p>
     *         Code for the country of the contact's address.
     *         </p>
     * @see CountryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * <p>
     * Code for the country of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS,
     * AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR,
     * BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR,
     * CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI,
     * FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU,
     * GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO,
     * JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR,
     * LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP,
     * MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR,
     * NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO,
     * RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST,
     * SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ,
     * UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM,
     * ZW
     *
     * @param countryCode <p>
     *            Code for the country of the contact's address.
     *            </p>
     * @see CountryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * Code for the country of the contact's address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS,
     * AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR,
     * BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR,
     * CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI,
     * FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU,
     * GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO,
     * JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR,
     * LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP,
     * MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR,
     * NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO,
     * RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST,
     * SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ,
     * UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM,
     * ZW
     *
     * @param countryCode <p>
     *            Code for the country of the contact's address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CountryCode
     */
    public ContactDetail withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * <p>
     * Code for the country of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS,
     * AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR,
     * BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR,
     * CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI,
     * FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU,
     * GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO,
     * JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR,
     * LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP,
     * MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR,
     * NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO,
     * RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST,
     * SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ,
     * UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM,
     * ZW
     *
     * @param countryCode <p>
     *            Code for the country of the contact's address.
     *            </p>
     * @see CountryCode
     */
    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode.toString();
    }

    /**
     * <p>
     * Code for the country of the contact's address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS,
     * AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR,
     * BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR,
     * CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI,
     * FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU,
     * GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO,
     * JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR,
     * LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP,
     * MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR,
     * NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO,
     * RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST,
     * SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ,
     * UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM,
     * ZW
     *
     * @param countryCode <p>
     *            Code for the country of the contact's address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CountryCode
     */
    public ContactDetail withCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode.toString();
        return this;
    }

    /**
     * <p>
     * The zip or postal code of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The zip or postal code of the contact's address.
     *         </p>
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * <p>
     * The zip or postal code of the contact's address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param zipCode <p>
     *            The zip or postal code of the contact's address.
     *            </p>
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * <p>
     * The zip or postal code of the contact's address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param zipCode <p>
     *            The zip or postal code of the contact's address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * <p>
     * The phone number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code&gt;]". For
     * example, a US phone number might appear as <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 30<br/>
     *
     * @return <p>
     *         The phone number of the contact.
     *         </p>
     *         <p>
     *         Constraints: Phone number must be specified in the format
     *         "+[country dialing code].[number including any area code&gt;]".
     *         For example, a US phone number might appear as
     *         <code>"+1.1234567890"</code>.
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code&gt;]". For
     * example, a US phone number might appear as <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 30<br/>
     *
     * @param phoneNumber <p>
     *            The phone number of the contact.
     *            </p>
     *            <p>
     *            Constraints: Phone number must be specified in the format
     *            "+[country dialing code].[number including any area code&gt;]"
     *            . For example, a US phone number might appear as
     *            <code>"+1.1234567890"</code>.
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code&gt;]". For
     * example, a US phone number might appear as <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 30<br/>
     *
     * @param phoneNumber <p>
     *            The phone number of the contact.
     *            </p>
     *            <p>
     *            Constraints: Phone number must be specified in the format
     *            "+[country dialing code].[number including any area code&gt;]"
     *            . For example, a US phone number might appear as
     *            <code>"+1.1234567890"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * <p>
     * Email address of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @return <p>
     *         Email address of the contact.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * Email address of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @param email <p>
     *            Email address of the contact.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * Email address of the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @param email <p>
     *            Email address of the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * Fax number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For example,
     * a US phone number might appear as <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 30<br/>
     *
     * @return <p>
     *         Fax number of the contact.
     *         </p>
     *         <p>
     *         Constraints: Phone number must be specified in the format
     *         "+[country dialing code].[number including any area code]". For
     *         example, a US phone number might appear as
     *         <code>"+1.1234567890"</code>.
     *         </p>
     */
    public String getFax() {
        return fax;
    }

    /**
     * <p>
     * Fax number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For example,
     * a US phone number might appear as <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 30<br/>
     *
     * @param fax <p>
     *            Fax number of the contact.
     *            </p>
     *            <p>
     *            Constraints: Phone number must be specified in the format
     *            "+[country dialing code].[number including any area code]".
     *            For example, a US phone number might appear as
     *            <code>"+1.1234567890"</code>.
     *            </p>
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * <p>
     * Fax number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For example,
     * a US phone number might appear as <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 30<br/>
     *
     * @param fax <p>
     *            Fax number of the contact.
     *            </p>
     *            <p>
     *            Constraints: Phone number must be specified in the format
     *            "+[country dialing code].[number including any area code]".
     *            For example, a US phone number might appear as
     *            <code>"+1.1234567890"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withFax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level
     * domains.
     * </p>
     *
     * @return <p>
     *         A list of name-value pairs for parameters required by certain
     *         top-level domains.
     *         </p>
     */
    public java.util.List<ExtraParam> getExtraParams() {
        return extraParams;
    }

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level
     * domains.
     * </p>
     *
     * @param extraParams <p>
     *            A list of name-value pairs for parameters required by certain
     *            top-level domains.
     *            </p>
     */
    public void setExtraParams(java.util.Collection<ExtraParam> extraParams) {
        if (extraParams == null) {
            this.extraParams = null;
            return;
        }

        this.extraParams = new java.util.ArrayList<ExtraParam>(extraParams);
    }

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level
     * domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extraParams <p>
     *            A list of name-value pairs for parameters required by certain
     *            top-level domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withExtraParams(ExtraParam... extraParams) {
        if (getExtraParams() == null) {
            this.extraParams = new java.util.ArrayList<ExtraParam>(extraParams.length);
        }
        for (ExtraParam value : extraParams) {
            this.extraParams.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level
     * domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extraParams <p>
     *            A list of name-value pairs for parameters required by certain
     *            top-level domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDetail withExtraParams(java.util.Collection<ExtraParam> extraParams) {
        setExtraParams(extraParams);
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
        if (getFirstName() != null)
            sb.append("FirstName: " + getFirstName() + ",");
        if (getLastName() != null)
            sb.append("LastName: " + getLastName() + ",");
        if (getContactType() != null)
            sb.append("ContactType: " + getContactType() + ",");
        if (getOrganizationName() != null)
            sb.append("OrganizationName: " + getOrganizationName() + ",");
        if (getAddressLine1() != null)
            sb.append("AddressLine1: " + getAddressLine1() + ",");
        if (getAddressLine2() != null)
            sb.append("AddressLine2: " + getAddressLine2() + ",");
        if (getCity() != null)
            sb.append("City: " + getCity() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getCountryCode() != null)
            sb.append("CountryCode: " + getCountryCode() + ",");
        if (getZipCode() != null)
            sb.append("ZipCode: " + getZipCode() + ",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getFax() != null)
            sb.append("Fax: " + getFax() + ",");
        if (getExtraParams() != null)
            sb.append("ExtraParams: " + getExtraParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode
                + ((getContactType() == null) ? 0 : getContactType().hashCode());
        hashCode = prime * hashCode
                + ((getOrganizationName() == null) ? 0 : getOrganizationName().hashCode());
        hashCode = prime * hashCode
                + ((getAddressLine1() == null) ? 0 : getAddressLine1().hashCode());
        hashCode = prime * hashCode
                + ((getAddressLine2() == null) ? 0 : getAddressLine2().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getFax() == null) ? 0 : getFax().hashCode());
        hashCode = prime * hashCode
                + ((getExtraParams() == null) ? 0 : getExtraParams().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactDetail == false)
            return false;
        ContactDetail other = (ContactDetail) obj;

        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null
                && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getContactType() == null ^ this.getContactType() == null)
            return false;
        if (other.getContactType() != null
                && other.getContactType().equals(this.getContactType()) == false)
            return false;
        if (other.getOrganizationName() == null ^ this.getOrganizationName() == null)
            return false;
        if (other.getOrganizationName() != null
                && other.getOrganizationName().equals(this.getOrganizationName()) == false)
            return false;
        if (other.getAddressLine1() == null ^ this.getAddressLine1() == null)
            return false;
        if (other.getAddressLine1() != null
                && other.getAddressLine1().equals(this.getAddressLine1()) == false)
            return false;
        if (other.getAddressLine2() == null ^ this.getAddressLine2() == null)
            return false;
        if (other.getAddressLine2() != null
                && other.getAddressLine2().equals(this.getAddressLine2()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null
                && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getZipCode() == null ^ this.getZipCode() == null)
            return false;
        if (other.getZipCode() != null && other.getZipCode().equals(this.getZipCode()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getFax() == null ^ this.getFax() == null)
            return false;
        if (other.getFax() != null && other.getFax().equals(this.getFax()) == false)
            return false;
        if (other.getExtraParams() == null ^ this.getExtraParams() == null)
            return false;
        if (other.getExtraParams() != null
                && other.getExtraParams().equals(this.getExtraParams()) == false)
            return false;
        return true;
    }
}
