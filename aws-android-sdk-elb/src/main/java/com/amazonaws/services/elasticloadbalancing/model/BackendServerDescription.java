/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the configuration of an EC2 instance.
 * </p>
 */
public class BackendServerDescription implements Serializable {
    /**
     * <p>
     * The port on which the EC2 instance is listening.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     */
    private Integer instancePort;

    /**
     * <p>
     * The names of the policies enabled for the EC2 instance.
     * </p>
     */
    private java.util.List<String> policyNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The port on which the EC2 instance is listening.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return <p>
     *         The port on which the EC2 instance is listening.
     *         </p>
     */
    public Integer getInstancePort() {
        return instancePort;
    }

    /**
     * <p>
     * The port on which the EC2 instance is listening.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort <p>
     *            The port on which the EC2 instance is listening.
     *            </p>
     */
    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }

    /**
     * <p>
     * The port on which the EC2 instance is listening.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort <p>
     *            The port on which the EC2 instance is listening.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackendServerDescription withInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }

    /**
     * <p>
     * The names of the policies enabled for the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The names of the policies enabled for the EC2 instance.
     *         </p>
     */
    public java.util.List<String> getPolicyNames() {
        return policyNames;
    }

    /**
     * <p>
     * The names of the policies enabled for the EC2 instance.
     * </p>
     *
     * @param policyNames <p>
     *            The names of the policies enabled for the EC2 instance.
     *            </p>
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new java.util.ArrayList<String>(policyNames);
    }

    /**
     * <p>
     * The names of the policies enabled for the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyNames <p>
     *            The names of the policies enabled for the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackendServerDescription withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) {
            this.policyNames = new java.util.ArrayList<String>(policyNames.length);
        }
        for (String value : policyNames) {
            this.policyNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the policies enabled for the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyNames <p>
     *            The names of the policies enabled for the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackendServerDescription withPolicyNames(java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
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
        if (getInstancePort() != null)
            sb.append("InstancePort: " + getInstancePort() + ",");
        if (getPolicyNames() != null)
            sb.append("PolicyNames: " + getPolicyNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstancePort() == null) ? 0 : getInstancePort().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackendServerDescription == false)
            return false;
        BackendServerDescription other = (BackendServerDescription) obj;

        if (other.getInstancePort() == null ^ this.getInstancePort() == null)
            return false;
        if (other.getInstancePort() != null
                && other.getInstancePort().equals(this.getInstancePort()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null
                && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        return true;
    }
}
