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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Defines the amount of money paid to an Amazon Mechanical Turk worker for each
 * task performed.
 * </p>
 * <p>
 * Use one of the following prices for bounding box tasks. Prices are in US
 * dollars and should be based on the complexity of the task; the longer it
 * takes in your initial testing, the more you should offer.
 * </p>
 * <ul>
 * <li>
 * <p>
 * 0.036
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.048
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.060
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.072
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.120
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.240
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.360
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.480
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.600
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.720
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.840
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.960
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.080
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.200
 * </p>
 * </li>
 * </ul>
 * <p>
 * Use one of the following prices for image classification, text
 * classification, and custom tasks. Prices are in US dollars.
 * </p>
 * <ul>
 * <li>
 * <p>
 * 0.012
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.024
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.036
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.048
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.060
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.072
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.120
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.240
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.360
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.480
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.600
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.720
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.840
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.960
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.080
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.200
 * </p>
 * </li>
 * </ul>
 * <p>
 * Use one of the following prices for semantic segmentation tasks. Prices are
 * in US dollars.
 * </p>
 * <ul>
 * <li>
 * <p>
 * 0.840
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.960
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.080
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.200
 * </p>
 * </li>
 * </ul>
 * <p>
 * Use one of the following prices for Textract AnalyzeDocument Important Form
 * Key Amazon Augmented AI review tasks. Prices are in US dollars.
 * </p>
 * <ul>
 * <li>
 * <p>
 * 2.400
 * </p>
 * </li>
 * <li>
 * <p>
 * 2.280
 * </p>
 * </li>
 * <li>
 * <p>
 * 2.160
 * </p>
 * </li>
 * <li>
 * <p>
 * 2.040
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.920
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.800
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.680
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.560
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.440
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.320
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.200
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.080
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.960
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.840
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.720
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.600
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.480
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.360
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.240
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.120
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.072
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.060
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.048
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.036
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.024
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.012
 * </p>
 * </li>
 * </ul>
 * <p>
 * Use one of the following prices for Rekognition DetectModerationLabels Amazon
 * Augmented AI review tasks. Prices are in US dollars.
 * </p>
 * <ul>
 * <li>
 * <p>
 * 1.200
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.080
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.960
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.840
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.720
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.600
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.480
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.360
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.240
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.120
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.072
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.060
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.048
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.036
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.024
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.012
 * </p>
 * </li>
 * </ul>
 * <p>
 * Use one of the following prices for Amazon Augmented AI custom human review
 * tasks. Prices are in US dollars.
 * </p>
 * <ul>
 * <li>
 * <p>
 * 1.200
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.080
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.960
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.840
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.720
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.600
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.480
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.360
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.240
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.120
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.072
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.060
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.048
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.036
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.024
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.012
 * </p>
 * </li>
 * </ul>
 */
public class PublicWorkforceTaskPrice implements Serializable {
    /**
     * <p>
     * Defines the amount of money paid to an Amazon Mechanical Turk worker in
     * United States dollars.
     * </p>
     */
    private USD amountInUsd;

    /**
     * <p>
     * Defines the amount of money paid to an Amazon Mechanical Turk worker in
     * United States dollars.
     * </p>
     *
     * @return <p>
     *         Defines the amount of money paid to an Amazon Mechanical Turk
     *         worker in United States dollars.
     *         </p>
     */
    public USD getAmountInUsd() {
        return amountInUsd;
    }

    /**
     * <p>
     * Defines the amount of money paid to an Amazon Mechanical Turk worker in
     * United States dollars.
     * </p>
     *
     * @param amountInUsd <p>
     *            Defines the amount of money paid to an Amazon Mechanical Turk
     *            worker in United States dollars.
     *            </p>
     */
    public void setAmountInUsd(USD amountInUsd) {
        this.amountInUsd = amountInUsd;
    }

    /**
     * <p>
     * Defines the amount of money paid to an Amazon Mechanical Turk worker in
     * United States dollars.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amountInUsd <p>
     *            Defines the amount of money paid to an Amazon Mechanical Turk
     *            worker in United States dollars.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicWorkforceTaskPrice withAmountInUsd(USD amountInUsd) {
        this.amountInUsd = amountInUsd;
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
        if (getAmountInUsd() != null)
            sb.append("AmountInUsd: " + getAmountInUsd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAmountInUsd() == null) ? 0 : getAmountInUsd().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicWorkforceTaskPrice == false)
            return false;
        PublicWorkforceTaskPrice other = (PublicWorkforceTaskPrice) obj;

        if (other.getAmountInUsd() == null ^ this.getAmountInUsd() == null)
            return false;
        if (other.getAmountInUsd() != null
                && other.getAmountInUsd().equals(this.getAmountInUsd()) == false)
            return false;
        return true;
    }
}
