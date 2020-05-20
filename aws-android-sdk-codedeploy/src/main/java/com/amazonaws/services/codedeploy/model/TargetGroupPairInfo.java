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
 * Information about two target groups and how traffic is routed during an
 * Amazon ECS deployment. An optional test traffic route can be specified.
 * </p>
 */
public class TargetGroupPairInfo implements Serializable {
    /**
     * <p>
     * One pair of target groups. One is associated with the original task set.
     * The second is associated with the task set that serves traffic after the
     * deployment is complete.
     * </p>
     */
    private java.util.List<TargetGroupInfo> targetGroups;

    /**
     * <p>
     * The path used by a load balancer to route production traffic when an
     * Amazon ECS deployment is complete.
     * </p>
     */
    private TrafficRoute prodTrafficRoute;

    /**
     * <p>
     * An optional path used by a load balancer to route test traffic after an
     * Amazon ECS deployment. Validation can occur while test traffic is served
     * during a deployment.
     * </p>
     */
    private TrafficRoute testTrafficRoute;

    /**
     * <p>
     * One pair of target groups. One is associated with the original task set.
     * The second is associated with the task set that serves traffic after the
     * deployment is complete.
     * </p>
     *
     * @return <p>
     *         One pair of target groups. One is associated with the original
     *         task set. The second is associated with the task set that serves
     *         traffic after the deployment is complete.
     *         </p>
     */
    public java.util.List<TargetGroupInfo> getTargetGroups() {
        return targetGroups;
    }

    /**
     * <p>
     * One pair of target groups. One is associated with the original task set.
     * The second is associated with the task set that serves traffic after the
     * deployment is complete.
     * </p>
     *
     * @param targetGroups <p>
     *            One pair of target groups. One is associated with the original
     *            task set. The second is associated with the task set that
     *            serves traffic after the deployment is complete.
     *            </p>
     */
    public void setTargetGroups(java.util.Collection<TargetGroupInfo> targetGroups) {
        if (targetGroups == null) {
            this.targetGroups = null;
            return;
        }

        this.targetGroups = new java.util.ArrayList<TargetGroupInfo>(targetGroups);
    }

    /**
     * <p>
     * One pair of target groups. One is associated with the original task set.
     * The second is associated with the task set that serves traffic after the
     * deployment is complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroups <p>
     *            One pair of target groups. One is associated with the original
     *            task set. The second is associated with the task set that
     *            serves traffic after the deployment is complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetGroupPairInfo withTargetGroups(TargetGroupInfo... targetGroups) {
        if (getTargetGroups() == null) {
            this.targetGroups = new java.util.ArrayList<TargetGroupInfo>(targetGroups.length);
        }
        for (TargetGroupInfo value : targetGroups) {
            this.targetGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One pair of target groups. One is associated with the original task set.
     * The second is associated with the task set that serves traffic after the
     * deployment is complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroups <p>
     *            One pair of target groups. One is associated with the original
     *            task set. The second is associated with the task set that
     *            serves traffic after the deployment is complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetGroupPairInfo withTargetGroups(java.util.Collection<TargetGroupInfo> targetGroups) {
        setTargetGroups(targetGroups);
        return this;
    }

    /**
     * <p>
     * The path used by a load balancer to route production traffic when an
     * Amazon ECS deployment is complete.
     * </p>
     *
     * @return <p>
     *         The path used by a load balancer to route production traffic when
     *         an Amazon ECS deployment is complete.
     *         </p>
     */
    public TrafficRoute getProdTrafficRoute() {
        return prodTrafficRoute;
    }

    /**
     * <p>
     * The path used by a load balancer to route production traffic when an
     * Amazon ECS deployment is complete.
     * </p>
     *
     * @param prodTrafficRoute <p>
     *            The path used by a load balancer to route production traffic
     *            when an Amazon ECS deployment is complete.
     *            </p>
     */
    public void setProdTrafficRoute(TrafficRoute prodTrafficRoute) {
        this.prodTrafficRoute = prodTrafficRoute;
    }

    /**
     * <p>
     * The path used by a load balancer to route production traffic when an
     * Amazon ECS deployment is complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prodTrafficRoute <p>
     *            The path used by a load balancer to route production traffic
     *            when an Amazon ECS deployment is complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetGroupPairInfo withProdTrafficRoute(TrafficRoute prodTrafficRoute) {
        this.prodTrafficRoute = prodTrafficRoute;
        return this;
    }

    /**
     * <p>
     * An optional path used by a load balancer to route test traffic after an
     * Amazon ECS deployment. Validation can occur while test traffic is served
     * during a deployment.
     * </p>
     *
     * @return <p>
     *         An optional path used by a load balancer to route test traffic
     *         after an Amazon ECS deployment. Validation can occur while test
     *         traffic is served during a deployment.
     *         </p>
     */
    public TrafficRoute getTestTrafficRoute() {
        return testTrafficRoute;
    }

    /**
     * <p>
     * An optional path used by a load balancer to route test traffic after an
     * Amazon ECS deployment. Validation can occur while test traffic is served
     * during a deployment.
     * </p>
     *
     * @param testTrafficRoute <p>
     *            An optional path used by a load balancer to route test traffic
     *            after an Amazon ECS deployment. Validation can occur while
     *            test traffic is served during a deployment.
     *            </p>
     */
    public void setTestTrafficRoute(TrafficRoute testTrafficRoute) {
        this.testTrafficRoute = testTrafficRoute;
    }

    /**
     * <p>
     * An optional path used by a load balancer to route test traffic after an
     * Amazon ECS deployment. Validation can occur while test traffic is served
     * during a deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param testTrafficRoute <p>
     *            An optional path used by a load balancer to route test traffic
     *            after an Amazon ECS deployment. Validation can occur while
     *            test traffic is served during a deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetGroupPairInfo withTestTrafficRoute(TrafficRoute testTrafficRoute) {
        this.testTrafficRoute = testTrafficRoute;
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
        if (getTargetGroups() != null)
            sb.append("targetGroups: " + getTargetGroups() + ",");
        if (getProdTrafficRoute() != null)
            sb.append("prodTrafficRoute: " + getProdTrafficRoute() + ",");
        if (getTestTrafficRoute() != null)
            sb.append("testTrafficRoute: " + getTestTrafficRoute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetGroups() == null) ? 0 : getTargetGroups().hashCode());
        hashCode = prime * hashCode
                + ((getProdTrafficRoute() == null) ? 0 : getProdTrafficRoute().hashCode());
        hashCode = prime * hashCode
                + ((getTestTrafficRoute() == null) ? 0 : getTestTrafficRoute().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetGroupPairInfo == false)
            return false;
        TargetGroupPairInfo other = (TargetGroupPairInfo) obj;

        if (other.getTargetGroups() == null ^ this.getTargetGroups() == null)
            return false;
        if (other.getTargetGroups() != null
                && other.getTargetGroups().equals(this.getTargetGroups()) == false)
            return false;
        if (other.getProdTrafficRoute() == null ^ this.getProdTrafficRoute() == null)
            return false;
        if (other.getProdTrafficRoute() != null
                && other.getProdTrafficRoute().equals(this.getProdTrafficRoute()) == false)
            return false;
        if (other.getTestTrafficRoute() == null ^ this.getTestTrafficRoute() == null)
            return false;
        if (other.getTestTrafficRoute() != null
                && other.getTestTrafficRoute().equals(this.getTestTrafficRoute()) == false)
            return false;
        return true;
    }
}
