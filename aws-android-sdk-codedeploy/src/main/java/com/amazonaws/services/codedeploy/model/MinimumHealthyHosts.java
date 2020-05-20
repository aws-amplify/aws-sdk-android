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
 * Information about minimum healthy instance.
 * </p>
 */
public class MinimumHealthyHosts implements Serializable {
    /**
     * <p>
     * The minimum healthy instance value.
     * </p>
     */
    private Integer value;

    /**
     * <p>
     * The minimum healthy instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST_COUNT</code>: The minimum number of healthy instances as an
     * absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FLEET_PERCENT</code>: The minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In an example of nine instances, if a HOST_COUNT of six is specified,
     * deploy to up to three instances at a time. The deployment is successful
     * if six or more instances are deployed to successfully. Otherwise, the
     * deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to
     * five instances at a time. The deployment is successful if four or more
     * instances are deployed to successfully. Otherwise, the deployment fails.
     * </p>
     * <note>
     * <p>
     * In a call to the <code>GetDeploymentConfig</code>,
     * CodeDeployDefault.OneAtATime returns a minimum healthy instance type of
     * MOST_CONCURRENCY and a value of 1. This means a deployment to only one
     * instance at a time. (You cannot set the type to MOST_CONCURRENCY, only to
     * HOST_COUNT or FLEET_PERCENT.) In addition, with
     * CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all
     * instances but one are kept in a healthy state during the deployment.
     * Although this allows one instance at a time to be taken offline for a new
     * deployment, it also means that if the deployment to the last instance
     * fails, the overall deployment is still successful.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html"
     * >AWS CodeDeploy Instance Health</a> in the <i>AWS CodeDeploy User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOST_COUNT, FLEET_PERCENT
     */
    private String type;

    /**
     * <p>
     * The minimum healthy instance value.
     * </p>
     *
     * @return <p>
     *         The minimum healthy instance value.
     *         </p>
     */
    public Integer getValue() {
        return value;
    }

    /**
     * <p>
     * The minimum healthy instance value.
     * </p>
     *
     * @param value <p>
     *            The minimum healthy instance value.
     *            </p>
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * The minimum healthy instance value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The minimum healthy instance value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MinimumHealthyHosts withValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The minimum healthy instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST_COUNT</code>: The minimum number of healthy instances as an
     * absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FLEET_PERCENT</code>: The minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In an example of nine instances, if a HOST_COUNT of six is specified,
     * deploy to up to three instances at a time. The deployment is successful
     * if six or more instances are deployed to successfully. Otherwise, the
     * deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to
     * five instances at a time. The deployment is successful if four or more
     * instances are deployed to successfully. Otherwise, the deployment fails.
     * </p>
     * <note>
     * <p>
     * In a call to the <code>GetDeploymentConfig</code>,
     * CodeDeployDefault.OneAtATime returns a minimum healthy instance type of
     * MOST_CONCURRENCY and a value of 1. This means a deployment to only one
     * instance at a time. (You cannot set the type to MOST_CONCURRENCY, only to
     * HOST_COUNT or FLEET_PERCENT.) In addition, with
     * CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all
     * instances but one are kept in a healthy state during the deployment.
     * Although this allows one instance at a time to be taken offline for a new
     * deployment, it also means that if the deployment to the last instance
     * fails, the overall deployment is still successful.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html"
     * >AWS CodeDeploy Instance Health</a> in the <i>AWS CodeDeploy User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOST_COUNT, FLEET_PERCENT
     *
     * @return <p>
     *         The minimum healthy instance type:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HOST_COUNT</code>: The minimum number of healthy instances
     *         as an absolute value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FLEET_PERCENT</code>: The minimum number of healthy
     *         instances as a percentage of the total number of instances in the
     *         deployment.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In an example of nine instances, if a HOST_COUNT of six is
     *         specified, deploy to up to three instances at a time. The
     *         deployment is successful if six or more instances are deployed to
     *         successfully. Otherwise, the deployment fails. If a FLEET_PERCENT
     *         of 40 is specified, deploy to up to five instances at a time. The
     *         deployment is successful if four or more instances are deployed
     *         to successfully. Otherwise, the deployment fails.
     *         </p>
     *         <note>
     *         <p>
     *         In a call to the <code>GetDeploymentConfig</code>,
     *         CodeDeployDefault.OneAtATime returns a minimum healthy instance
     *         type of MOST_CONCURRENCY and a value of 1. This means a
     *         deployment to only one instance at a time. (You cannot set the
     *         type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.)
     *         In addition, with CodeDeployDefault.OneAtATime, AWS CodeDeploy
     *         attempts to ensure that all instances but one are kept in a
     *         healthy state during the deployment. Although this allows one
     *         instance at a time to be taken offline for a new deployment, it
     *         also means that if the deployment to the last instance fails, the
     *         overall deployment is still successful.
     *         </p>
     *         </note>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html"
     *         >AWS CodeDeploy Instance Health</a> in the <i>AWS CodeDeploy User
     *         Guide</i>.
     *         </p>
     * @see MinimumHealthyHostsType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The minimum healthy instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST_COUNT</code>: The minimum number of healthy instances as an
     * absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FLEET_PERCENT</code>: The minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In an example of nine instances, if a HOST_COUNT of six is specified,
     * deploy to up to three instances at a time. The deployment is successful
     * if six or more instances are deployed to successfully. Otherwise, the
     * deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to
     * five instances at a time. The deployment is successful if four or more
     * instances are deployed to successfully. Otherwise, the deployment fails.
     * </p>
     * <note>
     * <p>
     * In a call to the <code>GetDeploymentConfig</code>,
     * CodeDeployDefault.OneAtATime returns a minimum healthy instance type of
     * MOST_CONCURRENCY and a value of 1. This means a deployment to only one
     * instance at a time. (You cannot set the type to MOST_CONCURRENCY, only to
     * HOST_COUNT or FLEET_PERCENT.) In addition, with
     * CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all
     * instances but one are kept in a healthy state during the deployment.
     * Although this allows one instance at a time to be taken offline for a new
     * deployment, it also means that if the deployment to the last instance
     * fails, the overall deployment is still successful.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html"
     * >AWS CodeDeploy Instance Health</a> in the <i>AWS CodeDeploy User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOST_COUNT, FLEET_PERCENT
     *
     * @param type <p>
     *            The minimum healthy instance type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HOST_COUNT</code>: The minimum number of healthy
     *            instances as an absolute value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FLEET_PERCENT</code>: The minimum number of healthy
     *            instances as a percentage of the total number of instances in
     *            the deployment.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In an example of nine instances, if a HOST_COUNT of six is
     *            specified, deploy to up to three instances at a time. The
     *            deployment is successful if six or more instances are deployed
     *            to successfully. Otherwise, the deployment fails. If a
     *            FLEET_PERCENT of 40 is specified, deploy to up to five
     *            instances at a time. The deployment is successful if four or
     *            more instances are deployed to successfully. Otherwise, the
     *            deployment fails.
     *            </p>
     *            <note>
     *            <p>
     *            In a call to the <code>GetDeploymentConfig</code>,
     *            CodeDeployDefault.OneAtATime returns a minimum healthy
     *            instance type of MOST_CONCURRENCY and a value of 1. This means
     *            a deployment to only one instance at a time. (You cannot set
     *            the type to MOST_CONCURRENCY, only to HOST_COUNT or
     *            FLEET_PERCENT.) In addition, with
     *            CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to
     *            ensure that all instances but one are kept in a healthy state
     *            during the deployment. Although this allows one instance at a
     *            time to be taken offline for a new deployment, it also means
     *            that if the deployment to the last instance fails, the overall
     *            deployment is still successful.
     *            </p>
     *            </note>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html"
     *            >AWS CodeDeploy Instance Health</a> in the <i>AWS CodeDeploy
     *            User Guide</i>.
     *            </p>
     * @see MinimumHealthyHostsType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The minimum healthy instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST_COUNT</code>: The minimum number of healthy instances as an
     * absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FLEET_PERCENT</code>: The minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In an example of nine instances, if a HOST_COUNT of six is specified,
     * deploy to up to three instances at a time. The deployment is successful
     * if six or more instances are deployed to successfully. Otherwise, the
     * deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to
     * five instances at a time. The deployment is successful if four or more
     * instances are deployed to successfully. Otherwise, the deployment fails.
     * </p>
     * <note>
     * <p>
     * In a call to the <code>GetDeploymentConfig</code>,
     * CodeDeployDefault.OneAtATime returns a minimum healthy instance type of
     * MOST_CONCURRENCY and a value of 1. This means a deployment to only one
     * instance at a time. (You cannot set the type to MOST_CONCURRENCY, only to
     * HOST_COUNT or FLEET_PERCENT.) In addition, with
     * CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all
     * instances but one are kept in a healthy state during the deployment.
     * Although this allows one instance at a time to be taken offline for a new
     * deployment, it also means that if the deployment to the last instance
     * fails, the overall deployment is still successful.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html"
     * >AWS CodeDeploy Instance Health</a> in the <i>AWS CodeDeploy User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOST_COUNT, FLEET_PERCENT
     *
     * @param type <p>
     *            The minimum healthy instance type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HOST_COUNT</code>: The minimum number of healthy
     *            instances as an absolute value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FLEET_PERCENT</code>: The minimum number of healthy
     *            instances as a percentage of the total number of instances in
     *            the deployment.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In an example of nine instances, if a HOST_COUNT of six is
     *            specified, deploy to up to three instances at a time. The
     *            deployment is successful if six or more instances are deployed
     *            to successfully. Otherwise, the deployment fails. If a
     *            FLEET_PERCENT of 40 is specified, deploy to up to five
     *            instances at a time. The deployment is successful if four or
     *            more instances are deployed to successfully. Otherwise, the
     *            deployment fails.
     *            </p>
     *            <note>
     *            <p>
     *            In a call to the <code>GetDeploymentConfig</code>,
     *            CodeDeployDefault.OneAtATime returns a minimum healthy
     *            instance type of MOST_CONCURRENCY and a value of 1. This means
     *            a deployment to only one instance at a time. (You cannot set
     *            the type to MOST_CONCURRENCY, only to HOST_COUNT or
     *            FLEET_PERCENT.) In addition, with
     *            CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to
     *            ensure that all instances but one are kept in a healthy state
     *            during the deployment. Although this allows one instance at a
     *            time to be taken offline for a new deployment, it also means
     *            that if the deployment to the last instance fails, the overall
     *            deployment is still successful.
     *            </p>
     *            </note>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html"
     *            >AWS CodeDeploy Instance Health</a> in the <i>AWS CodeDeploy
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MinimumHealthyHostsType
     */
    public MinimumHealthyHosts withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The minimum healthy instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST_COUNT</code>: The minimum number of healthy instances as an
     * absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FLEET_PERCENT</code>: The minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In an example of nine instances, if a HOST_COUNT of six is specified,
     * deploy to up to three instances at a time. The deployment is successful
     * if six or more instances are deployed to successfully. Otherwise, the
     * deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to
     * five instances at a time. The deployment is successful if four or more
     * instances are deployed to successfully. Otherwise, the deployment fails.
     * </p>
     * <note>
     * <p>
     * In a call to the <code>GetDeploymentConfig</code>,
     * CodeDeployDefault.OneAtATime returns a minimum healthy instance type of
     * MOST_CONCURRENCY and a value of 1. This means a deployment to only one
     * instance at a time. (You cannot set the type to MOST_CONCURRENCY, only to
     * HOST_COUNT or FLEET_PERCENT.) In addition, with
     * CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all
     * instances but one are kept in a healthy state during the deployment.
     * Although this allows one instance at a time to be taken offline for a new
     * deployment, it also means that if the deployment to the last instance
     * fails, the overall deployment is still successful.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html"
     * >AWS CodeDeploy Instance Health</a> in the <i>AWS CodeDeploy User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOST_COUNT, FLEET_PERCENT
     *
     * @param type <p>
     *            The minimum healthy instance type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HOST_COUNT</code>: The minimum number of healthy
     *            instances as an absolute value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FLEET_PERCENT</code>: The minimum number of healthy
     *            instances as a percentage of the total number of instances in
     *            the deployment.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In an example of nine instances, if a HOST_COUNT of six is
     *            specified, deploy to up to three instances at a time. The
     *            deployment is successful if six or more instances are deployed
     *            to successfully. Otherwise, the deployment fails. If a
     *            FLEET_PERCENT of 40 is specified, deploy to up to five
     *            instances at a time. The deployment is successful if four or
     *            more instances are deployed to successfully. Otherwise, the
     *            deployment fails.
     *            </p>
     *            <note>
     *            <p>
     *            In a call to the <code>GetDeploymentConfig</code>,
     *            CodeDeployDefault.OneAtATime returns a minimum healthy
     *            instance type of MOST_CONCURRENCY and a value of 1. This means
     *            a deployment to only one instance at a time. (You cannot set
     *            the type to MOST_CONCURRENCY, only to HOST_COUNT or
     *            FLEET_PERCENT.) In addition, with
     *            CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to
     *            ensure that all instances but one are kept in a healthy state
     *            during the deployment. Although this allows one instance at a
     *            time to be taken offline for a new deployment, it also means
     *            that if the deployment to the last instance fails, the overall
     *            deployment is still successful.
     *            </p>
     *            </note>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html"
     *            >AWS CodeDeploy Instance Health</a> in the <i>AWS CodeDeploy
     *            User Guide</i>.
     *            </p>
     * @see MinimumHealthyHostsType
     */
    public void setType(MinimumHealthyHostsType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The minimum healthy instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST_COUNT</code>: The minimum number of healthy instances as an
     * absolute value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FLEET_PERCENT</code>: The minimum number of healthy instances as a
     * percentage of the total number of instances in the deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In an example of nine instances, if a HOST_COUNT of six is specified,
     * deploy to up to three instances at a time. The deployment is successful
     * if six or more instances are deployed to successfully. Otherwise, the
     * deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to
     * five instances at a time. The deployment is successful if four or more
     * instances are deployed to successfully. Otherwise, the deployment fails.
     * </p>
     * <note>
     * <p>
     * In a call to the <code>GetDeploymentConfig</code>,
     * CodeDeployDefault.OneAtATime returns a minimum healthy instance type of
     * MOST_CONCURRENCY and a value of 1. This means a deployment to only one
     * instance at a time. (You cannot set the type to MOST_CONCURRENCY, only to
     * HOST_COUNT or FLEET_PERCENT.) In addition, with
     * CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all
     * instances but one are kept in a healthy state during the deployment.
     * Although this allows one instance at a time to be taken offline for a new
     * deployment, it also means that if the deployment to the last instance
     * fails, the overall deployment is still successful.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html"
     * >AWS CodeDeploy Instance Health</a> in the <i>AWS CodeDeploy User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOST_COUNT, FLEET_PERCENT
     *
     * @param type <p>
     *            The minimum healthy instance type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HOST_COUNT</code>: The minimum number of healthy
     *            instances as an absolute value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FLEET_PERCENT</code>: The minimum number of healthy
     *            instances as a percentage of the total number of instances in
     *            the deployment.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In an example of nine instances, if a HOST_COUNT of six is
     *            specified, deploy to up to three instances at a time. The
     *            deployment is successful if six or more instances are deployed
     *            to successfully. Otherwise, the deployment fails. If a
     *            FLEET_PERCENT of 40 is specified, deploy to up to five
     *            instances at a time. The deployment is successful if four or
     *            more instances are deployed to successfully. Otherwise, the
     *            deployment fails.
     *            </p>
     *            <note>
     *            <p>
     *            In a call to the <code>GetDeploymentConfig</code>,
     *            CodeDeployDefault.OneAtATime returns a minimum healthy
     *            instance type of MOST_CONCURRENCY and a value of 1. This means
     *            a deployment to only one instance at a time. (You cannot set
     *            the type to MOST_CONCURRENCY, only to HOST_COUNT or
     *            FLEET_PERCENT.) In addition, with
     *            CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to
     *            ensure that all instances but one are kept in a healthy state
     *            during the deployment. Although this allows one instance at a
     *            time to be taken offline for a new deployment, it also means
     *            that if the deployment to the last instance fails, the overall
     *            deployment is still successful.
     *            </p>
     *            </note>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html"
     *            >AWS CodeDeploy Instance Health</a> in the <i>AWS CodeDeploy
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MinimumHealthyHostsType
     */
    public MinimumHealthyHosts withType(MinimumHealthyHostsType type) {
        this.type = type.toString();
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
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MinimumHealthyHosts == false)
            return false;
        MinimumHealthyHosts other = (MinimumHealthyHosts) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
