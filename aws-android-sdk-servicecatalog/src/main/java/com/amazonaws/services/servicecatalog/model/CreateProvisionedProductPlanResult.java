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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class CreateProvisionedProductPlanResult implements Serializable {
    /**
     * <p>
     * The name of the plan.
     * </p>
     */
    private String planName;

    /**
     * <p>
     * The plan identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String planId;

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisionProductId;

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     */
    private String provisionedProductName;

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisioningArtifactId;

    /**
     * <p>
     * The name of the plan.
     * </p>
     *
     * @return <p>
     *         The name of the plan.
     *         </p>
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * <p>
     * The name of the plan.
     * </p>
     *
     * @param planName <p>
     *            The name of the plan.
     *            </p>
     */
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     * <p>
     * The name of the plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param planName <p>
     *            The name of the plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanResult withPlanName(String planName) {
        this.planName = planName;
        return this;
    }

    /**
     * <p>
     * The plan identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The plan identifier.
     *         </p>
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * <p>
     * The plan identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param planId <p>
     *            The plan identifier.
     *            </p>
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * <p>
     * The plan identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param planId <p>
     *            The plan identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanResult withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The product identifier.
     *         </p>
     */
    public String getProvisionProductId() {
        return provisionProductId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisionProductId <p>
     *            The product identifier.
     *            </p>
     */
    public void setProvisionProductId(String provisionProductId) {
        this.provisionProductId = provisionProductId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisionProductId <p>
     *            The product identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanResult withProvisionProductId(String provisionProductId) {
        this.provisionProductId = provisionProductId;
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @return <p>
     *         The user-friendly name of the provisioned product.
     *         </p>
     */
    public String getProvisionedProductName() {
        return provisionedProductName;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @param provisionedProductName <p>
     *            The user-friendly name of the provisioned product.
     *            </p>
     */
    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @param provisionedProductName <p>
     *            The user-friendly name of the provisioned product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanResult withProvisionedProductName(
            String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the provisioning artifact.
     *         </p>
     */
    public String getProvisioningArtifactId() {
        return provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     */
    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanResult withProvisioningArtifactId(
            String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
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
        if (getPlanName() != null)
            sb.append("PlanName: " + getPlanName() + ",");
        if (getPlanId() != null)
            sb.append("PlanId: " + getPlanId() + ",");
        if (getProvisionProductId() != null)
            sb.append("ProvisionProductId: " + getProvisionProductId() + ",");
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: " + getProvisionedProductName() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlanName() == null) ? 0 : getPlanName().hashCode());
        hashCode = prime * hashCode + ((getPlanId() == null) ? 0 : getPlanId().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionProductId() == null) ? 0 : getProvisionProductId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisionedProductPlanResult == false)
            return false;
        CreateProvisionedProductPlanResult other = (CreateProvisionedProductPlanResult) obj;

        if (other.getPlanName() == null ^ this.getPlanName() == null)
            return false;
        if (other.getPlanName() != null && other.getPlanName().equals(this.getPlanName()) == false)
            return false;
        if (other.getPlanId() == null ^ this.getPlanId() == null)
            return false;
        if (other.getPlanId() != null && other.getPlanId().equals(this.getPlanId()) == false)
            return false;
        if (other.getProvisionProductId() == null ^ this.getProvisionProductId() == null)
            return false;
        if (other.getProvisionProductId() != null
                && other.getProvisionProductId().equals(this.getProvisionProductId()) == false)
            return false;
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null
                && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null
                && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        return true;
    }
}
