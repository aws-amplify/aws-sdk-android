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

package com.amazonaws.services.awscloudmap.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that lets you specify the namespaces that you want to list
 * services for.
 * </p>
 */
public class ServiceFilter implements Serializable {
    /**
     * <p>
     * Specify <code>NAMESPACE_ID</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAMESPACE_ID
     */
    private String name;

    /**
     * <p>
     * The values that are applicable to the value that you specify for
     * <code>Condition</code> to filter the list of services.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The operator that you want to use to determine whether a service is
     * returned by <code>ListServices</code>. Valid values for
     * <code>Condition</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace
     * ID for <code>Values</code>. <code>EQ</code> is the default condition and
     * can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code>, specify a list of the
     * IDs for the namespaces that you want <code>ListServices</code> to return
     * a list of services for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, IN, BETWEEN
     */
    private String condition;

    /**
     * <p>
     * Specify <code>NAMESPACE_ID</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAMESPACE_ID
     *
     * @return <p>
     *         Specify <code>NAMESPACE_ID</code>.
     *         </p>
     * @see ServiceFilterName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Specify <code>NAMESPACE_ID</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAMESPACE_ID
     *
     * @param name <p>
     *            Specify <code>NAMESPACE_ID</code>.
     *            </p>
     * @see ServiceFilterName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specify <code>NAMESPACE_ID</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAMESPACE_ID
     *
     * @param name <p>
     *            Specify <code>NAMESPACE_ID</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceFilterName
     */
    public ServiceFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Specify <code>NAMESPACE_ID</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAMESPACE_ID
     *
     * @param name <p>
     *            Specify <code>NAMESPACE_ID</code>.
     *            </p>
     * @see ServiceFilterName
     */
    public void setName(ServiceFilterName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * Specify <code>NAMESPACE_ID</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAMESPACE_ID
     *
     * @param name <p>
     *            Specify <code>NAMESPACE_ID</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceFilterName
     */
    public ServiceFilter withName(ServiceFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The values that are applicable to the value that you specify for
     * <code>Condition</code> to filter the list of services.
     * </p>
     *
     * @return <p>
     *         The values that are applicable to the value that you specify for
     *         <code>Condition</code> to filter the list of services.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values that are applicable to the value that you specify for
     * <code>Condition</code> to filter the list of services.
     * </p>
     *
     * @param values <p>
     *            The values that are applicable to the value that you specify
     *            for <code>Condition</code> to filter the list of services.
     *            </p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The values that are applicable to the value that you specify for
     * <code>Condition</code> to filter the list of services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The values that are applicable to the value that you specify
     *            for <code>Condition</code> to filter the list of services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceFilter withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The values that are applicable to the value that you specify for
     * <code>Condition</code> to filter the list of services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The values that are applicable to the value that you specify
     *            for <code>Condition</code> to filter the list of services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether a service is
     * returned by <code>ListServices</code>. Valid values for
     * <code>Condition</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace
     * ID for <code>Values</code>. <code>EQ</code> is the default condition and
     * can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code>, specify a list of the
     * IDs for the namespaces that you want <code>ListServices</code> to return
     * a list of services for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, IN, BETWEEN
     *
     * @return <p>
     *         The operator that you want to use to determine whether a service
     *         is returned by <code>ListServices</code>. Valid values for
     *         <code>Condition</code> include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EQ</code>: When you specify <code>EQ</code>, specify one
     *         namespace ID for <code>Values</code>. <code>EQ</code> is the
     *         default condition and can be omitted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN</code>: When you specify <code>IN</code>, specify a list
     *         of the IDs for the namespaces that you want
     *         <code>ListServices</code> to return a list of services for.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BETWEEN</code>: Not applicable.
     *         </p>
     *         </li>
     *         </ul>
     * @see FilterCondition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether a service is
     * returned by <code>ListServices</code>. Valid values for
     * <code>Condition</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace
     * ID for <code>Values</code>. <code>EQ</code> is the default condition and
     * can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code>, specify a list of the
     * IDs for the namespaces that you want <code>ListServices</code> to return
     * a list of services for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, IN, BETWEEN
     *
     * @param condition <p>
     *            The operator that you want to use to determine whether a
     *            service is returned by <code>ListServices</code>. Valid values
     *            for <code>Condition</code> include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>EQ</code>: When you specify <code>EQ</code>, specify one
     *            namespace ID for <code>Values</code>. <code>EQ</code> is the
     *            default condition and can be omitted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN</code>: When you specify <code>IN</code>, specify a
     *            list of the IDs for the namespaces that you want
     *            <code>ListServices</code> to return a list of services for.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BETWEEN</code>: Not applicable.
     *            </p>
     *            </li>
     *            </ul>
     * @see FilterCondition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether a service is
     * returned by <code>ListServices</code>. Valid values for
     * <code>Condition</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace
     * ID for <code>Values</code>. <code>EQ</code> is the default condition and
     * can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code>, specify a list of the
     * IDs for the namespaces that you want <code>ListServices</code> to return
     * a list of services for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, IN, BETWEEN
     *
     * @param condition <p>
     *            The operator that you want to use to determine whether a
     *            service is returned by <code>ListServices</code>. Valid values
     *            for <code>Condition</code> include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>EQ</code>: When you specify <code>EQ</code>, specify one
     *            namespace ID for <code>Values</code>. <code>EQ</code> is the
     *            default condition and can be omitted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN</code>: When you specify <code>IN</code>, specify a
     *            list of the IDs for the namespaces that you want
     *            <code>ListServices</code> to return a list of services for.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BETWEEN</code>: Not applicable.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterCondition
     */
    public ServiceFilter withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether a service is
     * returned by <code>ListServices</code>. Valid values for
     * <code>Condition</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace
     * ID for <code>Values</code>. <code>EQ</code> is the default condition and
     * can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code>, specify a list of the
     * IDs for the namespaces that you want <code>ListServices</code> to return
     * a list of services for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, IN, BETWEEN
     *
     * @param condition <p>
     *            The operator that you want to use to determine whether a
     *            service is returned by <code>ListServices</code>. Valid values
     *            for <code>Condition</code> include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>EQ</code>: When you specify <code>EQ</code>, specify one
     *            namespace ID for <code>Values</code>. <code>EQ</code> is the
     *            default condition and can be omitted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN</code>: When you specify <code>IN</code>, specify a
     *            list of the IDs for the namespaces that you want
     *            <code>ListServices</code> to return a list of services for.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BETWEEN</code>: Not applicable.
     *            </p>
     *            </li>
     *            </ul>
     * @see FilterCondition
     */
    public void setCondition(FilterCondition condition) {
        this.condition = condition.toString();
    }

    /**
     * <p>
     * The operator that you want to use to determine whether a service is
     * returned by <code>ListServices</code>. Valid values for
     * <code>Condition</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace
     * ID for <code>Values</code>. <code>EQ</code> is the default condition and
     * can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code>, specify a list of the
     * IDs for the namespaces that you want <code>ListServices</code> to return
     * a list of services for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, IN, BETWEEN
     *
     * @param condition <p>
     *            The operator that you want to use to determine whether a
     *            service is returned by <code>ListServices</code>. Valid values
     *            for <code>Condition</code> include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>EQ</code>: When you specify <code>EQ</code>, specify one
     *            namespace ID for <code>Values</code>. <code>EQ</code> is the
     *            default condition and can be omitted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN</code>: When you specify <code>IN</code>, specify a
     *            list of the IDs for the namespaces that you want
     *            <code>ListServices</code> to return a list of services for.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BETWEEN</code>: Not applicable.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterCondition
     */
    public ServiceFilter withCondition(FilterCondition condition) {
        this.condition = condition.toString();
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
        if (getValues() != null)
            sb.append("Values: " + getValues() + ",");
        if (getCondition() != null)
            sb.append("Condition: " + getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceFilter == false)
            return false;
        ServiceFilter other = (ServiceFilter) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null
                && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }
}
