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

package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;

/**
 * <p>
 * An attribute that we extracted, but were unable to relate to an entity.
 * </p>
 */
public class UnmappedAttribute implements Serializable {
    /**
     * <p>
     * The type of the attribute, could be one of the following values:
     * "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     * "TEST_AND_TREATMENT_PROCEDURE" or "PROTECTED_HEALTH_INFORMATION".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICATION, MEDICAL_CONDITION,
     * PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY,
     * TIME_EXPRESSION
     */
    private String type;

    /**
     * <p>
     * The specific attribute that has been extracted but not mapped to an
     * entity.
     * </p>
     */
    private Attribute attribute;

    /**
     * <p>
     * The type of the attribute, could be one of the following values:
     * "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     * "TEST_AND_TREATMENT_PROCEDURE" or "PROTECTED_HEALTH_INFORMATION".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICATION, MEDICAL_CONDITION,
     * PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY,
     * TIME_EXPRESSION
     *
     * @return <p>
     *         The type of the attribute, could be one of the following values:
     *         "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     *         "TEST_AND_TREATMENT_PROCEDURE" or "PROTECTED_HEALTH_INFORMATION".
     *         </p>
     * @see EntityType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the attribute, could be one of the following values:
     * "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     * "TEST_AND_TREATMENT_PROCEDURE" or "PROTECTED_HEALTH_INFORMATION".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICATION, MEDICAL_CONDITION,
     * PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY,
     * TIME_EXPRESSION
     *
     * @param type <p>
     *            The type of the attribute, could be one of the following
     *            values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     *            "TEST_AND_TREATMENT_PROCEDURE" or
     *            "PROTECTED_HEALTH_INFORMATION".
     *            </p>
     * @see EntityType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the attribute, could be one of the following values:
     * "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     * "TEST_AND_TREATMENT_PROCEDURE" or "PROTECTED_HEALTH_INFORMATION".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICATION, MEDICAL_CONDITION,
     * PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY,
     * TIME_EXPRESSION
     *
     * @param type <p>
     *            The type of the attribute, could be one of the following
     *            values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     *            "TEST_AND_TREATMENT_PROCEDURE" or
     *            "PROTECTED_HEALTH_INFORMATION".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityType
     */
    public UnmappedAttribute withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the attribute, could be one of the following values:
     * "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     * "TEST_AND_TREATMENT_PROCEDURE" or "PROTECTED_HEALTH_INFORMATION".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICATION, MEDICAL_CONDITION,
     * PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY,
     * TIME_EXPRESSION
     *
     * @param type <p>
     *            The type of the attribute, could be one of the following
     *            values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     *            "TEST_AND_TREATMENT_PROCEDURE" or
     *            "PROTECTED_HEALTH_INFORMATION".
     *            </p>
     * @see EntityType
     */
    public void setType(EntityType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the attribute, could be one of the following values:
     * "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     * "TEST_AND_TREATMENT_PROCEDURE" or "PROTECTED_HEALTH_INFORMATION".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICATION, MEDICAL_CONDITION,
     * PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY,
     * TIME_EXPRESSION
     *
     * @param type <p>
     *            The type of the attribute, could be one of the following
     *            values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY",
     *            "TEST_AND_TREATMENT_PROCEDURE" or
     *            "PROTECTED_HEALTH_INFORMATION".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityType
     */
    public UnmappedAttribute withType(EntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The specific attribute that has been extracted but not mapped to an
     * entity.
     * </p>
     *
     * @return <p>
     *         The specific attribute that has been extracted but not mapped to
     *         an entity.
     *         </p>
     */
    public Attribute getAttribute() {
        return attribute;
    }

    /**
     * <p>
     * The specific attribute that has been extracted but not mapped to an
     * entity.
     * </p>
     *
     * @param attribute <p>
     *            The specific attribute that has been extracted but not mapped
     *            to an entity.
     *            </p>
     */
    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The specific attribute that has been extracted but not mapped to an
     * entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attribute <p>
     *            The specific attribute that has been extracted but not mapped
     *            to an entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnmappedAttribute withAttribute(Attribute attribute) {
        this.attribute = attribute;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnmappedAttribute == false)
            return false;
        UnmappedAttribute other = (UnmappedAttribute) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null
                && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        return true;
    }
}
