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

public class CreateServiceResult implements Serializable {
    /**
     * <p>
     * The full description of your service following the create call.
     * </p>
     * <p>
     * If a service is using the <code>ECS</code> deployment controller, the
     * <code>deploymentController</code> and <code>taskSets</code> parameters
     * will not be returned.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment
     * controller, the <code>deploymentController</code>, <code>taskSets</code>
     * and <code>deployments</code> parameters will be returned, however the
     * <code>deployments</code> parameter will be an empty list.
     * </p>
     */
    private Service service;

    /**
     * <p>
     * The full description of your service following the create call.
     * </p>
     * <p>
     * If a service is using the <code>ECS</code> deployment controller, the
     * <code>deploymentController</code> and <code>taskSets</code> parameters
     * will not be returned.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment
     * controller, the <code>deploymentController</code>, <code>taskSets</code>
     * and <code>deployments</code> parameters will be returned, however the
     * <code>deployments</code> parameter will be an empty list.
     * </p>
     *
     * @return <p>
     *         The full description of your service following the create call.
     *         </p>
     *         <p>
     *         If a service is using the <code>ECS</code> deployment controller,
     *         the <code>deploymentController</code> and <code>taskSets</code>
     *         parameters will not be returned.
     *         </p>
     *         <p>
     *         If the service is using the <code>CODE_DEPLOY</code> deployment
     *         controller, the <code>deploymentController</code>,
     *         <code>taskSets</code> and <code>deployments</code> parameters
     *         will be returned, however the <code>deployments</code> parameter
     *         will be an empty list.
     *         </p>
     */
    public Service getService() {
        return service;
    }

    /**
     * <p>
     * The full description of your service following the create call.
     * </p>
     * <p>
     * If a service is using the <code>ECS</code> deployment controller, the
     * <code>deploymentController</code> and <code>taskSets</code> parameters
     * will not be returned.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment
     * controller, the <code>deploymentController</code>, <code>taskSets</code>
     * and <code>deployments</code> parameters will be returned, however the
     * <code>deployments</code> parameter will be an empty list.
     * </p>
     *
     * @param service <p>
     *            The full description of your service following the create
     *            call.
     *            </p>
     *            <p>
     *            If a service is using the <code>ECS</code> deployment
     *            controller, the <code>deploymentController</code> and
     *            <code>taskSets</code> parameters will not be returned.
     *            </p>
     *            <p>
     *            If the service is using the <code>CODE_DEPLOY</code>
     *            deployment controller, the <code>deploymentController</code>,
     *            <code>taskSets</code> and <code>deployments</code> parameters
     *            will be returned, however the <code>deployments</code>
     *            parameter will be an empty list.
     *            </p>
     */
    public void setService(Service service) {
        this.service = service;
    }

    /**
     * <p>
     * The full description of your service following the create call.
     * </p>
     * <p>
     * If a service is using the <code>ECS</code> deployment controller, the
     * <code>deploymentController</code> and <code>taskSets</code> parameters
     * will not be returned.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment
     * controller, the <code>deploymentController</code>, <code>taskSets</code>
     * and <code>deployments</code> parameters will be returned, however the
     * <code>deployments</code> parameter will be an empty list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param service <p>
     *            The full description of your service following the create
     *            call.
     *            </p>
     *            <p>
     *            If a service is using the <code>ECS</code> deployment
     *            controller, the <code>deploymentController</code> and
     *            <code>taskSets</code> parameters will not be returned.
     *            </p>
     *            <p>
     *            If the service is using the <code>CODE_DEPLOY</code>
     *            deployment controller, the <code>deploymentController</code>,
     *            <code>taskSets</code> and <code>deployments</code> parameters
     *            will be returned, however the <code>deployments</code>
     *            parameter will be an empty list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceResult withService(Service service) {
        this.service = service;
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
        if (getService() != null)
            sb.append("service: " + getService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceResult == false)
            return false;
        CreateServiceResult other = (CreateServiceResult) obj;

        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        return true;
    }
}
