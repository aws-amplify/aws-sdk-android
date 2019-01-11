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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

public class DescribeTerminationPolicyTypesResult implements Serializable {
    /**
     * <p>
     * The termination policies supported by Amazon EC2 Auto Scaling:
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     * <code>Default</code>, <code>OldestLaunchTemplate</code>, and
     * <code>AllocationStrategy</code>. Currently, the
     * <code>OldestLaunchTemplate</code> and <code>AllocationStrategy</code>
     * policies are only supported for Auto Scaling groups with
     * <a>MixedInstancesPolicy</a>.
     * </p>
     */
    private java.util.List<String> terminationPolicyTypes = new java.util.ArrayList<String>();

    /**
     * <p>
     * The termination policies supported by Amazon EC2 Auto Scaling:
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     * <code>Default</code>, <code>OldestLaunchTemplate</code>, and
     * <code>AllocationStrategy</code>. Currently, the
     * <code>OldestLaunchTemplate</code> and <code>AllocationStrategy</code>
     * policies are only supported for Auto Scaling groups with
     * <a>MixedInstancesPolicy</a>.
     * </p>
     *
     * @return <p>
     *         The termination policies supported by Amazon EC2 Auto Scaling:
     *         <code>OldestInstance</code>,
     *         <code>OldestLaunchConfiguration</code>,
     *         <code>NewestInstance</code>,
     *         <code>ClosestToNextInstanceHour</code>, <code>Default</code>,
     *         <code>OldestLaunchTemplate</code>, and
     *         <code>AllocationStrategy</code>. Currently, the
     *         <code>OldestLaunchTemplate</code> and
     *         <code>AllocationStrategy</code> policies are only supported for
     *         Auto Scaling groups with <a>MixedInstancesPolicy</a>.
     *         </p>
     */
    public java.util.List<String> getTerminationPolicyTypes() {
        return terminationPolicyTypes;
    }

    /**
     * <p>
     * The termination policies supported by Amazon EC2 Auto Scaling:
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     * <code>Default</code>, <code>OldestLaunchTemplate</code>, and
     * <code>AllocationStrategy</code>. Currently, the
     * <code>OldestLaunchTemplate</code> and <code>AllocationStrategy</code>
     * policies are only supported for Auto Scaling groups with
     * <a>MixedInstancesPolicy</a>.
     * </p>
     *
     * @param terminationPolicyTypes <p>
     *            The termination policies supported by Amazon EC2 Auto Scaling:
     *            <code>OldestInstance</code>,
     *            <code>OldestLaunchConfiguration</code>,
     *            <code>NewestInstance</code>,
     *            <code>ClosestToNextInstanceHour</code>, <code>Default</code>,
     *            <code>OldestLaunchTemplate</code>, and
     *            <code>AllocationStrategy</code>. Currently, the
     *            <code>OldestLaunchTemplate</code> and
     *            <code>AllocationStrategy</code> policies are only supported
     *            for Auto Scaling groups with <a>MixedInstancesPolicy</a>.
     *            </p>
     */
    public void setTerminationPolicyTypes(java.util.Collection<String> terminationPolicyTypes) {
        if (terminationPolicyTypes == null) {
            this.terminationPolicyTypes = null;
            return;
        }

        this.terminationPolicyTypes = new java.util.ArrayList<String>(terminationPolicyTypes);
    }

    /**
     * <p>
     * The termination policies supported by Amazon EC2 Auto Scaling:
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     * <code>Default</code>, <code>OldestLaunchTemplate</code>, and
     * <code>AllocationStrategy</code>. Currently, the
     * <code>OldestLaunchTemplate</code> and <code>AllocationStrategy</code>
     * policies are only supported for Auto Scaling groups with
     * <a>MixedInstancesPolicy</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationPolicyTypes <p>
     *            The termination policies supported by Amazon EC2 Auto Scaling:
     *            <code>OldestInstance</code>,
     *            <code>OldestLaunchConfiguration</code>,
     *            <code>NewestInstance</code>,
     *            <code>ClosestToNextInstanceHour</code>, <code>Default</code>,
     *            <code>OldestLaunchTemplate</code>, and
     *            <code>AllocationStrategy</code>. Currently, the
     *            <code>OldestLaunchTemplate</code> and
     *            <code>AllocationStrategy</code> policies are only supported
     *            for Auto Scaling groups with <a>MixedInstancesPolicy</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTerminationPolicyTypesResult withTerminationPolicyTypes(
            String... terminationPolicyTypes) {
        if (getTerminationPolicyTypes() == null) {
            this.terminationPolicyTypes = new java.util.ArrayList<String>(
                    terminationPolicyTypes.length);
        }
        for (String value : terminationPolicyTypes) {
            this.terminationPolicyTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The termination policies supported by Amazon EC2 Auto Scaling:
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>,
     * <code>Default</code>, <code>OldestLaunchTemplate</code>, and
     * <code>AllocationStrategy</code>. Currently, the
     * <code>OldestLaunchTemplate</code> and <code>AllocationStrategy</code>
     * policies are only supported for Auto Scaling groups with
     * <a>MixedInstancesPolicy</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationPolicyTypes <p>
     *            The termination policies supported by Amazon EC2 Auto Scaling:
     *            <code>OldestInstance</code>,
     *            <code>OldestLaunchConfiguration</code>,
     *            <code>NewestInstance</code>,
     *            <code>ClosestToNextInstanceHour</code>, <code>Default</code>,
     *            <code>OldestLaunchTemplate</code>, and
     *            <code>AllocationStrategy</code>. Currently, the
     *            <code>OldestLaunchTemplate</code> and
     *            <code>AllocationStrategy</code> policies are only supported
     *            for Auto Scaling groups with <a>MixedInstancesPolicy</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTerminationPolicyTypesResult withTerminationPolicyTypes(
            java.util.Collection<String> terminationPolicyTypes) {
        setTerminationPolicyTypes(terminationPolicyTypes);
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
        if (getTerminationPolicyTypes() != null)
            sb.append("TerminationPolicyTypes: " + getTerminationPolicyTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTerminationPolicyTypes() == null) ? 0 : getTerminationPolicyTypes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTerminationPolicyTypesResult == false)
            return false;
        DescribeTerminationPolicyTypesResult other = (DescribeTerminationPolicyTypesResult) obj;

        if (other.getTerminationPolicyTypes() == null ^ this.getTerminationPolicyTypes() == null)
            return false;
        if (other.getTerminationPolicyTypes() != null
                && other.getTerminationPolicyTypes().equals(this.getTerminationPolicyTypes()) == false)
            return false;
        return true;
    }
}
