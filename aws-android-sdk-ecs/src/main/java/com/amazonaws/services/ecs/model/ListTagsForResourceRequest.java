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
 * List the tags for an Amazon ECS resource.
 * </p>
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the resource for which to
     * list the tags. Currently, the supported resources are Amazon ECS tasks,
     * services, task definitions, clusters, and container instances.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the resource for which to
     * list the tags. Currently, the supported resources are Amazon ECS tasks,
     * services, task definitions, clusters, and container instances.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that identifies the resource for
     *         which to list the tags. Currently, the supported resources are
     *         Amazon ECS tasks, services, task definitions, clusters, and
     *         container instances.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the resource for which to
     * list the tags. Currently, the supported resources are Amazon ECS tasks,
     * services, task definitions, clusters, and container instances.
     * </p>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) that identifies the resource
     *            for which to list the tags. Currently, the supported resources
     *            are Amazon ECS tasks, services, task definitions, clusters,
     *            and container instances.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the resource for which to
     * list the tags. Currently, the supported resources are Amazon ECS tasks,
     * services, task definitions, clusters, and container instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) that identifies the resource
     *            for which to list the tags. Currently, the supported resources
     *            are Amazon ECS tasks, services, task definitions, clusters,
     *            and container instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
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
        if (getResourceArn() != null)
            sb.append("resourceArn: " + getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }
}
