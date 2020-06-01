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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * A workgroup, which contains a name, description, creation time, state, and
 * other configuration, listed under <a>WorkGroup$Configuration</a>. Each
 * workgroup enables you to isolate queries for you or your group of users from
 * other queries in the same account, to configure the query results location
 * and the encryption configuration (known as workgroup settings), to enable
 * sending query metrics to Amazon CloudWatch, and to establish per-query data
 * usage control limits for all queries in a workgroup. The workgroup settings
 * override is specified in EnforceWorkGroupConfiguration (true/false) in the
 * WorkGroupConfiguration. See
 * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
 * </p>
 */
public class WorkGroup implements Serializable {
    /**
     * <p>
     * The workgroup name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     */
    private String name;

    /**
     * <p>
     * The state of the workgroup: ENABLED or DISABLED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String state;

    /**
     * <p>
     * The configuration of the workgroup, which includes the location in Amazon
     * S3 where query results are stored, the encryption configuration, if any,
     * used for query results; whether the Amazon CloudWatch Metrics are enabled
     * for the workgroup; whether workgroup settings override client-side
     * settings; and the data usage limits for the amount of data scanned per
     * query or per workgroup. The workgroup settings override is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration.
     * See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     */
    private WorkGroupConfiguration configuration;

    /**
     * <p>
     * The workgroup description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The date and time the workgroup was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The workgroup name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @return <p>
     *         The workgroup name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The workgroup name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param name <p>
     *            The workgroup name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The workgroup name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param name <p>
     *            The workgroup name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The state of the workgroup: ENABLED or DISABLED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The state of the workgroup: ENABLED or DISABLED.
     *         </p>
     * @see WorkGroupState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the workgroup: ENABLED or DISABLED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The state of the workgroup: ENABLED or DISABLED.
     *            </p>
     * @see WorkGroupState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the workgroup: ENABLED or DISABLED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The state of the workgroup: ENABLED or DISABLED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkGroupState
     */
    public WorkGroup withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the workgroup: ENABLED or DISABLED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The state of the workgroup: ENABLED or DISABLED.
     *            </p>
     * @see WorkGroupState
     */
    public void setState(WorkGroupState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the workgroup: ENABLED or DISABLED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The state of the workgroup: ENABLED or DISABLED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkGroupState
     */
    public WorkGroup withState(WorkGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The configuration of the workgroup, which includes the location in Amazon
     * S3 where query results are stored, the encryption configuration, if any,
     * used for query results; whether the Amazon CloudWatch Metrics are enabled
     * for the workgroup; whether workgroup settings override client-side
     * settings; and the data usage limits for the amount of data scanned per
     * query or per workgroup. The workgroup settings override is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration.
     * See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     *
     * @return <p>
     *         The configuration of the workgroup, which includes the location
     *         in Amazon S3 where query results are stored, the encryption
     *         configuration, if any, used for query results; whether the Amazon
     *         CloudWatch Metrics are enabled for the workgroup; whether
     *         workgroup settings override client-side settings; and the data
     *         usage limits for the amount of data scanned per query or per
     *         workgroup. The workgroup settings override is specified in
     *         EnforceWorkGroupConfiguration (true/false) in the
     *         WorkGroupConfiguration. See
     *         <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *         </p>
     */
    public WorkGroupConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * The configuration of the workgroup, which includes the location in Amazon
     * S3 where query results are stored, the encryption configuration, if any,
     * used for query results; whether the Amazon CloudWatch Metrics are enabled
     * for the workgroup; whether workgroup settings override client-side
     * settings; and the data usage limits for the amount of data scanned per
     * query or per workgroup. The workgroup settings override is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration.
     * See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     *
     * @param configuration <p>
     *            The configuration of the workgroup, which includes the
     *            location in Amazon S3 where query results are stored, the
     *            encryption configuration, if any, used for query results;
     *            whether the Amazon CloudWatch Metrics are enabled for the
     *            workgroup; whether workgroup settings override client-side
     *            settings; and the data usage limits for the amount of data
     *            scanned per query or per workgroup. The workgroup settings
     *            override is specified in EnforceWorkGroupConfiguration
     *            (true/false) in the WorkGroupConfiguration. See
     *            <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *            </p>
     */
    public void setConfiguration(WorkGroupConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration of the workgroup, which includes the location in Amazon
     * S3 where query results are stored, the encryption configuration, if any,
     * used for query results; whether the Amazon CloudWatch Metrics are enabled
     * for the workgroup; whether workgroup settings override client-side
     * settings; and the data usage limits for the amount of data scanned per
     * query or per workgroup. The workgroup settings override is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration.
     * See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configuration <p>
     *            The configuration of the workgroup, which includes the
     *            location in Amazon S3 where query results are stored, the
     *            encryption configuration, if any, used for query results;
     *            whether the Amazon CloudWatch Metrics are enabled for the
     *            workgroup; whether workgroup settings override client-side
     *            settings; and the data usage limits for the amount of data
     *            scanned per query or per workgroup. The workgroup settings
     *            override is specified in EnforceWorkGroupConfiguration
     *            (true/false) in the WorkGroupConfiguration. See
     *            <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkGroup withConfiguration(WorkGroupConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The workgroup description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The workgroup description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The workgroup description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date and time the workgroup was created.
     * </p>
     *
     * @return <p>
     *         The date and time the workgroup was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time the workgroup was created.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time the workgroup was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the workgroup was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time the workgroup was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkGroup withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
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
            sb.append("Name: " + getName() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkGroup == false)
            return false;
        WorkGroup other = (WorkGroup) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null
                && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }
}
