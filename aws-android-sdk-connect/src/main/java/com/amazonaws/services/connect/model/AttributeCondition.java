/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * An object to specify the predefined attribute condition.
 * </p>
 */
public class AttributeCondition implements Serializable {
    /**
     * <p>
     * The name of predefined attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String name;

    /**
     * <p>
     * The value of predefined attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String value;

    /**
     * <p>
     * The proficiency level of the condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1.0 - 5.0<br/>
     */
    private Float proficiencyLevel;

    /**
     * <p>
     * An object to define <code>AgentsCriteria</code>.
     * </p>
     */
    private MatchCriteria matchCriteria;

    /**
     * <p>
     * The operator of the condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     */
    private String comparisonOperator;

    /**
     * <p>
     * The name of predefined attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of predefined attribute.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of predefined attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of predefined attribute.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of predefined attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of predefined attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeCondition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The value of predefined attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The value of predefined attribute.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of predefined attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param value <p>
     *            The value of predefined attribute.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of predefined attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param value <p>
     *            The value of predefined attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeCondition withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The proficiency level of the condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1.0 - 5.0<br/>
     *
     * @return <p>
     *         The proficiency level of the condition.
     *         </p>
     */
    public Float getProficiencyLevel() {
        return proficiencyLevel;
    }

    /**
     * <p>
     * The proficiency level of the condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1.0 - 5.0<br/>
     *
     * @param proficiencyLevel <p>
     *            The proficiency level of the condition.
     *            </p>
     */
    public void setProficiencyLevel(Float proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    /**
     * <p>
     * The proficiency level of the condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1.0 - 5.0<br/>
     *
     * @param proficiencyLevel <p>
     *            The proficiency level of the condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeCondition withProficiencyLevel(Float proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
        return this;
    }

    /**
     * <p>
     * An object to define <code>AgentsCriteria</code>.
     * </p>
     *
     * @return <p>
     *         An object to define <code>AgentsCriteria</code>.
     *         </p>
     */
    public MatchCriteria getMatchCriteria() {
        return matchCriteria;
    }

    /**
     * <p>
     * An object to define <code>AgentsCriteria</code>.
     * </p>
     *
     * @param matchCriteria <p>
     *            An object to define <code>AgentsCriteria</code>.
     *            </p>
     */
    public void setMatchCriteria(MatchCriteria matchCriteria) {
        this.matchCriteria = matchCriteria;
    }

    /**
     * <p>
     * An object to define <code>AgentsCriteria</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchCriteria <p>
     *            An object to define <code>AgentsCriteria</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeCondition withMatchCriteria(MatchCriteria matchCriteria) {
        this.matchCriteria = matchCriteria;
        return this;
    }

    /**
     * <p>
     * The operator of the condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @return <p>
     *         The operator of the condition.
     *         </p>
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * <p>
     * The operator of the condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param comparisonOperator <p>
     *            The operator of the condition.
     *            </p>
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The operator of the condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param comparisonOperator <p>
     *            The operator of the condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeCondition withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getProficiencyLevel() != null)
            sb.append("ProficiencyLevel: " + getProficiencyLevel() + ",");
        if (getMatchCriteria() != null)
            sb.append("MatchCriteria: " + getMatchCriteria() + ",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: " + getComparisonOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode
                + ((getProficiencyLevel() == null) ? 0 : getProficiencyLevel().hashCode());
        hashCode = prime * hashCode
                + ((getMatchCriteria() == null) ? 0 : getMatchCriteria().hashCode());
        hashCode = prime * hashCode
                + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeCondition == false)
            return false;
        AttributeCondition other = (AttributeCondition) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getProficiencyLevel() == null ^ this.getProficiencyLevel() == null)
            return false;
        if (other.getProficiencyLevel() != null
                && other.getProficiencyLevel().equals(this.getProficiencyLevel()) == false)
            return false;
        if (other.getMatchCriteria() == null ^ this.getMatchCriteria() == null)
            return false;
        if (other.getMatchCriteria() != null
                && other.getMatchCriteria().equals(this.getMatchCriteria()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null
                && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        return true;
    }
}
