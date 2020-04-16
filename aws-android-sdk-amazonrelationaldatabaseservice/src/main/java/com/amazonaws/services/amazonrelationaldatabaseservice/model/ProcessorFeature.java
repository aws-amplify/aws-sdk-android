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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the processor features of a DB instance class.
 * </p>
 * <p>
 * To specify the number of CPU cores, use the <code>coreCount</code> feature
 * name for the <code>Name</code> parameter. To specify the number of threads
 * per core, use the <code>threadsPerCore</code> feature name for the
 * <code>Name</code> parameter.
 * </p>
 * <p>
 * You can set the processor features of the DB instance class for a DB instance
 * when you call one of the following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateDBInstance</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ModifyDBInstance</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RestoreDBInstanceFromDBSnapshot</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RestoreDBInstanceFromS3</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RestoreDBInstanceToPointInTime</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can view the valid processor values for a particular instance class by
 * calling the <code>DescribeOrderableDBInstanceOptions</code> action and
 * specifying the instance class for the <code>DBInstanceClass</code> parameter.
 * </p>
 * <p>
 * In addition, you can use the following actions for DB instance class
 * processor information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>DescribeDBInstances</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeDBSnapshots</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeValidDBInstanceModifications</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html#USER_ConfigureProcessor"
 * >Configuring the Processor of the DB Instance Class</a> in the <i>Amazon RDS
 * User Guide. </i>
 * </p>
 */
public class ProcessorFeature implements Serializable {
    /**
     * <p>
     * The name of the processor feature. Valid names are <code>coreCount</code>
     * and <code>threadsPerCore</code>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The value of a processor feature name.
     * </p>
     */
    private String value;

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
    public ProcessorFeature withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The value of a processor feature name.
     * </p>
     *
     * @return <p>
     *         The value of a processor feature name.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of a processor feature name.
     * </p>
     *
     * @param value <p>
     *            The value of a processor feature name.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of a processor feature name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of a processor feature name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessorFeature withValue(String value) {
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

        if (obj instanceof ProcessorFeature == false)
            return false;
        ProcessorFeature other = (ProcessorFeature) obj;

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
