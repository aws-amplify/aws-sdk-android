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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents a Transport Layer Security (TLS) client policy.
 * </p>
 */
public class ClientPolicyTls implements Serializable {
    /**
     * <p>
     * Whether the policy is enforced. The default is <code>True</code>, if a
     * value isn't specified.
     * </p>
     */
    private Boolean enforce;

    /**
     * <p>
     * One or more ports that the policy is enforced for.
     * </p>
     */
    private java.util.List<Integer> ports;

    /**
     * <p>
     * A reference to an object that represents a TLS validation context.
     * </p>
     */
    private TlsValidationContext validation;

    /**
     * <p>
     * Whether the policy is enforced. The default is <code>True</code>, if a
     * value isn't specified.
     * </p>
     *
     * @return <p>
     *         Whether the policy is enforced. The default is <code>True</code>,
     *         if a value isn't specified.
     *         </p>
     */
    public Boolean isEnforce() {
        return enforce;
    }

    /**
     * <p>
     * Whether the policy is enforced. The default is <code>True</code>, if a
     * value isn't specified.
     * </p>
     *
     * @return <p>
     *         Whether the policy is enforced. The default is <code>True</code>,
     *         if a value isn't specified.
     *         </p>
     */
    public Boolean getEnforce() {
        return enforce;
    }

    /**
     * <p>
     * Whether the policy is enforced. The default is <code>True</code>, if a
     * value isn't specified.
     * </p>
     *
     * @param enforce <p>
     *            Whether the policy is enforced. The default is
     *            <code>True</code>, if a value isn't specified.
     *            </p>
     */
    public void setEnforce(Boolean enforce) {
        this.enforce = enforce;
    }

    /**
     * <p>
     * Whether the policy is enforced. The default is <code>True</code>, if a
     * value isn't specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enforce <p>
     *            Whether the policy is enforced. The default is
     *            <code>True</code>, if a value isn't specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientPolicyTls withEnforce(Boolean enforce) {
        this.enforce = enforce;
        return this;
    }

    /**
     * <p>
     * One or more ports that the policy is enforced for.
     * </p>
     *
     * @return <p>
     *         One or more ports that the policy is enforced for.
     *         </p>
     */
    public java.util.List<Integer> getPorts() {
        return ports;
    }

    /**
     * <p>
     * One or more ports that the policy is enforced for.
     * </p>
     *
     * @param ports <p>
     *            One or more ports that the policy is enforced for.
     *            </p>
     */
    public void setPorts(java.util.Collection<Integer> ports) {
        if (ports == null) {
            this.ports = null;
            return;
        }

        this.ports = new java.util.ArrayList<Integer>(ports);
    }

    /**
     * <p>
     * One or more ports that the policy is enforced for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ports <p>
     *            One or more ports that the policy is enforced for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientPolicyTls withPorts(Integer... ports) {
        if (getPorts() == null) {
            this.ports = new java.util.ArrayList<Integer>(ports.length);
        }
        for (Integer value : ports) {
            this.ports.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more ports that the policy is enforced for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ports <p>
     *            One or more ports that the policy is enforced for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientPolicyTls withPorts(java.util.Collection<Integer> ports) {
        setPorts(ports);
        return this;
    }

    /**
     * <p>
     * A reference to an object that represents a TLS validation context.
     * </p>
     *
     * @return <p>
     *         A reference to an object that represents a TLS validation
     *         context.
     *         </p>
     */
    public TlsValidationContext getValidation() {
        return validation;
    }

    /**
     * <p>
     * A reference to an object that represents a TLS validation context.
     * </p>
     *
     * @param validation <p>
     *            A reference to an object that represents a TLS validation
     *            context.
     *            </p>
     */
    public void setValidation(TlsValidationContext validation) {
        this.validation = validation;
    }

    /**
     * <p>
     * A reference to an object that represents a TLS validation context.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validation <p>
     *            A reference to an object that represents a TLS validation
     *            context.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientPolicyTls withValidation(TlsValidationContext validation) {
        this.validation = validation;
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
        if (getEnforce() != null)
            sb.append("enforce: " + getEnforce() + ",");
        if (getPorts() != null)
            sb.append("ports: " + getPorts() + ",");
        if (getValidation() != null)
            sb.append("validation: " + getValidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnforce() == null) ? 0 : getEnforce().hashCode());
        hashCode = prime * hashCode + ((getPorts() == null) ? 0 : getPorts().hashCode());
        hashCode = prime * hashCode + ((getValidation() == null) ? 0 : getValidation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientPolicyTls == false)
            return false;
        ClientPolicyTls other = (ClientPolicyTls) obj;

        if (other.getEnforce() == null ^ this.getEnforce() == null)
            return false;
        if (other.getEnforce() != null && other.getEnforce().equals(this.getEnforce()) == false)
            return false;
        if (other.getPorts() == null ^ this.getPorts() == null)
            return false;
        if (other.getPorts() != null && other.getPorts().equals(this.getPorts()) == false)
            return false;
        if (other.getValidation() == null ^ this.getValidation() == null)
            return false;
        if (other.getValidation() != null
                && other.getValidation().equals(this.getValidation()) == false)
            return false;
        return true;
    }
}
