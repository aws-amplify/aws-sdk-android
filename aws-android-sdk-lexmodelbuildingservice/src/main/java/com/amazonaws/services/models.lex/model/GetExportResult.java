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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

public class GetExportResult implements Serializable {
    /**
     * <p>
     * The name of the bot being exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z_]+<br/>
     */
    private String name;

    /**
     * <p>
     * The version of the bot being exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String version;

    /**
     * <p>
     * The type of the exported resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     */
    private String resourceType;

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA_SKILLS_KIT, LEX
     */
    private String exportType;

    /**
     * <p>
     * The status of the export.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The export is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The export is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The export could not be completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, READY, FAILED
     */
    private String exportStatus;

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the
     * reason that it failed to export the resource.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * An S3 pre-signed URL that provides the location of the exported resource.
     * The exported resource is a ZIP archive that contains the exported
     * resource in JSON format. The structure of the archive may change. Your
     * code should not rely on the archive structure.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The name of the bot being exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z_]+<br/>
     *
     * @return <p>
     *         The name of the bot being exported.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the bot being exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z_]+<br/>
     *
     * @param name <p>
     *            The name of the bot being exported.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bot being exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z_]+<br/>
     *
     * @param name <p>
     *            The name of the bot being exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The version of the bot being exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return <p>
     *         The version of the bot being exported.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the bot being exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param version <p>
     *            The version of the bot being exported.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the bot being exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param version <p>
     *            The version of the bot being exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The type of the exported resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @return <p>
     *         The type of the exported resource.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of the exported resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            The type of the exported resource.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the exported resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            The type of the exported resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public GetExportResult withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of the exported resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            The type of the exported resource.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of the exported resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            The type of the exported resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public GetExportResult withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA_SKILLS_KIT, LEX
     *
     * @return <p>
     *         The format of the exported data.
     *         </p>
     * @see ExportType
     */
    public String getExportType() {
        return exportType;
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA_SKILLS_KIT, LEX
     *
     * @param exportType <p>
     *            The format of the exported data.
     *            </p>
     * @see ExportType
     */
    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA_SKILLS_KIT, LEX
     *
     * @param exportType <p>
     *            The format of the exported data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportType
     */
    public GetExportResult withExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA_SKILLS_KIT, LEX
     *
     * @param exportType <p>
     *            The format of the exported data.
     *            </p>
     * @see ExportType
     */
    public void setExportType(ExportType exportType) {
        this.exportType = exportType.toString();
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA_SKILLS_KIT, LEX
     *
     * @param exportType <p>
     *            The format of the exported data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportType
     */
    public GetExportResult withExportType(ExportType exportType) {
        this.exportType = exportType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the export.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The export is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The export is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The export could not be completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, READY, FAILED
     *
     * @return <p>
     *         The status of the export.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - The export is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>READY</code> - The export is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The export could not be completed.
     *         </p>
     *         </li>
     *         </ul>
     * @see ExportStatus
     */
    public String getExportStatus() {
        return exportStatus;
    }

    /**
     * <p>
     * The status of the export.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The export is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The export is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The export could not be completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, READY, FAILED
     *
     * @param exportStatus <p>
     *            The status of the export.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - The export is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>READY</code> - The export is complete.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - The export could not be completed.
     *            </p>
     *            </li>
     *            </ul>
     * @see ExportStatus
     */
    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * The status of the export.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The export is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The export is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The export could not be completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, READY, FAILED
     *
     * @param exportStatus <p>
     *            The status of the export.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - The export is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>READY</code> - The export is complete.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - The export could not be completed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportStatus
     */
    public GetExportResult withExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }

    /**
     * <p>
     * The status of the export.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The export is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The export is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The export could not be completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, READY, FAILED
     *
     * @param exportStatus <p>
     *            The status of the export.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - The export is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>READY</code> - The export is complete.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - The export could not be completed.
     *            </p>
     *            </li>
     *            </ul>
     * @see ExportStatus
     */
    public void setExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus.toString();
    }

    /**
     * <p>
     * The status of the export.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The export is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The export is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The export could not be completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, READY, FAILED
     *
     * @param exportStatus <p>
     *            The status of the export.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - The export is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>READY</code> - The export is complete.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - The export could not be completed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportStatus
     */
    public GetExportResult withExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus.toString();
        return this;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the
     * reason that it failed to export the resource.
     * </p>
     *
     * @return <p>
     *         If <code>status</code> is <code>FAILED</code>, Amazon Lex
     *         provides the reason that it failed to export the resource.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the
     * reason that it failed to export the resource.
     * </p>
     *
     * @param failureReason <p>
     *            If <code>status</code> is <code>FAILED</code>, Amazon Lex
     *            provides the reason that it failed to export the resource.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the
     * reason that it failed to export the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If <code>status</code> is <code>FAILED</code>, Amazon Lex
     *            provides the reason that it failed to export the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * An S3 pre-signed URL that provides the location of the exported resource.
     * The exported resource is a ZIP archive that contains the exported
     * resource in JSON format. The structure of the archive may change. Your
     * code should not rely on the archive structure.
     * </p>
     *
     * @return <p>
     *         An S3 pre-signed URL that provides the location of the exported
     *         resource. The exported resource is a ZIP archive that contains
     *         the exported resource in JSON format. The structure of the
     *         archive may change. Your code should not rely on the archive
     *         structure.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * An S3 pre-signed URL that provides the location of the exported resource.
     * The exported resource is a ZIP archive that contains the exported
     * resource in JSON format. The structure of the archive may change. Your
     * code should not rely on the archive structure.
     * </p>
     *
     * @param url <p>
     *            An S3 pre-signed URL that provides the location of the
     *            exported resource. The exported resource is a ZIP archive that
     *            contains the exported resource in JSON format. The structure
     *            of the archive may change. Your code should not rely on the
     *            archive structure.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * An S3 pre-signed URL that provides the location of the exported resource.
     * The exported resource is a ZIP archive that contains the exported
     * resource in JSON format. The structure of the archive may change. Your
     * code should not rely on the archive structure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            An S3 pre-signed URL that provides the location of the
     *            exported resource. The exported resource is a ZIP archive that
     *            contains the exported resource in JSON format. The structure
     *            of the archive may change. Your code should not rely on the
     *            archive structure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportResult withUrl(String url) {
        this.url = url;
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
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getExportType() != null)
            sb.append("exportType: " + getExportType() + ",");
        if (getExportStatus() != null)
            sb.append("exportStatus: " + getExportStatus() + ",");
        if (getFailureReason() != null)
            sb.append("failureReason: " + getFailureReason() + ",");
        if (getUrl() != null)
            sb.append("url: " + getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getExportType() == null) ? 0 : getExportType().hashCode());
        hashCode = prime * hashCode
                + ((getExportStatus() == null) ? 0 : getExportStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportResult == false)
            return false;
        GetExportResult other = (GetExportResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getExportType() == null ^ this.getExportType() == null)
            return false;
        if (other.getExportType() != null
                && other.getExportType().equals(this.getExportType()) == false)
            return false;
        if (other.getExportStatus() == null ^ this.getExportStatus() == null)
            return false;
        if (other.getExportStatus() != null
                && other.getExportStatus().equals(this.getExportStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }
}
