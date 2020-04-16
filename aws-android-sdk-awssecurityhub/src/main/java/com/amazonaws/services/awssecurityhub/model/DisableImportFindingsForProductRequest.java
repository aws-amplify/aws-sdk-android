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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disables the integration of the specified product with Security Hub. After
 * the integration is disabled, findings from that product are no longer sent to
 * Security Hub.
 * </p>
 */
public class DisableImportFindingsForProductRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the integrated product to disable the integration for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String productSubscriptionArn;

    /**
     * <p>
     * The ARN of the integrated product to disable the integration for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of the integrated product to disable the integration for.
     *         </p>
     */
    public String getProductSubscriptionArn() {
        return productSubscriptionArn;
    }

    /**
     * <p>
     * The ARN of the integrated product to disable the integration for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param productSubscriptionArn <p>
     *            The ARN of the integrated product to disable the integration
     *            for.
     *            </p>
     */
    public void setProductSubscriptionArn(String productSubscriptionArn) {
        this.productSubscriptionArn = productSubscriptionArn;
    }

    /**
     * <p>
     * The ARN of the integrated product to disable the integration for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param productSubscriptionArn <p>
     *            The ARN of the integrated product to disable the integration
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableImportFindingsForProductRequest withProductSubscriptionArn(
            String productSubscriptionArn) {
        this.productSubscriptionArn = productSubscriptionArn;
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
        if (getProductSubscriptionArn() != null)
            sb.append("ProductSubscriptionArn: " + getProductSubscriptionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getProductSubscriptionArn() == null) ? 0 : getProductSubscriptionArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableImportFindingsForProductRequest == false)
            return false;
        DisableImportFindingsForProductRequest other = (DisableImportFindingsForProductRequest) obj;

        if (other.getProductSubscriptionArn() == null ^ this.getProductSubscriptionArn() == null)
            return false;
        if (other.getProductSubscriptionArn() != null
                && other.getProductSubscriptionArn().equals(this.getProductSubscriptionArn()) == false)
            return false;
        return true;
    }
}
