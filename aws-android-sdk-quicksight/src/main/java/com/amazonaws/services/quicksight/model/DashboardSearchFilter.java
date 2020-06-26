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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * A filter that you apply when searching for dashboards.
 * </p>
 */
public class DashboardSearchFilter implements Serializable {
    /**
     * <p>
     * The comparison operator that you want to use as a filter, for example,
     * <code>"Operator": "StringEquals"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>StringEquals
     */
    private String operator;

    /**
     * <p>
     * The name of the value that you want to use as a filter, for example,
     * <code>"Name": "QUICKSIGHT_USER"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUICKSIGHT_USER
     */
    private String name;

    /**
     * <p>
     * The value of the named item, in this case <code>QUICKSIGHT_USER</code>,
     * that you want to use as a filter, for example,
     * <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     * .
     * </p>
     */
    private String value;

    /**
     * <p>
     * The comparison operator that you want to use as a filter, for example,
     * <code>"Operator": "StringEquals"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>StringEquals
     *
     * @return <p>
     *         The comparison operator that you want to use as a filter, for
     *         example, <code>"Operator": "StringEquals"</code>.
     *         </p>
     * @see FilterOperator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * <p>
     * The comparison operator that you want to use as a filter, for example,
     * <code>"Operator": "StringEquals"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>StringEquals
     *
     * @param operator <p>
     *            The comparison operator that you want to use as a filter, for
     *            example, <code>"Operator": "StringEquals"</code>.
     *            </p>
     * @see FilterOperator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The comparison operator that you want to use as a filter, for example,
     * <code>"Operator": "StringEquals"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>StringEquals
     *
     * @param operator <p>
     *            The comparison operator that you want to use as a filter, for
     *            example, <code>"Operator": "StringEquals"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterOperator
     */
    public DashboardSearchFilter withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * <p>
     * The comparison operator that you want to use as a filter, for example,
     * <code>"Operator": "StringEquals"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>StringEquals
     *
     * @param operator <p>
     *            The comparison operator that you want to use as a filter, for
     *            example, <code>"Operator": "StringEquals"</code>.
     *            </p>
     * @see FilterOperator
     */
    public void setOperator(FilterOperator operator) {
        this.operator = operator.toString();
    }

    /**
     * <p>
     * The comparison operator that you want to use as a filter, for example,
     * <code>"Operator": "StringEquals"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>StringEquals
     *
     * @param operator <p>
     *            The comparison operator that you want to use as a filter, for
     *            example, <code>"Operator": "StringEquals"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterOperator
     */
    public DashboardSearchFilter withOperator(FilterOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter, for example,
     * <code>"Name": "QUICKSIGHT_USER"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUICKSIGHT_USER
     *
     * @return <p>
     *         The name of the value that you want to use as a filter, for
     *         example, <code>"Name": "QUICKSIGHT_USER"</code>.
     *         </p>
     * @see DashboardFilterAttribute
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter, for example,
     * <code>"Name": "QUICKSIGHT_USER"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUICKSIGHT_USER
     *
     * @param name <p>
     *            The name of the value that you want to use as a filter, for
     *            example, <code>"Name": "QUICKSIGHT_USER"</code>.
     *            </p>
     * @see DashboardFilterAttribute
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter, for example,
     * <code>"Name": "QUICKSIGHT_USER"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUICKSIGHT_USER
     *
     * @param name <p>
     *            The name of the value that you want to use as a filter, for
     *            example, <code>"Name": "QUICKSIGHT_USER"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashboardFilterAttribute
     */
    public DashboardSearchFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter, for example,
     * <code>"Name": "QUICKSIGHT_USER"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUICKSIGHT_USER
     *
     * @param name <p>
     *            The name of the value that you want to use as a filter, for
     *            example, <code>"Name": "QUICKSIGHT_USER"</code>.
     *            </p>
     * @see DashboardFilterAttribute
     */
    public void setName(DashboardFilterAttribute name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter, for example,
     * <code>"Name": "QUICKSIGHT_USER"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUICKSIGHT_USER
     *
     * @param name <p>
     *            The name of the value that you want to use as a filter, for
     *            example, <code>"Name": "QUICKSIGHT_USER"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashboardFilterAttribute
     */
    public DashboardSearchFilter withName(DashboardFilterAttribute name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the named item, in this case <code>QUICKSIGHT_USER</code>,
     * that you want to use as a filter, for example,
     * <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     * .
     * </p>
     *
     * @return <p>
     *         The value of the named item, in this case
     *         <code>QUICKSIGHT_USER</code>, that you want to use as a filter,
     *         for example,
     *         <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     *         .
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the named item, in this case <code>QUICKSIGHT_USER</code>,
     * that you want to use as a filter, for example,
     * <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     * .
     * </p>
     *
     * @param value <p>
     *            The value of the named item, in this case
     *            <code>QUICKSIGHT_USER</code>, that you want to use as a
     *            filter, for example,
     *            <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     *            .
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the named item, in this case <code>QUICKSIGHT_USER</code>,
     * that you want to use as a filter, for example,
     * <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the named item, in this case
     *            <code>QUICKSIGHT_USER</code>, that you want to use as a
     *            filter, for example,
     *            <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardSearchFilter withValue(String value) {
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
        if (getOperator() != null)
            sb.append("Operator: " + getOperator() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardSearchFilter == false)
            return false;
        DashboardSearchFilter other = (DashboardSearchFilter) obj;

        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
