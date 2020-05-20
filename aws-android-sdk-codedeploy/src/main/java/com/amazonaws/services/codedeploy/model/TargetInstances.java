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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the instances to be used in the replacement environment in
 * a blue/green deployment.
 * </p>
 */
public class TargetInstances implements Serializable {
    /**
     * <p>
     * The tag filter key, type, and value used to identify Amazon EC2 instances
     * in a replacement environment for a blue/green deployment. Cannot be used
     * in the same call as <code>ec2TagSet</code>.
     * </p>
     */
    private java.util.List<EC2TagFilter> tagFilters;

    /**
     * <p>
     * The names of one or more Auto Scaling groups to identify a replacement
     * environment for a blue/green deployment.
     * </p>
     */
    private java.util.List<String> autoScalingGroups;

    /**
     * <p>
     * Information about the groups of EC2 instance tags that an instance must
     * be identified by in order for it to be included in the replacement
     * environment for a blue/green deployment. Cannot be used in the same call
     * as <code>tagFilters</code>.
     * </p>
     */
    private EC2TagSet ec2TagSet;

    /**
     * <p>
     * The tag filter key, type, and value used to identify Amazon EC2 instances
     * in a replacement environment for a blue/green deployment. Cannot be used
     * in the same call as <code>ec2TagSet</code>.
     * </p>
     *
     * @return <p>
     *         The tag filter key, type, and value used to identify Amazon EC2
     *         instances in a replacement environment for a blue/green
     *         deployment. Cannot be used in the same call as
     *         <code>ec2TagSet</code>.
     *         </p>
     */
    public java.util.List<EC2TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * <p>
     * The tag filter key, type, and value used to identify Amazon EC2 instances
     * in a replacement environment for a blue/green deployment. Cannot be used
     * in the same call as <code>ec2TagSet</code>.
     * </p>
     *
     * @param tagFilters <p>
     *            The tag filter key, type, and value used to identify Amazon
     *            EC2 instances in a replacement environment for a blue/green
     *            deployment. Cannot be used in the same call as
     *            <code>ec2TagSet</code>.
     *            </p>
     */
    public void setTagFilters(java.util.Collection<EC2TagFilter> tagFilters) {
        if (tagFilters == null) {
            this.tagFilters = null;
            return;
        }

        this.tagFilters = new java.util.ArrayList<EC2TagFilter>(tagFilters);
    }

    /**
     * <p>
     * The tag filter key, type, and value used to identify Amazon EC2 instances
     * in a replacement environment for a blue/green deployment. Cannot be used
     * in the same call as <code>ec2TagSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagFilters <p>
     *            The tag filter key, type, and value used to identify Amazon
     *            EC2 instances in a replacement environment for a blue/green
     *            deployment. Cannot be used in the same call as
     *            <code>ec2TagSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetInstances withTagFilters(EC2TagFilter... tagFilters) {
        if (getTagFilters() == null) {
            this.tagFilters = new java.util.ArrayList<EC2TagFilter>(tagFilters.length);
        }
        for (EC2TagFilter value : tagFilters) {
            this.tagFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tag filter key, type, and value used to identify Amazon EC2 instances
     * in a replacement environment for a blue/green deployment. Cannot be used
     * in the same call as <code>ec2TagSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagFilters <p>
     *            The tag filter key, type, and value used to identify Amazon
     *            EC2 instances in a replacement environment for a blue/green
     *            deployment. Cannot be used in the same call as
     *            <code>ec2TagSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetInstances withTagFilters(java.util.Collection<EC2TagFilter> tagFilters) {
        setTagFilters(tagFilters);
        return this;
    }

    /**
     * <p>
     * The names of one or more Auto Scaling groups to identify a replacement
     * environment for a blue/green deployment.
     * </p>
     *
     * @return <p>
     *         The names of one or more Auto Scaling groups to identify a
     *         replacement environment for a blue/green deployment.
     *         </p>
     */
    public java.util.List<String> getAutoScalingGroups() {
        return autoScalingGroups;
    }

    /**
     * <p>
     * The names of one or more Auto Scaling groups to identify a replacement
     * environment for a blue/green deployment.
     * </p>
     *
     * @param autoScalingGroups <p>
     *            The names of one or more Auto Scaling groups to identify a
     *            replacement environment for a blue/green deployment.
     *            </p>
     */
    public void setAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }

        this.autoScalingGroups = new java.util.ArrayList<String>(autoScalingGroups);
    }

    /**
     * <p>
     * The names of one or more Auto Scaling groups to identify a replacement
     * environment for a blue/green deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroups <p>
     *            The names of one or more Auto Scaling groups to identify a
     *            replacement environment for a blue/green deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetInstances withAutoScalingGroups(String... autoScalingGroups) {
        if (getAutoScalingGroups() == null) {
            this.autoScalingGroups = new java.util.ArrayList<String>(autoScalingGroups.length);
        }
        for (String value : autoScalingGroups) {
            this.autoScalingGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more Auto Scaling groups to identify a replacement
     * environment for a blue/green deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroups <p>
     *            The names of one or more Auto Scaling groups to identify a
     *            replacement environment for a blue/green deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetInstances withAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * Information about the groups of EC2 instance tags that an instance must
     * be identified by in order for it to be included in the replacement
     * environment for a blue/green deployment. Cannot be used in the same call
     * as <code>tagFilters</code>.
     * </p>
     *
     * @return <p>
     *         Information about the groups of EC2 instance tags that an
     *         instance must be identified by in order for it to be included in
     *         the replacement environment for a blue/green deployment. Cannot
     *         be used in the same call as <code>tagFilters</code>.
     *         </p>
     */
    public EC2TagSet getEc2TagSet() {
        return ec2TagSet;
    }

    /**
     * <p>
     * Information about the groups of EC2 instance tags that an instance must
     * be identified by in order for it to be included in the replacement
     * environment for a blue/green deployment. Cannot be used in the same call
     * as <code>tagFilters</code>.
     * </p>
     *
     * @param ec2TagSet <p>
     *            Information about the groups of EC2 instance tags that an
     *            instance must be identified by in order for it to be included
     *            in the replacement environment for a blue/green deployment.
     *            Cannot be used in the same call as <code>tagFilters</code>.
     *            </p>
     */
    public void setEc2TagSet(EC2TagSet ec2TagSet) {
        this.ec2TagSet = ec2TagSet;
    }

    /**
     * <p>
     * Information about the groups of EC2 instance tags that an instance must
     * be identified by in order for it to be included in the replacement
     * environment for a blue/green deployment. Cannot be used in the same call
     * as <code>tagFilters</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2TagSet <p>
     *            Information about the groups of EC2 instance tags that an
     *            instance must be identified by in order for it to be included
     *            in the replacement environment for a blue/green deployment.
     *            Cannot be used in the same call as <code>tagFilters</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetInstances withEc2TagSet(EC2TagSet ec2TagSet) {
        this.ec2TagSet = ec2TagSet;
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
        if (getTagFilters() != null)
            sb.append("tagFilters: " + getTagFilters() + ",");
        if (getAutoScalingGroups() != null)
            sb.append("autoScalingGroups: " + getAutoScalingGroups() + ",");
        if (getEc2TagSet() != null)
            sb.append("ec2TagSet: " + getEc2TagSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagFilters() == null) ? 0 : getTagFilters().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode());
        hashCode = prime * hashCode + ((getEc2TagSet() == null) ? 0 : getEc2TagSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetInstances == false)
            return false;
        TargetInstances other = (TargetInstances) obj;

        if (other.getTagFilters() == null ^ this.getTagFilters() == null)
            return false;
        if (other.getTagFilters() != null
                && other.getTagFilters().equals(this.getTagFilters()) == false)
            return false;
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null)
            return false;
        if (other.getAutoScalingGroups() != null
                && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false)
            return false;
        if (other.getEc2TagSet() == null ^ this.getEc2TagSet() == null)
            return false;
        if (other.getEc2TagSet() != null
                && other.getEc2TagSet().equals(this.getEc2TagSet()) == false)
            return false;
        return true;
    }
}
