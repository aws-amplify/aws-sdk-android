/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a policy type.
 * </p>
 */
public class PolicyTypeDescription implements Serializable {
    /**
     * <p>
     * The name of the policy type.
     * </p>
     */
    private String policyTypeName;

    /**
     * <p>
     * A description of the policy type.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The description of the policy attributes associated with the policies
     * defined by Elastic Load Balancing.
     * </p>
     */
    private java.util.List<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions = new java.util.ArrayList<PolicyAttributeTypeDescription>();

    /**
     * <p>
     * The name of the policy type.
     * </p>
     *
     * @return <p>
     *         The name of the policy type.
     *         </p>
     */
    public String getPolicyTypeName() {
        return policyTypeName;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     *
     * @param policyTypeName <p>
     *            The name of the policy type.
     *            </p>
     */
    public void setPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyTypeName <p>
     *            The name of the policy type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyTypeDescription withPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
        return this;
    }

    /**
     * <p>
     * A description of the policy type.
     * </p>
     *
     * @return <p>
     *         A description of the policy type.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the policy type.
     * </p>
     *
     * @param description <p>
     *            A description of the policy type.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the policy type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the policy type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyTypeDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The description of the policy attributes associated with the policies
     * defined by Elastic Load Balancing.
     * </p>
     *
     * @return <p>
     *         The description of the policy attributes associated with the
     *         policies defined by Elastic Load Balancing.
     *         </p>
     */
    public java.util.List<PolicyAttributeTypeDescription> getPolicyAttributeTypeDescriptions() {
        return policyAttributeTypeDescriptions;
    }

    /**
     * <p>
     * The description of the policy attributes associated with the policies
     * defined by Elastic Load Balancing.
     * </p>
     *
     * @param policyAttributeTypeDescriptions <p>
     *            The description of the policy attributes associated with the
     *            policies defined by Elastic Load Balancing.
     *            </p>
     */
    public void setPolicyAttributeTypeDescriptions(
            java.util.Collection<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions) {
        if (policyAttributeTypeDescriptions == null) {
            this.policyAttributeTypeDescriptions = null;
            return;
        }

        this.policyAttributeTypeDescriptions = new java.util.ArrayList<PolicyAttributeTypeDescription>(
                policyAttributeTypeDescriptions);
    }

    /**
     * <p>
     * The description of the policy attributes associated with the policies
     * defined by Elastic Load Balancing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyAttributeTypeDescriptions <p>
     *            The description of the policy attributes associated with the
     *            policies defined by Elastic Load Balancing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyTypeDescription withPolicyAttributeTypeDescriptions(
            PolicyAttributeTypeDescription... policyAttributeTypeDescriptions) {
        if (getPolicyAttributeTypeDescriptions() == null) {
            this.policyAttributeTypeDescriptions = new java.util.ArrayList<PolicyAttributeTypeDescription>(
                    policyAttributeTypeDescriptions.length);
        }
        for (PolicyAttributeTypeDescription value : policyAttributeTypeDescriptions) {
            this.policyAttributeTypeDescriptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The description of the policy attributes associated with the policies
     * defined by Elastic Load Balancing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyAttributeTypeDescriptions <p>
     *            The description of the policy attributes associated with the
     *            policies defined by Elastic Load Balancing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyTypeDescription withPolicyAttributeTypeDescriptions(
            java.util.Collection<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions) {
        setPolicyAttributeTypeDescriptions(policyAttributeTypeDescriptions);
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
        if (getPolicyTypeName() != null)
            sb.append("PolicyTypeName: " + getPolicyTypeName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getPolicyAttributeTypeDescriptions() != null)
            sb.append("PolicyAttributeTypeDescriptions: " + getPolicyAttributeTypeDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyTypeName() == null) ? 0 : getPolicyTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getPolicyAttributeTypeDescriptions() == null) ? 0
                        : getPolicyAttributeTypeDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyTypeDescription == false)
            return false;
        PolicyTypeDescription other = (PolicyTypeDescription) obj;

        if (other.getPolicyTypeName() == null ^ this.getPolicyTypeName() == null)
            return false;
        if (other.getPolicyTypeName() != null
                && other.getPolicyTypeName().equals(this.getPolicyTypeName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPolicyAttributeTypeDescriptions() == null
                ^ this.getPolicyAttributeTypeDescriptions() == null)
            return false;
        if (other.getPolicyAttributeTypeDescriptions() != null
                && other.getPolicyAttributeTypeDescriptions().equals(
                        this.getPolicyAttributeTypeDescriptions()) == false)
            return false;
        return true;
    }
}
