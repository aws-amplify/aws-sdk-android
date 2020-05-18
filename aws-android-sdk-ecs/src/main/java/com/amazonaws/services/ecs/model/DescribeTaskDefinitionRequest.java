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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes a task definition. You can specify a <code>family</code> and
 * <code>revision</code> to find information about a specific task definition,
 * or you can simply specify the family to find the latest <code>ACTIVE</code>
 * revision in that family.
 * </p>
 * <note>
 * <p>
 * You can only describe <code>INACTIVE</code> task definitions while an active
 * task or service references them.
 * </p>
 * </note>
 */
public class DescribeTaskDefinitionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>family</code> for the latest <code>ACTIVE</code> revision,
     * <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) for a specific revision in the family, or
     * full Amazon Resource Name (ARN) of the task definition to describe.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * Specifies whether to see the resource tags for the task definition. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     */
    private java.util.List<String> include;

    /**
     * <p>
     * The <code>family</code> for the latest <code>ACTIVE</code> revision,
     * <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) for a specific revision in the family, or
     * full Amazon Resource Name (ARN) of the task definition to describe.
     * </p>
     *
     * @return <p>
     *         The <code>family</code> for the latest <code>ACTIVE</code>
     *         revision, <code>family</code> and <code>revision</code> (
     *         <code>family:revision</code>) for a specific revision in the
     *         family, or full Amazon Resource Name (ARN) of the task definition
     *         to describe.
     *         </p>
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> for the latest <code>ACTIVE</code> revision,
     * <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) for a specific revision in the family, or
     * full Amazon Resource Name (ARN) of the task definition to describe.
     * </p>
     *
     * @param taskDefinition <p>
     *            The <code>family</code> for the latest <code>ACTIVE</code>
     *            revision, <code>family</code> and <code>revision</code> (
     *            <code>family:revision</code>) for a specific revision in the
     *            family, or full Amazon Resource Name (ARN) of the task
     *            definition to describe.
     *            </p>
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> for the latest <code>ACTIVE</code> revision,
     * <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) for a specific revision in the family, or
     * full Amazon Resource Name (ARN) of the task definition to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskDefinition <p>
     *            The <code>family</code> for the latest <code>ACTIVE</code>
     *            revision, <code>family</code> and <code>revision</code> (
     *            <code>family:revision</code>) for a specific revision in the
     *            family, or full Amazon Resource Name (ARN) of the task
     *            definition to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTaskDefinitionRequest withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task definition. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     *
     * @return <p>
     *         Specifies whether to see the resource tags for the task
     *         definition. If <code>TAGS</code> is specified, the tags are
     *         included in the response. If this field is omitted, tags are not
     *         included in the response.
     *         </p>
     */
    public java.util.List<String> getInclude() {
        return include;
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task definition. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     *
     * @param include <p>
     *            Specifies whether to see the resource tags for the task
     *            definition. If <code>TAGS</code> is specified, the tags are
     *            included in the response. If this field is omitted, tags are
     *            not included in the response.
     *            </p>
     */
    public void setInclude(java.util.Collection<String> include) {
        if (include == null) {
            this.include = null;
            return;
        }

        this.include = new java.util.ArrayList<String>(include);
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task definition. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param include <p>
     *            Specifies whether to see the resource tags for the task
     *            definition. If <code>TAGS</code> is specified, the tags are
     *            included in the response. If this field is omitted, tags are
     *            not included in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTaskDefinitionRequest withInclude(String... include) {
        if (getInclude() == null) {
            this.include = new java.util.ArrayList<String>(include.length);
        }
        for (String value : include) {
            this.include.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether to see the resource tags for the task definition. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param include <p>
     *            Specifies whether to see the resource tags for the task
     *            definition. If <code>TAGS</code> is specified, the tags are
     *            included in the response. If this field is omitted, tags are
     *            not included in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTaskDefinitionRequest withInclude(java.util.Collection<String> include) {
        setInclude(include);
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
        if (getTaskDefinition() != null)
            sb.append("taskDefinition: " + getTaskDefinition() + ",");
        if (getInclude() != null)
            sb.append("include: " + getInclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTaskDefinitionRequest == false)
            return false;
        DescribeTaskDefinitionRequest other = (DescribeTaskDefinitionRequest) obj;

        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null
                && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }
}
