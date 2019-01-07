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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The event risk type.
 * </p>
 */
public class EventRiskType implements Serializable {
    /**
     * <p>
     * The risk decision.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NoRisk, AccountTakeover, Block
     */
    private String riskDecision;

    /**
     * <p>
     * The risk level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Low, Medium, High
     */
    private String riskLevel;

    /**
     * <p>
     * The risk decision.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NoRisk, AccountTakeover, Block
     *
     * @return <p>
     *         The risk decision.
     *         </p>
     * @see RiskDecisionType
     */
    public String getRiskDecision() {
        return riskDecision;
    }

    /**
     * <p>
     * The risk decision.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NoRisk, AccountTakeover, Block
     *
     * @param riskDecision <p>
     *            The risk decision.
     *            </p>
     * @see RiskDecisionType
     */
    public void setRiskDecision(String riskDecision) {
        this.riskDecision = riskDecision;
    }

    /**
     * <p>
     * The risk decision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NoRisk, AccountTakeover, Block
     *
     * @param riskDecision <p>
     *            The risk decision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RiskDecisionType
     */
    public EventRiskType withRiskDecision(String riskDecision) {
        this.riskDecision = riskDecision;
        return this;
    }

    /**
     * <p>
     * The risk decision.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NoRisk, AccountTakeover, Block
     *
     * @param riskDecision <p>
     *            The risk decision.
     *            </p>
     * @see RiskDecisionType
     */
    public void setRiskDecision(RiskDecisionType riskDecision) {
        this.riskDecision = riskDecision.toString();
    }

    /**
     * <p>
     * The risk decision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NoRisk, AccountTakeover, Block
     *
     * @param riskDecision <p>
     *            The risk decision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RiskDecisionType
     */
    public EventRiskType withRiskDecision(RiskDecisionType riskDecision) {
        this.riskDecision = riskDecision.toString();
        return this;
    }

    /**
     * <p>
     * The risk level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Low, Medium, High
     *
     * @return <p>
     *         The risk level.
     *         </p>
     * @see RiskLevelType
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    /**
     * <p>
     * The risk level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Low, Medium, High
     *
     * @param riskLevel <p>
     *            The risk level.
     *            </p>
     * @see RiskLevelType
     */
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    /**
     * <p>
     * The risk level.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Low, Medium, High
     *
     * @param riskLevel <p>
     *            The risk level.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RiskLevelType
     */
    public EventRiskType withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * <p>
     * The risk level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Low, Medium, High
     *
     * @param riskLevel <p>
     *            The risk level.
     *            </p>
     * @see RiskLevelType
     */
    public void setRiskLevel(RiskLevelType riskLevel) {
        this.riskLevel = riskLevel.toString();
    }

    /**
     * <p>
     * The risk level.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Low, Medium, High
     *
     * @param riskLevel <p>
     *            The risk level.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RiskLevelType
     */
    public EventRiskType withRiskLevel(RiskLevelType riskLevel) {
        this.riskLevel = riskLevel.toString();
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
        if (getRiskDecision() != null)
            sb.append("RiskDecision: " + getRiskDecision() + ",");
        if (getRiskLevel() != null)
            sb.append("RiskLevel: " + getRiskLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRiskDecision() == null) ? 0 : getRiskDecision().hashCode());
        hashCode = prime * hashCode + ((getRiskLevel() == null) ? 0 : getRiskLevel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventRiskType == false)
            return false;
        EventRiskType other = (EventRiskType) obj;

        if (other.getRiskDecision() == null ^ this.getRiskDecision() == null)
            return false;
        if (other.getRiskDecision() != null
                && other.getRiskDecision().equals(this.getRiskDecision()) == false)
            return false;
        if (other.getRiskLevel() == null ^ this.getRiskLevel() == null)
            return false;
        if (other.getRiskLevel() != null
                && other.getRiskLevel().equals(this.getRiskLevel()) == false)
            return false;
        return true;
    }
}
