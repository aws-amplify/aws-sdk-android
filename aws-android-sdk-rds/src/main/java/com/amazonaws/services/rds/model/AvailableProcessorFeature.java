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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the available processor feature information for the DB instance
 * class of a DB instance.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor"
 * >Configuring the Processor of the DB Instance Class</a> in the <i>Amazon RDS
 * User Guide. </i>
 * </p>
 */
public class AvailableProcessorFeature implements Serializable {
    /**
     * <p>
     * The name of the processor feature. Valid names are <code>coreCount</code>
     * and <code>threadsPerCore</code>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The default value for the processor feature of the DB instance class.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The allowed values for the processor feature of the DB instance class.
     * </p>
     */
    private String allowedValues;

    /**
     * <p>
     * The name of the processor feature. Valid names are <code>coreCount</code>
     * and <code>threadsPerCore</code>.
     * </p>
     *
     * @return <p>
     *         The name of the processor feature. Valid names are
     *         <code>coreCount</code> and <code>threadsPerCore</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the processor feature. Valid names are <code>coreCount</code>
     * and <code>threadsPerCore</code>.
     * </p>
     *
     * @param name <p>
     *            The name of the processor feature. Valid names are
     *            <code>coreCount</code> and <code>threadsPerCore</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the processor feature. Valid names are <code>coreCount</code>
     * and <code>threadsPerCore</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the processor feature. Valid names are
     *            <code>coreCount</code> and <code>threadsPerCore</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailableProcessorFeature withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The default value for the processor feature of the DB instance class.
     * </p>
     *
     * @return <p>
     *         The default value for the processor feature of the DB instance
     *         class.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value for the processor feature of the DB instance class.
     * </p>
     *
     * @param defaultValue <p>
     *            The default value for the processor feature of the DB instance
     *            class.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value for the processor feature of the DB instance class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The default value for the processor feature of the DB instance
     *            class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailableProcessorFeature withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * <p>
     * The allowed values for the processor feature of the DB instance class.
     * </p>
     *
     * @return <p>
     *         The allowed values for the processor feature of the DB instance
     *         class.
     *         </p>
     */
    public String getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * The allowed values for the processor feature of the DB instance class.
     * </p>
     *
     * @param allowedValues <p>
     *            The allowed values for the processor feature of the DB
     *            instance class.
     *            </p>
     */
    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * The allowed values for the processor feature of the DB instance class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedValues <p>
     *            The allowed values for the processor feature of the DB
     *            instance class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailableProcessorFeature withAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: " + getAllowedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailableProcessorFeature == false)
            return false;
        AvailableProcessorFeature other = (AvailableProcessorFeature) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null
                && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null
                && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        return true;
    }
}
