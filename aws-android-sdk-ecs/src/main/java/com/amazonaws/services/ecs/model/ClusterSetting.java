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
 * The settings to use when creating a cluster. This parameter is used to enable
 * CloudWatch Container Insights for a cluster.
 * </p>
 */
public class ClusterSetting implements Serializable {
    /**
     * <p>
     * The name of the cluster setting. The only supported value is
     * <code>containerInsights</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>containerInsights
     */
    private String name;

    /**
     * <p>
     * The value to set for the cluster setting. The supported values are
     * <code>enabled</code> and <code>disabled</code>. If <code>enabled</code>
     * is specified, CloudWatch Container Insights will be enabled for the
     * cluster, otherwise it will be disabled unless the
     * <code>containerInsights</code> account setting is enabled. If a cluster
     * value is specified, it will override the <code>containerInsights</code>
     * value set with <a>PutAccountSetting</a> or
     * <a>PutAccountSettingDefault</a>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the cluster setting. The only supported value is
     * <code>containerInsights</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>containerInsights
     *
     * @return <p>
     *         The name of the cluster setting. The only supported value is
     *         <code>containerInsights</code>.
     *         </p>
     * @see ClusterSettingName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the cluster setting. The only supported value is
     * <code>containerInsights</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>containerInsights
     *
     * @param name <p>
     *            The name of the cluster setting. The only supported value is
     *            <code>containerInsights</code>.
     *            </p>
     * @see ClusterSettingName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cluster setting. The only supported value is
     * <code>containerInsights</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>containerInsights
     *
     * @param name <p>
     *            The name of the cluster setting. The only supported value is
     *            <code>containerInsights</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClusterSettingName
     */
    public ClusterSetting withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The name of the cluster setting. The only supported value is
     * <code>containerInsights</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>containerInsights
     *
     * @param name <p>
     *            The name of the cluster setting. The only supported value is
     *            <code>containerInsights</code>.
     *            </p>
     * @see ClusterSettingName
     */
    public void setName(ClusterSettingName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The name of the cluster setting. The only supported value is
     * <code>containerInsights</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>containerInsights
     *
     * @param name <p>
     *            The name of the cluster setting. The only supported value is
     *            <code>containerInsights</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClusterSettingName
     */
    public ClusterSetting withName(ClusterSettingName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value to set for the cluster setting. The supported values are
     * <code>enabled</code> and <code>disabled</code>. If <code>enabled</code>
     * is specified, CloudWatch Container Insights will be enabled for the
     * cluster, otherwise it will be disabled unless the
     * <code>containerInsights</code> account setting is enabled. If a cluster
     * value is specified, it will override the <code>containerInsights</code>
     * value set with <a>PutAccountSetting</a> or
     * <a>PutAccountSettingDefault</a>.
     * </p>
     *
     * @return <p>
     *         The value to set for the cluster setting. The supported values
     *         are <code>enabled</code> and <code>disabled</code>. If
     *         <code>enabled</code> is specified, CloudWatch Container Insights
     *         will be enabled for the cluster, otherwise it will be disabled
     *         unless the <code>containerInsights</code> account setting is
     *         enabled. If a cluster value is specified, it will override the
     *         <code>containerInsights</code> value set with
     *         <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value to set for the cluster setting. The supported values are
     * <code>enabled</code> and <code>disabled</code>. If <code>enabled</code>
     * is specified, CloudWatch Container Insights will be enabled for the
     * cluster, otherwise it will be disabled unless the
     * <code>containerInsights</code> account setting is enabled. If a cluster
     * value is specified, it will override the <code>containerInsights</code>
     * value set with <a>PutAccountSetting</a> or
     * <a>PutAccountSettingDefault</a>.
     * </p>
     *
     * @param value <p>
     *            The value to set for the cluster setting. The supported values
     *            are <code>enabled</code> and <code>disabled</code>. If
     *            <code>enabled</code> is specified, CloudWatch Container
     *            Insights will be enabled for the cluster, otherwise it will be
     *            disabled unless the <code>containerInsights</code> account
     *            setting is enabled. If a cluster value is specified, it will
     *            override the <code>containerInsights</code> value set with
     *            <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value to set for the cluster setting. The supported values are
     * <code>enabled</code> and <code>disabled</code>. If <code>enabled</code>
     * is specified, CloudWatch Container Insights will be enabled for the
     * cluster, otherwise it will be disabled unless the
     * <code>containerInsights</code> account setting is enabled. If a cluster
     * value is specified, it will override the <code>containerInsights</code>
     * value set with <a>PutAccountSetting</a> or
     * <a>PutAccountSettingDefault</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value to set for the cluster setting. The supported values
     *            are <code>enabled</code> and <code>disabled</code>. If
     *            <code>enabled</code> is specified, CloudWatch Container
     *            Insights will be enabled for the cluster, otherwise it will be
     *            disabled unless the <code>containerInsights</code> account
     *            setting is enabled. If a cluster value is specified, it will
     *            override the <code>containerInsights</code> value set with
     *            <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterSetting withValue(String value) {
        this.value = value;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterSetting == false)
            return false;
        ClusterSetting other = (ClusterSetting) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
