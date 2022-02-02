/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies one of the label or labels that categorize the personally
 * identifiable information (PII) entity being analyzed.
 * </p>
 */
public class EntityLabel implements Serializable {
    /**
     * <p>
     * The name of the label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BANK_ACCOUNT_NUMBER, BANK_ROUTING,
     * CREDIT_DEBIT_NUMBER, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, PIN, EMAIL,
     * ADDRESS, NAME, PHONE, SSN, DATE_TIME, PASSPORT_NUMBER, DRIVER_ID, URL,
     * AGE, USERNAME, PASSWORD, AWS_ACCESS_KEY, AWS_SECRET_KEY, IP_ADDRESS,
     * MAC_ADDRESS, ALL
     */
    private String name;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The name of the label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BANK_ACCOUNT_NUMBER, BANK_ROUTING,
     * CREDIT_DEBIT_NUMBER, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, PIN, EMAIL,
     * ADDRESS, NAME, PHONE, SSN, DATE_TIME, PASSPORT_NUMBER, DRIVER_ID, URL,
     * AGE, USERNAME, PASSWORD, AWS_ACCESS_KEY, AWS_SECRET_KEY, IP_ADDRESS,
     * MAC_ADDRESS, ALL
     *
     * @return <p>
     *         The name of the label.
     *         </p>
     * @see PiiEntityType
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BANK_ACCOUNT_NUMBER, BANK_ROUTING,
     * CREDIT_DEBIT_NUMBER, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, PIN, EMAIL,
     * ADDRESS, NAME, PHONE, SSN, DATE_TIME, PASSPORT_NUMBER, DRIVER_ID, URL,
     * AGE, USERNAME, PASSWORD, AWS_ACCESS_KEY, AWS_SECRET_KEY, IP_ADDRESS,
     * MAC_ADDRESS, ALL
     *
     * @param name <p>
     *            The name of the label.
     *            </p>
     * @see PiiEntityType
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the label.
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
     * MAC_ADDRESS, ALL
     *
     * @param name <p>
     *            The name of the label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PiiEntityType
     */
    public EntityLabel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The name of the label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BANK_ACCOUNT_NUMBER, BANK_ROUTING,
     * CREDIT_DEBIT_NUMBER, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, PIN, EMAIL,
     * ADDRESS, NAME, PHONE, SSN, DATE_TIME, PASSPORT_NUMBER, DRIVER_ID, URL,
     * AGE, USERNAME, PASSWORD, AWS_ACCESS_KEY, AWS_SECRET_KEY, IP_ADDRESS,
     * MAC_ADDRESS, ALL
     *
     * @param name <p>
     *            The name of the label.
     *            </p>
     * @see PiiEntityType
     */
    public void setName(PiiEntityType name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The name of the label.
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
     * MAC_ADDRESS, ALL
     *
     * @param name <p>
     *            The name of the label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PiiEntityType
     */
    public EntityLabel withName(PiiEntityType name) {
        this.name = name.toString();
        return this;
    }

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
    public EntityLabel withScore(Float score) {
        this.score = score;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getScore() != null)
            sb.append("Score: " + getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityLabel == false)
            return false;
        EntityLabel other = (EntityLabel) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }
}
