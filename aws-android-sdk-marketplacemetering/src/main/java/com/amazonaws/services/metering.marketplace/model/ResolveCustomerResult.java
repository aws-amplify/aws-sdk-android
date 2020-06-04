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

package com.amazonaws.services.metering.marketplace.model;

import java.io.Serializable;

/**
 * <p>
 * The result of the ResolveCustomer operation. Contains the CustomerIdentifier
 * and product code.
 * </p>
 */
public class ResolveCustomerResult implements Serializable {
    /**
     * <p>
     * The CustomerIdentifier is used to identify an individual customer in your
     * application. Calls to BatchMeterUsage require CustomerIdentifiers for
     * each UsageRecord.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String customerIdentifier;

    /**
     * <p>
     * The product code is returned to confirm that the buyer is registering for
     * your product. Subsequent BatchMeterUsage calls should be made using this
     * product code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String productCode;

    /**
     * <p>
     * The CustomerIdentifier is used to identify an individual customer in your
     * application. Calls to BatchMeterUsage require CustomerIdentifiers for
     * each UsageRecord.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The CustomerIdentifier is used to identify an individual customer
     *         in your application. Calls to BatchMeterUsage require
     *         CustomerIdentifiers for each UsageRecord.
     *         </p>
     */
    public String getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * <p>
     * The CustomerIdentifier is used to identify an individual customer in your
     * application. Calls to BatchMeterUsage require CustomerIdentifiers for
     * each UsageRecord.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param customerIdentifier <p>
     *            The CustomerIdentifier is used to identify an individual
     *            customer in your application. Calls to BatchMeterUsage require
     *            CustomerIdentifiers for each UsageRecord.
     *            </p>
     */
    public void setCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
    }

    /**
     * <p>
     * The CustomerIdentifier is used to identify an individual customer in your
     * application. Calls to BatchMeterUsage require CustomerIdentifiers for
     * each UsageRecord.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param customerIdentifier <p>
     *            The CustomerIdentifier is used to identify an individual
     *            customer in your application. Calls to BatchMeterUsage require
     *            CustomerIdentifiers for each UsageRecord.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResolveCustomerResult withCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
        return this;
    }

    /**
     * <p>
     * The product code is returned to confirm that the buyer is registering for
     * your product. Subsequent BatchMeterUsage calls should be made using this
     * product code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The product code is returned to confirm that the buyer is
     *         registering for your product. Subsequent BatchMeterUsage calls
     *         should be made using this product code.
     *         </p>
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * <p>
     * The product code is returned to confirm that the buyer is registering for
     * your product. Subsequent BatchMeterUsage calls should be made using this
     * product code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param productCode <p>
     *            The product code is returned to confirm that the buyer is
     *            registering for your product. Subsequent BatchMeterUsage calls
     *            should be made using this product code.
     *            </p>
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * The product code is returned to confirm that the buyer is registering for
     * your product. Subsequent BatchMeterUsage calls should be made using this
     * product code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param productCode <p>
     *            The product code is returned to confirm that the buyer is
     *            registering for your product. Subsequent BatchMeterUsage calls
     *            should be made using this product code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResolveCustomerResult withProductCode(String productCode) {
        this.productCode = productCode;
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
        if (getCustomerIdentifier() != null)
            sb.append("CustomerIdentifier: " + getCustomerIdentifier() + ",");
        if (getProductCode() != null)
            sb.append("ProductCode: " + getProductCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCustomerIdentifier() == null) ? 0 : getCustomerIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolveCustomerResult == false)
            return false;
        ResolveCustomerResult other = (ResolveCustomerResult) obj;

        if (other.getCustomerIdentifier() == null ^ this.getCustomerIdentifier() == null)
            return false;
        if (other.getCustomerIdentifier() != null
                && other.getCustomerIdentifier().equals(this.getCustomerIdentifier()) == false)
            return false;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null
                && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        return true;
    }
}
