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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a report group. A report group contains a collection of reports.
 * </p>
 */
public class CreateReportGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the report group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 128<br/>
     */
    private String name;

    /**
     * <p>
     * The type of report group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     */
    private String type;

    /**
     * <p>
     * A <code>ReportExportConfig</code> object that contains information about
     * where the report group test results are exported.
     * </p>
     */
    private ReportExportConfig exportConfig;

    /**
     * <p>
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS
     * CodeBuild report group tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the report group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 128<br/>
     *
     * @return <p>
     *         The name of the report group.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the report group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 128<br/>
     *
     * @param name <p>
     *            The name of the report group.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the report group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 128<br/>
     *
     * @param name <p>
     *            The name of the report group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReportGroupRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of report group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @return <p>
     *         The type of report group.
     *         </p>
     * @see ReportType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of report group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @param type <p>
     *            The type of report group.
     *            </p>
     * @see ReportType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of report group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @param type <p>
     *            The type of report group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportType
     */
    public CreateReportGroupRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of report group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @param type <p>
     *            The type of report group.
     *            </p>
     * @see ReportType
     */
    public void setType(ReportType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of report group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @param type <p>
     *            The type of report group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportType
     */
    public CreateReportGroupRequest withType(ReportType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A <code>ReportExportConfig</code> object that contains information about
     * where the report group test results are exported.
     * </p>
     *
     * @return <p>
     *         A <code>ReportExportConfig</code> object that contains
     *         information about where the report group test results are
     *         exported.
     *         </p>
     */
    public ReportExportConfig getExportConfig() {
        return exportConfig;
    }

    /**
     * <p>
     * A <code>ReportExportConfig</code> object that contains information about
     * where the report group test results are exported.
     * </p>
     *
     * @param exportConfig <p>
     *            A <code>ReportExportConfig</code> object that contains
     *            information about where the report group test results are
     *            exported.
     *            </p>
     */
    public void setExportConfig(ReportExportConfig exportConfig) {
        this.exportConfig = exportConfig;
    }

    /**
     * <p>
     * A <code>ReportExportConfig</code> object that contains information about
     * where the report group test results are exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportConfig <p>
     *            A <code>ReportExportConfig</code> object that contains
     *            information about where the report group test results are
     *            exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReportGroupRequest withExportConfig(ReportExportConfig exportConfig) {
        this.exportConfig = exportConfig;
        return this;
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS
     * CodeBuild report group tags.
     * </p>
     *
     * @return <p>
     *         A list of tag key and value pairs associated with this report
     *         group.
     *         </p>
     *         <p>
     *         These tags are available for use by AWS services that support AWS
     *         CodeBuild report group tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS
     * CodeBuild report group tags.
     * </p>
     *
     * @param tags <p>
     *            A list of tag key and value pairs associated with this report
     *            group.
     *            </p>
     *            <p>
     *            These tags are available for use by AWS services that support
     *            AWS CodeBuild report group tags.
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
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS
     * CodeBuild report group tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag key and value pairs associated with this report
     *            group.
     *            </p>
     *            <p>
     *            These tags are available for use by AWS services that support
     *            AWS CodeBuild report group tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReportGroupRequest withTags(Tag... tags) {
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
     * A list of tag key and value pairs associated with this report group.
     * </p>
     * <p>
     * These tags are available for use by AWS services that support AWS
     * CodeBuild report group tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag key and value pairs associated with this report
     *            group.
     *            </p>
     *            <p>
     *            These tags are available for use by AWS services that support
     *            AWS CodeBuild report group tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReportGroupRequest withTags(java.util.Collection<Tag> tags) {
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
            sb.append("name: " + getName() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getExportConfig() != null)
            sb.append("exportConfig: " + getExportConfig() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getExportConfig() == null) ? 0 : getExportConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReportGroupRequest == false)
            return false;
        CreateReportGroupRequest other = (CreateReportGroupRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getExportConfig() == null ^ this.getExportConfig() == null)
            return false;
        if (other.getExportConfig() != null
                && other.getExportConfig().equals(this.getExportConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
