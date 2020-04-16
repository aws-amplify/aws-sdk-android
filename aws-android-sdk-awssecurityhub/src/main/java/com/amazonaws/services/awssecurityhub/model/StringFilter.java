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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * A string filter for querying findings.
 * </p>
 */
public class StringFilter implements Serializable {
    /**
     * <p>
     * The string filter value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String value;

    /**
     * <p>
     * The condition to be applied to a string value when querying for findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, PREFIX
     */
    private String comparison;

    /**
     * <p>
     * The string filter value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The string filter value.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The string filter value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param value <p>
     *            The string filter value.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The string filter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param value <p>
     *            The string filter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StringFilter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The condition to be applied to a string value when querying for findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, PREFIX
     *
     * @return <p>
     *         The condition to be applied to a string value when querying for
     *         findings.
     *         </p>
     * @see StringFilterComparison
     */
    public String getComparison() {
        return comparison;
    }

    /**
     * <p>
     * The condition to be applied to a string value when querying for findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, PREFIX
     *
     * @param comparison <p>
     *            The condition to be applied to a string value when querying
     *            for findings.
     *            </p>
     * @see StringFilterComparison
     */
    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * The condition to be applied to a string value when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, PREFIX
     *
     * @param comparison <p>
     *            The condition to be applied to a string value when querying
     *            for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StringFilterComparison
     */
    public StringFilter withComparison(String comparison) {
        this.comparison = comparison;
        return this;
    }

    /**
     * <p>
     * The condition to be applied to a string value when querying for findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, PREFIX
     *
     * @param comparison <p>
     *            The condition to be applied to a string value when querying
     *            for findings.
     *            </p>
     * @see StringFilterComparison
     */
    public void setComparison(StringFilterComparison comparison) {
        this.comparison = comparison.toString();
    }

    /**
     * <p>
     * The condition to be applied to a string value when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, PREFIX
     *
     * @param comparison <p>
     *            The condition to be applied to a string value when querying
     *            for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StringFilterComparison
     */
    public StringFilter withComparison(StringFilterComparison comparison) {
        this.comparison = comparison.toString();
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getComparison() != null)
            sb.append("Comparison: " + getComparison());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getComparison() == null) ? 0 : getComparison().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StringFilter == false)
            return false;
        StringFilter other = (StringFilter) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getComparison() == null ^ this.getComparison() == null)
            return false;
        if (other.getComparison() != null
                && other.getComparison().equals(this.getComparison()) == false)
            return false;
        return true;
    }
}
