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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns an array of one or more targets associated with a deployment. This
 * method works with all compute types and should be used instead of the
 * deprecated <code>BatchGetDeploymentInstances</code>. The maximum number of
 * targets that can be returned is 25.
 * </p>
 * <p>
 * The type of targets returned depends on the deployment's compute platform or
 * deployment method:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>EC2/On-premises</b>: Information about EC2 instance targets.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS Lambda</b>: Information about Lambda functions targets.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Amazon ECS</b>: Information about Amazon ECS service targets.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>CloudFormation</b>: Information about targets of blue/green deployments
 * initiated by a CloudFormation stack update.
 * </p>
 * </li>
 * </ul>
 */
public class BatchGetDeploymentTargetsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The unique IDs of the deployment targets. The compute platform of the
     * deployment determines the type of the targets and their formats. The
     * maximum number of deployment target IDs you can specify is 25.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For deployments that use the EC2/On-premises compute platform, the target
     * IDs are EC2 or on-premises instances IDs, and their target type is
     * <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the AWS Lambda compute platform, the target IDs
     * are the names of Lambda functions, and their target type is
     * <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the Amazon ECS compute platform, the target IDs
     * are pairs of Amazon ECS clusters and services specified using the format
     * <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target type
     * is <code>ecsTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that are deployed with AWS CloudFormation, the target IDs
     * are CloudFormation stack IDs. Their target type is
     * <code>cloudFormationTarget</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> targetIds;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @return <p>
     *         The unique ID of a deployment.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentTargetsRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * The unique IDs of the deployment targets. The compute platform of the
     * deployment determines the type of the targets and their formats. The
     * maximum number of deployment target IDs you can specify is 25.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For deployments that use the EC2/On-premises compute platform, the target
     * IDs are EC2 or on-premises instances IDs, and their target type is
     * <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the AWS Lambda compute platform, the target IDs
     * are the names of Lambda functions, and their target type is
     * <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the Amazon ECS compute platform, the target IDs
     * are pairs of Amazon ECS clusters and services specified using the format
     * <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target type
     * is <code>ecsTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that are deployed with AWS CloudFormation, the target IDs
     * are CloudFormation stack IDs. Their target type is
     * <code>cloudFormationTarget</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The unique IDs of the deployment targets. The compute platform of
     *         the deployment determines the type of the targets and their
     *         formats. The maximum number of deployment target IDs you can
     *         specify is 25.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For deployments that use the EC2/On-premises compute platform,
     *         the target IDs are EC2 or on-premises instances IDs, and their
     *         target type is <code>instanceTarget</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For deployments that use the AWS Lambda compute platform, the
     *         target IDs are the names of Lambda functions, and their target
     *         type is <code>instanceTarget</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For deployments that use the Amazon ECS compute platform, the
     *         target IDs are pairs of Amazon ECS clusters and services
     *         specified using the format
     *         <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their
     *         target type is <code>ecsTarget</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For deployments that are deployed with AWS CloudFormation, the
     *         target IDs are CloudFormation stack IDs. Their target type is
     *         <code>cloudFormationTarget</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getTargetIds() {
        return targetIds;
    }

    /**
     * <p>
     * The unique IDs of the deployment targets. The compute platform of the
     * deployment determines the type of the targets and their formats. The
     * maximum number of deployment target IDs you can specify is 25.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For deployments that use the EC2/On-premises compute platform, the target
     * IDs are EC2 or on-premises instances IDs, and their target type is
     * <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the AWS Lambda compute platform, the target IDs
     * are the names of Lambda functions, and their target type is
     * <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the Amazon ECS compute platform, the target IDs
     * are pairs of Amazon ECS clusters and services specified using the format
     * <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target type
     * is <code>ecsTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that are deployed with AWS CloudFormation, the target IDs
     * are CloudFormation stack IDs. Their target type is
     * <code>cloudFormationTarget</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param targetIds <p>
     *            The unique IDs of the deployment targets. The compute platform
     *            of the deployment determines the type of the targets and their
     *            formats. The maximum number of deployment target IDs you can
     *            specify is 25.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For deployments that use the EC2/On-premises compute platform,
     *            the target IDs are EC2 or on-premises instances IDs, and their
     *            target type is <code>instanceTarget</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For deployments that use the AWS Lambda compute platform, the
     *            target IDs are the names of Lambda functions, and their target
     *            type is <code>instanceTarget</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For deployments that use the Amazon ECS compute platform, the
     *            target IDs are pairs of Amazon ECS clusters and services
     *            specified using the format
     *            <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their
     *            target type is <code>ecsTarget</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For deployments that are deployed with AWS CloudFormation, the
     *            target IDs are CloudFormation stack IDs. Their target type is
     *            <code>cloudFormationTarget</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTargetIds(java.util.Collection<String> targetIds) {
        if (targetIds == null) {
            this.targetIds = null;
            return;
        }

        this.targetIds = new java.util.ArrayList<String>(targetIds);
    }

    /**
     * <p>
     * The unique IDs of the deployment targets. The compute platform of the
     * deployment determines the type of the targets and their formats. The
     * maximum number of deployment target IDs you can specify is 25.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For deployments that use the EC2/On-premises compute platform, the target
     * IDs are EC2 or on-premises instances IDs, and their target type is
     * <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the AWS Lambda compute platform, the target IDs
     * are the names of Lambda functions, and their target type is
     * <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the Amazon ECS compute platform, the target IDs
     * are pairs of Amazon ECS clusters and services specified using the format
     * <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target type
     * is <code>ecsTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that are deployed with AWS CloudFormation, the target IDs
     * are CloudFormation stack IDs. Their target type is
     * <code>cloudFormationTarget</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetIds <p>
     *            The unique IDs of the deployment targets. The compute platform
     *            of the deployment determines the type of the targets and their
     *            formats. The maximum number of deployment target IDs you can
     *            specify is 25.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For deployments that use the EC2/On-premises compute platform,
     *            the target IDs are EC2 or on-premises instances IDs, and their
     *            target type is <code>instanceTarget</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For deployments that use the AWS Lambda compute platform, the
     *            target IDs are the names of Lambda functions, and their target
     *            type is <code>instanceTarget</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For deployments that use the Amazon ECS compute platform, the
     *            target IDs are pairs of Amazon ECS clusters and services
     *            specified using the format
     *            <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their
     *            target type is <code>ecsTarget</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For deployments that are deployed with AWS CloudFormation, the
     *            target IDs are CloudFormation stack IDs. Their target type is
     *            <code>cloudFormationTarget</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentTargetsRequest withTargetIds(String... targetIds) {
        if (getTargetIds() == null) {
            this.targetIds = new java.util.ArrayList<String>(targetIds.length);
        }
        for (String value : targetIds) {
            this.targetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The unique IDs of the deployment targets. The compute platform of the
     * deployment determines the type of the targets and their formats. The
     * maximum number of deployment target IDs you can specify is 25.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For deployments that use the EC2/On-premises compute platform, the target
     * IDs are EC2 or on-premises instances IDs, and their target type is
     * <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the AWS Lambda compute platform, the target IDs
     * are the names of Lambda functions, and their target type is
     * <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the Amazon ECS compute platform, the target IDs
     * are pairs of Amazon ECS clusters and services specified using the format
     * <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target type
     * is <code>ecsTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that are deployed with AWS CloudFormation, the target IDs
     * are CloudFormation stack IDs. Their target type is
     * <code>cloudFormationTarget</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetIds <p>
     *            The unique IDs of the deployment targets. The compute platform
     *            of the deployment determines the type of the targets and their
     *            formats. The maximum number of deployment target IDs you can
     *            specify is 25.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For deployments that use the EC2/On-premises compute platform,
     *            the target IDs are EC2 or on-premises instances IDs, and their
     *            target type is <code>instanceTarget</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For deployments that use the AWS Lambda compute platform, the
     *            target IDs are the names of Lambda functions, and their target
     *            type is <code>instanceTarget</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For deployments that use the Amazon ECS compute platform, the
     *            target IDs are pairs of Amazon ECS clusters and services
     *            specified using the format
     *            <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their
     *            target type is <code>ecsTarget</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For deployments that are deployed with AWS CloudFormation, the
     *            target IDs are CloudFormation stack IDs. Their target type is
     *            <code>cloudFormationTarget</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentTargetsRequest withTargetIds(java.util.Collection<String> targetIds) {
        setTargetIds(targetIds);
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
        if (getDeploymentId() != null)
            sb.append("deploymentId: " + getDeploymentId() + ",");
        if (getTargetIds() != null)
            sb.append("targetIds: " + getTargetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getTargetIds() == null) ? 0 : getTargetIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDeploymentTargetsRequest == false)
            return false;
        BatchGetDeploymentTargetsRequest other = (BatchGetDeploymentTargetsRequest) obj;

        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getTargetIds() == null ^ this.getTargetIds() == null)
            return false;
        if (other.getTargetIds() != null
                && other.getTargetIds().equals(this.getTargetIds()) == false)
            return false;
        return true;
    }
}
