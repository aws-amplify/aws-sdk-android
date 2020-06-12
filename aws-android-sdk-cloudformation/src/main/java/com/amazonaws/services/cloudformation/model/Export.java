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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>Export</code> structure describes the exported output values for a
 * stack.
 * </p>
 */
public class Export implements Serializable {
    /**
     * <p>
     * The stack that contains the exported output name and value.
     * </p>
     */
    private String exportingStackId;

    /**
     * <p>
     * The name of exported output value. Use this name and the
     * <code>Fn::ImportValue</code> function to import the associated value into
     * other stacks. The name is defined in the <code>Export</code> field in the
     * associated stack's <code>Outputs</code> section.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The value of the exported output, such as a resource physical ID. This
     * value is defined in the <code>Export</code> field in the associated
     * stack's <code>Outputs</code> section.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The stack that contains the exported output name and value.
     * </p>
     *
     * @return <p>
     *         The stack that contains the exported output name and value.
     *         </p>
     */
    public String getExportingStackId() {
        return exportingStackId;
    }

    /**
     * <p>
     * The stack that contains the exported output name and value.
     * </p>
     *
     * @param exportingStackId <p>
     *            The stack that contains the exported output name and value.
     *            </p>
     */
    public void setExportingStackId(String exportingStackId) {
        this.exportingStackId = exportingStackId;
    }

    /**
     * <p>
     * The stack that contains the exported output name and value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportingStackId <p>
     *            The stack that contains the exported output name and value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Export withExportingStackId(String exportingStackId) {
        this.exportingStackId = exportingStackId;
        return this;
    }

    /**
     * <p>
     * The name of exported output value. Use this name and the
     * <code>Fn::ImportValue</code> function to import the associated value into
     * other stacks. The name is defined in the <code>Export</code> field in the
     * associated stack's <code>Outputs</code> section.
     * </p>
     *
     * @return <p>
     *         The name of exported output value. Use this name and the
     *         <code>Fn::ImportValue</code> function to import the associated
     *         value into other stacks. The name is defined in the
     *         <code>Export</code> field in the associated stack's
     *         <code>Outputs</code> section.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of exported output value. Use this name and the
     * <code>Fn::ImportValue</code> function to import the associated value into
     * other stacks. The name is defined in the <code>Export</code> field in the
     * associated stack's <code>Outputs</code> section.
     * </p>
     *
     * @param name <p>
     *            The name of exported output value. Use this name and the
     *            <code>Fn::ImportValue</code> function to import the associated
     *            value into other stacks. The name is defined in the
     *            <code>Export</code> field in the associated stack's
     *            <code>Outputs</code> section.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of exported output value. Use this name and the
     * <code>Fn::ImportValue</code> function to import the associated value into
     * other stacks. The name is defined in the <code>Export</code> field in the
     * associated stack's <code>Outputs</code> section.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of exported output value. Use this name and the
     *            <code>Fn::ImportValue</code> function to import the associated
     *            value into other stacks. The name is defined in the
     *            <code>Export</code> field in the associated stack's
     *            <code>Outputs</code> section.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Export withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The value of the exported output, such as a resource physical ID. This
     * value is defined in the <code>Export</code> field in the associated
     * stack's <code>Outputs</code> section.
     * </p>
     *
     * @return <p>
     *         The value of the exported output, such as a resource physical ID.
     *         This value is defined in the <code>Export</code> field in the
     *         associated stack's <code>Outputs</code> section.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the exported output, such as a resource physical ID. This
     * value is defined in the <code>Export</code> field in the associated
     * stack's <code>Outputs</code> section.
     * </p>
     *
     * @param value <p>
     *            The value of the exported output, such as a resource physical
     *            ID. This value is defined in the <code>Export</code> field in
     *            the associated stack's <code>Outputs</code> section.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the exported output, such as a resource physical ID. This
     * value is defined in the <code>Export</code> field in the associated
     * stack's <code>Outputs</code> section.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the exported output, such as a resource physical
     *            ID. This value is defined in the <code>Export</code> field in
     *            the associated stack's <code>Outputs</code> section.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Export withValue(String value) {
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
        if (getExportingStackId() != null)
            sb.append("ExportingStackId: " + getExportingStackId() + ",");
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

        hashCode = prime * hashCode
                + ((getExportingStackId() == null) ? 0 : getExportingStackId().hashCode());
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

        if (obj instanceof Export == false)
            return false;
        Export other = (Export) obj;

        if (other.getExportingStackId() == null ^ this.getExportingStackId() == null)
            return false;
        if (other.getExportingStackId() != null
                && other.getExportingStackId().equals(this.getExportingStackId()) == false)
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
