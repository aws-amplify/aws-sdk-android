/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A map containing a priority as a key, and recovery method name as a value.
 * </p>
 */
public class RecoveryOptionType implements Serializable {
    /**
     * <p>
     * A positive integer specifying priority of a method with 1 being the
     * highest priority.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2<br/>
     */
    private Integer priority;

    /**
     * <p>
     * The recovery method for a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verified_email, verified_phone_number, admin_only
     */
    private String name;

    /**
     * <p>
     * A positive integer specifying priority of a method with 1 being the
     * highest priority.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2<br/>
     *
     * @return <p>
     *         A positive integer specifying priority of a method with 1 being
     *         the highest priority.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * A positive integer specifying priority of a method with 1 being the
     * highest priority.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2<br/>
     *
     * @param priority <p>
     *            A positive integer specifying priority of a method with 1
     *            being the highest priority.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * A positive integer specifying priority of a method with 1 being the
     * highest priority.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2<br/>
     *
     * @param priority <p>
     *            A positive integer specifying priority of a method with 1
     *            being the highest priority.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryOptionType withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * The recovery method for a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verified_email, verified_phone_number, admin_only
     *
     * @return <p>
     *         The recovery method for a user.
     *         </p>
     * @see RecoveryOptionNameType
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The recovery method for a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verified_email, verified_phone_number, admin_only
     *
     * @param name <p>
     *            The recovery method for a user.
     *            </p>
     * @see RecoveryOptionNameType
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The recovery method for a user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verified_email, verified_phone_number, admin_only
     *
     * @param name <p>
     *            The recovery method for a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecoveryOptionNameType
     */
    public RecoveryOptionType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The recovery method for a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verified_email, verified_phone_number, admin_only
     *
     * @param name <p>
     *            The recovery method for a user.
     *            </p>
     * @see RecoveryOptionNameType
     */
    public void setName(RecoveryOptionNameType name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The recovery method for a user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verified_email, verified_phone_number, admin_only
     *
     * @param name <p>
     *            The recovery method for a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecoveryOptionNameType
     */
    public RecoveryOptionType withName(RecoveryOptionNameType name) {
        this.name = name.toString();
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
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryOptionType == false)
            return false;
        RecoveryOptionType other = (RecoveryOptionType) obj;

        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
