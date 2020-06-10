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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a custom data identifier.
 * </p>
 */
public class CustomDataIdentifierSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom
     * data identifier was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the custom data identifier.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the custom data identifier.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDataIdentifierSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom
     * data identifier was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when the
     *         custom data identifier was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom
     * data identifier was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the custom data identifier was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom
     * data identifier was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the custom data identifier was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDataIdentifierSummary withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     *
     * @return <p>
     *         The custom description of the custom data identifier.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     *
     * @param description <p>
     *            The custom description of the custom data identifier.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The custom description of the custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDataIdentifierSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the custom data identifier.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the custom data identifier.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDataIdentifierSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     *
     * @return <p>
     *         The custom name of the custom data identifier.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     *
     * @param name <p>
     *            The custom name of the custom data identifier.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The custom name of the custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDataIdentifierSummary withName(String name) {
        this.name = name;
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getName() != null)
            sb.append("name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomDataIdentifierSummary == false)
            return false;
        CustomDataIdentifierSummary other = (CustomDataIdentifierSummary) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
