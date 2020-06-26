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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Reloads the target database table with the source data.
 * </p>
 */
public class ReloadTablesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     */
    private String replicationTaskArn;

    /**
     * <p>
     * The name and schema of the table to be reloaded.
     * </p>
     */
    private java.util.List<TableToReload> tablesToReload;

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data
     * and re-validate it if validation is enabled. Specify
     * <code>validate-only</code> to re-validate the table. This option applies
     * only when validation is enabled for the task.
     * </p>
     * <p>
     * Valid values: data-reload, validate-only
     * </p>
     * <p>
     * Default value is data-reload.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>data-reload, validate-only
     */
    private String reloadOption;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the replication task.
     *         </p>
     */
    public String getReplicationTaskArn() {
        return replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     *
     * @param replicationTaskArn <p>
     *            The Amazon Resource Name (ARN) of the replication task.
     *            </p>
     */
    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskArn <p>
     *            The Amazon Resource Name (ARN) of the replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReloadTablesRequest withReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
        return this;
    }

    /**
     * <p>
     * The name and schema of the table to be reloaded.
     * </p>
     *
     * @return <p>
     *         The name and schema of the table to be reloaded.
     *         </p>
     */
    public java.util.List<TableToReload> getTablesToReload() {
        return tablesToReload;
    }

    /**
     * <p>
     * The name and schema of the table to be reloaded.
     * </p>
     *
     * @param tablesToReload <p>
     *            The name and schema of the table to be reloaded.
     *            </p>
     */
    public void setTablesToReload(java.util.Collection<TableToReload> tablesToReload) {
        if (tablesToReload == null) {
            this.tablesToReload = null;
            return;
        }

        this.tablesToReload = new java.util.ArrayList<TableToReload>(tablesToReload);
    }

    /**
     * <p>
     * The name and schema of the table to be reloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tablesToReload <p>
     *            The name and schema of the table to be reloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReloadTablesRequest withTablesToReload(TableToReload... tablesToReload) {
        if (getTablesToReload() == null) {
            this.tablesToReload = new java.util.ArrayList<TableToReload>(tablesToReload.length);
        }
        for (TableToReload value : tablesToReload) {
            this.tablesToReload.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The name and schema of the table to be reloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tablesToReload <p>
     *            The name and schema of the table to be reloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReloadTablesRequest withTablesToReload(java.util.Collection<TableToReload> tablesToReload) {
        setTablesToReload(tablesToReload);
        return this;
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data
     * and re-validate it if validation is enabled. Specify
     * <code>validate-only</code> to re-validate the table. This option applies
     * only when validation is enabled for the task.
     * </p>
     * <p>
     * Valid values: data-reload, validate-only
     * </p>
     * <p>
     * Default value is data-reload.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>data-reload, validate-only
     *
     * @return <p>
     *         Options for reload. Specify <code>data-reload</code> to reload
     *         the data and re-validate it if validation is enabled. Specify
     *         <code>validate-only</code> to re-validate the table. This option
     *         applies only when validation is enabled for the task.
     *         </p>
     *         <p>
     *         Valid values: data-reload, validate-only
     *         </p>
     *         <p>
     *         Default value is data-reload.
     *         </p>
     * @see ReloadOptionValue
     */
    public String getReloadOption() {
        return reloadOption;
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data
     * and re-validate it if validation is enabled. Specify
     * <code>validate-only</code> to re-validate the table. This option applies
     * only when validation is enabled for the task.
     * </p>
     * <p>
     * Valid values: data-reload, validate-only
     * </p>
     * <p>
     * Default value is data-reload.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>data-reload, validate-only
     *
     * @param reloadOption <p>
     *            Options for reload. Specify <code>data-reload</code> to reload
     *            the data and re-validate it if validation is enabled. Specify
     *            <code>validate-only</code> to re-validate the table. This
     *            option applies only when validation is enabled for the task.
     *            </p>
     *            <p>
     *            Valid values: data-reload, validate-only
     *            </p>
     *            <p>
     *            Default value is data-reload.
     *            </p>
     * @see ReloadOptionValue
     */
    public void setReloadOption(String reloadOption) {
        this.reloadOption = reloadOption;
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data
     * and re-validate it if validation is enabled. Specify
     * <code>validate-only</code> to re-validate the table. This option applies
     * only when validation is enabled for the task.
     * </p>
     * <p>
     * Valid values: data-reload, validate-only
     * </p>
     * <p>
     * Default value is data-reload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>data-reload, validate-only
     *
     * @param reloadOption <p>
     *            Options for reload. Specify <code>data-reload</code> to reload
     *            the data and re-validate it if validation is enabled. Specify
     *            <code>validate-only</code> to re-validate the table. This
     *            option applies only when validation is enabled for the task.
     *            </p>
     *            <p>
     *            Valid values: data-reload, validate-only
     *            </p>
     *            <p>
     *            Default value is data-reload.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReloadOptionValue
     */
    public ReloadTablesRequest withReloadOption(String reloadOption) {
        this.reloadOption = reloadOption;
        return this;
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data
     * and re-validate it if validation is enabled. Specify
     * <code>validate-only</code> to re-validate the table. This option applies
     * only when validation is enabled for the task.
     * </p>
     * <p>
     * Valid values: data-reload, validate-only
     * </p>
     * <p>
     * Default value is data-reload.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>data-reload, validate-only
     *
     * @param reloadOption <p>
     *            Options for reload. Specify <code>data-reload</code> to reload
     *            the data and re-validate it if validation is enabled. Specify
     *            <code>validate-only</code> to re-validate the table. This
     *            option applies only when validation is enabled for the task.
     *            </p>
     *            <p>
     *            Valid values: data-reload, validate-only
     *            </p>
     *            <p>
     *            Default value is data-reload.
     *            </p>
     * @see ReloadOptionValue
     */
    public void setReloadOption(ReloadOptionValue reloadOption) {
        this.reloadOption = reloadOption.toString();
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data
     * and re-validate it if validation is enabled. Specify
     * <code>validate-only</code> to re-validate the table. This option applies
     * only when validation is enabled for the task.
     * </p>
     * <p>
     * Valid values: data-reload, validate-only
     * </p>
     * <p>
     * Default value is data-reload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>data-reload, validate-only
     *
     * @param reloadOption <p>
     *            Options for reload. Specify <code>data-reload</code> to reload
     *            the data and re-validate it if validation is enabled. Specify
     *            <code>validate-only</code> to re-validate the table. This
     *            option applies only when validation is enabled for the task.
     *            </p>
     *            <p>
     *            Valid values: data-reload, validate-only
     *            </p>
     *            <p>
     *            Default value is data-reload.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReloadOptionValue
     */
    public ReloadTablesRequest withReloadOption(ReloadOptionValue reloadOption) {
        this.reloadOption = reloadOption.toString();
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
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: " + getReplicationTaskArn() + ",");
        if (getTablesToReload() != null)
            sb.append("TablesToReload: " + getTablesToReload() + ",");
        if (getReloadOption() != null)
            sb.append("ReloadOption: " + getReloadOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode
                + ((getTablesToReload() == null) ? 0 : getTablesToReload().hashCode());
        hashCode = prime * hashCode
                + ((getReloadOption() == null) ? 0 : getReloadOption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReloadTablesRequest == false)
            return false;
        ReloadTablesRequest other = (ReloadTablesRequest) obj;

        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null
                && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getTablesToReload() == null ^ this.getTablesToReload() == null)
            return false;
        if (other.getTablesToReload() != null
                && other.getTablesToReload().equals(this.getTablesToReload()) == false)
            return false;
        if (other.getReloadOption() == null ^ this.getReloadOption() == null)
            return false;
        if (other.getReloadOption() != null
                && other.getReloadOption().equals(this.getReloadOption()) == false)
            return false;
        return true;
    }
}
