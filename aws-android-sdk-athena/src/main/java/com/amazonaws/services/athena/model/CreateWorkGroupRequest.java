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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a workgroup with the specified name.
 * </p>
 */
public class CreateWorkGroupRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The configuration for the workgroup, which includes the location in
     * Amazon S3 where query results are stored, the encryption configuration,
     * if any, used for encrypting query results, whether the Amazon CloudWatch
     * Metrics are enabled for the workgroup, the limit for the amount of bytes
     * scanned (cutoff) per query, if it is specified, and whether workgroup's
     * settings (specified with EnforceWorkGroupConfiguration) in the
     * WorkGroupConfiguration override client-side settings. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
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
     * A list of comma separated tags to add to the workgroup that is created.
     * </p>
     */
    private java.util.List<Tag> tags;

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
    public CreateWorkGroupRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in
     * Amazon S3 where query results are stored, the encryption configuration,
     * if any, used for encrypting query results, whether the Amazon CloudWatch
     * Metrics are enabled for the workgroup, the limit for the amount of bytes
     * scanned (cutoff) per query, if it is specified, and whether workgroup's
     * settings (specified with EnforceWorkGroupConfiguration) in the
     * WorkGroupConfiguration override client-side settings. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     *
     * @return <p>
     *         The configuration for the workgroup, which includes the location
     *         in Amazon S3 where query results are stored, the encryption
     *         configuration, if any, used for encrypting query results, whether
     *         the Amazon CloudWatch Metrics are enabled for the workgroup, the
     *         limit for the amount of bytes scanned (cutoff) per query, if it
     *         is specified, and whether workgroup's settings (specified with
     *         EnforceWorkGroupConfiguration) in the WorkGroupConfiguration
     *         override client-side settings. See
     *         <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *         </p>
     */
    public WorkGroupConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in
     * Amazon S3 where query results are stored, the encryption configuration,
     * if any, used for encrypting query results, whether the Amazon CloudWatch
     * Metrics are enabled for the workgroup, the limit for the amount of bytes
     * scanned (cutoff) per query, if it is specified, and whether workgroup's
     * settings (specified with EnforceWorkGroupConfiguration) in the
     * WorkGroupConfiguration override client-side settings. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     *
     * @param configuration <p>
     *            The configuration for the workgroup, which includes the
     *            location in Amazon S3 where query results are stored, the
     *            encryption configuration, if any, used for encrypting query
     *            results, whether the Amazon CloudWatch Metrics are enabled for
     *            the workgroup, the limit for the amount of bytes scanned
     *            (cutoff) per query, if it is specified, and whether
     *            workgroup's settings (specified with
     *            EnforceWorkGroupConfiguration) in the WorkGroupConfiguration
     *            override client-side settings. See
     *            <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *            </p>
     */
    public void setConfiguration(WorkGroupConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in
     * Amazon S3 where query results are stored, the encryption configuration,
     * if any, used for encrypting query results, whether the Amazon CloudWatch
     * Metrics are enabled for the workgroup, the limit for the amount of bytes
     * scanned (cutoff) per query, if it is specified, and whether workgroup's
     * settings (specified with EnforceWorkGroupConfiguration) in the
     * WorkGroupConfiguration override client-side settings. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configuration <p>
     *            The configuration for the workgroup, which includes the
     *            location in Amazon S3 where query results are stored, the
     *            encryption configuration, if any, used for encrypting query
     *            results, whether the Amazon CloudWatch Metrics are enabled for
     *            the workgroup, the limit for the amount of bytes scanned
     *            (cutoff) per query, if it is specified, and whether
     *            workgroup's settings (specified with
     *            EnforceWorkGroupConfiguration) in the WorkGroupConfiguration
     *            override client-side settings. See
     *            <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWorkGroupRequest withConfiguration(WorkGroupConfiguration configuration) {
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
    public CreateWorkGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of comma separated tags to add to the workgroup that is created.
     * </p>
     *
     * @return <p>
     *         A list of comma separated tags to add to the workgroup that is
     *         created.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of comma separated tags to add to the workgroup that is created.
     * </p>
     *
     * @param tags <p>
     *            A list of comma separated tags to add to the workgroup that is
     *            created.
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
     * A list of comma separated tags to add to the workgroup that is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of comma separated tags to add to the workgroup that is
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWorkGroupRequest withTags(Tag... tags) {
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
     * A list of comma separated tags to add to the workgroup that is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of comma separated tags to add to the workgroup that is
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWorkGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkGroupRequest == false)
            return false;
        CreateWorkGroupRequest other = (CreateWorkGroupRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
