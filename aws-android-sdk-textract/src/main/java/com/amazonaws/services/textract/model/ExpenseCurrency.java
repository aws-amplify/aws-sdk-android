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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Returns the kind of currency detected.
 * </p>
 */
public class ExpenseCurrency implements Serializable {
    /**
     * <p>
     * Currency code for detected currency. the current supported codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USD
     * </p>
     * </li>
     * <li>
     * <p>
     * EUR
     * </p>
     * </li>
     * <li>
     * <p>
     * GBP
     * </p>
     * </li>
     * <li>
     * <p>
     * CAD
     * </p>
     * </li>
     * <li>
     * <p>
     * INR
     * </p>
     * </li>
     * <li>
     * <p>
     * JPY
     * </p>
     * </li>
     * <li>
     * <p>
     * CHF
     * </p>
     * </li>
     * <li>
     * <p>
     * AUD
     * </p>
     * </li>
     * <li>
     * <p>
     * CNY
     * </p>
     * </li>
     * <li>
     * <p>
     * BZR
     * </p>
     * </li>
     * <li>
     * <p>
     * SEK
     * </p>
     * </li>
     * <li>
     * <p>
     * HKD
     * </p>
     * </li>
     * </ul>
     */
    private String code;

    /**
     * <p>
     * Percentage confideence in the detected currency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float confidence;

    /**
     * <p>
     * Currency code for detected currency. the current supported codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USD
     * </p>
     * </li>
     * <li>
     * <p>
     * EUR
     * </p>
     * </li>
     * <li>
     * <p>
     * GBP
     * </p>
     * </li>
     * <li>
     * <p>
     * CAD
     * </p>
     * </li>
     * <li>
     * <p>
     * INR
     * </p>
     * </li>
     * <li>
     * <p>
     * JPY
     * </p>
     * </li>
     * <li>
     * <p>
     * CHF
     * </p>
     * </li>
     * <li>
     * <p>
     * AUD
     * </p>
     * </li>
     * <li>
     * <p>
     * CNY
     * </p>
     * </li>
     * <li>
     * <p>
     * BZR
     * </p>
     * </li>
     * <li>
     * <p>
     * SEK
     * </p>
     * </li>
     * <li>
     * <p>
     * HKD
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Currency code for detected currency. the current supported codes
     *         are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         USD
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EUR
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GBP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CAD
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INR
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         JPY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CHF
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AUD
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CNY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         BZR
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SEK
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HKD
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * Currency code for detected currency. the current supported codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USD
     * </p>
     * </li>
     * <li>
     * <p>
     * EUR
     * </p>
     * </li>
     * <li>
     * <p>
     * GBP
     * </p>
     * </li>
     * <li>
     * <p>
     * CAD
     * </p>
     * </li>
     * <li>
     * <p>
     * INR
     * </p>
     * </li>
     * <li>
     * <p>
     * JPY
     * </p>
     * </li>
     * <li>
     * <p>
     * CHF
     * </p>
     * </li>
     * <li>
     * <p>
     * AUD
     * </p>
     * </li>
     * <li>
     * <p>
     * CNY
     * </p>
     * </li>
     * <li>
     * <p>
     * BZR
     * </p>
     * </li>
     * <li>
     * <p>
     * SEK
     * </p>
     * </li>
     * <li>
     * <p>
     * HKD
     * </p>
     * </li>
     * </ul>
     *
     * @param code <p>
     *            Currency code for detected currency. the current supported
     *            codes are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            USD
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EUR
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GBP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CAD
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INR
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            JPY
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CHF
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AUD
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CNY
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            BZR
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SEK
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HKD
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Currency code for detected currency. the current supported codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USD
     * </p>
     * </li>
     * <li>
     * <p>
     * EUR
     * </p>
     * </li>
     * <li>
     * <p>
     * GBP
     * </p>
     * </li>
     * <li>
     * <p>
     * CAD
     * </p>
     * </li>
     * <li>
     * <p>
     * INR
     * </p>
     * </li>
     * <li>
     * <p>
     * JPY
     * </p>
     * </li>
     * <li>
     * <p>
     * CHF
     * </p>
     * </li>
     * <li>
     * <p>
     * AUD
     * </p>
     * </li>
     * <li>
     * <p>
     * CNY
     * </p>
     * </li>
     * <li>
     * <p>
     * BZR
     * </p>
     * </li>
     * <li>
     * <p>
     * SEK
     * </p>
     * </li>
     * <li>
     * <p>
     * HKD
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            Currency code for detected currency. the current supported
     *            codes are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            USD
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EUR
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GBP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CAD
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INR
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            JPY
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CHF
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AUD
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CNY
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            BZR
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SEK
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HKD
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseCurrency withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * Percentage confideence in the detected currency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         Percentage confideence in the detected currency.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Percentage confideence in the detected currency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            Percentage confideence in the detected currency.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Percentage confideence in the detected currency.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            Percentage confideence in the detected currency.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseCurrency withConfidence(Float confidence) {
        this.confidence = confidence;
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpenseCurrency == false)
            return false;
        ExpenseCurrency other = (ExpenseCurrency) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }
}
