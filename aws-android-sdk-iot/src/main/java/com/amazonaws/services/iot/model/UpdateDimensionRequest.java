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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the definition for a dimension. You cannot change the type of a
 * dimension after it is created (you can delete it and recreate it).
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >UpdateDimension</a> action.
 * </p>
 */
public class UpdateDimensionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes
     * the type and value to make it easy to remember what it does.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String name;

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For
     * <code>TOPIC_FILTER</code> dimensions, this is a pattern used to match the
     * MQTT topic (for example, "admin/#").
     * </p>
     */
    private java.util.List<String> stringValues;

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes
     * the type and value to make it easy to remember what it does.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         A unique identifier for the dimension. Choose something that
     *         describes the type and value to make it easy to remember what it
     *         does.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes
     * the type and value to make it easy to remember what it does.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param name <p>
     *            A unique identifier for the dimension. Choose something that
     *            describes the type and value to make it easy to remember what
     *            it does.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes
     * the type and value to make it easy to remember what it does.
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
     *            A unique identifier for the dimension. Choose something that
     *            describes the type and value to make it easy to remember what
     *            it does.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDimensionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For
     * <code>TOPIC_FILTER</code> dimensions, this is a pattern used to match the
     * MQTT topic (for example, "admin/#").
     * </p>
     *
     * @return <p>
     *         Specifies the value or list of values for the dimension. For
     *         <code>TOPIC_FILTER</code> dimensions, this is a pattern used to
     *         match the MQTT topic (for example, "admin/#").
     *         </p>
     */
    public java.util.List<String> getStringValues() {
        return stringValues;
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For
     * <code>TOPIC_FILTER</code> dimensions, this is a pattern used to match the
     * MQTT topic (for example, "admin/#").
     * </p>
     *
     * @param stringValues <p>
     *            Specifies the value or list of values for the dimension. For
     *            <code>TOPIC_FILTER</code> dimensions, this is a pattern used
     *            to match the MQTT topic (for example, "admin/#").
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
     * Specifies the value or list of values for the dimension. For
     * <code>TOPIC_FILTER</code> dimensions, this is a pattern used to match the
     * MQTT topic (for example, "admin/#").
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringValues <p>
     *            Specifies the value or list of values for the dimension. For
     *            <code>TOPIC_FILTER</code> dimensions, this is a pattern used
     *            to match the MQTT topic (for example, "admin/#").
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDimensionRequest withStringValues(String... stringValues) {
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
     * Specifies the value or list of values for the dimension. For
     * <code>TOPIC_FILTER</code> dimensions, this is a pattern used to match the
     * MQTT topic (for example, "admin/#").
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringValues <p>
     *            Specifies the value or list of values for the dimension. For
     *            <code>TOPIC_FILTER</code> dimensions, this is a pattern used
     *            to match the MQTT topic (for example, "admin/#").
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDimensionRequest withStringValues(java.util.Collection<String> stringValues) {
        setStringValues(stringValues);
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
        if (getStringValues() != null)
            sb.append("stringValues: " + getStringValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getStringValues() == null) ? 0 : getStringValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDimensionRequest == false)
            return false;
        UpdateDimensionRequest other = (UpdateDimensionRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStringValues() == null ^ this.getStringValues() == null)
            return false;
        if (other.getStringValues() != null
                && other.getStringValues().equals(this.getStringValues()) == false)
            return false;
        return true;
    }
}
