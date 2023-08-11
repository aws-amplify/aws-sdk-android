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

/**
 * <p>
 * Information about a phone number that has been claimed to your Amazon Connect
 * instance or traffic distribution group.
 * </p>
 */
public class ClaimedPhoneNumberSummary implements Serializable {
    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     */
    private String phoneNumberId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     */
    private String phoneNumberArn;

    /**
     * <p>
     * The phone number. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+[1-9]\\d{1,14}$<br/>
     */
    private String phoneNumber;

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
     * The description of the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^[\W\S_]*<br/>
     */
    private String phoneNumberDescription;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic
     * distribution groups that phone numbers are claimed to.
     * </p>
     */
    private String targetArn;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The status of the phone number.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLAIMED</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     * >ClaimedPhoneNumber</a> or <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means a <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     * >ClaimedPhoneNumber</a> or <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation is still in progress and has not yet
     * completed. You can call <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> at a later time to verify if the previous
     * operation has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     * >ClaimedPhoneNumber</a> or <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation has failed. It will include a message
     * indicating the failure reason. A common reason for a failure may be that
     * the <code>TargetArn</code> value you are claiming or updating a phone
     * number to has reached its limit of total claimed numbers. If you received
     * a <code>FAILED</code> status from a <code>ClaimPhoneNumber</code> API
     * call, you have one day to retry claiming the phone number before the
     * number is released back to the inventory for other customers to claim.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You will not be billed for the phone number during the 1-day period if
     * number claiming fails.
     * </p>
     * </note>
     */
    private PhoneNumberStatus phoneNumberStatus;

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the phone number.
     *         </p>
     */
    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     *
     * @param phoneNumberId <p>
     *            A unique identifier for the phone number.
     *            </p>
     */
    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberId <p>
     *            A unique identifier for the phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClaimedPhoneNumberSummary withPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the phone number.
     *         </p>
     */
    public String getPhoneNumberArn() {
        return phoneNumberArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     *
     * @param phoneNumberArn <p>
     *            The Amazon Resource Name (ARN) of the phone number.
     *            </p>
     */
    public void setPhoneNumberArn(String phoneNumberArn) {
        this.phoneNumberArn = phoneNumberArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberArn <p>
     *            The Amazon Resource Name (ARN) of the phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClaimedPhoneNumberSummary withPhoneNumberArn(String phoneNumberArn) {
        this.phoneNumberArn = phoneNumberArn;
        return this;
    }

    /**
     * <p>
     * The phone number. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+[1-9]\\d{1,14}$<br/>
     *
     * @return <p>
     *         The phone number. Phone numbers are formatted
     *         <code>[+] [country code] [subscriber number including area code]</code>
     *         .
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The phone number. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+[1-9]\\d{1,14}$<br/>
     *
     * @param phoneNumber <p>
     *            The phone number. Phone numbers are formatted
     *            <code>[+] [country code] [subscriber number including area code]</code>
     *            .
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+[1-9]\\d{1,14}$<br/>
     *
     * @param phoneNumber <p>
     *            The phone number. Phone numbers are formatted
     *            <code>[+] [country code] [subscriber number including area code]</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClaimedPhoneNumberSummary withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
    public ClaimedPhoneNumberSummary withPhoneNumberCountryCode(String phoneNumberCountryCode) {
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
    public ClaimedPhoneNumberSummary withPhoneNumberCountryCode(
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
    public ClaimedPhoneNumberSummary withPhoneNumberType(String phoneNumberType) {
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
    public ClaimedPhoneNumberSummary withPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType.toString();
        return this;
    }

    /**
     * <p>
     * The description of the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^[\W\S_]*<br/>
     *
     * @return <p>
     *         The description of the phone number.
     *         </p>
     */
    public String getPhoneNumberDescription() {
        return phoneNumberDescription;
    }

    /**
     * <p>
     * The description of the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^[\W\S_]*<br/>
     *
     * @param phoneNumberDescription <p>
     *            The description of the phone number.
     *            </p>
     */
    public void setPhoneNumberDescription(String phoneNumberDescription) {
        this.phoneNumberDescription = phoneNumberDescription;
    }

    /**
     * <p>
     * The description of the phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^[\W\S_]*<br/>
     *
     * @param phoneNumberDescription <p>
     *            The description of the phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClaimedPhoneNumberSummary withPhoneNumberDescription(String phoneNumberDescription) {
        this.phoneNumberDescription = phoneNumberDescription;
        return this;
    }

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
    public ClaimedPhoneNumberSummary withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     *
     * @return <p>
     *         The tags used to organize, track, or control access for this
     *         resource. For example, { "tags": {"key1":"value1",
     *         "key2":"value2"} }.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "tags": {"key1":"value1",
     *            "key2":"value2"} }.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "tags": {"key1":"value1",
     *            "key2":"value2"} }.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClaimedPhoneNumberSummary withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClaimedPhoneNumberSummary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ClaimedPhoneNumberSummary clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The status of the phone number.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLAIMED</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     * >ClaimedPhoneNumber</a> or <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means a <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     * >ClaimedPhoneNumber</a> or <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation is still in progress and has not yet
     * completed. You can call <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> at a later time to verify if the previous
     * operation has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     * >ClaimedPhoneNumber</a> or <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation has failed. It will include a message
     * indicating the failure reason. A common reason for a failure may be that
     * the <code>TargetArn</code> value you are claiming or updating a phone
     * number to has reached its limit of total claimed numbers. If you received
     * a <code>FAILED</code> status from a <code>ClaimPhoneNumber</code> API
     * call, you have one day to retry claiming the phone number before the
     * number is released back to the inventory for other customers to claim.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You will not be billed for the phone number during the 1-day period if
     * number claiming fails.
     * </p>
     * </note>
     *
     * @return <p>
     *         The status of the phone number.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CLAIMED</code> means the previous <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *         >ClaimedPhoneNumber</a> or <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *         >UpdatePhoneNumber</a> operation succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> means a <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *         >ClaimedPhoneNumber</a> or <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *         >UpdatePhoneNumber</a> operation is still in progress and has not
     *         yet completed. You can call <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     *         >DescribePhoneNumber</a> at a later time to verify if the
     *         previous operation has completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> indicates that the previous <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *         >ClaimedPhoneNumber</a> or <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *         >UpdatePhoneNumber</a> operation has failed. It will include a
     *         message indicating the failure reason. A common reason for a
     *         failure may be that the <code>TargetArn</code> value you are
     *         claiming or updating a phone number to has reached its limit of
     *         total claimed numbers. If you received a <code>FAILED</code>
     *         status from a <code>ClaimPhoneNumber</code> API call, you have
     *         one day to retry claiming the phone number before the number is
     *         released back to the inventory for other customers to claim.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         You will not be billed for the phone number during the 1-day
     *         period if number claiming fails.
     *         </p>
     *         </note>
     */
    public PhoneNumberStatus getPhoneNumberStatus() {
        return phoneNumberStatus;
    }

    /**
     * <p>
     * The status of the phone number.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLAIMED</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     * >ClaimedPhoneNumber</a> or <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means a <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     * >ClaimedPhoneNumber</a> or <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation is still in progress and has not yet
     * completed. You can call <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> at a later time to verify if the previous
     * operation has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     * >ClaimedPhoneNumber</a> or <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation has failed. It will include a message
     * indicating the failure reason. A common reason for a failure may be that
     * the <code>TargetArn</code> value you are claiming or updating a phone
     * number to has reached its limit of total claimed numbers. If you received
     * a <code>FAILED</code> status from a <code>ClaimPhoneNumber</code> API
     * call, you have one day to retry claiming the phone number before the
     * number is released back to the inventory for other customers to claim.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You will not be billed for the phone number during the 1-day period if
     * number claiming fails.
     * </p>
     * </note>
     *
     * @param phoneNumberStatus <p>
     *            The status of the phone number.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CLAIMED</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *            >ClaimedPhoneNumber</a> or <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *            >UpdatePhoneNumber</a> operation succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> means a <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *            >ClaimedPhoneNumber</a> or <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *            >UpdatePhoneNumber</a> operation is still in progress and has
     *            not yet completed. You can call <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     *            >DescribePhoneNumber</a> at a later time to verify if the
     *            previous operation has completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> indicates that the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *            >ClaimedPhoneNumber</a> or <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *            >UpdatePhoneNumber</a> operation has failed. It will include a
     *            message indicating the failure reason. A common reason for a
     *            failure may be that the <code>TargetArn</code> value you are
     *            claiming or updating a phone number to has reached its limit
     *            of total claimed numbers. If you received a
     *            <code>FAILED</code> status from a
     *            <code>ClaimPhoneNumber</code> API call, you have one day to
     *            retry claiming the phone number before the number is released
     *            back to the inventory for other customers to claim.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            You will not be billed for the phone number during the 1-day
     *            period if number claiming fails.
     *            </p>
     *            </note>
     */
    public void setPhoneNumberStatus(PhoneNumberStatus phoneNumberStatus) {
        this.phoneNumberStatus = phoneNumberStatus;
    }

    /**
     * <p>
     * The status of the phone number.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLAIMED</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     * >ClaimedPhoneNumber</a> or <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means a <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     * >ClaimedPhoneNumber</a> or <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation is still in progress and has not yet
     * completed. You can call <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> at a later time to verify if the previous
     * operation has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     * >ClaimedPhoneNumber</a> or <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation has failed. It will include a message
     * indicating the failure reason. A common reason for a failure may be that
     * the <code>TargetArn</code> value you are claiming or updating a phone
     * number to has reached its limit of total claimed numbers. If you received
     * a <code>FAILED</code> status from a <code>ClaimPhoneNumber</code> API
     * call, you have one day to retry claiming the phone number before the
     * number is released back to the inventory for other customers to claim.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You will not be billed for the phone number during the 1-day period if
     * number claiming fails.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberStatus <p>
     *            The status of the phone number.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CLAIMED</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *            >ClaimedPhoneNumber</a> or <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *            >UpdatePhoneNumber</a> operation succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> means a <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *            >ClaimedPhoneNumber</a> or <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *            >UpdatePhoneNumber</a> operation is still in progress and has
     *            not yet completed. You can call <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     *            >DescribePhoneNumber</a> at a later time to verify if the
     *            previous operation has completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> indicates that the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *            >ClaimedPhoneNumber</a> or <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *            >UpdatePhoneNumber</a> operation has failed. It will include a
     *            message indicating the failure reason. A common reason for a
     *            failure may be that the <code>TargetArn</code> value you are
     *            claiming or updating a phone number to has reached its limit
     *            of total claimed numbers. If you received a
     *            <code>FAILED</code> status from a
     *            <code>ClaimPhoneNumber</code> API call, you have one day to
     *            retry claiming the phone number before the number is released
     *            back to the inventory for other customers to claim.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            You will not be billed for the phone number during the 1-day
     *            period if number claiming fails.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClaimedPhoneNumberSummary withPhoneNumberStatus(PhoneNumberStatus phoneNumberStatus) {
        this.phoneNumberStatus = phoneNumberStatus;
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
        if (getPhoneNumberId() != null)
            sb.append("PhoneNumberId: " + getPhoneNumberId() + ",");
        if (getPhoneNumberArn() != null)
            sb.append("PhoneNumberArn: " + getPhoneNumberArn() + ",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getPhoneNumberCountryCode() != null)
            sb.append("PhoneNumberCountryCode: " + getPhoneNumberCountryCode() + ",");
        if (getPhoneNumberType() != null)
            sb.append("PhoneNumberType: " + getPhoneNumberType() + ",");
        if (getPhoneNumberDescription() != null)
            sb.append("PhoneNumberDescription: " + getPhoneNumberDescription() + ",");
        if (getTargetArn() != null)
            sb.append("TargetArn: " + getTargetArn() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getPhoneNumberStatus() != null)
            sb.append("PhoneNumberStatus: " + getPhoneNumberStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPhoneNumberId() == null) ? 0 : getPhoneNumberId().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumberArn() == null) ? 0 : getPhoneNumberArn().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhoneNumberCountryCode() == null) ? 0 : getPhoneNumberCountryCode()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumberType() == null) ? 0 : getPhoneNumberType().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhoneNumberDescription() == null) ? 0 : getPhoneNumberDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumberStatus() == null) ? 0 : getPhoneNumberStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClaimedPhoneNumberSummary == false)
            return false;
        ClaimedPhoneNumberSummary other = (ClaimedPhoneNumberSummary) obj;

        if (other.getPhoneNumberId() == null ^ this.getPhoneNumberId() == null)
            return false;
        if (other.getPhoneNumberId() != null
                && other.getPhoneNumberId().equals(this.getPhoneNumberId()) == false)
            return false;
        if (other.getPhoneNumberArn() == null ^ this.getPhoneNumberArn() == null)
            return false;
        if (other.getPhoneNumberArn() != null
                && other.getPhoneNumberArn().equals(this.getPhoneNumberArn()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
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
        if (other.getPhoneNumberDescription() == null ^ this.getPhoneNumberDescription() == null)
            return false;
        if (other.getPhoneNumberDescription() != null
                && other.getPhoneNumberDescription().equals(this.getPhoneNumberDescription()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null
                && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPhoneNumberStatus() == null ^ this.getPhoneNumberStatus() == null)
            return false;
        if (other.getPhoneNumberStatus() != null
                && other.getPhoneNumberStatus().equals(this.getPhoneNumberStatus()) == false)
            return false;
        return true;
    }
}
