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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Exports a specified server engine attribute as a base64-encoded string. For
 * example, you can export user data that you can use in EC2 to associate nodes
 * with a server.
 * </p>
 * <p>
 * This operation is synchronous.
 * </p>
 * <p>
 * A <code>ValidationException</code> is raised when parameters of the request
 * are not valid. A <code>ResourceNotFoundException</code> is thrown when the
 * server does not exist. An <code>InvalidStateException</code> is thrown when
 * the server is in any of the following states: CREATING, TERMINATED, FAILED or
 * DELETING.
 * </p>
 */
public class ExportServerEngineAttributeRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the export attribute. Currently, the supported export
     * attribute is <code>Userdata</code>. This exports a user data script that
     * includes parameters and values provided in the
     * <code>InputAttributes</code> list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String exportAttributeName;

    /**
     * <p>
     * The name of the server from which you are exporting the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     */
    private String serverName;

    /**
     * <p>
     * The list of engine attributes. The list type is
     * <code>EngineAttribute</code>. An <code>EngineAttribute</code> list item
     * is a pair that includes an attribute name and its value. For the
     * <code>Userdata</code> ExportAttributeName, the following are supported
     * engine attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RunList</b> In Chef, a list of roles or recipes that are run in the
     * specified order. In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for
     * Chef Automate always creates the organization <code>default</code>. In
     * Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeEnvironment</b> In Chef, a node environment (for example,
     * development, staging, or one-box). In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three
     * numbers separated by dots, such as 13.8.5). If this attribute is empty,
     * OpsWorks for Chef Automate uses the most current version. In Puppet, this
     * parameter is ignored.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<EngineAttribute> inputAttributes;

    /**
     * <p>
     * The name of the export attribute. Currently, the supported export
     * attribute is <code>Userdata</code>. This exports a user data script that
     * includes parameters and values provided in the
     * <code>InputAttributes</code> list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The name of the export attribute. Currently, the supported export
     *         attribute is <code>Userdata</code>. This exports a user data
     *         script that includes parameters and values provided in the
     *         <code>InputAttributes</code> list.
     *         </p>
     */
    public String getExportAttributeName() {
        return exportAttributeName;
    }

    /**
     * <p>
     * The name of the export attribute. Currently, the supported export
     * attribute is <code>Userdata</code>. This exports a user data script that
     * includes parameters and values provided in the
     * <code>InputAttributes</code> list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param exportAttributeName <p>
     *            The name of the export attribute. Currently, the supported
     *            export attribute is <code>Userdata</code>. This exports a user
     *            data script that includes parameters and values provided in
     *            the <code>InputAttributes</code> list.
     *            </p>
     */
    public void setExportAttributeName(String exportAttributeName) {
        this.exportAttributeName = exportAttributeName;
    }

    /**
     * <p>
     * The name of the export attribute. Currently, the supported export
     * attribute is <code>Userdata</code>. This exports a user data script that
     * includes parameters and values provided in the
     * <code>InputAttributes</code> list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param exportAttributeName <p>
     *            The name of the export attribute. Currently, the supported
     *            export attribute is <code>Userdata</code>. This exports a user
     *            data script that includes parameters and values provided in
     *            the <code>InputAttributes</code> list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportServerEngineAttributeRequest withExportAttributeName(String exportAttributeName) {
        this.exportAttributeName = exportAttributeName;
        return this;
    }

    /**
     * <p>
     * The name of the server from which you are exporting the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @return <p>
     *         The name of the server from which you are exporting the
     *         attribute.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The name of the server from which you are exporting the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The name of the server from which you are exporting the
     *            attribute.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server from which you are exporting the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The name of the server from which you are exporting the
     *            attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportServerEngineAttributeRequest withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>
     * The list of engine attributes. The list type is
     * <code>EngineAttribute</code>. An <code>EngineAttribute</code> list item
     * is a pair that includes an attribute name and its value. For the
     * <code>Userdata</code> ExportAttributeName, the following are supported
     * engine attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RunList</b> In Chef, a list of roles or recipes that are run in the
     * specified order. In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for
     * Chef Automate always creates the organization <code>default</code>. In
     * Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeEnvironment</b> In Chef, a node environment (for example,
     * development, staging, or one-box). In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three
     * numbers separated by dots, such as 13.8.5). If this attribute is empty,
     * OpsWorks for Chef Automate uses the most current version. In Puppet, this
     * parameter is ignored.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The list of engine attributes. The list type is
     *         <code>EngineAttribute</code>. An <code>EngineAttribute</code>
     *         list item is a pair that includes an attribute name and its
     *         value. For the <code>Userdata</code> ExportAttributeName, the
     *         following are supported engine attribute names.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>RunList</b> In Chef, a list of roles or recipes that are run
     *         in the specified order. In Puppet, this parameter is ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>OrganizationName</b> In Chef, an organization name. AWS
     *         OpsWorks for Chef Automate always creates the organization
     *         <code>default</code>. In Puppet, this parameter is ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>NodeEnvironment</b> In Chef, a node environment (for example,
     *         development, staging, or one-box). In Puppet, this parameter is
     *         ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>NodeClientVersion</b> In Chef, the version of the Chef engine
     *         (three numbers separated by dots, such as 13.8.5). If this
     *         attribute is empty, OpsWorks for Chef Automate uses the most
     *         current version. In Puppet, this parameter is ignored.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<EngineAttribute> getInputAttributes() {
        return inputAttributes;
    }

    /**
     * <p>
     * The list of engine attributes. The list type is
     * <code>EngineAttribute</code>. An <code>EngineAttribute</code> list item
     * is a pair that includes an attribute name and its value. For the
     * <code>Userdata</code> ExportAttributeName, the following are supported
     * engine attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RunList</b> In Chef, a list of roles or recipes that are run in the
     * specified order. In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for
     * Chef Automate always creates the organization <code>default</code>. In
     * Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeEnvironment</b> In Chef, a node environment (for example,
     * development, staging, or one-box). In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three
     * numbers separated by dots, such as 13.8.5). If this attribute is empty,
     * OpsWorks for Chef Automate uses the most current version. In Puppet, this
     * parameter is ignored.
     * </p>
     * </li>
     * </ul>
     *
     * @param inputAttributes <p>
     *            The list of engine attributes. The list type is
     *            <code>EngineAttribute</code>. An <code>EngineAttribute</code>
     *            list item is a pair that includes an attribute name and its
     *            value. For the <code>Userdata</code> ExportAttributeName, the
     *            following are supported engine attribute names.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>RunList</b> In Chef, a list of roles or recipes that are
     *            run in the specified order. In Puppet, this parameter is
     *            ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>OrganizationName</b> In Chef, an organization name. AWS
     *            OpsWorks for Chef Automate always creates the organization
     *            <code>default</code>. In Puppet, this parameter is ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>NodeEnvironment</b> In Chef, a node environment (for
     *            example, development, staging, or one-box). In Puppet, this
     *            parameter is ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>NodeClientVersion</b> In Chef, the version of the Chef
     *            engine (three numbers separated by dots, such as 13.8.5). If
     *            this attribute is empty, OpsWorks for Chef Automate uses the
     *            most current version. In Puppet, this parameter is ignored.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setInputAttributes(java.util.Collection<EngineAttribute> inputAttributes) {
        if (inputAttributes == null) {
            this.inputAttributes = null;
            return;
        }

        this.inputAttributes = new java.util.ArrayList<EngineAttribute>(inputAttributes);
    }

    /**
     * <p>
     * The list of engine attributes. The list type is
     * <code>EngineAttribute</code>. An <code>EngineAttribute</code> list item
     * is a pair that includes an attribute name and its value. For the
     * <code>Userdata</code> ExportAttributeName, the following are supported
     * engine attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RunList</b> In Chef, a list of roles or recipes that are run in the
     * specified order. In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for
     * Chef Automate always creates the organization <code>default</code>. In
     * Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeEnvironment</b> In Chef, a node environment (for example,
     * development, staging, or one-box). In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three
     * numbers separated by dots, such as 13.8.5). If this attribute is empty,
     * OpsWorks for Chef Automate uses the most current version. In Puppet, this
     * parameter is ignored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputAttributes <p>
     *            The list of engine attributes. The list type is
     *            <code>EngineAttribute</code>. An <code>EngineAttribute</code>
     *            list item is a pair that includes an attribute name and its
     *            value. For the <code>Userdata</code> ExportAttributeName, the
     *            following are supported engine attribute names.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>RunList</b> In Chef, a list of roles or recipes that are
     *            run in the specified order. In Puppet, this parameter is
     *            ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>OrganizationName</b> In Chef, an organization name. AWS
     *            OpsWorks for Chef Automate always creates the organization
     *            <code>default</code>. In Puppet, this parameter is ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>NodeEnvironment</b> In Chef, a node environment (for
     *            example, development, staging, or one-box). In Puppet, this
     *            parameter is ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>NodeClientVersion</b> In Chef, the version of the Chef
     *            engine (three numbers separated by dots, such as 13.8.5). If
     *            this attribute is empty, OpsWorks for Chef Automate uses the
     *            most current version. In Puppet, this parameter is ignored.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportServerEngineAttributeRequest withInputAttributes(
            EngineAttribute... inputAttributes) {
        if (getInputAttributes() == null) {
            this.inputAttributes = new java.util.ArrayList<EngineAttribute>(inputAttributes.length);
        }
        for (EngineAttribute value : inputAttributes) {
            this.inputAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of engine attributes. The list type is
     * <code>EngineAttribute</code>. An <code>EngineAttribute</code> list item
     * is a pair that includes an attribute name and its value. For the
     * <code>Userdata</code> ExportAttributeName, the following are supported
     * engine attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RunList</b> In Chef, a list of roles or recipes that are run in the
     * specified order. In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for
     * Chef Automate always creates the organization <code>default</code>. In
     * Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeEnvironment</b> In Chef, a node environment (for example,
     * development, staging, or one-box). In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three
     * numbers separated by dots, such as 13.8.5). If this attribute is empty,
     * OpsWorks for Chef Automate uses the most current version. In Puppet, this
     * parameter is ignored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputAttributes <p>
     *            The list of engine attributes. The list type is
     *            <code>EngineAttribute</code>. An <code>EngineAttribute</code>
     *            list item is a pair that includes an attribute name and its
     *            value. For the <code>Userdata</code> ExportAttributeName, the
     *            following are supported engine attribute names.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>RunList</b> In Chef, a list of roles or recipes that are
     *            run in the specified order. In Puppet, this parameter is
     *            ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>OrganizationName</b> In Chef, an organization name. AWS
     *            OpsWorks for Chef Automate always creates the organization
     *            <code>default</code>. In Puppet, this parameter is ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>NodeEnvironment</b> In Chef, a node environment (for
     *            example, development, staging, or one-box). In Puppet, this
     *            parameter is ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>NodeClientVersion</b> In Chef, the version of the Chef
     *            engine (three numbers separated by dots, such as 13.8.5). If
     *            this attribute is empty, OpsWorks for Chef Automate uses the
     *            most current version. In Puppet, this parameter is ignored.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportServerEngineAttributeRequest withInputAttributes(
            java.util.Collection<EngineAttribute> inputAttributes) {
        setInputAttributes(inputAttributes);
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
        if (getExportAttributeName() != null)
            sb.append("ExportAttributeName: " + getExportAttributeName() + ",");
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getInputAttributes() != null)
            sb.append("InputAttributes: " + getInputAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExportAttributeName() == null) ? 0 : getExportAttributeName().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode
                + ((getInputAttributes() == null) ? 0 : getInputAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportServerEngineAttributeRequest == false)
            return false;
        ExportServerEngineAttributeRequest other = (ExportServerEngineAttributeRequest) obj;

        if (other.getExportAttributeName() == null ^ this.getExportAttributeName() == null)
            return false;
        if (other.getExportAttributeName() != null
                && other.getExportAttributeName().equals(this.getExportAttributeName()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null
                && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getInputAttributes() == null ^ this.getInputAttributes() == null)
            return false;
        if (other.getInputAttributes() != null
                && other.getInputAttributes().equals(this.getInputAttributes()) == false)
            return false;
        return true;
    }
}
