/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about available phone numbers.
 * </p>
 */
public class AvailableNumberSummary implements Serializable {
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
     * THIRD_PARTY_DID, SHORT_CODE
     */
    private String phoneNumberType;

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
    public AvailableNumberSummary withPhoneNumber(String phoneNumber) {
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
    public AvailableNumberSummary withPhoneNumberCountryCode(String phoneNumberCountryCode) {
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
    public AvailableNumberSummary withPhoneNumberCountryCode(
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
     * THIRD_PARTY_DID, SHORT_CODE
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
     * THIRD_PARTY_DID, SHORT_CODE
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
     * THIRD_PARTY_DID, SHORT_CODE
     *
     * @param phoneNumberType <p>
     *            The type of phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberType
     */
    public AvailableNumberSummary withPhoneNumberType(String phoneNumberType) {
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
     * THIRD_PARTY_DID, SHORT_CODE
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
     * THIRD_PARTY_DID, SHORT_CODE
     *
     * @param phoneNumberType <p>
     *            The type of phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberType
     */
    public AvailableNumberSummary withPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType.toString();
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
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getPhoneNumberCountryCode() != null)
            sb.append("PhoneNumberCountryCode: " + getPhoneNumberCountryCode() + ",");
        if (getPhoneNumberType() != null)
            sb.append("PhoneNumberType: " + getPhoneNumberType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhoneNumberCountryCode() == null) ? 0 : getPhoneNumberCountryCode()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumberType() == null) ? 0 : getPhoneNumberType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailableNumberSummary == false)
            return false;
        AvailableNumberSummary other = (AvailableNumberSummary) obj;

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
        return true;
    }
}
