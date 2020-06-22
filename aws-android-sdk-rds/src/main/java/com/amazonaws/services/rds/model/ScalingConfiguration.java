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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the scaling configuration of an Aurora Serverless DB cluster.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
 * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 */
public class ScalingConfiguration implements Serializable {
    /**
     * <p>
     * The minimum capacity for an Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     * <p>
     * For Aurora MySQL, valid capacity values are <code>1</code>,
     * <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     * <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>192</code>, and <code>384</code>.
     * </p>
     * <p>
     * The minimum capacity must be less than or equal to the maximum capacity.
     * </p>
     */
    private Integer minCapacity;

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     * <p>
     * For Aurora MySQL, valid capacity values are <code>1</code>,
     * <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     * <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>192</code>, and <code>384</code>.
     * </p>
     * <p>
     * The maximum capacity must be greater than or equal to the minimum
     * capacity.
     * </p>
     */
    private Integer maxCapacity;

    /**
     * <p>
     * A value that indicates whether to allow or disallow automatic pause for
     * an Aurora DB cluster in <code>serverless</code> DB engine mode. A DB
     * cluster can be paused only when it's idle (it has no connections).
     * </p>
     * <note>
     * <p>
     * If a DB cluster is paused for more than seven days, the DB cluster might
     * be backed up with a snapshot. In this case, the DB cluster is restored
     * when there is a request to connect to it.
     * </p>
     * </note>
     */
    private Boolean autoPause;

    /**
     * <p>
     * The time, in seconds, before an Aurora DB cluster in
     * <code>serverless</code> mode is paused.
     * </p>
     */
    private Integer secondsUntilAutoPause;

    /**
     * <p>
     * The action to take when the timeout is reached, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code> sets the capacity to the specified
     * value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code>, the default, ignores the capacity
     * change if a scaling point isn't found in the timeout period.
     * </p>
     * <important>
     * <p>
     * If you specify <code>ForceApplyCapacityChange</code>, connections that
     * prevent Aurora Serverless from finding a scaling point might be dropped.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     */
    private String timeoutAction;

    /**
     * <p>
     * The minimum capacity for an Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     * <p>
     * For Aurora MySQL, valid capacity values are <code>1</code>,
     * <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     * <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>192</code>, and <code>384</code>.
     * </p>
     * <p>
     * The minimum capacity must be less than or equal to the maximum capacity.
     * </p>
     *
     * @return <p>
     *         The minimum capacity for an Aurora DB cluster in
     *         <code>serverless</code> DB engine mode.
     *         </p>
     *         <p>
     *         For Aurora MySQL, valid capacity values are <code>1</code>,
     *         <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     *         <code>32</code>, <code>64</code>, <code>128</code>, and
     *         <code>256</code>.
     *         </p>
     *         <p>
     *         For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     *         <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     *         <code>64</code>, <code>192</code>, and <code>384</code>.
     *         </p>
     *         <p>
     *         The minimum capacity must be less than or equal to the maximum
     *         capacity.
     *         </p>
     */
    public Integer getMinCapacity() {
        return minCapacity;
    }

    /**
     * <p>
     * The minimum capacity for an Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     * <p>
     * For Aurora MySQL, valid capacity values are <code>1</code>,
     * <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     * <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>192</code>, and <code>384</code>.
     * </p>
     * <p>
     * The minimum capacity must be less than or equal to the maximum capacity.
     * </p>
     *
     * @param minCapacity <p>
     *            The minimum capacity for an Aurora DB cluster in
     *            <code>serverless</code> DB engine mode.
     *            </p>
     *            <p>
     *            For Aurora MySQL, valid capacity values are <code>1</code>,
     *            <code>2</code>, <code>4</code>, <code>8</code>,
     *            <code>16</code>, <code>32</code>, <code>64</code>,
     *            <code>128</code>, and <code>256</code>.
     *            </p>
     *            <p>
     *            For Aurora PostgreSQL, valid capacity values are
     *            <code>2</code>, <code>4</code>, <code>8</code>,
     *            <code>16</code>, <code>32</code>, <code>64</code>,
     *            <code>192</code>, and <code>384</code>.
     *            </p>
     *            <p>
     *            The minimum capacity must be less than or equal to the maximum
     *            capacity.
     *            </p>
     */
    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>
     * The minimum capacity for an Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     * <p>
     * For Aurora MySQL, valid capacity values are <code>1</code>,
     * <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     * <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>192</code>, and <code>384</code>.
     * </p>
     * <p>
     * The minimum capacity must be less than or equal to the maximum capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minCapacity <p>
     *            The minimum capacity for an Aurora DB cluster in
     *            <code>serverless</code> DB engine mode.
     *            </p>
     *            <p>
     *            For Aurora MySQL, valid capacity values are <code>1</code>,
     *            <code>2</code>, <code>4</code>, <code>8</code>,
     *            <code>16</code>, <code>32</code>, <code>64</code>,
     *            <code>128</code>, and <code>256</code>.
     *            </p>
     *            <p>
     *            For Aurora PostgreSQL, valid capacity values are
     *            <code>2</code>, <code>4</code>, <code>8</code>,
     *            <code>16</code>, <code>32</code>, <code>64</code>,
     *            <code>192</code>, and <code>384</code>.
     *            </p>
     *            <p>
     *            The minimum capacity must be less than or equal to the maximum
     *            capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingConfiguration withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     * <p>
     * For Aurora MySQL, valid capacity values are <code>1</code>,
     * <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     * <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>192</code>, and <code>384</code>.
     * </p>
     * <p>
     * The maximum capacity must be greater than or equal to the minimum
     * capacity.
     * </p>
     *
     * @return <p>
     *         The maximum capacity for an Aurora DB cluster in
     *         <code>serverless</code> DB engine mode.
     *         </p>
     *         <p>
     *         For Aurora MySQL, valid capacity values are <code>1</code>,
     *         <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     *         <code>32</code>, <code>64</code>, <code>128</code>, and
     *         <code>256</code>.
     *         </p>
     *         <p>
     *         For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     *         <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     *         <code>64</code>, <code>192</code>, and <code>384</code>.
     *         </p>
     *         <p>
     *         The maximum capacity must be greater than or equal to the minimum
     *         capacity.
     *         </p>
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     * <p>
     * For Aurora MySQL, valid capacity values are <code>1</code>,
     * <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     * <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>192</code>, and <code>384</code>.
     * </p>
     * <p>
     * The maximum capacity must be greater than or equal to the minimum
     * capacity.
     * </p>
     *
     * @param maxCapacity <p>
     *            The maximum capacity for an Aurora DB cluster in
     *            <code>serverless</code> DB engine mode.
     *            </p>
     *            <p>
     *            For Aurora MySQL, valid capacity values are <code>1</code>,
     *            <code>2</code>, <code>4</code>, <code>8</code>,
     *            <code>16</code>, <code>32</code>, <code>64</code>,
     *            <code>128</code>, and <code>256</code>.
     *            </p>
     *            <p>
     *            For Aurora PostgreSQL, valid capacity values are
     *            <code>2</code>, <code>4</code>, <code>8</code>,
     *            <code>16</code>, <code>32</code>, <code>64</code>,
     *            <code>192</code>, and <code>384</code>.
     *            </p>
     *            <p>
     *            The maximum capacity must be greater than or equal to the
     *            minimum capacity.
     *            </p>
     */
    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     * <p>
     * For Aurora MySQL, valid capacity values are <code>1</code>,
     * <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     * <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>192</code>, and <code>384</code>.
     * </p>
     * <p>
     * The maximum capacity must be greater than or equal to the minimum
     * capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxCapacity <p>
     *            The maximum capacity for an Aurora DB cluster in
     *            <code>serverless</code> DB engine mode.
     *            </p>
     *            <p>
     *            For Aurora MySQL, valid capacity values are <code>1</code>,
     *            <code>2</code>, <code>4</code>, <code>8</code>,
     *            <code>16</code>, <code>32</code>, <code>64</code>,
     *            <code>128</code>, and <code>256</code>.
     *            </p>
     *            <p>
     *            For Aurora PostgreSQL, valid capacity values are
     *            <code>2</code>, <code>4</code>, <code>8</code>,
     *            <code>16</code>, <code>32</code>, <code>64</code>,
     *            <code>192</code>, and <code>384</code>.
     *            </p>
     *            <p>
     *            The maximum capacity must be greater than or equal to the
     *            minimum capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingConfiguration withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to allow or disallow automatic pause for
     * an Aurora DB cluster in <code>serverless</code> DB engine mode. A DB
     * cluster can be paused only when it's idle (it has no connections).
     * </p>
     * <note>
     * <p>
     * If a DB cluster is paused for more than seven days, the DB cluster might
     * be backed up with a snapshot. In this case, the DB cluster is restored
     * when there is a request to connect to it.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that indicates whether to allow or disallow automatic
     *         pause for an Aurora DB cluster in <code>serverless</code> DB
     *         engine mode. A DB cluster can be paused only when it's idle (it
     *         has no connections).
     *         </p>
     *         <note>
     *         <p>
     *         If a DB cluster is paused for more than seven days, the DB
     *         cluster might be backed up with a snapshot. In this case, the DB
     *         cluster is restored when there is a request to connect to it.
     *         </p>
     *         </note>
     */
    public Boolean isAutoPause() {
        return autoPause;
    }

    /**
     * <p>
     * A value that indicates whether to allow or disallow automatic pause for
     * an Aurora DB cluster in <code>serverless</code> DB engine mode. A DB
     * cluster can be paused only when it's idle (it has no connections).
     * </p>
     * <note>
     * <p>
     * If a DB cluster is paused for more than seven days, the DB cluster might
     * be backed up with a snapshot. In this case, the DB cluster is restored
     * when there is a request to connect to it.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that indicates whether to allow or disallow automatic
     *         pause for an Aurora DB cluster in <code>serverless</code> DB
     *         engine mode. A DB cluster can be paused only when it's idle (it
     *         has no connections).
     *         </p>
     *         <note>
     *         <p>
     *         If a DB cluster is paused for more than seven days, the DB
     *         cluster might be backed up with a snapshot. In this case, the DB
     *         cluster is restored when there is a request to connect to it.
     *         </p>
     *         </note>
     */
    public Boolean getAutoPause() {
        return autoPause;
    }

    /**
     * <p>
     * A value that indicates whether to allow or disallow automatic pause for
     * an Aurora DB cluster in <code>serverless</code> DB engine mode. A DB
     * cluster can be paused only when it's idle (it has no connections).
     * </p>
     * <note>
     * <p>
     * If a DB cluster is paused for more than seven days, the DB cluster might
     * be backed up with a snapshot. In this case, the DB cluster is restored
     * when there is a request to connect to it.
     * </p>
     * </note>
     *
     * @param autoPause <p>
     *            A value that indicates whether to allow or disallow automatic
     *            pause for an Aurora DB cluster in <code>serverless</code> DB
     *            engine mode. A DB cluster can be paused only when it's idle
     *            (it has no connections).
     *            </p>
     *            <note>
     *            <p>
     *            If a DB cluster is paused for more than seven days, the DB
     *            cluster might be backed up with a snapshot. In this case, the
     *            DB cluster is restored when there is a request to connect to
     *            it.
     *            </p>
     *            </note>
     */
    public void setAutoPause(Boolean autoPause) {
        this.autoPause = autoPause;
    }

    /**
     * <p>
     * A value that indicates whether to allow or disallow automatic pause for
     * an Aurora DB cluster in <code>serverless</code> DB engine mode. A DB
     * cluster can be paused only when it's idle (it has no connections).
     * </p>
     * <note>
     * <p>
     * If a DB cluster is paused for more than seven days, the DB cluster might
     * be backed up with a snapshot. In this case, the DB cluster is restored
     * when there is a request to connect to it.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoPause <p>
     *            A value that indicates whether to allow or disallow automatic
     *            pause for an Aurora DB cluster in <code>serverless</code> DB
     *            engine mode. A DB cluster can be paused only when it's idle
     *            (it has no connections).
     *            </p>
     *            <note>
     *            <p>
     *            If a DB cluster is paused for more than seven days, the DB
     *            cluster might be backed up with a snapshot. In this case, the
     *            DB cluster is restored when there is a request to connect to
     *            it.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingConfiguration withAutoPause(Boolean autoPause) {
        this.autoPause = autoPause;
        return this;
    }

    /**
     * <p>
     * The time, in seconds, before an Aurora DB cluster in
     * <code>serverless</code> mode is paused.
     * </p>
     *
     * @return <p>
     *         The time, in seconds, before an Aurora DB cluster in
     *         <code>serverless</code> mode is paused.
     *         </p>
     */
    public Integer getSecondsUntilAutoPause() {
        return secondsUntilAutoPause;
    }

    /**
     * <p>
     * The time, in seconds, before an Aurora DB cluster in
     * <code>serverless</code> mode is paused.
     * </p>
     *
     * @param secondsUntilAutoPause <p>
     *            The time, in seconds, before an Aurora DB cluster in
     *            <code>serverless</code> mode is paused.
     *            </p>
     */
    public void setSecondsUntilAutoPause(Integer secondsUntilAutoPause) {
        this.secondsUntilAutoPause = secondsUntilAutoPause;
    }

    /**
     * <p>
     * The time, in seconds, before an Aurora DB cluster in
     * <code>serverless</code> mode is paused.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondsUntilAutoPause <p>
     *            The time, in seconds, before an Aurora DB cluster in
     *            <code>serverless</code> mode is paused.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingConfiguration withSecondsUntilAutoPause(Integer secondsUntilAutoPause) {
        this.secondsUntilAutoPause = secondsUntilAutoPause;
        return this;
    }

    /**
     * <p>
     * The action to take when the timeout is reached, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code> sets the capacity to the specified
     * value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code>, the default, ignores the capacity
     * change if a scaling point isn't found in the timeout period.
     * </p>
     * <important>
     * <p>
     * If you specify <code>ForceApplyCapacityChange</code>, connections that
     * prevent Aurora Serverless from finding a scaling point might be dropped.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The action to take when the timeout is reached, either
     *         <code>ForceApplyCapacityChange</code> or
     *         <code>RollbackCapacityChange</code>.
     *         </p>
     *         <p>
     *         <code>ForceApplyCapacityChange</code> sets the capacity to the
     *         specified value as soon as possible.
     *         </p>
     *         <p>
     *         <code>RollbackCapacityChange</code>, the default, ignores the
     *         capacity change if a scaling point isn't found in the timeout
     *         period.
     *         </p>
     *         <important>
     *         <p>
     *         If you specify <code>ForceApplyCapacityChange</code>, connections
     *         that prevent Aurora Serverless from finding a scaling point might
     *         be dropped.
     *         </p>
     *         </important>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     *         > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora
     *         User Guide</i>.
     *         </p>
     */
    public String getTimeoutAction() {
        return timeoutAction;
    }

    /**
     * <p>
     * The action to take when the timeout is reached, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code> sets the capacity to the specified
     * value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code>, the default, ignores the capacity
     * change if a scaling point isn't found in the timeout period.
     * </p>
     * <important>
     * <p>
     * If you specify <code>ForceApplyCapacityChange</code>, connections that
     * prevent Aurora Serverless from finding a scaling point might be dropped.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     *
     * @param timeoutAction <p>
     *            The action to take when the timeout is reached, either
     *            <code>ForceApplyCapacityChange</code> or
     *            <code>RollbackCapacityChange</code>.
     *            </p>
     *            <p>
     *            <code>ForceApplyCapacityChange</code> sets the capacity to the
     *            specified value as soon as possible.
     *            </p>
     *            <p>
     *            <code>RollbackCapacityChange</code>, the default, ignores the
     *            capacity change if a scaling point isn't found in the timeout
     *            period.
     *            </p>
     *            <important>
     *            <p>
     *            If you specify <code>ForceApplyCapacityChange</code>,
     *            connections that prevent Aurora Serverless from finding a
     *            scaling point might be dropped.
     *            </p>
     *            </important>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     *            > Autoscaling for Aurora Serverless</a> in the <i>Amazon
     *            Aurora User Guide</i>.
     *            </p>
     */
    public void setTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    /**
     * <p>
     * The action to take when the timeout is reached, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code> sets the capacity to the specified
     * value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code>, the default, ignores the capacity
     * change if a scaling point isn't found in the timeout period.
     * </p>
     * <important>
     * <p>
     * If you specify <code>ForceApplyCapacityChange</code>, connections that
     * prevent Aurora Serverless from finding a scaling point might be dropped.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeoutAction <p>
     *            The action to take when the timeout is reached, either
     *            <code>ForceApplyCapacityChange</code> or
     *            <code>RollbackCapacityChange</code>.
     *            </p>
     *            <p>
     *            <code>ForceApplyCapacityChange</code> sets the capacity to the
     *            specified value as soon as possible.
     *            </p>
     *            <p>
     *            <code>RollbackCapacityChange</code>, the default, ignores the
     *            capacity change if a scaling point isn't found in the timeout
     *            period.
     *            </p>
     *            <important>
     *            <p>
     *            If you specify <code>ForceApplyCapacityChange</code>,
     *            connections that prevent Aurora Serverless from finding a
     *            scaling point might be dropped.
     *            </p>
     *            </important>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     *            > Autoscaling for Aurora Serverless</a> in the <i>Amazon
     *            Aurora User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingConfiguration withTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
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
        if (getMinCapacity() != null)
            sb.append("MinCapacity: " + getMinCapacity() + ",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: " + getMaxCapacity() + ",");
        if (getAutoPause() != null)
            sb.append("AutoPause: " + getAutoPause() + ",");
        if (getSecondsUntilAutoPause() != null)
            sb.append("SecondsUntilAutoPause: " + getSecondsUntilAutoPause() + ",");
        if (getTimeoutAction() != null)
            sb.append("TimeoutAction: " + getTimeoutAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinCapacity() == null) ? 0 : getMinCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getAutoPause() == null) ? 0 : getAutoPause().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondsUntilAutoPause() == null) ? 0 : getSecondsUntilAutoPause().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutAction() == null) ? 0 : getTimeoutAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingConfiguration == false)
            return false;
        ScalingConfiguration other = (ScalingConfiguration) obj;

        if (other.getMinCapacity() == null ^ this.getMinCapacity() == null)
            return false;
        if (other.getMinCapacity() != null
                && other.getMinCapacity().equals(this.getMinCapacity()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null
                && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getAutoPause() == null ^ this.getAutoPause() == null)
            return false;
        if (other.getAutoPause() != null
                && other.getAutoPause().equals(this.getAutoPause()) == false)
            return false;
        if (other.getSecondsUntilAutoPause() == null ^ this.getSecondsUntilAutoPause() == null)
            return false;
        if (other.getSecondsUntilAutoPause() != null
                && other.getSecondsUntilAutoPause().equals(this.getSecondsUntilAutoPause()) == false)
            return false;
        if (other.getTimeoutAction() == null ^ this.getTimeoutAction() == null)
            return false;
        if (other.getTimeoutAction() != null
                && other.getTimeoutAction().equals(this.getTimeoutAction()) == false)
            return false;
        return true;
    }
}
