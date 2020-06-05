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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about the overall health of the specified environment.
 * The <b>DescribeEnvironmentHealth</b> operation is only available with AWS
 * Elastic Beanstalk Enhanced Health.
 * </p>
 */
public class DescribeEnvironmentHealthRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specify the environment by name.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * Specify the environment by ID.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     */
    private String environmentId;

    /**
     * <p>
     * Specify the response elements to return. To retrieve all attributes, set
     * to <code>All</code>. If no attribute names are specified, returns the
     * name of the environment.
     * </p>
     */
    private java.util.List<String> attributeNames;

    /**
     * <p>
     * Specify the environment by name.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         Specify the environment by name.
     *         </p>
     *         <p>
     *         You must specify either this or an EnvironmentName, or both.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * Specify the environment by name.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            Specify the environment by name.
     *            </p>
     *            <p>
     *            You must specify either this or an EnvironmentName, or both.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * Specify the environment by name.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            Specify the environment by name.
     *            </p>
     *            <p>
     *            You must specify either this or an EnvironmentName, or both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentHealthRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * Specify the environment by ID.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     *
     * @return <p>
     *         Specify the environment by ID.
     *         </p>
     *         <p>
     *         You must specify either this or an EnvironmentName, or both.
     *         </p>
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    /**
     * <p>
     * Specify the environment by ID.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     *
     * @param environmentId <p>
     *            Specify the environment by ID.
     *            </p>
     *            <p>
     *            You must specify either this or an EnvironmentName, or both.
     *            </p>
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * Specify the environment by ID.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentId <p>
     *            Specify the environment by ID.
     *            </p>
     *            <p>
     *            You must specify either this or an EnvironmentName, or both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentHealthRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * <p>
     * Specify the response elements to return. To retrieve all attributes, set
     * to <code>All</code>. If no attribute names are specified, returns the
     * name of the environment.
     * </p>
     *
     * @return <p>
     *         Specify the response elements to return. To retrieve all
     *         attributes, set to <code>All</code>. If no attribute names are
     *         specified, returns the name of the environment.
     *         </p>
     */
    public java.util.List<String> getAttributeNames() {
        return attributeNames;
    }

    /**
     * <p>
     * Specify the response elements to return. To retrieve all attributes, set
     * to <code>All</code>. If no attribute names are specified, returns the
     * name of the environment.
     * </p>
     *
     * @param attributeNames <p>
     *            Specify the response elements to return. To retrieve all
     *            attributes, set to <code>All</code>. If no attribute names are
     *            specified, returns the name of the environment.
     *            </p>
     */
    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new java.util.ArrayList<String>(attributeNames);
    }

    /**
     * <p>
     * Specify the response elements to return. To retrieve all attributes, set
     * to <code>All</code>. If no attribute names are specified, returns the
     * name of the environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeNames <p>
     *            Specify the response elements to return. To retrieve all
     *            attributes, set to <code>All</code>. If no attribute names are
     *            specified, returns the name of the environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentHealthRequest withAttributeNames(String... attributeNames) {
        if (getAttributeNames() == null) {
            this.attributeNames = new java.util.ArrayList<String>(attributeNames.length);
        }
        for (String value : attributeNames) {
            this.attributeNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specify the response elements to return. To retrieve all attributes, set
     * to <code>All</code>. If no attribute names are specified, returns the
     * name of the environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeNames <p>
     *            Specify the response elements to return. To retrieve all
     *            attributes, set to <code>All</code>. If no attribute names are
     *            specified, returns the name of the environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentHealthRequest withAttributeNames(
            java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: " + getAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentHealthRequest == false)
            return false;
        DescribeEnvironmentHealthRequest other = (DescribeEnvironmentHealthRequest) obj;

        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null
                && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null
                && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        return true;
    }
}
