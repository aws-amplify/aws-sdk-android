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
 * A list of namespaced kernel parameters to set in the container. This
 * parameter maps to <code>Sysctls</code> in the <a
 * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
 * >Create a container</a> section of the <a
 * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and
 * the <code>--sysctl</code> option to <a
 * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
 * </p>
 * <p>
 * It is not recommended that you specify network-related
 * <code>systemControls</code> parameters for multiple containers in a single
 * task that also uses either the <code>awsvpc</code> or <code>host</code>
 * network mode for the following reasons:
 * </p>
 * <ul>
 * <li>
 * <p>
 * For tasks that use the <code>awsvpc</code> network mode, if you set
 * <code>systemControls</code> for any container, it applies to all containers
 * in the task. If you set different <code>systemControls</code> for multiple
 * containers in a single task, the container that is started last determines
 * which <code>systemControls</code> take effect.
 * </p>
 * </li>
 * <li>
 * <p>
 * For tasks that use the <code>host</code> network mode, the
 * <code>systemControls</code> parameter applies to the container instance's
 * kernel parameter as well as that of all containers of any tasks running on
 * that container instance.
 * </p>
 * </li>
 * </ul>
 */
public class SystemControl implements Serializable {
    /**
     * <p>
     * The namespaced kernel parameter for which to set a <code>value</code>.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The value for the namespaced kernel parameter specified in
     * <code>namespace</code>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The namespaced kernel parameter for which to set a <code>value</code>.
     * </p>
     *
     * @return <p>
     *         The namespaced kernel parameter for which to set a
     *         <code>value</code>.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespaced kernel parameter for which to set a <code>value</code>.
     * </p>
     *
     * @param namespace <p>
     *            The namespaced kernel parameter for which to set a
     *            <code>value</code>.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespaced kernel parameter for which to set a <code>value</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namespace <p>
     *            The namespaced kernel parameter for which to set a
     *            <code>value</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SystemControl withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * The value for the namespaced kernel parameter specified in
     * <code>namespace</code>.
     * </p>
     *
     * @return <p>
     *         The value for the namespaced kernel parameter specified in
     *         <code>namespace</code>.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value for the namespaced kernel parameter specified in
     * <code>namespace</code>.
     * </p>
     *
     * @param value <p>
     *            The value for the namespaced kernel parameter specified in
     *            <code>namespace</code>.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the namespaced kernel parameter specified in
     * <code>namespace</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value for the namespaced kernel parameter specified in
     *            <code>namespace</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SystemControl withValue(String value) {
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
        if (getNamespace() != null)
            sb.append("namespace: " + getNamespace() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SystemControl == false)
            return false;
        SystemControl other = (SystemControl) obj;

        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
