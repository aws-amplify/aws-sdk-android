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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class GetBucketRequestPaymentResult implements Serializable {
    /**
     * <p>
     * Specifies who pays for the download and request fees.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Requester, BucketOwner
     */
    private String payer;

    /**
     * <p>
     * Specifies who pays for the download and request fees.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Requester, BucketOwner
     *
     * @return <p>
     *         Specifies who pays for the download and request fees.
     *         </p>
     * @see Payer
     */
    public String getPayer() {
        return payer;
    }

    /**
     * <p>
     * Specifies who pays for the download and request fees.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Requester, BucketOwner
     *
     * @param payer <p>
     *            Specifies who pays for the download and request fees.
     *            </p>
     * @see Payer
     */
    public void setPayer(String payer) {
        this.payer = payer;
    }

    /**
     * <p>
     * Specifies who pays for the download and request fees.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Requester, BucketOwner
     *
     * @param payer <p>
     *            Specifies who pays for the download and request fees.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Payer
     */
    public GetBucketRequestPaymentResult withPayer(String payer) {
        this.payer = payer;
        return this;
    }

    /**
     * <p>
     * Specifies who pays for the download and request fees.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Requester, BucketOwner
     *
     * @param payer <p>
     *            Specifies who pays for the download and request fees.
     *            </p>
     * @see Payer
     */
    public void setPayer(Payer payer) {
        this.payer = payer.toString();
    }

    /**
     * <p>
     * Specifies who pays for the download and request fees.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Requester, BucketOwner
     *
     * @param payer <p>
     *            Specifies who pays for the download and request fees.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Payer
     */
    public GetBucketRequestPaymentResult withPayer(Payer payer) {
        this.payer = payer.toString();
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
        if (getPayer() != null)
            sb.append("Payer: " + getPayer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayer() == null) ? 0 : getPayer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketRequestPaymentResult == false)
            return false;
        GetBucketRequestPaymentResult other = (GetBucketRequestPaymentResult) obj;

        if (other.getPayer() == null ^ this.getPayer() == null)
            return false;
        if (other.getPayer() != null && other.getPayer().equals(this.getPayer()) == false)
            return false;
        return true;
    }
}
