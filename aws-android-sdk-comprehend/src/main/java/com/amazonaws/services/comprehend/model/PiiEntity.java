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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a PII entity.
 * </p>
 */
public class PiiEntity implements Serializable {
    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The entity's type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BANK_ACCOUNT_NUMBER, BANK_ROUTING,
     * CREDIT_DEBIT_NUMBER, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, PIN, EMAIL,
     * ADDRESS, NAME, PHONE, SSN, DATE_TIME, PASSPORT_NUMBER, DRIVER_ID, URL,
     * AGE, USERNAME, PASSWORD, AWS_ACCESS_KEY, AWS_SECRET_KEY, IP_ADDRESS,
     * MAC_ADDRESS, ALL, LICENSE_PLATE, VEHICLE_IDENTIFICATION_NUMBER,
     * UK_NATIONAL_INSURANCE_NUMBER, CA_SOCIAL_INSURANCE_NUMBER,
     * US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER,
     * UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER, IN_PERMANENT_ACCOUNT_NUMBER,
     * IN_NREGA, INTERNATIONAL_BANK_ACCOUNT_NUMBER, SWIFT_CODE,
     * UK_NATIONAL_HEALTH_SERVICE_NUMBER, CA_HEALTH_NUMBER, IN_AADHAAR,
     * IN_VOTER_NUMBER
     */
    private String type;

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first
     * character in the entity.
     * </p>
     */
    private Integer beginOffset;

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last
     * character in the entity.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend has in the
     *         accuracy of the detection.
     *         </p>
     */
    public Float getScore() {
        return score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of the detection.
     *            </p>
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of the detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PiiEntity withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * <p>
     * The entity's type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BANK_ACCOUNT_NUMBER, BANK_ROUTING,
     * CREDIT_DEBIT_NUMBER, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, PIN, EMAIL,
     * ADDRESS, NAME, PHONE, SSN, DATE_TIME, PASSPORT_NUMBER, DRIVER_ID, URL,
     * AGE, USERNAME, PASSWORD, AWS_ACCESS_KEY, AWS_SECRET_KEY, IP_ADDRESS,
     * MAC_ADDRESS, ALL, LICENSE_PLATE, VEHICLE_IDENTIFICATION_NUMBER,
     * UK_NATIONAL_INSURANCE_NUMBER, CA_SOCIAL_INSURANCE_NUMBER,
     * US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER,
     * UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER, IN_PERMANENT_ACCOUNT_NUMBER,
     * IN_NREGA, INTERNATIONAL_BANK_ACCOUNT_NUMBER, SWIFT_CODE,
     * UK_NATIONAL_HEALTH_SERVICE_NUMBER, CA_HEALTH_NUMBER, IN_AADHAAR,
     * IN_VOTER_NUMBER
     *
     * @return <p>
     *         The entity's type.
     *         </p>
     * @see PiiEntityType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The entity's type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BANK_ACCOUNT_NUMBER, BANK_ROUTING,
     * CREDIT_DEBIT_NUMBER, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, PIN, EMAIL,
     * ADDRESS, NAME, PHONE, SSN, DATE_TIME, PASSPORT_NUMBER, DRIVER_ID, URL,
     * AGE, USERNAME, PASSWORD, AWS_ACCESS_KEY, AWS_SECRET_KEY, IP_ADDRESS,
     * MAC_ADDRESS, ALL, LICENSE_PLATE, VEHICLE_IDENTIFICATION_NUMBER,
     * UK_NATIONAL_INSURANCE_NUMBER, CA_SOCIAL_INSURANCE_NUMBER,
     * US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER,
     * UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER, IN_PERMANENT_ACCOUNT_NUMBER,
     * IN_NREGA, INTERNATIONAL_BANK_ACCOUNT_NUMBER, SWIFT_CODE,
     * UK_NATIONAL_HEALTH_SERVICE_NUMBER, CA_HEALTH_NUMBER, IN_AADHAAR,
     * IN_VOTER_NUMBER
     *
     * @param type <p>
     *            The entity's type.
     *            </p>
     * @see PiiEntityType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The entity's type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BANK_ACCOUNT_NUMBER, BANK_ROUTING,
     * CREDIT_DEBIT_NUMBER, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, PIN, EMAIL,
     * ADDRESS, NAME, PHONE, SSN, DATE_TIME, PASSPORT_NUMBER, DRIVER_ID, URL,
     * AGE, USERNAME, PASSWORD, AWS_ACCESS_KEY, AWS_SECRET_KEY, IP_ADDRESS,
     * MAC_ADDRESS, ALL, LICENSE_PLATE, VEHICLE_IDENTIFICATION_NUMBER,
     * UK_NATIONAL_INSURANCE_NUMBER, CA_SOCIAL_INSURANCE_NUMBER,
     * US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER,
     * UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER, IN_PERMANENT_ACCOUNT_NUMBER,
     * IN_NREGA, INTERNATIONAL_BANK_ACCOUNT_NUMBER, SWIFT_CODE,
     * UK_NATIONAL_HEALTH_SERVICE_NUMBER, CA_HEALTH_NUMBER, IN_AADHAAR,
     * IN_VOTER_NUMBER
     *
     * @param type <p>
     *            The entity's type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PiiEntityType
     */
    public PiiEntity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The entity's type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BANK_ACCOUNT_NUMBER, BANK_ROUTING,
     * CREDIT_DEBIT_NUMBER, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, PIN, EMAIL,
     * ADDRESS, NAME, PHONE, SSN, DATE_TIME, PASSPORT_NUMBER, DRIVER_ID, URL,
     * AGE, USERNAME, PASSWORD, AWS_ACCESS_KEY, AWS_SECRET_KEY, IP_ADDRESS,
     * MAC_ADDRESS, ALL, LICENSE_PLATE, VEHICLE_IDENTIFICATION_NUMBER,
     * UK_NATIONAL_INSURANCE_NUMBER, CA_SOCIAL_INSURANCE_NUMBER,
     * US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER,
     * UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER, IN_PERMANENT_ACCOUNT_NUMBER,
     * IN_NREGA, INTERNATIONAL_BANK_ACCOUNT_NUMBER, SWIFT_CODE,
     * UK_NATIONAL_HEALTH_SERVICE_NUMBER, CA_HEALTH_NUMBER, IN_AADHAAR,
     * IN_VOTER_NUMBER
     *
     * @param type <p>
     *            The entity's type.
     *            </p>
     * @see PiiEntityType
     */
    public void setType(PiiEntityType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The entity's type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BANK_ACCOUNT_NUMBER, BANK_ROUTING,
     * CREDIT_DEBIT_NUMBER, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, PIN, EMAIL,
     * ADDRESS, NAME, PHONE, SSN, DATE_TIME, PASSPORT_NUMBER, DRIVER_ID, URL,
     * AGE, USERNAME, PASSWORD, AWS_ACCESS_KEY, AWS_SECRET_KEY, IP_ADDRESS,
     * MAC_ADDRESS, ALL, LICENSE_PLATE, VEHICLE_IDENTIFICATION_NUMBER,
     * UK_NATIONAL_INSURANCE_NUMBER, CA_SOCIAL_INSURANCE_NUMBER,
     * US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER,
     * UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER, IN_PERMANENT_ACCOUNT_NUMBER,
     * IN_NREGA, INTERNATIONAL_BANK_ACCOUNT_NUMBER, SWIFT_CODE,
     * UK_NATIONAL_HEALTH_SERVICE_NUMBER, CA_HEALTH_NUMBER, IN_AADHAAR,
     * IN_VOTER_NUMBER
     *
     * @param type <p>
     *            The entity's type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PiiEntityType
     */
    public PiiEntity withType(PiiEntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first
     * character in the entity.
     * </p>
     *
     * @return <p>
     *         The zero-based offset from the beginning of the source text to
     *         the first character in the entity.
     *         </p>
     */
    public Integer getBeginOffset() {
        return beginOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first
     * character in the entity.
     * </p>
     *
     * @param beginOffset <p>
     *            The zero-based offset from the beginning of the source text to
     *            the first character in the entity.
     *            </p>
     */
    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first
     * character in the entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beginOffset <p>
     *            The zero-based offset from the beginning of the source text to
     *            the first character in the entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PiiEntity withBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last
     * character in the entity.
     * </p>
     *
     * @return <p>
     *         The zero-based offset from the beginning of the source text to
     *         the last character in the entity.
     *         </p>
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last
     * character in the entity.
     * </p>
     *
     * @param endOffset <p>
     *            The zero-based offset from the beginning of the source text to
     *            the last character in the entity.
     *            </p>
     */
    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last
     * character in the entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endOffset <p>
     *            The zero-based offset from the beginning of the source text to
     *            the last character in the entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PiiEntity withEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
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
        if (getScore() != null)
            sb.append("Score: " + getScore() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: " + getBeginOffset() + ",");
        if (getEndOffset() != null)
            sb.append("EndOffset: " + getEndOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PiiEntity == false)
            return false;
        PiiEntity other = (PiiEntity) obj;

        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getBeginOffset() == null ^ this.getBeginOffset() == null)
            return false;
        if (other.getBeginOffset() != null
                && other.getBeginOffset().equals(this.getBeginOffset()) == false)
            return false;
        if (other.getEndOffset() == null ^ this.getEndOffset() == null)
            return false;
        if (other.getEndOffset() != null
                && other.getEndOffset().equals(this.getEndOffset()) == false)
            return false;
        return true;
    }
}
