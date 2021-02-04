/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class UpdateDimensionResult implements Serializable {
    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN)of the created dimension.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The type of the dimension.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOPIC_FILTER
     */
    private String type;

    /**
     * <p>
     * The value or list of values used to scope the dimension. For example, for
     * topic filters, this is the pattern used to match the MQTT topic name.
     * </p>
     */
    private java.util.List<String> stringValues;

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was
     * initially created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was
     * most recently updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         A unique identifier for the dimension.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param name <p>
     *            A unique identifier for the dimension.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param name <p>
     *            A unique identifier for the dimension.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDimensionResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN)of the created dimension.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN)of the created dimension.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN)of the created dimension.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN)of the created dimension.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN)of the created dimension.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN)of the created dimension.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDimensionResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The type of the dimension.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOPIC_FILTER
     *
     * @return <p>
     *         The type of the dimension.
     *         </p>
     * @see DimensionType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the dimension.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOPIC_FILTER
     *
     * @param type <p>
     *            The type of the dimension.
     *            </p>
     * @see DimensionType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the dimension.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOPIC_FILTER
     *
     * @param type <p>
     *            The type of the dimension.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DimensionType
     */
    public UpdateDimensionResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the dimension.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOPIC_FILTER
     *
     * @param type <p>
     *            The type of the dimension.
     *            </p>
     * @see DimensionType
     */
    public void setType(DimensionType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the dimension.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOPIC_FILTER
     *
     * @param type <p>
     *            The type of the dimension.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DimensionType
     */
    public UpdateDimensionResult withType(DimensionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The value or list of values used to scope the dimension. For example, for
     * topic filters, this is the pattern used to match the MQTT topic name.
     * </p>
     *
     * @return <p>
     *         The value or list of values used to scope the dimension. For
     *         example, for topic filters, this is the pattern used to match the
     *         MQTT topic name.
     *         </p>
     */
    public java.util.List<String> getStringValues() {
        return stringValues;
    }

    /**
     * <p>
     * The value or list of values used to scope the dimension. For example, for
     * topic filters, this is the pattern used to match the MQTT topic name.
     * </p>
     *
     * @param stringValues <p>
     *            The value or list of values used to scope the dimension. For
     *            example, for topic filters, this is the pattern used to match
     *            the MQTT topic name.
     *            </p>
     */
    public void setStringValues(java.util.Collection<String> stringValues) {
        if (stringValues == null) {
            this.stringValues = null;
            return;
        }

        this.stringValues = new java.util.ArrayList<String>(stringValues);
    }

    /**
     * <p>
     * The value or list of values used to scope the dimension. For example, for
     * topic filters, this is the pattern used to match the MQTT topic name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringValues <p>
     *            The value or list of values used to scope the dimension. For
     *            example, for topic filters, this is the pattern used to match
     *            the MQTT topic name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDimensionResult withStringValues(String... stringValues) {
        if (getStringValues() == null) {
            this.stringValues = new java.util.ArrayList<String>(stringValues.length);
        }
        for (String value : stringValues) {
            this.stringValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The value or list of values used to scope the dimension. For example, for
     * topic filters, this is the pattern used to match the MQTT topic name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringValues <p>
     *            The value or list of values used to scope the dimension. For
     *            example, for topic filters, this is the pattern used to match
     *            the MQTT topic name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDimensionResult withStringValues(java.util.Collection<String> stringValues) {
        setStringValues(stringValues);
        return this;
    }

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was
     * initially created.
     * </p>
     *
     * @return <p>
     *         The date and time, in milliseconds since epoch, when the
     *         dimension was initially created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was
     * initially created.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time, in milliseconds since epoch, when the
     *            dimension was initially created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was
     * initially created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time, in milliseconds since epoch, when the
     *            dimension was initially created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDimensionResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was
     * most recently updated.
     * </p>
     *
     * @return <p>
     *         The date and time, in milliseconds since epoch, when the
     *         dimension was most recently updated.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was
     * most recently updated.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date and time, in milliseconds since epoch, when the
     *            dimension was most recently updated.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was
     * most recently updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date and time, in milliseconds since epoch, when the
     *            dimension was most recently updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDimensionResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
            sb.append("name: " + getName() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getStringValues() != null)
            sb.append("stringValues: " + getStringValues() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getStringValues() == null) ? 0 : getStringValues().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDimensionResult == false)
            return false;
        UpdateDimensionResult other = (UpdateDimensionResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStringValues() == null ^ this.getStringValues() == null)
            return false;
        if (other.getStringValues() != null
                && other.getStringValues().equals(this.getStringValues()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }
}
