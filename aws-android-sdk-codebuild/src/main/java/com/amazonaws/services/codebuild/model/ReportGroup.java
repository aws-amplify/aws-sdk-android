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

/**
 * <p>
 * A series of reports. Each report contains information about the results from
 * running a series of test cases. You specify the test cases for a report group
 * in the buildspec for a build project using one or more paths to the test case
 * files.
 * </p>
 */
public class ReportGroup implements Serializable {
    /**
     * <p>
     * The ARN of a <code>ReportGroup</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String arn;

    /**
     * <p>
     * The name of a <code>ReportGroup</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 128<br/>
     */
    private String name;

    /**
     * <p>
     * The type of the <code>ReportGroup</code>. The one valid value is
     * <code>TEST</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     */
    private String type;

    /**
     * <p>
     * Information about the destination where the raw data of this
     * <code>ReportGroup</code> is exported.
     * </p>
     */
    private ReportExportConfig exportConfig;

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was created.
     * </p>
     */
    private java.util.Date created;

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was last modified.
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * The ARN of a <code>ReportGroup</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ARN of a <code>ReportGroup</code>.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of a <code>ReportGroup</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param arn <p>
     *            The ARN of a <code>ReportGroup</code>.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of a <code>ReportGroup</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param arn <p>
     *            The ARN of a <code>ReportGroup</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportGroup withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of a <code>ReportGroup</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 128<br/>
     *
     * @return <p>
     *         The name of a <code>ReportGroup</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of a <code>ReportGroup</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 128<br/>
     *
     * @param name <p>
     *            The name of a <code>ReportGroup</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a <code>ReportGroup</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 128<br/>
     *
     * @param name <p>
     *            The name of a <code>ReportGroup</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the <code>ReportGroup</code>. The one valid value is
     * <code>TEST</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @return <p>
     *         The type of the <code>ReportGroup</code>. The one valid value is
     *         <code>TEST</code>.
     *         </p>
     * @see ReportType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the <code>ReportGroup</code>. The one valid value is
     * <code>TEST</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @param type <p>
     *            The type of the <code>ReportGroup</code>. The one valid value
     *            is <code>TEST</code>.
     *            </p>
     * @see ReportType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the <code>ReportGroup</code>. The one valid value is
     * <code>TEST</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @param type <p>
     *            The type of the <code>ReportGroup</code>. The one valid value
     *            is <code>TEST</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportType
     */
    public ReportGroup withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the <code>ReportGroup</code>. The one valid value is
     * <code>TEST</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @param type <p>
     *            The type of the <code>ReportGroup</code>. The one valid value
     *            is <code>TEST</code>.
     *            </p>
     * @see ReportType
     */
    public void setType(ReportType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the <code>ReportGroup</code>. The one valid value is
     * <code>TEST</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEST
     *
     * @param type <p>
     *            The type of the <code>ReportGroup</code>. The one valid value
     *            is <code>TEST</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportType
     */
    public ReportGroup withType(ReportType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the destination where the raw data of this
     * <code>ReportGroup</code> is exported.
     * </p>
     *
     * @return <p>
     *         Information about the destination where the raw data of this
     *         <code>ReportGroup</code> is exported.
     *         </p>
     */
    public ReportExportConfig getExportConfig() {
        return exportConfig;
    }

    /**
     * <p>
     * Information about the destination where the raw data of this
     * <code>ReportGroup</code> is exported.
     * </p>
     *
     * @param exportConfig <p>
     *            Information about the destination where the raw data of this
     *            <code>ReportGroup</code> is exported.
     *            </p>
     */
    public void setExportConfig(ReportExportConfig exportConfig) {
        this.exportConfig = exportConfig;
    }

    /**
     * <p>
     * Information about the destination where the raw data of this
     * <code>ReportGroup</code> is exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportConfig <p>
     *            Information about the destination where the raw data of this
     *            <code>ReportGroup</code> is exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportGroup withExportConfig(ReportExportConfig exportConfig) {
        this.exportConfig = exportConfig;
        return this;
    }

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was created.
     * </p>
     *
     * @return <p>
     *         The date and time this <code>ReportGroup</code> was created.
     *         </p>
     */
    public java.util.Date getCreated() {
        return created;
    }

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was created.
     * </p>
     *
     * @param created <p>
     *            The date and time this <code>ReportGroup</code> was created.
     *            </p>
     */
    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param created <p>
     *            The date and time this <code>ReportGroup</code> was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportGroup withCreated(java.util.Date created) {
        this.created = created;
        return this;
    }

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was last modified.
     * </p>
     *
     * @return <p>
     *         The date and time this <code>ReportGroup</code> was last
     *         modified.
     *         </p>
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was last modified.
     * </p>
     *
     * @param lastModified <p>
     *            The date and time this <code>ReportGroup</code> was last
     *            modified.
     *            </p>
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time this <code>ReportGroup</code> was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModified <p>
     *            The date and time this <code>ReportGroup</code> was last
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReportGroup withLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getExportConfig() != null)
            sb.append("exportConfig: " + getExportConfig() + ",");
        if (getCreated() != null)
            sb.append("created: " + getCreated() + ",");
        if (getLastModified() != null)
            sb.append("lastModified: " + getLastModified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getExportConfig() == null) ? 0 : getExportConfig().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportGroup == false)
            return false;
        ReportGroup other = (ReportGroup) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        return true;
    }
}
