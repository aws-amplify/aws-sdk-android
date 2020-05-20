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
 * The configuration that specifies how traffic is shifted from one version of a
 * Lambda function to another version during an AWS Lambda deployment, or from
 * one Amazon ECS task set to another during an Amazon ECS deployment.
 * </p>
 */
public class TrafficRoutingConfig implements Serializable {
    /**
     * <p>
     * The type of traffic shifting (<code>TimeBasedCanary</code> or
     * <code>TimeBasedLinear</code>) used by a deployment configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBasedCanary, TimeBasedLinear, AllAtOnce
     */
    private String type;

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function
     * or ECS task set to another in two increments. The original and target
     * Lambda function versions or ECS task sets are specified in the
     * deployment's AppSpec file.
     * </p>
     */
    private TimeBasedCanary timeBasedCanary;

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function
     * or ECS task set to another in equal increments, with an equal number of
     * minutes between each increment. The original and target Lambda function
     * versions or ECS task sets are specified in the deployment's AppSpec file.
     * </p>
     */
    private TimeBasedLinear timeBasedLinear;

    /**
     * <p>
     * The type of traffic shifting (<code>TimeBasedCanary</code> or
     * <code>TimeBasedLinear</code>) used by a deployment configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBasedCanary, TimeBasedLinear, AllAtOnce
     *
     * @return <p>
     *         The type of traffic shifting (<code>TimeBasedCanary</code> or
     *         <code>TimeBasedLinear</code>) used by a deployment configuration.
     *         </p>
     * @see TrafficRoutingType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of traffic shifting (<code>TimeBasedCanary</code> or
     * <code>TimeBasedLinear</code>) used by a deployment configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBasedCanary, TimeBasedLinear, AllAtOnce
     *
     * @param type <p>
     *            The type of traffic shifting (<code>TimeBasedCanary</code> or
     *            <code>TimeBasedLinear</code>) used by a deployment
     *            configuration.
     *            </p>
     * @see TrafficRoutingType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of traffic shifting (<code>TimeBasedCanary</code> or
     * <code>TimeBasedLinear</code>) used by a deployment configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBasedCanary, TimeBasedLinear, AllAtOnce
     *
     * @param type <p>
     *            The type of traffic shifting (<code>TimeBasedCanary</code> or
     *            <code>TimeBasedLinear</code>) used by a deployment
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficRoutingType
     */
    public TrafficRoutingConfig withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of traffic shifting (<code>TimeBasedCanary</code> or
     * <code>TimeBasedLinear</code>) used by a deployment configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBasedCanary, TimeBasedLinear, AllAtOnce
     *
     * @param type <p>
     *            The type of traffic shifting (<code>TimeBasedCanary</code> or
     *            <code>TimeBasedLinear</code>) used by a deployment
     *            configuration.
     *            </p>
     * @see TrafficRoutingType
     */
    public void setType(TrafficRoutingType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of traffic shifting (<code>TimeBasedCanary</code> or
     * <code>TimeBasedLinear</code>) used by a deployment configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBasedCanary, TimeBasedLinear, AllAtOnce
     *
     * @param type <p>
     *            The type of traffic shifting (<code>TimeBasedCanary</code> or
     *            <code>TimeBasedLinear</code>) used by a deployment
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficRoutingType
     */
    public TrafficRoutingConfig withType(TrafficRoutingType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function
     * or ECS task set to another in two increments. The original and target
     * Lambda function versions or ECS task sets are specified in the
     * deployment's AppSpec file.
     * </p>
     *
     * @return <p>
     *         A configuration that shifts traffic from one version of a Lambda
     *         function or ECS task set to another in two increments. The
     *         original and target Lambda function versions or ECS task sets are
     *         specified in the deployment's AppSpec file.
     *         </p>
     */
    public TimeBasedCanary getTimeBasedCanary() {
        return timeBasedCanary;
    }

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function
     * or ECS task set to another in two increments. The original and target
     * Lambda function versions or ECS task sets are specified in the
     * deployment's AppSpec file.
     * </p>
     *
     * @param timeBasedCanary <p>
     *            A configuration that shifts traffic from one version of a
     *            Lambda function or ECS task set to another in two increments.
     *            The original and target Lambda function versions or ECS task
     *            sets are specified in the deployment's AppSpec file.
     *            </p>
     */
    public void setTimeBasedCanary(TimeBasedCanary timeBasedCanary) {
        this.timeBasedCanary = timeBasedCanary;
    }

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function
     * or ECS task set to another in two increments. The original and target
     * Lambda function versions or ECS task sets are specified in the
     * deployment's AppSpec file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeBasedCanary <p>
     *            A configuration that shifts traffic from one version of a
     *            Lambda function or ECS task set to another in two increments.
     *            The original and target Lambda function versions or ECS task
     *            sets are specified in the deployment's AppSpec file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficRoutingConfig withTimeBasedCanary(TimeBasedCanary timeBasedCanary) {
        this.timeBasedCanary = timeBasedCanary;
        return this;
    }

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function
     * or ECS task set to another in equal increments, with an equal number of
     * minutes between each increment. The original and target Lambda function
     * versions or ECS task sets are specified in the deployment's AppSpec file.
     * </p>
     *
     * @return <p>
     *         A configuration that shifts traffic from one version of a Lambda
     *         function or ECS task set to another in equal increments, with an
     *         equal number of minutes between each increment. The original and
     *         target Lambda function versions or ECS task sets are specified in
     *         the deployment's AppSpec file.
     *         </p>
     */
    public TimeBasedLinear getTimeBasedLinear() {
        return timeBasedLinear;
    }

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function
     * or ECS task set to another in equal increments, with an equal number of
     * minutes between each increment. The original and target Lambda function
     * versions or ECS task sets are specified in the deployment's AppSpec file.
     * </p>
     *
     * @param timeBasedLinear <p>
     *            A configuration that shifts traffic from one version of a
     *            Lambda function or ECS task set to another in equal
     *            increments, with an equal number of minutes between each
     *            increment. The original and target Lambda function versions or
     *            ECS task sets are specified in the deployment's AppSpec file.
     *            </p>
     */
    public void setTimeBasedLinear(TimeBasedLinear timeBasedLinear) {
        this.timeBasedLinear = timeBasedLinear;
    }

    /**
     * <p>
     * A configuration that shifts traffic from one version of a Lambda function
     * or ECS task set to another in equal increments, with an equal number of
     * minutes between each increment. The original and target Lambda function
     * versions or ECS task sets are specified in the deployment's AppSpec file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeBasedLinear <p>
     *            A configuration that shifts traffic from one version of a
     *            Lambda function or ECS task set to another in equal
     *            increments, with an equal number of minutes between each
     *            increment. The original and target Lambda function versions or
     *            ECS task sets are specified in the deployment's AppSpec file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficRoutingConfig withTimeBasedLinear(TimeBasedLinear timeBasedLinear) {
        this.timeBasedLinear = timeBasedLinear;
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
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getTimeBasedCanary() != null)
            sb.append("timeBasedCanary: " + getTimeBasedCanary() + ",");
        if (getTimeBasedLinear() != null)
            sb.append("timeBasedLinear: " + getTimeBasedLinear());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getTimeBasedCanary() == null) ? 0 : getTimeBasedCanary().hashCode());
        hashCode = prime * hashCode
                + ((getTimeBasedLinear() == null) ? 0 : getTimeBasedLinear().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficRoutingConfig == false)
            return false;
        TrafficRoutingConfig other = (TrafficRoutingConfig) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTimeBasedCanary() == null ^ this.getTimeBasedCanary() == null)
            return false;
        if (other.getTimeBasedCanary() != null
                && other.getTimeBasedCanary().equals(this.getTimeBasedCanary()) == false)
            return false;
        if (other.getTimeBasedLinear() == null ^ this.getTimeBasedLinear() == null)
            return false;
        if (other.getTimeBasedLinear() != null
                && other.getTimeBasedLinear().equals(this.getTimeBasedLinear()) == false)
            return false;
        return true;
    }
}
