/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Searches for available phone numbers that you can claim to your Amazon
 * Connect instance or traffic distribution group. If the provided
 * <code>TargetArn</code> is a traffic distribution group, you can call this API
 * in both Amazon Web Services Regions associated with the traffic distribution
 * group.
 * </p>
 */
public class SearchAvailablePhoneNumbersRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic
     * distribution groups that phone numbers are claimed to.
     * </p>
     */
    private String targetArn;

    /**
     * <p>
     * The ISO country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AF, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW,
     * AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BA, BW, BR, IO,
     * VG, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM,
     * CK, CR, HR, CU, CW, CY, CZ, CD, DK, DJ, DM, DO, TL, EC, EG, SV, GQ, ER,
     * EE, ET, FK, FO, FJ, FI, FR, PF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GU,
     * GT, GG, GN, GW, GY, HT, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT,
     * CI, JM, JP, JE, JO, KZ, KE, KI, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT,
     * LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MR, MU, YT, MX, FM, MD, MC, MN,
     * ME, MS, MA, MZ, MM, NA, NR, NP, NL, AN, NC, NZ, NI, NE, NG, NU, KP, MP,
     * NO, OM, PK, PW, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, CG, RE, RO, RU,
     * RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX,
     * SK, SI, SB, SO, ZA, KR, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ,
     * TH, TG, TK, TO, TT, TN, TR, TM, TC, TV, VI, UG, UA, AE, GB, US, UY, UZ,
     * VU, VA, VE, VN, WF, EH, YE, ZM, ZW
     */
    private String phoneNumberCountryCode;

    /**
     * <p>
     * The type of phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOLL_FREE, DID, UIFN, SHARED, THIRD_PARTY_TF,
     * THIRD_PARTY_DID
     */
    private String phoneNumberType;

    /**
     * <p>
     * The prefix of the phone number. If provided, it must contain
     * <code>+</code> as part of the country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+?[0-9]{1,11}<br/>
     */
    private String phoneNumberPrefix;

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic
     * distribution groups that phone numbers are claimed to.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for Amazon Connect instances or
     *         traffic distribution groups that phone numbers are claimed to.
     *         </p>
     */
    public String getTargetArn() {
        return targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic
     * distribution groups that phone numbers are claimed to.
     * </p>
     *
     * @param targetArn <p>
     *            The Amazon Resource Name (ARN) for Amazon Connect instances or
     *            traffic distribution groups that phone numbers are claimed to.
     *            </p>
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic
     * distribution groups that phone numbers are claimed to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetArn <p>
     *            The Amazon Resource Name (ARN) for Amazon Connect instances or
     *            traffic distribution groups that phone numbers are claimed to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersRequest withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AF, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW,
     * AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BA, BW, BR, IO,
     * VG, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM,
     * CK, CR, HR, CU, CW, CY, CZ, CD, DK, DJ, DM, DO, TL, EC, EG, SV, GQ, ER,
     * EE, ET, FK, FO, FJ, FI, FR, PF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GU,
     * GT, GG, GN, GW, GY, HT, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT,
     * CI, JM, JP, JE, JO, KZ, KE, KI, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT,
     * LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MR, MU, YT, MX, FM, MD, MC, MN,
     * ME, MS, MA, MZ, MM, NA, NR, NP, NL, AN, NC, NZ, NI, NE, NG, NU, KP, MP,
     * NO, OM, PK, PW, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, CG, RE, RO, RU,
     * RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX,
     * SK, SI, SB, SO, ZA, KR, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ,
     * TH, TG, TK, TO, TT, TN, TR, TM, TC, TV, VI, UG, UA, AE, GB, US, UY, UZ,
     * VU, VA, VE, VN, WF, EH, YE, ZM, ZW
     *
     * @return <p>
     *         The ISO country code.
     *         </p>
     * @see PhoneNumberCountryCode
     */
    public String getPhoneNumberCountryCode() {
        return phoneNumberCountryCode;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AF, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW,
     * AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BA, BW, BR, IO,
     * VG, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM,
     * CK, CR, HR, CU, CW, CY, CZ, CD, DK, DJ, DM, DO, TL, EC, EG, SV, GQ, ER,
     * EE, ET, FK, FO, FJ, FI, FR, PF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GU,
     * GT, GG, GN, GW, GY, HT, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT,
     * CI, JM, JP, JE, JO, KZ, KE, KI, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT,
     * LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MR, MU, YT, MX, FM, MD, MC, MN,
     * ME, MS, MA, MZ, MM, NA, NR, NP, NL, AN, NC, NZ, NI, NE, NG, NU, KP, MP,
     * NO, OM, PK, PW, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, CG, RE, RO, RU,
     * RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX,
     * SK, SI, SB, SO, ZA, KR, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ,
     * TH, TG, TK, TO, TT, TN, TR, TM, TC, TV, VI, UG, UA, AE, GB, US, UY, UZ,
     * VU, VA, VE, VN, WF, EH, YE, ZM, ZW
     *
     * @param phoneNumberCountryCode <p>
     *            The ISO country code.
     *            </p>
     * @see PhoneNumberCountryCode
     */
    public void setPhoneNumberCountryCode(String phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AF, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW,
     * AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BA, BW, BR, IO,
     * VG, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM,
     * CK, CR, HR, CU, CW, CY, CZ, CD, DK, DJ, DM, DO, TL, EC, EG, SV, GQ, ER,
     * EE, ET, FK, FO, FJ, FI, FR, PF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GU,
     * GT, GG, GN, GW, GY, HT, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT,
     * CI, JM, JP, JE, JO, KZ, KE, KI, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT,
     * LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MR, MU, YT, MX, FM, MD, MC, MN,
     * ME, MS, MA, MZ, MM, NA, NR, NP, NL, AN, NC, NZ, NI, NE, NG, NU, KP, MP,
     * NO, OM, PK, PW, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, CG, RE, RO, RU,
     * RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX,
     * SK, SI, SB, SO, ZA, KR, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ,
     * TH, TG, TK, TO, TT, TN, TR, TM, TC, TV, VI, UG, UA, AE, GB, US, UY, UZ,
     * VU, VA, VE, VN, WF, EH, YE, ZM, ZW
     *
     * @param phoneNumberCountryCode <p>
     *            The ISO country code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberCountryCode
     */
    public SearchAvailablePhoneNumbersRequest withPhoneNumberCountryCode(
            String phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode;
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AF, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW,
     * AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BA, BW, BR, IO,
     * VG, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM,
     * CK, CR, HR, CU, CW, CY, CZ, CD, DK, DJ, DM, DO, TL, EC, EG, SV, GQ, ER,
     * EE, ET, FK, FO, FJ, FI, FR, PF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GU,
     * GT, GG, GN, GW, GY, HT, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT,
     * CI, JM, JP, JE, JO, KZ, KE, KI, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT,
     * LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MR, MU, YT, MX, FM, MD, MC, MN,
     * ME, MS, MA, MZ, MM, NA, NR, NP, NL, AN, NC, NZ, NI, NE, NG, NU, KP, MP,
     * NO, OM, PK, PW, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, CG, RE, RO, RU,
     * RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX,
     * SK, SI, SB, SO, ZA, KR, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ,
     * TH, TG, TK, TO, TT, TN, TR, TM, TC, TV, VI, UG, UA, AE, GB, US, UY, UZ,
     * VU, VA, VE, VN, WF, EH, YE, ZM, ZW
     *
     * @param phoneNumberCountryCode <p>
     *            The ISO country code.
     *            </p>
     * @see PhoneNumberCountryCode
     */
    public void setPhoneNumberCountryCode(PhoneNumberCountryCode phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode.toString();
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AF, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW,
     * AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BA, BW, BR, IO,
     * VG, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM,
     * CK, CR, HR, CU, CW, CY, CZ, CD, DK, DJ, DM, DO, TL, EC, EG, SV, GQ, ER,
     * EE, ET, FK, FO, FJ, FI, FR, PF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GU,
     * GT, GG, GN, GW, GY, HT, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT,
     * CI, JM, JP, JE, JO, KZ, KE, KI, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT,
     * LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MR, MU, YT, MX, FM, MD, MC, MN,
     * ME, MS, MA, MZ, MM, NA, NR, NP, NL, AN, NC, NZ, NI, NE, NG, NU, KP, MP,
     * NO, OM, PK, PW, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, CG, RE, RO, RU,
     * RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX,
     * SK, SI, SB, SO, ZA, KR, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ,
     * TH, TG, TK, TO, TT, TN, TR, TM, TC, TV, VI, UG, UA, AE, GB, US, UY, UZ,
     * VU, VA, VE, VN, WF, EH, YE, ZM, ZW
     *
     * @param phoneNumberCountryCode <p>
     *            The ISO country code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberCountryCode
     */
    public SearchAvailablePhoneNumbersRequest withPhoneNumberCountryCode(
            PhoneNumberCountryCode phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode.toString();
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOLL_FREE, DID, UIFN, SHARED, THIRD_PARTY_TF,
     * THIRD_PARTY_DID
     *
     * @return <p>
     *         The type of phone number.
     *         </p>
     * @see PhoneNumberType
     */
    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOLL_FREE, DID, UIFN, SHARED, THIRD_PARTY_TF,
     * THIRD_PARTY_DID
     *
     * @param phoneNumberType <p>
     *            The type of phone number.
     *            </p>
     * @see PhoneNumberType
     */
    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOLL_FREE, DID, UIFN, SHARED, THIRD_PARTY_TF,
     * THIRD_PARTY_DID
     *
     * @param phoneNumberType <p>
     *            The type of phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberType
     */
    public SearchAvailablePhoneNumbersRequest withPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOLL_FREE, DID, UIFN, SHARED, THIRD_PARTY_TF,
     * THIRD_PARTY_DID
     *
     * @param phoneNumberType <p>
     *            The type of phone number.
     *            </p>
     * @see PhoneNumberType
     */
    public void setPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType.toString();
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOLL_FREE, DID, UIFN, SHARED, THIRD_PARTY_TF,
     * THIRD_PARTY_DID
     *
     * @param phoneNumberType <p>
     *            The type of phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberType
     */
    public SearchAvailablePhoneNumbersRequest withPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType.toString();
        return this;
    }

    /**
     * <p>
     * The prefix of the phone number. If provided, it must contain
     * <code>+</code> as part of the country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+?[0-9]{1,11}<br/>
     *
     * @return <p>
     *         The prefix of the phone number. If provided, it must contain
     *         <code>+</code> as part of the country code.
     *         </p>
     */
    public String getPhoneNumberPrefix() {
        return phoneNumberPrefix;
    }

    /**
     * <p>
     * The prefix of the phone number. If provided, it must contain
     * <code>+</code> as part of the country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+?[0-9]{1,11}<br/>
     *
     * @param phoneNumberPrefix <p>
     *            The prefix of the phone number. If provided, it must contain
     *            <code>+</code> as part of the country code.
     *            </p>
     */
    public void setPhoneNumberPrefix(String phoneNumberPrefix) {
        this.phoneNumberPrefix = phoneNumberPrefix;
    }

    /**
     * <p>
     * The prefix of the phone number. If provided, it must contain
     * <code>+</code> as part of the country code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+?[0-9]{1,11}<br/>
     *
     * @param phoneNumberPrefix <p>
     *            The prefix of the phone number. If provided, it must contain
     *            <code>+</code> as part of the country code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersRequest withPhoneNumberPrefix(String phoneNumberPrefix) {
        this.phoneNumberPrefix = phoneNumberPrefix;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         The maximum number of results to return per page.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @return <p>
     *         The token for the next set of results. Use the value returned in
     *         the previous response in the next request to retrieve the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getTargetArn() != null)
            sb.append("TargetArn: " + getTargetArn() + ",");
        if (getPhoneNumberCountryCode() != null)
            sb.append("PhoneNumberCountryCode: " + getPhoneNumberCountryCode() + ",");
        if (getPhoneNumberType() != null)
            sb.append("PhoneNumberType: " + getPhoneNumberType() + ",");
        if (getPhoneNumberPrefix() != null)
            sb.append("PhoneNumberPrefix: " + getPhoneNumberPrefix() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhoneNumberCountryCode() == null) ? 0 : getPhoneNumberCountryCode()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumberType() == null) ? 0 : getPhoneNumberType().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumberPrefix() == null) ? 0 : getPhoneNumberPrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchAvailablePhoneNumbersRequest == false)
            return false;
        SearchAvailablePhoneNumbersRequest other = (SearchAvailablePhoneNumbersRequest) obj;

        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null
                && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getPhoneNumberCountryCode() == null ^ this.getPhoneNumberCountryCode() == null)
            return false;
        if (other.getPhoneNumberCountryCode() != null
                && other.getPhoneNumberCountryCode().equals(this.getPhoneNumberCountryCode()) == false)
            return false;
        if (other.getPhoneNumberType() == null ^ this.getPhoneNumberType() == null)
            return false;
        if (other.getPhoneNumberType() != null
                && other.getPhoneNumberType().equals(this.getPhoneNumberType()) == false)
            return false;
        if (other.getPhoneNumberPrefix() == null ^ this.getPhoneNumberPrefix() == null)
            return false;
        if (other.getPhoneNumberPrefix() != null
                && other.getPhoneNumberPrefix().equals(this.getPhoneNumberPrefix()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
