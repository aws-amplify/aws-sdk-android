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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * The deployment controller to use for the service. For more information, see
 * <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
 * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 */
public class DeploymentController implements Serializable {
    /**
     * <p>
     * The deployment controller type to use.
     * </p>
     * <p>
     * There are three deployment controller types available:
     * </p>
     * <dl>
     * <dt>ECS</dt>
     * <dd>
     * <p>
     * The rolling update (<code>ECS</code>) deployment type involves replacing
     * the current running version of the container with the latest version. The
     * number of containers Amazon ECS adds or removes from the service during a
     * rolling update is controlled by adjusting the minimum and maximum number
     * of healthy tasks allowed during a service deployment, as specified in the
     * <a>DeploymentConfiguration</a>.
     * </p>
     * </dd>
     * <dt>CODE_DEPLOY</dt>
     * <dd>
     * <p>
     * The blue/green (<code>CODE_DEPLOY</code>) deployment type uses the
     * blue/green deployment model powered by AWS CodeDeploy, which allows you
     * to verify a new deployment of a service before sending production traffic
     * to it.
     * </p>
     * </dd>
     * <dt>EXTERNAL</dt>
     * <dd>
     * <p>
     * The external (<code>EXTERNAL</code>) deployment type enables you to use
     * any third-party deployment controller for full control over the
     * deployment process for an Amazon ECS service.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECS, CODE_DEPLOY, EXTERNAL
     */
    private String type;

    /**
     * <p>
     * The deployment controller type to use.
     * </p>
     * <p>
     * There are three deployment controller types available:
     * </p>
     * <dl>
     * <dt>ECS</dt>
     * <dd>
     * <p>
     * The rolling update (<code>ECS</code>) deployment type involves replacing
     * the current running version of the container with the latest version. The
     * number of containers Amazon ECS adds or removes from the service during a
     * rolling update is controlled by adjusting the minimum and maximum number
     * of healthy tasks allowed during a service deployment, as specified in the
     * <a>DeploymentConfiguration</a>.
     * </p>
     * </dd>
     * <dt>CODE_DEPLOY</dt>
     * <dd>
     * <p>
     * The blue/green (<code>CODE_DEPLOY</code>) deployment type uses the
     * blue/green deployment model powered by AWS CodeDeploy, which allows you
     * to verify a new deployment of a service before sending production traffic
     * to it.
     * </p>
     * </dd>
     * <dt>EXTERNAL</dt>
     * <dd>
     * <p>
     * The external (<code>EXTERNAL</code>) deployment type enables you to use
     * any third-party deployment controller for full control over the
     * deployment process for an Amazon ECS service.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECS, CODE_DEPLOY, EXTERNAL
     *
     * @return <p>
     *         The deployment controller type to use.
     *         </p>
     *         <p>
     *         There are three deployment controller types available:
     *         </p>
     *         <dl>
     *         <dt>ECS</dt>
     *         <dd>
     *         <p>
     *         The rolling update (<code>ECS</code>) deployment type involves
     *         replacing the current running version of the container with the
     *         latest version. The number of containers Amazon ECS adds or
     *         removes from the service during a rolling update is controlled by
     *         adjusting the minimum and maximum number of healthy tasks allowed
     *         during a service deployment, as specified in the
     *         <a>DeploymentConfiguration</a>.
     *         </p>
     *         </dd>
     *         <dt>CODE_DEPLOY</dt>
     *         <dd>
     *         <p>
     *         The blue/green (<code>CODE_DEPLOY</code>) deployment type uses
     *         the blue/green deployment model powered by AWS CodeDeploy, which
     *         allows you to verify a new deployment of a service before sending
     *         production traffic to it.
     *         </p>
     *         </dd>
     *         <dt>EXTERNAL</dt>
     *         <dd>
     *         <p>
     *         The external (<code>EXTERNAL</code>) deployment type enables you
     *         to use any third-party deployment controller for full control
     *         over the deployment process for an Amazon ECS service.
     *         </p>
     *         </dd>
     *         </dl>
     * @see DeploymentControllerType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The deployment controller type to use.
     * </p>
     * <p>
     * There are three deployment controller types available:
     * </p>
     * <dl>
     * <dt>ECS</dt>
     * <dd>
     * <p>
     * The rolling update (<code>ECS</code>) deployment type involves replacing
     * the current running version of the container with the latest version. The
     * number of containers Amazon ECS adds or removes from the service during a
     * rolling update is controlled by adjusting the minimum and maximum number
     * of healthy tasks allowed during a service deployment, as specified in the
     * <a>DeploymentConfiguration</a>.
     * </p>
     * </dd>
     * <dt>CODE_DEPLOY</dt>
     * <dd>
     * <p>
     * The blue/green (<code>CODE_DEPLOY</code>) deployment type uses the
     * blue/green deployment model powered by AWS CodeDeploy, which allows you
     * to verify a new deployment of a service before sending production traffic
     * to it.
     * </p>
     * </dd>
     * <dt>EXTERNAL</dt>
     * <dd>
     * <p>
     * The external (<code>EXTERNAL</code>) deployment type enables you to use
     * any third-party deployment controller for full control over the
     * deployment process for an Amazon ECS service.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECS, CODE_DEPLOY, EXTERNAL
     *
     * @param type <p>
     *            The deployment controller type to use.
     *            </p>
     *            <p>
     *            There are three deployment controller types available:
     *            </p>
     *            <dl>
     *            <dt>ECS</dt>
     *            <dd>
     *            <p>
     *            The rolling update (<code>ECS</code>) deployment type involves
     *            replacing the current running version of the container with
     *            the latest version. The number of containers Amazon ECS adds
     *            or removes from the service during a rolling update is
     *            controlled by adjusting the minimum and maximum number of
     *            healthy tasks allowed during a service deployment, as
     *            specified in the <a>DeploymentConfiguration</a>.
     *            </p>
     *            </dd>
     *            <dt>CODE_DEPLOY</dt>
     *            <dd>
     *            <p>
     *            The blue/green (<code>CODE_DEPLOY</code>) deployment type uses
     *            the blue/green deployment model powered by AWS CodeDeploy,
     *            which allows you to verify a new deployment of a service
     *            before sending production traffic to it.
     *            </p>
     *            </dd>
     *            <dt>EXTERNAL</dt>
     *            <dd>
     *            <p>
     *            The external (<code>EXTERNAL</code>) deployment type enables
     *            you to use any third-party deployment controller for full
     *            control over the deployment process for an Amazon ECS service.
     *            </p>
     *            </dd>
     *            </dl>
     * @see DeploymentControllerType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The deployment controller type to use.
     * </p>
     * <p>
     * There are three deployment controller types available:
     * </p>
     * <dl>
     * <dt>ECS</dt>
     * <dd>
     * <p>
     * The rolling update (<code>ECS</code>) deployment type involves replacing
     * the current running version of the container with the latest version. The
     * number of containers Amazon ECS adds or removes from the service during a
     * rolling update is controlled by adjusting the minimum and maximum number
     * of healthy tasks allowed during a service deployment, as specified in the
     * <a>DeploymentConfiguration</a>.
     * </p>
     * </dd>
     * <dt>CODE_DEPLOY</dt>
     * <dd>
     * <p>
     * The blue/green (<code>CODE_DEPLOY</code>) deployment type uses the
     * blue/green deployment model powered by AWS CodeDeploy, which allows you
     * to verify a new deployment of a service before sending production traffic
     * to it.
     * </p>
     * </dd>
     * <dt>EXTERNAL</dt>
     * <dd>
     * <p>
     * The external (<code>EXTERNAL</code>) deployment type enables you to use
     * any third-party deployment controller for full control over the
     * deployment process for an Amazon ECS service.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECS, CODE_DEPLOY, EXTERNAL
     *
     * @param type <p>
     *            The deployment controller type to use.
     *            </p>
     *            <p>
     *            There are three deployment controller types available:
     *            </p>
     *            <dl>
     *            <dt>ECS</dt>
     *            <dd>
     *            <p>
     *            The rolling update (<code>ECS</code>) deployment type involves
     *            replacing the current running version of the container with
     *            the latest version. The number of containers Amazon ECS adds
     *            or removes from the service during a rolling update is
     *            controlled by adjusting the minimum and maximum number of
     *            healthy tasks allowed during a service deployment, as
     *            specified in the <a>DeploymentConfiguration</a>.
     *            </p>
     *            </dd>
     *            <dt>CODE_DEPLOY</dt>
     *            <dd>
     *            <p>
     *            The blue/green (<code>CODE_DEPLOY</code>) deployment type uses
     *            the blue/green deployment model powered by AWS CodeDeploy,
     *            which allows you to verify a new deployment of a service
     *            before sending production traffic to it.
     *            </p>
     *            </dd>
     *            <dt>EXTERNAL</dt>
     *            <dd>
     *            <p>
     *            The external (<code>EXTERNAL</code>) deployment type enables
     *            you to use any third-party deployment controller for full
     *            control over the deployment process for an Amazon ECS service.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentControllerType
     */
    public DeploymentController withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The deployment controller type to use.
     * </p>
     * <p>
     * There are three deployment controller types available:
     * </p>
     * <dl>
     * <dt>ECS</dt>
     * <dd>
     * <p>
     * The rolling update (<code>ECS</code>) deployment type involves replacing
     * the current running version of the container with the latest version. The
     * number of containers Amazon ECS adds or removes from the service during a
     * rolling update is controlled by adjusting the minimum and maximum number
     * of healthy tasks allowed during a service deployment, as specified in the
     * <a>DeploymentConfiguration</a>.
     * </p>
     * </dd>
     * <dt>CODE_DEPLOY</dt>
     * <dd>
     * <p>
     * The blue/green (<code>CODE_DEPLOY</code>) deployment type uses the
     * blue/green deployment model powered by AWS CodeDeploy, which allows you
     * to verify a new deployment of a service before sending production traffic
     * to it.
     * </p>
     * </dd>
     * <dt>EXTERNAL</dt>
     * <dd>
     * <p>
     * The external (<code>EXTERNAL</code>) deployment type enables you to use
     * any third-party deployment controller for full control over the
     * deployment process for an Amazon ECS service.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECS, CODE_DEPLOY, EXTERNAL
     *
     * @param type <p>
     *            The deployment controller type to use.
     *            </p>
     *            <p>
     *            There are three deployment controller types available:
     *            </p>
     *            <dl>
     *            <dt>ECS</dt>
     *            <dd>
     *            <p>
     *            The rolling update (<code>ECS</code>) deployment type involves
     *            replacing the current running version of the container with
     *            the latest version. The number of containers Amazon ECS adds
     *            or removes from the service during a rolling update is
     *            controlled by adjusting the minimum and maximum number of
     *            healthy tasks allowed during a service deployment, as
     *            specified in the <a>DeploymentConfiguration</a>.
     *            </p>
     *            </dd>
     *            <dt>CODE_DEPLOY</dt>
     *            <dd>
     *            <p>
     *            The blue/green (<code>CODE_DEPLOY</code>) deployment type uses
     *            the blue/green deployment model powered by AWS CodeDeploy,
     *            which allows you to verify a new deployment of a service
     *            before sending production traffic to it.
     *            </p>
     *            </dd>
     *            <dt>EXTERNAL</dt>
     *            <dd>
     *            <p>
     *            The external (<code>EXTERNAL</code>) deployment type enables
     *            you to use any third-party deployment controller for full
     *            control over the deployment process for an Amazon ECS service.
     *            </p>
     *            </dd>
     *            </dl>
     * @see DeploymentControllerType
     */
    public void setType(DeploymentControllerType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The deployment controller type to use.
     * </p>
     * <p>
     * There are three deployment controller types available:
     * </p>
     * <dl>
     * <dt>ECS</dt>
     * <dd>
     * <p>
     * The rolling update (<code>ECS</code>) deployment type involves replacing
     * the current running version of the container with the latest version. The
     * number of containers Amazon ECS adds or removes from the service during a
     * rolling update is controlled by adjusting the minimum and maximum number
     * of healthy tasks allowed during a service deployment, as specified in the
     * <a>DeploymentConfiguration</a>.
     * </p>
     * </dd>
     * <dt>CODE_DEPLOY</dt>
     * <dd>
     * <p>
     * The blue/green (<code>CODE_DEPLOY</code>) deployment type uses the
     * blue/green deployment model powered by AWS CodeDeploy, which allows you
     * to verify a new deployment of a service before sending production traffic
     * to it.
     * </p>
     * </dd>
     * <dt>EXTERNAL</dt>
     * <dd>
     * <p>
     * The external (<code>EXTERNAL</code>) deployment type enables you to use
     * any third-party deployment controller for full control over the
     * deployment process for an Amazon ECS service.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECS, CODE_DEPLOY, EXTERNAL
     *
     * @param type <p>
     *            The deployment controller type to use.
     *            </p>
     *            <p>
     *            There are three deployment controller types available:
     *            </p>
     *            <dl>
     *            <dt>ECS</dt>
     *            <dd>
     *            <p>
     *            The rolling update (<code>ECS</code>) deployment type involves
     *            replacing the current running version of the container with
     *            the latest version. The number of containers Amazon ECS adds
     *            or removes from the service during a rolling update is
     *            controlled by adjusting the minimum and maximum number of
     *            healthy tasks allowed during a service deployment, as
     *            specified in the <a>DeploymentConfiguration</a>.
     *            </p>
     *            </dd>
     *            <dt>CODE_DEPLOY</dt>
     *            <dd>
     *            <p>
     *            The blue/green (<code>CODE_DEPLOY</code>) deployment type uses
     *            the blue/green deployment model powered by AWS CodeDeploy,
     *            which allows you to verify a new deployment of a service
     *            before sending production traffic to it.
     *            </p>
     *            </dd>
     *            <dt>EXTERNAL</dt>
     *            <dd>
     *            <p>
     *            The external (<code>EXTERNAL</code>) deployment type enables
     *            you to use any third-party deployment controller for full
     *            control over the deployment process for an Amazon ECS service.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentControllerType
     */
    public DeploymentController withType(DeploymentControllerType type) {
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
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentController == false)
            return false;
        DeploymentController other = (DeploymentController) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
