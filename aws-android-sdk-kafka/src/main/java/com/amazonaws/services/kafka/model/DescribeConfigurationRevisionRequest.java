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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 <p>
 * Returns a description of this revision of the configuration.
 * </p>
 */
public class DescribeConfigurationRevisionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK
     * configuration and all of its revisions.
     * </p>
     */
    private String arn;

    /**
     * 
     <p>
     * A string that uniquely identifies a revision of an MSK configuration.
     * </p>
     */
    private Long revision;

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK
     * configuration and all of its revisions.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies an MSK
     *         configuration and all of its revisions.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK
     * configuration and all of its revisions.
     * </p>
     * 
     * @param arn <p>
     *            The Amazon Resource Name (ARN) that uniquely identifies an MSK
     *            configuration and all of its revisions.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK
     * configuration and all of its revisions.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) that uniquely identifies an MSK
     *            configuration and all of its revisions.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationRevisionRequest withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * 
     <p>
     * A string that uniquely identifies a revision of an MSK configuration.
     * </p>
     * 
     * @return <p>
     *         A string that uniquely identifies a revision of an MSK
     *         configuration.
     *         </p>
     */
    public Long getRevision() {
        return revision;
    }

    /**
     * 
     <p>
     * A string that uniquely identifies a revision of an MSK configuration.
     * </p>
     * 
     * @param revision <p>
     *            A string that uniquely identifies a revision of an MSK
     *            configuration.
     *            </p>
     */
    public void setRevision(Long revision) {
        this.revision = revision;
    }

    /**
     * 
     <p>
     * A string that uniquely identifies a revision of an MSK configuration.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revision <p>
     *            A string that uniquely identifies a revision of an MSK
     *            configuration.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationRevisionRequest withRevision(Long revision) {
        this.revision = revision;
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
            sb.append("Arn: " + getArn() + ",");
        if (getRevision() != null)
            sb.append("Revision: " + getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationRevisionRequest == false)
            return false;
        DescribeConfigurationRevisionRequest other = (DescribeConfigurationRevisionRequest) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }
}
