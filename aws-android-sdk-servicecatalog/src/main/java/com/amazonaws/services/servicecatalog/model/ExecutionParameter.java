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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Details of an execution parameter value that is passed to a self-service
 * action when executed on a provisioned product.
 * </p>
 */
public class ExecutionParameter implements Serializable {
    /**
     * <p>
     * The name of the execution parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String name;

    /**
     * <p>
     * The execution parameter type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String type;

    /**
     * <p>
     * The default values for the execution parameter.
     * </p>
     */
    private java.util.List<String> defaultValues;

    /**
     * <p>
     * The name of the execution parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         The name of the execution parameter.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the execution parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param name <p>
     *            The name of the execution parameter.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the execution parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param name <p>
     *            The name of the execution parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecutionParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The execution parameter type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The execution parameter type.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The execution parameter type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param type <p>
     *            The execution parameter type.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The execution parameter type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param type <p>
     *            The execution parameter type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecutionParameter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The default values for the execution parameter.
     * </p>
     *
     * @return <p>
     *         The default values for the execution parameter.
     *         </p>
     */
    public java.util.List<String> getDefaultValues() {
        return defaultValues;
    }

    /**
     * <p>
     * The default values for the execution parameter.
     * </p>
     *
     * @param defaultValues <p>
     *            The default values for the execution parameter.
     *            </p>
     */
    public void setDefaultValues(java.util.Collection<String> defaultValues) {
        if (defaultValues == null) {
            this.defaultValues = null;
            return;
        }

        this.defaultValues = new java.util.ArrayList<String>(defaultValues);
    }

    /**
     * <p>
     * The default values for the execution parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValues <p>
     *            The default values for the execution parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecutionParameter withDefaultValues(String... defaultValues) {
        if (getDefaultValues() == null) {
            this.defaultValues = new java.util.ArrayList<String>(defaultValues.length);
        }
        for (String value : defaultValues) {
            this.defaultValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The default values for the execution parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValues <p>
     *            The default values for the execution parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecutionParameter withDefaultValues(java.util.Collection<String> defaultValues) {
        setDefaultValues(defaultValues);
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDefaultValues() != null)
            sb.append("DefaultValues: " + getDefaultValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultValues() == null) ? 0 : getDefaultValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionParameter == false)
            return false;
        ExecutionParameter other = (ExecutionParameter) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDefaultValues() == null ^ this.getDefaultValues() == null)
            return false;
        if (other.getDefaultValues() != null
                && other.getDefaultValues().equals(this.getDefaultValues()) == false)
            return false;
        return true;
    }
}
