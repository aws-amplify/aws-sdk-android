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
 * Enables the integration of a partner product with Security Hub. Integrated
 * products send findings to Security Hub.
 * </p>
 * <p>
 * When you enable a product integration, a permission policy that grants
 * permission for the product to send findings to Security Hub is applied.
 * </p>
 */
public class EnableImportFindingsForProductRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the product to enable the integration for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String productArn;

    /**
     * <p>
     * The ARN of the product to enable the integration for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of the product to enable the integration for.
     *         </p>
     */
    public String getProductArn() {
        return productArn;
    }

    /**
     * <p>
     * The ARN of the product to enable the integration for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param productArn <p>
     *            The ARN of the product to enable the integration for.
     *            </p>
     */
    public void setProductArn(String productArn) {
        this.productArn = productArn;
    }

    /**
     * <p>
     * The ARN of the product to enable the integration for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param productArn <p>
     *            The ARN of the product to enable the integration for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableImportFindingsForProductRequest withProductArn(String productArn) {
        this.productArn = productArn;
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
        if (getProductArn() != null)
            sb.append("ProductArn: " + getProductArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductArn() == null) ? 0 : getProductArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableImportFindingsForProductRequest == false)
            return false;
        EnableImportFindingsForProductRequest other = (EnableImportFindingsForProductRequest) obj;

        if (other.getProductArn() == null ^ this.getProductArn() == null)
            return false;
        if (other.getProductArn() != null
                && other.getProductArn().equals(this.getProductArn()) == false)
            return false;
        return true;
    }
}
