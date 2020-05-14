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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

/**
 * <p>
 * A schedule configures how often and when a pipeline will automatically create
 * a new image.
 * </p>
 */
public class Schedule implements Serializable {
    /**
     * <p>
     * The expression determines how often EC2 Image Builder evaluates your
     * <code>pipelineExecutionStartCondition</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String scheduleExpression;

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image
     * build. When the <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image
     * Builder will build a new image only when there are known changes pending.
     * When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new
     * image every time the CRON expression matches the current time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPRESSION_MATCH_ONLY,
     * EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE
     */
    private String pipelineExecutionStartCondition;

    /**
     * <p>
     * The expression determines how often EC2 Image Builder evaluates your
     * <code>pipelineExecutionStartCondition</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The expression determines how often EC2 Image Builder evaluates
     *         your <code>pipelineExecutionStartCondition</code>.
     *         </p>
     */
    public String getScheduleExpression() {
        return scheduleExpression;
    }

    /**
     * <p>
     * The expression determines how often EC2 Image Builder evaluates your
     * <code>pipelineExecutionStartCondition</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param scheduleExpression <p>
     *            The expression determines how often EC2 Image Builder
     *            evaluates your <code>pipelineExecutionStartCondition</code>.
     *            </p>
     */
    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The expression determines how often EC2 Image Builder evaluates your
     * <code>pipelineExecutionStartCondition</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param scheduleExpression <p>
     *            The expression determines how often EC2 Image Builder
     *            evaluates your <code>pipelineExecutionStartCondition</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image
     * build. When the <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image
     * Builder will build a new image only when there are known changes pending.
     * When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new
     * image every time the CRON expression matches the current time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPRESSION_MATCH_ONLY,
     * EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE
     *
     * @return <p>
     *         The condition configures when the pipeline should trigger a new
     *         image build. When the
     *         <code>pipelineExecutionStartCondition</code> is set to
     *         <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>,
     *         EC2 Image Builder will build a new image only when there are
     *         known changes pending. When it is set to
     *         <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image
     *         every time the CRON expression matches the current time.
     *         </p>
     * @see PipelineExecutionStartCondition
     */
    public String getPipelineExecutionStartCondition() {
        return pipelineExecutionStartCondition;
    }

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image
     * build. When the <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image
     * Builder will build a new image only when there are known changes pending.
     * When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new
     * image every time the CRON expression matches the current time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPRESSION_MATCH_ONLY,
     * EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE
     *
     * @param pipelineExecutionStartCondition <p>
     *            The condition configures when the pipeline should trigger a
     *            new image build. When the
     *            <code>pipelineExecutionStartCondition</code> is set to
     *            <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>
     *            , EC2 Image Builder will build a new image only when there are
     *            known changes pending. When it is set to
     *            <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image
     *            every time the CRON expression matches the current time.
     *            </p>
     * @see PipelineExecutionStartCondition
     */
    public void setPipelineExecutionStartCondition(String pipelineExecutionStartCondition) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
    }

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image
     * build. When the <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image
     * Builder will build a new image only when there are known changes pending.
     * When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new
     * image every time the CRON expression matches the current time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPRESSION_MATCH_ONLY,
     * EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE
     *
     * @param pipelineExecutionStartCondition <p>
     *            The condition configures when the pipeline should trigger a
     *            new image build. When the
     *            <code>pipelineExecutionStartCondition</code> is set to
     *            <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>
     *            , EC2 Image Builder will build a new image only when there are
     *            known changes pending. When it is set to
     *            <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image
     *            every time the CRON expression matches the current time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PipelineExecutionStartCondition
     */
    public Schedule withPipelineExecutionStartCondition(String pipelineExecutionStartCondition) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
        return this;
    }

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image
     * build. When the <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image
     * Builder will build a new image only when there are known changes pending.
     * When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new
     * image every time the CRON expression matches the current time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPRESSION_MATCH_ONLY,
     * EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE
     *
     * @param pipelineExecutionStartCondition <p>
     *            The condition configures when the pipeline should trigger a
     *            new image build. When the
     *            <code>pipelineExecutionStartCondition</code> is set to
     *            <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>
     *            , EC2 Image Builder will build a new image only when there are
     *            known changes pending. When it is set to
     *            <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image
     *            every time the CRON expression matches the current time.
     *            </p>
     * @see PipelineExecutionStartCondition
     */
    public void setPipelineExecutionStartCondition(
            PipelineExecutionStartCondition pipelineExecutionStartCondition) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition.toString();
    }

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image
     * build. When the <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image
     * Builder will build a new image only when there are known changes pending.
     * When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new
     * image every time the CRON expression matches the current time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPRESSION_MATCH_ONLY,
     * EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE
     *
     * @param pipelineExecutionStartCondition <p>
     *            The condition configures when the pipeline should trigger a
     *            new image build. When the
     *            <code>pipelineExecutionStartCondition</code> is set to
     *            <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>
     *            , EC2 Image Builder will build a new image only when there are
     *            known changes pending. When it is set to
     *            <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image
     *            every time the CRON expression matches the current time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PipelineExecutionStartCondition
     */
    public Schedule withPipelineExecutionStartCondition(
            PipelineExecutionStartCondition pipelineExecutionStartCondition) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition.toString();
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
        if (getScheduleExpression() != null)
            sb.append("scheduleExpression: " + getScheduleExpression() + ",");
        if (getPipelineExecutionStartCondition() != null)
            sb.append("pipelineExecutionStartCondition: " + getPipelineExecutionStartCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime
                * hashCode
                + ((getPipelineExecutionStartCondition() == null) ? 0
                        : getPipelineExecutionStartCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schedule == false)
            return false;
        Schedule other = (Schedule) obj;

        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null
                && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getPipelineExecutionStartCondition() == null
                ^ this.getPipelineExecutionStartCondition() == null)
            return false;
        if (other.getPipelineExecutionStartCondition() != null
                && other.getPipelineExecutionStartCondition().equals(
                        this.getPipelineExecutionStartCondition()) == false)
            return false;
        return true;
    }
}
