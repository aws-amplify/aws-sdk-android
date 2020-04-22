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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies a usage limit in a cluster. You can't modify the feature type or
 * period of a usage limit.
 * </p>
 */
public class ModifyUsageLimitRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the usage limit to modify.
     * </p>
     */
    private String usageLimitId;

    /**
     * <p>
     * The new limit amount. For more information about this parameter, see
     * <a>UsageLimit</a>.
     * </p>
     */
    private Long amount;

    /**
     * <p>
     * The new action that Amazon Redshift takes when the limit is reached. For
     * more information about this parameter, see <a>UsageLimit</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>log, emit-metric, disable
     */
    private String breachAction;

    /**
     * <p>
     * The identifier of the usage limit to modify.
     * </p>
     *
     * @return <p>
     *         The identifier of the usage limit to modify.
     *         </p>
     */
    public String getUsageLimitId() {
        return usageLimitId;
    }

    /**
     * <p>
     * The identifier of the usage limit to modify.
     * </p>
     *
     * @param usageLimitId <p>
     *            The identifier of the usage limit to modify.
     *            </p>
     */
    public void setUsageLimitId(String usageLimitId) {
        this.usageLimitId = usageLimitId;
    }

    /**
     * <p>
     * The identifier of the usage limit to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usageLimitId <p>
     *            The identifier of the usage limit to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyUsageLimitRequest withUsageLimitId(String usageLimitId) {
        this.usageLimitId = usageLimitId;
        return this;
    }

    /**
     * <p>
     * The new limit amount. For more information about this parameter, see
     * <a>UsageLimit</a>.
     * </p>
     *
     * @return <p>
     *         The new limit amount. For more information about this parameter,
     *         see <a>UsageLimit</a>.
     *         </p>
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * <p>
     * The new limit amount. For more information about this parameter, see
     * <a>UsageLimit</a>.
     * </p>
     *
     * @param amount <p>
     *            The new limit amount. For more information about this
     *            parameter, see <a>UsageLimit</a>.
     *            </p>
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The new limit amount. For more information about this parameter, see
     * <a>UsageLimit</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amount <p>
     *            The new limit amount. For more information about this
     *            parameter, see <a>UsageLimit</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyUsageLimitRequest withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    /**
     * <p>
     * The new action that Amazon Redshift takes when the limit is reached. For
     * more information about this parameter, see <a>UsageLimit</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>log, emit-metric, disable
     *
     * @return <p>
     *         The new action that Amazon Redshift takes when the limit is
     *         reached. For more information about this parameter, see
     *         <a>UsageLimit</a>.
     *         </p>
     * @see UsageLimitBreachAction
     */
    public String getBreachAction() {
        return breachAction;
    }

    /**
     * <p>
     * The new action that Amazon Redshift takes when the limit is reached. For
     * more information about this parameter, see <a>UsageLimit</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>log, emit-metric, disable
     *
     * @param breachAction <p>
     *            The new action that Amazon Redshift takes when the limit is
     *            reached. For more information about this parameter, see
     *            <a>UsageLimit</a>.
     *            </p>
     * @see UsageLimitBreachAction
     */
    public void setBreachAction(String breachAction) {
        this.breachAction = breachAction;
    }

    /**
     * <p>
     * The new action that Amazon Redshift takes when the limit is reached. For
     * more information about this parameter, see <a>UsageLimit</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>log, emit-metric, disable
     *
     * @param breachAction <p>
     *            The new action that Amazon Redshift takes when the limit is
     *            reached. For more information about this parameter, see
     *            <a>UsageLimit</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageLimitBreachAction
     */
    public ModifyUsageLimitRequest withBreachAction(String breachAction) {
        this.breachAction = breachAction;
        return this;
    }

    /**
     * <p>
     * The new action that Amazon Redshift takes when the limit is reached. For
     * more information about this parameter, see <a>UsageLimit</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>log, emit-metric, disable
     *
     * @param breachAction <p>
     *            The new action that Amazon Redshift takes when the limit is
     *            reached. For more information about this parameter, see
     *            <a>UsageLimit</a>.
     *            </p>
     * @see UsageLimitBreachAction
     */
    public void setBreachAction(UsageLimitBreachAction breachAction) {
        this.breachAction = breachAction.toString();
    }

    /**
     * <p>
     * The new action that Amazon Redshift takes when the limit is reached. For
     * more information about this parameter, see <a>UsageLimit</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>log, emit-metric, disable
     *
     * @param breachAction <p>
     *            The new action that Amazon Redshift takes when the limit is
     *            reached. For more information about this parameter, see
     *            <a>UsageLimit</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageLimitBreachAction
     */
    public ModifyUsageLimitRequest withBreachAction(UsageLimitBreachAction breachAction) {
        this.breachAction = breachAction.toString();
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
        if (getUsageLimitId() != null)
            sb.append("UsageLimitId: " + getUsageLimitId() + ",");
        if (getAmount() != null)
            sb.append("Amount: " + getAmount() + ",");
        if (getBreachAction() != null)
            sb.append("BreachAction: " + getBreachAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUsageLimitId() == null) ? 0 : getUsageLimitId().hashCode());
        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode());
        hashCode = prime * hashCode
                + ((getBreachAction() == null) ? 0 : getBreachAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyUsageLimitRequest == false)
            return false;
        ModifyUsageLimitRequest other = (ModifyUsageLimitRequest) obj;

        if (other.getUsageLimitId() == null ^ this.getUsageLimitId() == null)
            return false;
        if (other.getUsageLimitId() != null
                && other.getUsageLimitId().equals(this.getUsageLimitId()) == false)
            return false;
        if (other.getAmount() == null ^ this.getAmount() == null)
            return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false)
            return false;
        if (other.getBreachAction() == null ^ this.getBreachAction() == null)
            return false;
        if (other.getBreachAction() != null
                && other.getBreachAction().equals(this.getBreachAction()) == false)
            return false;
        return true;
    }
}
