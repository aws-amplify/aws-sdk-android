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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a usage limit object for a cluster.
 * </p>
 */
public class CreateUsageLimitResult implements Serializable {
    /**
     * <p>
     * The identifier of the usage limit.
     * </p>
     */
    private String usageLimitId;

    /**
     * <p>
     * The identifier of the cluster with a usage limit.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The Amazon Redshift feature to which the limit applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spectrum, concurrency-scaling
     */
    private String featureType;

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a
     * time duration or data size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>time, data-scanned
     */
    private String limitType;

    /**
     * <p>
     * The limit amount. If time-based, this amount is in minutes. If
     * data-based, this amount is in terabytes (TB).
     * </p>
     */
    private Long amount;

    /**
     * <p>
     * The time period that the amount applies to. A <code>weekly</code> period
     * begins on Sunday. The default is <code>monthly</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>daily, weekly, monthly
     */
    private String period;

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. Possible
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>log</b> - To log an event in a system table. The default is log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>emit-metric</b> - To emit CloudWatch metrics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>disable</b> - To disable the feature until the next usage period
     * begins.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>log, emit-metric, disable
     */
    private String breachAction;

    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier of the usage limit.
     * </p>
     *
     * @return <p>
     *         The identifier of the usage limit.
     *         </p>
     */
    public String getUsageLimitId() {
        return usageLimitId;
    }

    /**
     * <p>
     * The identifier of the usage limit.
     * </p>
     *
     * @param usageLimitId <p>
     *            The identifier of the usage limit.
     *            </p>
     */
    public void setUsageLimitId(String usageLimitId) {
        this.usageLimitId = usageLimitId;
    }

    /**
     * <p>
     * The identifier of the usage limit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usageLimitId <p>
     *            The identifier of the usage limit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUsageLimitResult withUsageLimitId(String usageLimitId) {
        this.usageLimitId = usageLimitId;
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster with a usage limit.
     * </p>
     *
     * @return <p>
     *         The identifier of the cluster with a usage limit.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster with a usage limit.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The identifier of the cluster with a usage limit.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster with a usage limit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The identifier of the cluster with a usage limit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUsageLimitResult withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift feature to which the limit applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spectrum, concurrency-scaling
     *
     * @return <p>
     *         The Amazon Redshift feature to which the limit applies.
     *         </p>
     * @see UsageLimitFeatureType
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * <p>
     * The Amazon Redshift feature to which the limit applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spectrum, concurrency-scaling
     *
     * @param featureType <p>
     *            The Amazon Redshift feature to which the limit applies.
     *            </p>
     * @see UsageLimitFeatureType
     */
    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }

    /**
     * <p>
     * The Amazon Redshift feature to which the limit applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spectrum, concurrency-scaling
     *
     * @param featureType <p>
     *            The Amazon Redshift feature to which the limit applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageLimitFeatureType
     */
    public CreateUsageLimitResult withFeatureType(String featureType) {
        this.featureType = featureType;
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift feature to which the limit applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spectrum, concurrency-scaling
     *
     * @param featureType <p>
     *            The Amazon Redshift feature to which the limit applies.
     *            </p>
     * @see UsageLimitFeatureType
     */
    public void setFeatureType(UsageLimitFeatureType featureType) {
        this.featureType = featureType.toString();
    }

    /**
     * <p>
     * The Amazon Redshift feature to which the limit applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spectrum, concurrency-scaling
     *
     * @param featureType <p>
     *            The Amazon Redshift feature to which the limit applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageLimitFeatureType
     */
    public CreateUsageLimitResult withFeatureType(UsageLimitFeatureType featureType) {
        this.featureType = featureType.toString();
        return this;
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a
     * time duration or data size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>time, data-scanned
     *
     * @return <p>
     *         The type of limit. Depending on the feature type, this can be
     *         based on a time duration or data size.
     *         </p>
     * @see UsageLimitLimitType
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a
     * time duration or data size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>time, data-scanned
     *
     * @param limitType <p>
     *            The type of limit. Depending on the feature type, this can be
     *            based on a time duration or data size.
     *            </p>
     * @see UsageLimitLimitType
     */
    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a
     * time duration or data size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>time, data-scanned
     *
     * @param limitType <p>
     *            The type of limit. Depending on the feature type, this can be
     *            based on a time duration or data size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageLimitLimitType
     */
    public CreateUsageLimitResult withLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a
     * time duration or data size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>time, data-scanned
     *
     * @param limitType <p>
     *            The type of limit. Depending on the feature type, this can be
     *            based on a time duration or data size.
     *            </p>
     * @see UsageLimitLimitType
     */
    public void setLimitType(UsageLimitLimitType limitType) {
        this.limitType = limitType.toString();
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a
     * time duration or data size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>time, data-scanned
     *
     * @param limitType <p>
     *            The type of limit. Depending on the feature type, this can be
     *            based on a time duration or data size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageLimitLimitType
     */
    public CreateUsageLimitResult withLimitType(UsageLimitLimitType limitType) {
        this.limitType = limitType.toString();
        return this;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in minutes. If
     * data-based, this amount is in terabytes (TB).
     * </p>
     *
     * @return <p>
     *         The limit amount. If time-based, this amount is in minutes. If
     *         data-based, this amount is in terabytes (TB).
     *         </p>
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in minutes. If
     * data-based, this amount is in terabytes (TB).
     * </p>
     *
     * @param amount <p>
     *            The limit amount. If time-based, this amount is in minutes. If
     *            data-based, this amount is in terabytes (TB).
     *            </p>
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in minutes. If
     * data-based, this amount is in terabytes (TB).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amount <p>
     *            The limit amount. If time-based, this amount is in minutes. If
     *            data-based, this amount is in terabytes (TB).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUsageLimitResult withAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    /**
     * <p>
     * The time period that the amount applies to. A <code>weekly</code> period
     * begins on Sunday. The default is <code>monthly</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>daily, weekly, monthly
     *
     * @return <p>
     *         The time period that the amount applies to. A <code>weekly</code>
     *         period begins on Sunday. The default is <code>monthly</code>.
     *         </p>
     * @see UsageLimitPeriod
     */
    public String getPeriod() {
        return period;
    }

    /**
     * <p>
     * The time period that the amount applies to. A <code>weekly</code> period
     * begins on Sunday. The default is <code>monthly</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>daily, weekly, monthly
     *
     * @param period <p>
     *            The time period that the amount applies to. A
     *            <code>weekly</code> period begins on Sunday. The default is
     *            <code>monthly</code>.
     *            </p>
     * @see UsageLimitPeriod
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * The time period that the amount applies to. A <code>weekly</code> period
     * begins on Sunday. The default is <code>monthly</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>daily, weekly, monthly
     *
     * @param period <p>
     *            The time period that the amount applies to. A
     *            <code>weekly</code> period begins on Sunday. The default is
     *            <code>monthly</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageLimitPeriod
     */
    public CreateUsageLimitResult withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * <p>
     * The time period that the amount applies to. A <code>weekly</code> period
     * begins on Sunday. The default is <code>monthly</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>daily, weekly, monthly
     *
     * @param period <p>
     *            The time period that the amount applies to. A
     *            <code>weekly</code> period begins on Sunday. The default is
     *            <code>monthly</code>.
     *            </p>
     * @see UsageLimitPeriod
     */
    public void setPeriod(UsageLimitPeriod period) {
        this.period = period.toString();
    }

    /**
     * <p>
     * The time period that the amount applies to. A <code>weekly</code> period
     * begins on Sunday. The default is <code>monthly</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>daily, weekly, monthly
     *
     * @param period <p>
     *            The time period that the amount applies to. A
     *            <code>weekly</code> period begins on Sunday. The default is
     *            <code>monthly</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageLimitPeriod
     */
    public CreateUsageLimitResult withPeriod(UsageLimitPeriod period) {
        this.period = period.toString();
        return this;
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. Possible
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>log</b> - To log an event in a system table. The default is log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>emit-metric</b> - To emit CloudWatch metrics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>disable</b> - To disable the feature until the next usage period
     * begins.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>log, emit-metric, disable
     *
     * @return <p>
     *         The action that Amazon Redshift takes when the limit is reached.
     *         Possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>log</b> - To log an event in a system table. The default is
     *         log.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>emit-metric</b> - To emit CloudWatch metrics.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>disable</b> - To disable the feature until the next usage
     *         period begins.
     *         </p>
     *         </li>
     *         </ul>
     * @see UsageLimitBreachAction
     */
    public String getBreachAction() {
        return breachAction;
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. Possible
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>log</b> - To log an event in a system table. The default is log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>emit-metric</b> - To emit CloudWatch metrics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>disable</b> - To disable the feature until the next usage period
     * begins.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>log, emit-metric, disable
     *
     * @param breachAction <p>
     *            The action that Amazon Redshift takes when the limit is
     *            reached. Possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>log</b> - To log an event in a system table. The default is
     *            log.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>emit-metric</b> - To emit CloudWatch metrics.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>disable</b> - To disable the feature until the next usage
     *            period begins.
     *            </p>
     *            </li>
     *            </ul>
     * @see UsageLimitBreachAction
     */
    public void setBreachAction(String breachAction) {
        this.breachAction = breachAction;
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. Possible
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>log</b> - To log an event in a system table. The default is log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>emit-metric</b> - To emit CloudWatch metrics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>disable</b> - To disable the feature until the next usage period
     * begins.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>log, emit-metric, disable
     *
     * @param breachAction <p>
     *            The action that Amazon Redshift takes when the limit is
     *            reached. Possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>log</b> - To log an event in a system table. The default is
     *            log.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>emit-metric</b> - To emit CloudWatch metrics.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>disable</b> - To disable the feature until the next usage
     *            period begins.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageLimitBreachAction
     */
    public CreateUsageLimitResult withBreachAction(String breachAction) {
        this.breachAction = breachAction;
        return this;
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. Possible
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>log</b> - To log an event in a system table. The default is log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>emit-metric</b> - To emit CloudWatch metrics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>disable</b> - To disable the feature until the next usage period
     * begins.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>log, emit-metric, disable
     *
     * @param breachAction <p>
     *            The action that Amazon Redshift takes when the limit is
     *            reached. Possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>log</b> - To log an event in a system table. The default is
     *            log.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>emit-metric</b> - To emit CloudWatch metrics.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>disable</b> - To disable the feature until the next usage
     *            period begins.
     *            </p>
     *            </li>
     *            </ul>
     * @see UsageLimitBreachAction
     */
    public void setBreachAction(UsageLimitBreachAction breachAction) {
        this.breachAction = breachAction.toString();
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. Possible
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>log</b> - To log an event in a system table. The default is log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>emit-metric</b> - To emit CloudWatch metrics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>disable</b> - To disable the feature until the next usage period
     * begins.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>log, emit-metric, disable
     *
     * @param breachAction <p>
     *            The action that Amazon Redshift takes when the limit is
     *            reached. Possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>log</b> - To log an event in a system table. The default is
     *            log.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>emit-metric</b> - To emit CloudWatch metrics.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>disable</b> - To disable the feature until the next usage
     *            period begins.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageLimitBreachAction
     */
    public CreateUsageLimitResult withBreachAction(UsageLimitBreachAction breachAction) {
        this.breachAction = breachAction.toString();
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     *
     * @return <p>
     *         A list of tag instances.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUsageLimitResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUsageLimitResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getUsageLimitId() != null)
            sb.append("UsageLimitId: " + getUsageLimitId() + ",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getFeatureType() != null)
            sb.append("FeatureType: " + getFeatureType() + ",");
        if (getLimitType() != null)
            sb.append("LimitType: " + getLimitType() + ",");
        if (getAmount() != null)
            sb.append("Amount: " + getAmount() + ",");
        if (getPeriod() != null)
            sb.append("Period: " + getPeriod() + ",");
        if (getBreachAction() != null)
            sb.append("BreachAction: " + getBreachAction() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUsageLimitId() == null) ? 0 : getUsageLimitId().hashCode());
        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getFeatureType() == null) ? 0 : getFeatureType().hashCode());
        hashCode = prime * hashCode + ((getLimitType() == null) ? 0 : getLimitType().hashCode());
        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode
                + ((getBreachAction() == null) ? 0 : getBreachAction().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUsageLimitResult == false)
            return false;
        CreateUsageLimitResult other = (CreateUsageLimitResult) obj;

        if (other.getUsageLimitId() == null ^ this.getUsageLimitId() == null)
            return false;
        if (other.getUsageLimitId() != null
                && other.getUsageLimitId().equals(this.getUsageLimitId()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getFeatureType() == null ^ this.getFeatureType() == null)
            return false;
        if (other.getFeatureType() != null
                && other.getFeatureType().equals(this.getFeatureType()) == false)
            return false;
        if (other.getLimitType() == null ^ this.getLimitType() == null)
            return false;
        if (other.getLimitType() != null
                && other.getLimitType().equals(this.getLimitType()) == false)
            return false;
        if (other.getAmount() == null ^ this.getAmount() == null)
            return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getBreachAction() == null ^ this.getBreachAction() == null)
            return false;
        if (other.getBreachAction() != null
                && other.getBreachAction().equals(this.getBreachAction()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
