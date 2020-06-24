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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * This represents a step in a cluster.
 * </p>
 */
public class Step implements Serializable {
    /**
     * <p>
     * The identifier of the cluster step.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name of the cluster step.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Hadoop job configuration of the cluster step.
     * </p>
     */
    private HadoopStepConfig config;

    /**
     * <p>
     * The action to take when the cluster step fails. Possible values are
     * TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is
     * provided for backward compatibility. We recommend using TERMINATE_CLUSTER
     * instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, TERMINATE_CLUSTER,
     * CANCEL_AND_WAIT, CONTINUE
     */
    private String actionOnFailure;

    /**
     * <p>
     * The current execution status details of the cluster step.
     * </p>
     */
    private StepStatus status;

    /**
     * <p>
     * The identifier of the cluster step.
     * </p>
     *
     * @return <p>
     *         The identifier of the cluster step.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the cluster step.
     * </p>
     *
     * @param id <p>
     *            The identifier of the cluster step.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the cluster step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of the cluster step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the cluster step.
     * </p>
     *
     * @return <p>
     *         The name of the cluster step.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the cluster step.
     * </p>
     *
     * @param name <p>
     *            The name of the cluster step.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cluster step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the cluster step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Hadoop job configuration of the cluster step.
     * </p>
     *
     * @return <p>
     *         The Hadoop job configuration of the cluster step.
     *         </p>
     */
    public HadoopStepConfig getConfig() {
        return config;
    }

    /**
     * <p>
     * The Hadoop job configuration of the cluster step.
     * </p>
     *
     * @param config <p>
     *            The Hadoop job configuration of the cluster step.
     *            </p>
     */
    public void setConfig(HadoopStepConfig config) {
        this.config = config;
    }

    /**
     * <p>
     * The Hadoop job configuration of the cluster step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param config <p>
     *            The Hadoop job configuration of the cluster step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withConfig(HadoopStepConfig config) {
        this.config = config;
        return this;
    }

    /**
     * <p>
     * The action to take when the cluster step fails. Possible values are
     * TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is
     * provided for backward compatibility. We recommend using TERMINATE_CLUSTER
     * instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, TERMINATE_CLUSTER,
     * CANCEL_AND_WAIT, CONTINUE
     *
     * @return <p>
     *         The action to take when the cluster step fails. Possible values
     *         are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE.
     *         TERMINATE_JOB_FLOW is provided for backward compatibility. We
     *         recommend using TERMINATE_CLUSTER instead.
     *         </p>
     * @see ActionOnFailure
     */
    public String getActionOnFailure() {
        return actionOnFailure;
    }

    /**
     * <p>
     * The action to take when the cluster step fails. Possible values are
     * TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is
     * provided for backward compatibility. We recommend using TERMINATE_CLUSTER
     * instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, TERMINATE_CLUSTER,
     * CANCEL_AND_WAIT, CONTINUE
     *
     * @param actionOnFailure <p>
     *            The action to take when the cluster step fails. Possible
     *            values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE.
     *            TERMINATE_JOB_FLOW is provided for backward compatibility. We
     *            recommend using TERMINATE_CLUSTER instead.
     *            </p>
     * @see ActionOnFailure
     */
    public void setActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
    }

    /**
     * <p>
     * The action to take when the cluster step fails. Possible values are
     * TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is
     * provided for backward compatibility. We recommend using TERMINATE_CLUSTER
     * instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, TERMINATE_CLUSTER,
     * CANCEL_AND_WAIT, CONTINUE
     *
     * @param actionOnFailure <p>
     *            The action to take when the cluster step fails. Possible
     *            values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE.
     *            TERMINATE_JOB_FLOW is provided for backward compatibility. We
     *            recommend using TERMINATE_CLUSTER instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionOnFailure
     */
    public Step withActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
        return this;
    }

    /**
     * <p>
     * The action to take when the cluster step fails. Possible values are
     * TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is
     * provided for backward compatibility. We recommend using TERMINATE_CLUSTER
     * instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, TERMINATE_CLUSTER,
     * CANCEL_AND_WAIT, CONTINUE
     *
     * @param actionOnFailure <p>
     *            The action to take when the cluster step fails. Possible
     *            values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE.
     *            TERMINATE_JOB_FLOW is provided for backward compatibility. We
     *            recommend using TERMINATE_CLUSTER instead.
     *            </p>
     * @see ActionOnFailure
     */
    public void setActionOnFailure(ActionOnFailure actionOnFailure) {
        this.actionOnFailure = actionOnFailure.toString();
    }

    /**
     * <p>
     * The action to take when the cluster step fails. Possible values are
     * TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is
     * provided for backward compatibility. We recommend using TERMINATE_CLUSTER
     * instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, TERMINATE_CLUSTER,
     * CANCEL_AND_WAIT, CONTINUE
     *
     * @param actionOnFailure <p>
     *            The action to take when the cluster step fails. Possible
     *            values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE.
     *            TERMINATE_JOB_FLOW is provided for backward compatibility. We
     *            recommend using TERMINATE_CLUSTER instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionOnFailure
     */
    public Step withActionOnFailure(ActionOnFailure actionOnFailure) {
        this.actionOnFailure = actionOnFailure.toString();
        return this;
    }

    /**
     * <p>
     * The current execution status details of the cluster step.
     * </p>
     *
     * @return <p>
     *         The current execution status details of the cluster step.
     *         </p>
     */
    public StepStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current execution status details of the cluster step.
     * </p>
     *
     * @param status <p>
     *            The current execution status details of the cluster step.
     *            </p>
     */
    public void setStatus(StepStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current execution status details of the cluster step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current execution status details of the cluster step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withStatus(StepStatus status) {
        this.status = status;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getConfig() != null)
            sb.append("Config: " + getConfig() + ",");
        if (getActionOnFailure() != null)
            sb.append("ActionOnFailure: " + getActionOnFailure() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        hashCode = prime * hashCode
                + ((getActionOnFailure() == null) ? 0 : getActionOnFailure().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Step == false)
            return false;
        Step other = (Step) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        if (other.getActionOnFailure() == null ^ this.getActionOnFailure() == null)
            return false;
        if (other.getActionOnFailure() != null
                && other.getActionOnFailure().equals(this.getActionOnFailure()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
