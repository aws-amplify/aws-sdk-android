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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Paid container software products sold through AWS Marketplace must integrate
 * with the AWS Marketplace Metering Service and call the RegisterUsage
 * operation for software entitlement and metering. Free and BYOL products for
 * Amazon ECS or Amazon EKS aren't required to call RegisterUsage, but you may
 * choose to do so if you would like to receive usage data in your seller
 * reports. The sections below explain the behavior of RegisterUsage.
 * RegisterUsage performs two primary functions: metering and entitlement.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Entitlement</i>: RegisterUsage allows you to verify that the customer
 * running your paid software is subscribed to your product on AWS Marketplace,
 * enabling you to guard against unauthorized use. Your container image that
 * integrates with RegisterUsage is only required to guard against unauthorized
 * use at container startup, as such a
 * CustomerNotSubscribedException/PlatformNotSupportedException will only be
 * thrown on the initial call to RegisterUsage. Subsequent calls from the same
 * Amazon ECS task instance (e.g. task-id) or Amazon EKS pod will not throw a
 * CustomerNotSubscribedException, even if the customer unsubscribes while the
 * Amazon ECS task or Amazon EKS pod is still running.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Metering</i>: RegisterUsage meters software use per ECS task, per hour, or
 * per pod for Amazon EKS with usage prorated to the second. A minimum of 1
 * minute of usage applies to tasks that are short lived. For example, if a
 * customer has a 10 node Amazon ECS or Amazon EKS cluster and a service
 * configured as a Daemon Set, then Amazon ECS or Amazon EKS will launch a task
 * on all 10 cluster nodes and the customer will be charged: (10 * hourly_rate).
 * Metering for software use is automatically handled by the AWS Marketplace
 * Metering Control Plane -- your software is not required to perform any
 * metering specific actions, other than call RegisterUsage once for metering of
 * software use to commence. The AWS Marketplace Metering Control Plane will
 * also continue to bill customers for running ECS tasks and Amazon EKS pods,
 * regardless of the customers subscription state, removing the need for your
 * software to perform entitlement checks at runtime.
 * </p>
 * </li>
 * </ul>
 */
public class RegisterUsageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace.
     * The product code should be the same as the one used during the publishing
     * of a new product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String productCode;

    /**
     * <p>
     * Public Key Version provided by AWS Marketplace
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer publicKeyVersion;

    /**
     * <p>
     * (Optional) To scope down the registration to a specific running software
     * instance and guard against replay attacks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nonce;

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace.
     * The product code should be the same as the one used during the publishing
     * of a new product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         Product code is used to uniquely identify a product in AWS
     *         Marketplace. The product code should be the same as the one used
     *         during the publishing of a new product.
     *         </p>
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace.
     * The product code should be the same as the one used during the publishing
     * of a new product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param productCode <p>
     *            Product code is used to uniquely identify a product in AWS
     *            Marketplace. The product code should be the same as the one
     *            used during the publishing of a new product.
     *            </p>
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace.
     * The product code should be the same as the one used during the publishing
     * of a new product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param productCode <p>
     *            Product code is used to uniquely identify a product in AWS
     *            Marketplace. The product code should be the same as the one
     *            used during the publishing of a new product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterUsageRequest withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * <p>
     * Public Key Version provided by AWS Marketplace
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         Public Key Version provided by AWS Marketplace
     *         </p>
     */
    public Integer getPublicKeyVersion() {
        return publicKeyVersion;
    }

    /**
     * <p>
     * Public Key Version provided by AWS Marketplace
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param publicKeyVersion <p>
     *            Public Key Version provided by AWS Marketplace
     *            </p>
     */
    public void setPublicKeyVersion(Integer publicKeyVersion) {
        this.publicKeyVersion = publicKeyVersion;
    }

    /**
     * <p>
     * Public Key Version provided by AWS Marketplace
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param publicKeyVersion <p>
     *            Public Key Version provided by AWS Marketplace
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterUsageRequest withPublicKeyVersion(Integer publicKeyVersion) {
        this.publicKeyVersion = publicKeyVersion;
        return this;
    }

    /**
     * <p>
     * (Optional) To scope down the registration to a specific running software
     * instance and guard against replay attacks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         (Optional) To scope down the registration to a specific running
     *         software instance and guard against replay attacks.
     *         </p>
     */
    public String getNonce() {
        return nonce;
    }

    /**
     * <p>
     * (Optional) To scope down the registration to a specific running software
     * instance and guard against replay attacks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nonce <p>
     *            (Optional) To scope down the registration to a specific
     *            running software instance and guard against replay attacks.
     *            </p>
     */
    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    /**
     * <p>
     * (Optional) To scope down the registration to a specific running software
     * instance and guard against replay attacks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nonce <p>
     *            (Optional) To scope down the registration to a specific
     *            running software instance and guard against replay attacks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterUsageRequest withNonce(String nonce) {
        this.nonce = nonce;
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
        if (getProductCode() != null)
            sb.append("ProductCode: " + getProductCode() + ",");
        if (getPublicKeyVersion() != null)
            sb.append("PublicKeyVersion: " + getPublicKeyVersion() + ",");
        if (getNonce() != null)
            sb.append("Nonce: " + getNonce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode
                + ((getPublicKeyVersion() == null) ? 0 : getPublicKeyVersion().hashCode());
        hashCode = prime * hashCode + ((getNonce() == null) ? 0 : getNonce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterUsageRequest == false)
            return false;
        RegisterUsageRequest other = (RegisterUsageRequest) obj;

        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null
                && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        if (other.getPublicKeyVersion() == null ^ this.getPublicKeyVersion() == null)
            return false;
        if (other.getPublicKeyVersion() != null
                && other.getPublicKeyVersion().equals(this.getPublicKeyVersion()) == false)
            return false;
        if (other.getNonce() == null ^ this.getNonce() == null)
            return false;
        if (other.getNonce() != null && other.getNonce().equals(this.getNonce()) == false)
            return false;
        return true;
    }
}
