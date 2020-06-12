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

/**
 * <p>
 * The type and amount of a resource to assign to a container. The supported
 * resource types are GPUs and Elastic Inference accelerators. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-gpu.html"
 * >Working with GPUs on Amazon ECS</a> or <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-eia.html"
 * >Working with Amazon Elastic Inference on Amazon ECS</a> in the <i>Amazon
 * Elastic Container Service Developer Guide</i>
 * </p>
 */
public class ResourceRequirement implements Serializable {
    /**
     * <p>
     * The value for the specified resource type.
     * </p>
     * <p>
     * If the <code>GPU</code> type is used, the value is the number of physical
     * <code>GPUs</code> the Amazon ECS container agent will reserve for the
     * container. The number of GPUs reserved for all containers in a task
     * should not exceed the number of available GPUs on the container instance
     * the task is launched on.
     * </p>
     * <p>
     * If the <code>InferenceAccelerator</code> type is used, the
     * <code>value</code> should match the <code>deviceName</code> for an
     * <a>InferenceAccelerator</a> specified in a task definition.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of resource to assign to a container. The supported values are
     * <code>GPU</code> or <code>InferenceAccelerator</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GPU, InferenceAccelerator
     */
    private String type;

    /**
     * <p>
     * The value for the specified resource type.
     * </p>
     * <p>
     * If the <code>GPU</code> type is used, the value is the number of physical
     * <code>GPUs</code> the Amazon ECS container agent will reserve for the
     * container. The number of GPUs reserved for all containers in a task
     * should not exceed the number of available GPUs on the container instance
     * the task is launched on.
     * </p>
     * <p>
     * If the <code>InferenceAccelerator</code> type is used, the
     * <code>value</code> should match the <code>deviceName</code> for an
     * <a>InferenceAccelerator</a> specified in a task definition.
     * </p>
     *
     * @return <p>
     *         The value for the specified resource type.
     *         </p>
     *         <p>
     *         If the <code>GPU</code> type is used, the value is the number of
     *         physical <code>GPUs</code> the Amazon ECS container agent will
     *         reserve for the container. The number of GPUs reserved for all
     *         containers in a task should not exceed the number of available
     *         GPUs on the container instance the task is launched on.
     *         </p>
     *         <p>
     *         If the <code>InferenceAccelerator</code> type is used, the
     *         <code>value</code> should match the <code>deviceName</code> for
     *         an <a>InferenceAccelerator</a> specified in a task definition.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value for the specified resource type.
     * </p>
     * <p>
     * If the <code>GPU</code> type is used, the value is the number of physical
     * <code>GPUs</code> the Amazon ECS container agent will reserve for the
     * container. The number of GPUs reserved for all containers in a task
     * should not exceed the number of available GPUs on the container instance
     * the task is launched on.
     * </p>
     * <p>
     * If the <code>InferenceAccelerator</code> type is used, the
     * <code>value</code> should match the <code>deviceName</code> for an
     * <a>InferenceAccelerator</a> specified in a task definition.
     * </p>
     *
     * @param value <p>
     *            The value for the specified resource type.
     *            </p>
     *            <p>
     *            If the <code>GPU</code> type is used, the value is the number
     *            of physical <code>GPUs</code> the Amazon ECS container agent
     *            will reserve for the container. The number of GPUs reserved
     *            for all containers in a task should not exceed the number of
     *            available GPUs on the container instance the task is launched
     *            on.
     *            </p>
     *            <p>
     *            If the <code>InferenceAccelerator</code> type is used, the
     *            <code>value</code> should match the <code>deviceName</code>
     *            for an <a>InferenceAccelerator</a> specified in a task
     *            definition.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the specified resource type.
     * </p>
     * <p>
     * If the <code>GPU</code> type is used, the value is the number of physical
     * <code>GPUs</code> the Amazon ECS container agent will reserve for the
     * container. The number of GPUs reserved for all containers in a task
     * should not exceed the number of available GPUs on the container instance
     * the task is launched on.
     * </p>
     * <p>
     * If the <code>InferenceAccelerator</code> type is used, the
     * <code>value</code> should match the <code>deviceName</code> for an
     * <a>InferenceAccelerator</a> specified in a task definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value for the specified resource type.
     *            </p>
     *            <p>
     *            If the <code>GPU</code> type is used, the value is the number
     *            of physical <code>GPUs</code> the Amazon ECS container agent
     *            will reserve for the container. The number of GPUs reserved
     *            for all containers in a task should not exceed the number of
     *            available GPUs on the container instance the task is launched
     *            on.
     *            </p>
     *            <p>
     *            If the <code>InferenceAccelerator</code> type is used, the
     *            <code>value</code> should match the <code>deviceName</code>
     *            for an <a>InferenceAccelerator</a> specified in a task
     *            definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceRequirement withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The type of resource to assign to a container. The supported values are
     * <code>GPU</code> or <code>InferenceAccelerator</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GPU, InferenceAccelerator
     *
     * @return <p>
     *         The type of resource to assign to a container. The supported
     *         values are <code>GPU</code> or <code>InferenceAccelerator</code>.
     *         </p>
     * @see ResourceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of resource to assign to a container. The supported values are
     * <code>GPU</code> or <code>InferenceAccelerator</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GPU, InferenceAccelerator
     *
     * @param type <p>
     *            The type of resource to assign to a container. The supported
     *            values are <code>GPU</code> or
     *            <code>InferenceAccelerator</code>.
     *            </p>
     * @see ResourceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of resource to assign to a container. The supported values are
     * <code>GPU</code> or <code>InferenceAccelerator</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GPU, InferenceAccelerator
     *
     * @param type <p>
     *            The type of resource to assign to a container. The supported
     *            values are <code>GPU</code> or
     *            <code>InferenceAccelerator</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public ResourceRequirement withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of resource to assign to a container. The supported values are
     * <code>GPU</code> or <code>InferenceAccelerator</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GPU, InferenceAccelerator
     *
     * @param type <p>
     *            The type of resource to assign to a container. The supported
     *            values are <code>GPU</code> or
     *            <code>InferenceAccelerator</code>.
     *            </p>
     * @see ResourceType
     */
    public void setType(ResourceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of resource to assign to a container. The supported values are
     * <code>GPU</code> or <code>InferenceAccelerator</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GPU, InferenceAccelerator
     *
     * @param type <p>
     *            The type of resource to assign to a container. The supported
     *            values are <code>GPU</code> or
     *            <code>InferenceAccelerator</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public ResourceRequirement withType(ResourceType type) {
        this.type = type.toString();
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
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceRequirement == false)
            return false;
        ResourceRequirement other = (ResourceRequirement) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
