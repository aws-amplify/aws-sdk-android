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
 * Deregisters the specified task definition by family and revision. Upon
 * deregistration, the task definition is marked as <code>INACTIVE</code>.
 * Existing tasks and services that reference an <code>INACTIVE</code> task
 * definition continue to run without disruption. Existing services that
 * reference an <code>INACTIVE</code> task definition can still scale up or down
 * by modifying the service's desired count.
 * </p>
 * <p>
 * You cannot use an <code>INACTIVE</code> task definition to run new tasks or
 * create new services, and you cannot update an existing service to reference
 * an <code>INACTIVE</code> task definition. However, there may be up to a
 * 10-minute window following deregistration where these restrictions have not
 * yet taken effect.
 * </p>
 * <note>
 * <p>
 * At this time, <code>INACTIVE</code> task definitions remain discoverable in
 * your account indefinitely. However, this behavior is subject to change in the
 * future, so you should not rely on <code>INACTIVE</code> task definitions
 * persisting beyond the lifecycle of any associated tasks and services.
 * </p>
 * </note>
 */
public class DeregisterTaskDefinitionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full Amazon Resource Name (ARN) of the
     * task definition to deregister. You must specify a <code>revision</code>.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full Amazon Resource Name (ARN) of the
     * task definition to deregister. You must specify a <code>revision</code>.
     * </p>
     *
     * @return <p>
     *         The <code>family</code> and <code>revision</code> (
     *         <code>family:revision</code>) or full Amazon Resource Name (ARN)
     *         of the task definition to deregister. You must specify a
     *         <code>revision</code>.
     *         </p>
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full Amazon Resource Name (ARN) of the
     * task definition to deregister. You must specify a <code>revision</code>.
     * </p>
     *
     * @param taskDefinition <p>
     *            The <code>family</code> and <code>revision</code> (
     *            <code>family:revision</code>) or full Amazon Resource Name
     *            (ARN) of the task definition to deregister. You must specify a
     *            <code>revision</code>.
     *            </p>
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full Amazon Resource Name (ARN) of the
     * task definition to deregister. You must specify a <code>revision</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskDefinition <p>
     *            The <code>family</code> and <code>revision</code> (
     *            <code>family:revision</code>) or full Amazon Resource Name
     *            (ARN) of the task definition to deregister. You must specify a
     *            <code>revision</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeregisterTaskDefinitionRequest withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
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
            sb.append("taskDefinition: " + getTaskDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterTaskDefinitionRequest == false)
            return false;
        DeregisterTaskDefinitionRequest other = (DeregisterTaskDefinitionRequest) obj;

        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null
                && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        return true;
    }
}
