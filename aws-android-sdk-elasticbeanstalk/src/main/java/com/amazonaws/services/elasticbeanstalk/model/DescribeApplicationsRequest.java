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
 * Returns the descriptions of existing applications.
 * </p>
 */
public class DescribeApplicationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to only include those with the specified names.
     * </p>
     */
    private java.util.List<String> applicationNames;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to only include those with the specified names.
     * </p>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to only include those with the specified names.
     *         </p>
     */
    public java.util.List<String> getApplicationNames() {
        return applicationNames;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to only include those with the specified names.
     * </p>
     *
     * @param applicationNames <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to only include those with the specified names.
     *            </p>
     */
    public void setApplicationNames(java.util.Collection<String> applicationNames) {
        if (applicationNames == null) {
            this.applicationNames = null;
            return;
        }

        this.applicationNames = new java.util.ArrayList<String>(applicationNames);
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to only include those with the specified names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationNames <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to only include those with the specified names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeApplicationsRequest withApplicationNames(String... applicationNames) {
        if (getApplicationNames() == null) {
            this.applicationNames = new java.util.ArrayList<String>(applicationNames.length);
        }
        for (String value : applicationNames) {
            this.applicationNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions
     * to only include those with the specified names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationNames <p>
     *            If specified, AWS Elastic Beanstalk restricts the returned
     *            descriptions to only include those with the specified names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeApplicationsRequest withApplicationNames(
            java.util.Collection<String> applicationNames) {
        setApplicationNames(applicationNames);
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
        if (getApplicationNames() != null)
            sb.append("ApplicationNames: " + getApplicationNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationNames() == null) ? 0 : getApplicationNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationsRequest == false)
            return false;
        DescribeApplicationsRequest other = (DescribeApplicationsRequest) obj;

        if (other.getApplicationNames() == null ^ this.getApplicationNames() == null)
            return false;
        if (other.getApplicationNames() != null
                && other.getApplicationNames().equals(this.getApplicationNames()) == false)
            return false;
        return true;
    }
}
