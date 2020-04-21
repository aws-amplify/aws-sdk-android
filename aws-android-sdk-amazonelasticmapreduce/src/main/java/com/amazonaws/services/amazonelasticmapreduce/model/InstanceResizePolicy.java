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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Custom policy for requesting termination protection or termination of
 * specific instances when shrinking an instance group.
 * </p>
 */
public class InstanceResizePolicy implements Serializable {
    /**
     * <p>
     * Specific list of instances to be terminated when shrinking an instance
     * group.
     * </p>
     */
    private java.util.List<String> instancesToTerminate;

    /**
     * <p>
     * Specific list of instances to be protected when shrinking an instance
     * group.
     * </p>
     */
    private java.util.List<String> instancesToProtect;

    /**
     * <p>
     * Decommissioning timeout override for the specific list of instances to be
     * terminated.
     * </p>
     */
    private Integer instanceTerminationTimeout;

    /**
     * <p>
     * Specific list of instances to be terminated when shrinking an instance
     * group.
     * </p>
     *
     * @return <p>
     *         Specific list of instances to be terminated when shrinking an
     *         instance group.
     *         </p>
     */
    public java.util.List<String> getInstancesToTerminate() {
        return instancesToTerminate;
    }

    /**
     * <p>
     * Specific list of instances to be terminated when shrinking an instance
     * group.
     * </p>
     *
     * @param instancesToTerminate <p>
     *            Specific list of instances to be terminated when shrinking an
     *            instance group.
     *            </p>
     */
    public void setInstancesToTerminate(java.util.Collection<String> instancesToTerminate) {
        if (instancesToTerminate == null) {
            this.instancesToTerminate = null;
            return;
        }

        this.instancesToTerminate = new java.util.ArrayList<String>(instancesToTerminate);
    }

    /**
     * <p>
     * Specific list of instances to be terminated when shrinking an instance
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancesToTerminate <p>
     *            Specific list of instances to be terminated when shrinking an
     *            instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceResizePolicy withInstancesToTerminate(String... instancesToTerminate) {
        if (getInstancesToTerminate() == null) {
            this.instancesToTerminate = new java.util.ArrayList<String>(instancesToTerminate.length);
        }
        for (String value : instancesToTerminate) {
            this.instancesToTerminate.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specific list of instances to be terminated when shrinking an instance
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancesToTerminate <p>
     *            Specific list of instances to be terminated when shrinking an
     *            instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceResizePolicy withInstancesToTerminate(
            java.util.Collection<String> instancesToTerminate) {
        setInstancesToTerminate(instancesToTerminate);
        return this;
    }

    /**
     * <p>
     * Specific list of instances to be protected when shrinking an instance
     * group.
     * </p>
     *
     * @return <p>
     *         Specific list of instances to be protected when shrinking an
     *         instance group.
     *         </p>
     */
    public java.util.List<String> getInstancesToProtect() {
        return instancesToProtect;
    }

    /**
     * <p>
     * Specific list of instances to be protected when shrinking an instance
     * group.
     * </p>
     *
     * @param instancesToProtect <p>
     *            Specific list of instances to be protected when shrinking an
     *            instance group.
     *            </p>
     */
    public void setInstancesToProtect(java.util.Collection<String> instancesToProtect) {
        if (instancesToProtect == null) {
            this.instancesToProtect = null;
            return;
        }

        this.instancesToProtect = new java.util.ArrayList<String>(instancesToProtect);
    }

    /**
     * <p>
     * Specific list of instances to be protected when shrinking an instance
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancesToProtect <p>
     *            Specific list of instances to be protected when shrinking an
     *            instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceResizePolicy withInstancesToProtect(String... instancesToProtect) {
        if (getInstancesToProtect() == null) {
            this.instancesToProtect = new java.util.ArrayList<String>(instancesToProtect.length);
        }
        for (String value : instancesToProtect) {
            this.instancesToProtect.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specific list of instances to be protected when shrinking an instance
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancesToProtect <p>
     *            Specific list of instances to be protected when shrinking an
     *            instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceResizePolicy withInstancesToProtect(
            java.util.Collection<String> instancesToProtect) {
        setInstancesToProtect(instancesToProtect);
        return this;
    }

    /**
     * <p>
     * Decommissioning timeout override for the specific list of instances to be
     * terminated.
     * </p>
     *
     * @return <p>
     *         Decommissioning timeout override for the specific list of
     *         instances to be terminated.
     *         </p>
     */
    public Integer getInstanceTerminationTimeout() {
        return instanceTerminationTimeout;
    }

    /**
     * <p>
     * Decommissioning timeout override for the specific list of instances to be
     * terminated.
     * </p>
     *
     * @param instanceTerminationTimeout <p>
     *            Decommissioning timeout override for the specific list of
     *            instances to be terminated.
     *            </p>
     */
    public void setInstanceTerminationTimeout(Integer instanceTerminationTimeout) {
        this.instanceTerminationTimeout = instanceTerminationTimeout;
    }

    /**
     * <p>
     * Decommissioning timeout override for the specific list of instances to be
     * terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTerminationTimeout <p>
     *            Decommissioning timeout override for the specific list of
     *            instances to be terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceResizePolicy withInstanceTerminationTimeout(Integer instanceTerminationTimeout) {
        this.instanceTerminationTimeout = instanceTerminationTimeout;
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
        if (getInstancesToTerminate() != null)
            sb.append("InstancesToTerminate: " + getInstancesToTerminate() + ",");
        if (getInstancesToProtect() != null)
            sb.append("InstancesToProtect: " + getInstancesToProtect() + ",");
        if (getInstanceTerminationTimeout() != null)
            sb.append("InstanceTerminationTimeout: " + getInstanceTerminationTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstancesToTerminate() == null) ? 0 : getInstancesToTerminate().hashCode());
        hashCode = prime * hashCode
                + ((getInstancesToProtect() == null) ? 0 : getInstancesToProtect().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceTerminationTimeout() == null) ? 0 : getInstanceTerminationTimeout()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceResizePolicy == false)
            return false;
        InstanceResizePolicy other = (InstanceResizePolicy) obj;

        if (other.getInstancesToTerminate() == null ^ this.getInstancesToTerminate() == null)
            return false;
        if (other.getInstancesToTerminate() != null
                && other.getInstancesToTerminate().equals(this.getInstancesToTerminate()) == false)
            return false;
        if (other.getInstancesToProtect() == null ^ this.getInstancesToProtect() == null)
            return false;
        if (other.getInstancesToProtect() != null
                && other.getInstancesToProtect().equals(this.getInstancesToProtect()) == false)
            return false;
        if (other.getInstanceTerminationTimeout() == null
                ^ this.getInstanceTerminationTimeout() == null)
            return false;
        if (other.getInstanceTerminationTimeout() != null
                && other.getInstanceTerminationTimeout().equals(
                        this.getInstanceTerminationTimeout()) == false)
            return false;
        return true;
    }
}
