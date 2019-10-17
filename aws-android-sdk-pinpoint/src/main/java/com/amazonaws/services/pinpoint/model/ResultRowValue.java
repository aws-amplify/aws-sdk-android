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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Provides a single value and metadata about that value as part of an array of
 * query results for a standard metric that applies to an application or
 * campaign.
 * </p>
 */
public class ResultRowValue implements Serializable {
    /**
     * <p>
     * The name of the field that Amazon Pinpoint uses to store the value
     * specified by the Value property.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The data type of the value specified by the Value property.
     * </p>
     */
    private String type;

    /**
     * <p>
     * In a Values object, the value for the metric that the query retrieved
     * data for. In a GroupedBys object, the value for the field that was used
     * to group data in a result set that contains multiple results (Values
     * objects).
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the field that Amazon Pinpoint uses to store the value
     * specified by the Value property.
     * </p>
     *
     * @return <p>
     *         The name of the field that Amazon Pinpoint uses to store the
     *         value specified by the Value property.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The name of the field that Amazon Pinpoint uses to store the value
     * specified by the Value property.
     * </p>
     *
     * @param key <p>
     *            The name of the field that Amazon Pinpoint uses to store the
     *            value specified by the Value property.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the field that Amazon Pinpoint uses to store the value
     * specified by the Value property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The name of the field that Amazon Pinpoint uses to store the
     *            value specified by the Value property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultRowValue withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The data type of the value specified by the Value property.
     * </p>
     *
     * @return <p>
     *         The data type of the value specified by the Value property.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The data type of the value specified by the Value property.
     * </p>
     *
     * @param type <p>
     *            The data type of the value specified by the Value property.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the value specified by the Value property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The data type of the value specified by the Value property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultRowValue withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * In a Values object, the value for the metric that the query retrieved
     * data for. In a GroupedBys object, the value for the field that was used
     * to group data in a result set that contains multiple results (Values
     * objects).
     * </p>
     *
     * @return <p>
     *         In a Values object, the value for the metric that the query
     *         retrieved data for. In a GroupedBys object, the value for the
     *         field that was used to group data in a result set that contains
     *         multiple results (Values objects).
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * In a Values object, the value for the metric that the query retrieved
     * data for. In a GroupedBys object, the value for the field that was used
     * to group data in a result set that contains multiple results (Values
     * objects).
     * </p>
     *
     * @param value <p>
     *            In a Values object, the value for the metric that the query
     *            retrieved data for. In a GroupedBys object, the value for the
     *            field that was used to group data in a result set that
     *            contains multiple results (Values objects).
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * In a Values object, the value for the metric that the query retrieved
     * data for. In a GroupedBys object, the value for the field that was used
     * to group data in a result set that contains multiple results (Values
     * objects).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            In a Values object, the value for the metric that the query
     *            retrieved data for. In a GroupedBys object, the value for the
     *            field that was used to group data in a result set that
     *            contains multiple results (Values objects).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultRowValue withValue(String value) {
        this.value = value;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultRowValue == false)
            return false;
        ResultRowValue other = (ResultRowValue) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
