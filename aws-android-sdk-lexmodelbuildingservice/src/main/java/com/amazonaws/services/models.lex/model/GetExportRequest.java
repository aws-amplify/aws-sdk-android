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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Exports the contents of a Amazon Lex resource in a specified format.
 * </p>
 */
public class GetExportRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bot to export.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z_]+<br/>
     */
    private String name;

    /**
     * <p>
     * The version of the bot to export.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String version;

    /**
     * <p>
     * The type of resource to export.
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
     * The name of the bot to export.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z_]+<br/>
     *
     * @return <p>
     *         The name of the bot to export.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the bot to export.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z_]+<br/>
     *
     * @param name <p>
     *            The name of the bot to export.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bot to export.
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
     *            The name of the bot to export.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The version of the bot to export.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return <p>
     *         The version of the bot to export.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the bot to export.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param version <p>
     *            The version of the bot to export.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the bot to export.
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
     *            The version of the bot to export.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The type of resource to export.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @return <p>
     *         The type of resource to export.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource to export.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            The type of resource to export.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to export.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            The type of resource to export.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public GetExportRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource to export.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            The type of resource to export.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource to export.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            The type of resource to export.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public GetExportRequest withResourceType(ResourceType resourceType) {
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
    public GetExportRequest withExportType(String exportType) {
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
    public GetExportRequest withExportType(ExportType exportType) {
        this.exportType = exportType.toString();
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
            sb.append("exportType: " + getExportType());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportRequest == false)
            return false;
        GetExportRequest other = (GetExportRequest) obj;

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
        return true;
    }
}
