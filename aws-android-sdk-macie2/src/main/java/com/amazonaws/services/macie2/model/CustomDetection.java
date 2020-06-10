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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a custom data identifier that produced a sensitive
 * data finding, and the number of occurrences of the data that it detected for
 * the finding.
 * </p>
 */
public class CustomDetection implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The total number of occurrences of the data that the custom data
     * identifier detected for the finding.
     * </p>
     */
    private Long count;

    /**
     * <p>
     * The name of the custom data identifier.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the custom data identifier.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the custom data identifier.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDetection withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The total number of occurrences of the data that the custom data
     * identifier detected for the finding.
     * </p>
     *
     * @return <p>
     *         The total number of occurrences of the data that the custom data
     *         identifier detected for the finding.
     *         </p>
     */
    public Long getCount() {
        return count;
    }

    /**
     * <p>
     * The total number of occurrences of the data that the custom data
     * identifier detected for the finding.
     * </p>
     *
     * @param count <p>
     *            The total number of occurrences of the data that the custom
     *            data identifier detected for the finding.
     *            </p>
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The total number of occurrences of the data that the custom data
     * identifier detected for the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The total number of occurrences of the data that the custom
     *            data identifier detected for the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDetection withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The name of the custom data identifier.
     * </p>
     *
     * @return <p>
     *         The name of the custom data identifier.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the custom data identifier.
     * </p>
     *
     * @param name <p>
     *            The name of the custom data identifier.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDetection withName(String name) {
        this.name = name;
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getCount() != null)
            sb.append("count: " + getCount() + ",");
        if (getName() != null)
            sb.append("name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomDetection == false)
            return false;
        CustomDetection other = (CustomDetection) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
