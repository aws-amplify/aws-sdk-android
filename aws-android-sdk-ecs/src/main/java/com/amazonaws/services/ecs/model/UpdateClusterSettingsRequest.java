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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the settings to use for a cluster.
 * </p>
 */
public class UpdateClusterSettingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the cluster to modify the settings for.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The setting to use by default for a cluster. This parameter is used to
     * enable CloudWatch Container Insights for a cluster. If this value is
     * specified, it will override the <code>containerInsights</code> value set
     * with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     */
    private java.util.List<ClusterSetting> settings;

    /**
     * <p>
     * The name of the cluster to modify the settings for.
     * </p>
     *
     * @return <p>
     *         The name of the cluster to modify the settings for.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The name of the cluster to modify the settings for.
     * </p>
     *
     * @param cluster <p>
     *            The name of the cluster to modify the settings for.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The name of the cluster to modify the settings for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The name of the cluster to modify the settings for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClusterSettingsRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The setting to use by default for a cluster. This parameter is used to
     * enable CloudWatch Container Insights for a cluster. If this value is
     * specified, it will override the <code>containerInsights</code> value set
     * with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     *
     * @return <p>
     *         The setting to use by default for a cluster. This parameter is
     *         used to enable CloudWatch Container Insights for a cluster. If
     *         this value is specified, it will override the
     *         <code>containerInsights</code> value set with
     *         <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     *         </p>
     */
    public java.util.List<ClusterSetting> getSettings() {
        return settings;
    }

    /**
     * <p>
     * The setting to use by default for a cluster. This parameter is used to
     * enable CloudWatch Container Insights for a cluster. If this value is
     * specified, it will override the <code>containerInsights</code> value set
     * with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     *
     * @param settings <p>
     *            The setting to use by default for a cluster. This parameter is
     *            used to enable CloudWatch Container Insights for a cluster. If
     *            this value is specified, it will override the
     *            <code>containerInsights</code> value set with
     *            <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     *            </p>
     */
    public void setSettings(java.util.Collection<ClusterSetting> settings) {
        if (settings == null) {
            this.settings = null;
            return;
        }

        this.settings = new java.util.ArrayList<ClusterSetting>(settings);
    }

    /**
     * <p>
     * The setting to use by default for a cluster. This parameter is used to
     * enable CloudWatch Container Insights for a cluster. If this value is
     * specified, it will override the <code>containerInsights</code> value set
     * with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            The setting to use by default for a cluster. This parameter is
     *            used to enable CloudWatch Container Insights for a cluster. If
     *            this value is specified, it will override the
     *            <code>containerInsights</code> value set with
     *            <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClusterSettingsRequest withSettings(ClusterSetting... settings) {
        if (getSettings() == null) {
            this.settings = new java.util.ArrayList<ClusterSetting>(settings.length);
        }
        for (ClusterSetting value : settings) {
            this.settings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The setting to use by default for a cluster. This parameter is used to
     * enable CloudWatch Container Insights for a cluster. If this value is
     * specified, it will override the <code>containerInsights</code> value set
     * with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            The setting to use by default for a cluster. This parameter is
     *            used to enable CloudWatch Container Insights for a cluster. If
     *            this value is specified, it will override the
     *            <code>containerInsights</code> value set with
     *            <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClusterSettingsRequest withSettings(java.util.Collection<ClusterSetting> settings) {
        setSettings(settings);
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
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getSettings() != null)
            sb.append("settings: " + getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClusterSettingsRequest == false)
            return false;
        UpdateClusterSettingsRequest other = (UpdateClusterSettingsRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }
}
