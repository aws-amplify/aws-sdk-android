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
 * Information about the Elastic Load Balancing load balancer or target group
 * used in a deployment.
 * </p>
 */
public class LoadBalancerInfo implements Serializable {
    /**
     * <p>
     * An array that contains information about the load balancer to use for
     * load balancing in a deployment. In Elastic Load Balancing, load balancers
     * are used with Classic Load Balancers.
     * </p>
     * <note>
     * <p>
     * Adding more than one load balancer to the array is not supported.
     * </p>
     * </note>
     */
    private java.util.List<ELBInfo> elbInfoList;

    /**
     * <p>
     * An array that contains information about the target group to use for load
     * balancing in a deployment. In Elastic Load Balancing, target groups are
     * used with Application Load Balancers.
     * </p>
     * <note>
     * <p>
     * Adding more than one target group to the array is not supported.
     * </p>
     * </note>
     */
    private java.util.List<TargetGroupInfo> targetGroupInfoList;

    /**
     * <p>
     * The target group pair information. This is an array of
     * <code>TargeGroupPairInfo</code> objects with a maximum size of one.
     * </p>
     */
    private java.util.List<TargetGroupPairInfo> targetGroupPairInfoList;

    /**
     * <p>
     * An array that contains information about the load balancer to use for
     * load balancing in a deployment. In Elastic Load Balancing, load balancers
     * are used with Classic Load Balancers.
     * </p>
     * <note>
     * <p>
     * Adding more than one load balancer to the array is not supported.
     * </p>
     * </note>
     *
     * @return <p>
     *         An array that contains information about the load balancer to use
     *         for load balancing in a deployment. In Elastic Load Balancing,
     *         load balancers are used with Classic Load Balancers.
     *         </p>
     *         <note>
     *         <p>
     *         Adding more than one load balancer to the array is not supported.
     *         </p>
     *         </note>
     */
    public java.util.List<ELBInfo> getElbInfoList() {
        return elbInfoList;
    }

    /**
     * <p>
     * An array that contains information about the load balancer to use for
     * load balancing in a deployment. In Elastic Load Balancing, load balancers
     * are used with Classic Load Balancers.
     * </p>
     * <note>
     * <p>
     * Adding more than one load balancer to the array is not supported.
     * </p>
     * </note>
     *
     * @param elbInfoList <p>
     *            An array that contains information about the load balancer to
     *            use for load balancing in a deployment. In Elastic Load
     *            Balancing, load balancers are used with Classic Load
     *            Balancers.
     *            </p>
     *            <note>
     *            <p>
     *            Adding more than one load balancer to the array is not
     *            supported.
     *            </p>
     *            </note>
     */
    public void setElbInfoList(java.util.Collection<ELBInfo> elbInfoList) {
        if (elbInfoList == null) {
            this.elbInfoList = null;
            return;
        }

        this.elbInfoList = new java.util.ArrayList<ELBInfo>(elbInfoList);
    }

    /**
     * <p>
     * An array that contains information about the load balancer to use for
     * load balancing in a deployment. In Elastic Load Balancing, load balancers
     * are used with Classic Load Balancers.
     * </p>
     * <note>
     * <p>
     * Adding more than one load balancer to the array is not supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elbInfoList <p>
     *            An array that contains information about the load balancer to
     *            use for load balancing in a deployment. In Elastic Load
     *            Balancing, load balancers are used with Classic Load
     *            Balancers.
     *            </p>
     *            <note>
     *            <p>
     *            Adding more than one load balancer to the array is not
     *            supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerInfo withElbInfoList(ELBInfo... elbInfoList) {
        if (getElbInfoList() == null) {
            this.elbInfoList = new java.util.ArrayList<ELBInfo>(elbInfoList.length);
        }
        for (ELBInfo value : elbInfoList) {
            this.elbInfoList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains information about the load balancer to use for
     * load balancing in a deployment. In Elastic Load Balancing, load balancers
     * are used with Classic Load Balancers.
     * </p>
     * <note>
     * <p>
     * Adding more than one load balancer to the array is not supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elbInfoList <p>
     *            An array that contains information about the load balancer to
     *            use for load balancing in a deployment. In Elastic Load
     *            Balancing, load balancers are used with Classic Load
     *            Balancers.
     *            </p>
     *            <note>
     *            <p>
     *            Adding more than one load balancer to the array is not
     *            supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerInfo withElbInfoList(java.util.Collection<ELBInfo> elbInfoList) {
        setElbInfoList(elbInfoList);
        return this;
    }

    /**
     * <p>
     * An array that contains information about the target group to use for load
     * balancing in a deployment. In Elastic Load Balancing, target groups are
     * used with Application Load Balancers.
     * </p>
     * <note>
     * <p>
     * Adding more than one target group to the array is not supported.
     * </p>
     * </note>
     *
     * @return <p>
     *         An array that contains information about the target group to use
     *         for load balancing in a deployment. In Elastic Load Balancing,
     *         target groups are used with Application Load Balancers.
     *         </p>
     *         <note>
     *         <p>
     *         Adding more than one target group to the array is not supported.
     *         </p>
     *         </note>
     */
    public java.util.List<TargetGroupInfo> getTargetGroupInfoList() {
        return targetGroupInfoList;
    }

    /**
     * <p>
     * An array that contains information about the target group to use for load
     * balancing in a deployment. In Elastic Load Balancing, target groups are
     * used with Application Load Balancers.
     * </p>
     * <note>
     * <p>
     * Adding more than one target group to the array is not supported.
     * </p>
     * </note>
     *
     * @param targetGroupInfoList <p>
     *            An array that contains information about the target group to
     *            use for load balancing in a deployment. In Elastic Load
     *            Balancing, target groups are used with Application Load
     *            Balancers.
     *            </p>
     *            <note>
     *            <p>
     *            Adding more than one target group to the array is not
     *            supported.
     *            </p>
     *            </note>
     */
    public void setTargetGroupInfoList(java.util.Collection<TargetGroupInfo> targetGroupInfoList) {
        if (targetGroupInfoList == null) {
            this.targetGroupInfoList = null;
            return;
        }

        this.targetGroupInfoList = new java.util.ArrayList<TargetGroupInfo>(targetGroupInfoList);
    }

    /**
     * <p>
     * An array that contains information about the target group to use for load
     * balancing in a deployment. In Elastic Load Balancing, target groups are
     * used with Application Load Balancers.
     * </p>
     * <note>
     * <p>
     * Adding more than one target group to the array is not supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroupInfoList <p>
     *            An array that contains information about the target group to
     *            use for load balancing in a deployment. In Elastic Load
     *            Balancing, target groups are used with Application Load
     *            Balancers.
     *            </p>
     *            <note>
     *            <p>
     *            Adding more than one target group to the array is not
     *            supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerInfo withTargetGroupInfoList(TargetGroupInfo... targetGroupInfoList) {
        if (getTargetGroupInfoList() == null) {
            this.targetGroupInfoList = new java.util.ArrayList<TargetGroupInfo>(
                    targetGroupInfoList.length);
        }
        for (TargetGroupInfo value : targetGroupInfoList) {
            this.targetGroupInfoList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains information about the target group to use for load
     * balancing in a deployment. In Elastic Load Balancing, target groups are
     * used with Application Load Balancers.
     * </p>
     * <note>
     * <p>
     * Adding more than one target group to the array is not supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroupInfoList <p>
     *            An array that contains information about the target group to
     *            use for load balancing in a deployment. In Elastic Load
     *            Balancing, target groups are used with Application Load
     *            Balancers.
     *            </p>
     *            <note>
     *            <p>
     *            Adding more than one target group to the array is not
     *            supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerInfo withTargetGroupInfoList(
            java.util.Collection<TargetGroupInfo> targetGroupInfoList) {
        setTargetGroupInfoList(targetGroupInfoList);
        return this;
    }

    /**
     * <p>
     * The target group pair information. This is an array of
     * <code>TargeGroupPairInfo</code> objects with a maximum size of one.
     * </p>
     *
     * @return <p>
     *         The target group pair information. This is an array of
     *         <code>TargeGroupPairInfo</code> objects with a maximum size of
     *         one.
     *         </p>
     */
    public java.util.List<TargetGroupPairInfo> getTargetGroupPairInfoList() {
        return targetGroupPairInfoList;
    }

    /**
     * <p>
     * The target group pair information. This is an array of
     * <code>TargeGroupPairInfo</code> objects with a maximum size of one.
     * </p>
     *
     * @param targetGroupPairInfoList <p>
     *            The target group pair information. This is an array of
     *            <code>TargeGroupPairInfo</code> objects with a maximum size of
     *            one.
     *            </p>
     */
    public void setTargetGroupPairInfoList(
            java.util.Collection<TargetGroupPairInfo> targetGroupPairInfoList) {
        if (targetGroupPairInfoList == null) {
            this.targetGroupPairInfoList = null;
            return;
        }

        this.targetGroupPairInfoList = new java.util.ArrayList<TargetGroupPairInfo>(
                targetGroupPairInfoList);
    }

    /**
     * <p>
     * The target group pair information. This is an array of
     * <code>TargeGroupPairInfo</code> objects with a maximum size of one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroupPairInfoList <p>
     *            The target group pair information. This is an array of
     *            <code>TargeGroupPairInfo</code> objects with a maximum size of
     *            one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerInfo withTargetGroupPairInfoList(
            TargetGroupPairInfo... targetGroupPairInfoList) {
        if (getTargetGroupPairInfoList() == null) {
            this.targetGroupPairInfoList = new java.util.ArrayList<TargetGroupPairInfo>(
                    targetGroupPairInfoList.length);
        }
        for (TargetGroupPairInfo value : targetGroupPairInfoList) {
            this.targetGroupPairInfoList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The target group pair information. This is an array of
     * <code>TargeGroupPairInfo</code> objects with a maximum size of one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroupPairInfoList <p>
     *            The target group pair information. This is an array of
     *            <code>TargeGroupPairInfo</code> objects with a maximum size of
     *            one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerInfo withTargetGroupPairInfoList(
            java.util.Collection<TargetGroupPairInfo> targetGroupPairInfoList) {
        setTargetGroupPairInfoList(targetGroupPairInfoList);
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
        if (getElbInfoList() != null)
            sb.append("elbInfoList: " + getElbInfoList() + ",");
        if (getTargetGroupInfoList() != null)
            sb.append("targetGroupInfoList: " + getTargetGroupInfoList() + ",");
        if (getTargetGroupPairInfoList() != null)
            sb.append("targetGroupPairInfoList: " + getTargetGroupPairInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getElbInfoList() == null) ? 0 : getElbInfoList().hashCode());
        hashCode = prime * hashCode
                + ((getTargetGroupInfoList() == null) ? 0 : getTargetGroupInfoList().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetGroupPairInfoList() == null) ? 0 : getTargetGroupPairInfoList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerInfo == false)
            return false;
        LoadBalancerInfo other = (LoadBalancerInfo) obj;

        if (other.getElbInfoList() == null ^ this.getElbInfoList() == null)
            return false;
        if (other.getElbInfoList() != null
                && other.getElbInfoList().equals(this.getElbInfoList()) == false)
            return false;
        if (other.getTargetGroupInfoList() == null ^ this.getTargetGroupInfoList() == null)
            return false;
        if (other.getTargetGroupInfoList() != null
                && other.getTargetGroupInfoList().equals(this.getTargetGroupInfoList()) == false)
            return false;
        if (other.getTargetGroupPairInfoList() == null ^ this.getTargetGroupPairInfoList() == null)
            return false;
        if (other.getTargetGroupPairInfoList() != null
                && other.getTargetGroupPairInfoList().equals(this.getTargetGroupPairInfoList()) == false)
            return false;
        return true;
    }
}
