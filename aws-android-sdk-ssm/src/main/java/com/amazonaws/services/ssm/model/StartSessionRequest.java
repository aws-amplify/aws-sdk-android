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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Initiates a connection to a target (for example, an instance) for a Session
 * Manager session. Returns a URL and token that can be used to open a WebSocket
 * connection for sending input and receiving outputs.
 * </p>
 * <note>
 * <p>
 * AWS CLI usage: <code>start-session</code> is an interactive command that
 * requires the Session Manager plugin to be installed on the client machine
 * making the call. For information, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-install-plugin.html"
 * >Install the Session Manager plugin for the AWS CLI</a> in the <i>AWS Systems
 * Manager User Guide</i>.
 * </p>
 * <p>
 * AWS Tools for PowerShell usage: Start-SSMSession is not currently supported
 * by AWS Tools for PowerShell on Windows local machines.
 * </p>
 * </note>
 */
public class StartSessionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The instance to connect to for the session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     */
    private String target;

    /**
     * <p>
     * The name of the SSM document to define the parameters and plugin settings
     * for the session. For example, <code>SSM-SessionManagerRunShell</code>. If
     * no document name is provided, a shell to the instance is launched by
     * default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     */
    private String documentName;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;

    /**
     * <p>
     * The instance to connect to for the session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     *
     * @return <p>
     *         The instance to connect to for the session.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * The instance to connect to for the session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     *
     * @param target <p>
     *            The instance to connect to for the session.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The instance to connect to for the session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     *
     * @param target <p>
     *            The instance to connect to for the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSessionRequest withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * The name of the SSM document to define the parameters and plugin settings
     * for the session. For example, <code>SSM-SessionManagerRunShell</code>. If
     * no document name is provided, a shell to the instance is launched by
     * default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the SSM document to define the parameters and plugin
     *         settings for the session. For example,
     *         <code>SSM-SessionManagerRunShell</code>. If no document name is
     *         provided, a shell to the instance is launched by default.
     *         </p>
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * <p>
     * The name of the SSM document to define the parameters and plugin settings
     * for the session. For example, <code>SSM-SessionManagerRunShell</code>. If
     * no document name is provided, a shell to the instance is launched by
     * default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param documentName <p>
     *            The name of the SSM document to define the parameters and
     *            plugin settings for the session. For example,
     *            <code>SSM-SessionManagerRunShell</code>. If no document name
     *            is provided, a shell to the instance is launched by default.
     *            </p>
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the SSM document to define the parameters and plugin settings
     * for the session. For example, <code>SSM-SessionManagerRunShell</code>. If
     * no document name is provided, a shell to the instance is launched by
     * default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param documentName <p>
     *            The name of the SSM document to define the parameters and
     *            plugin settings for the session. For example,
     *            <code>SSM-SessionManagerRunShell</code>. If no document name
     *            is provided, a shell to the instance is launched by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSessionRequest withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param parameters <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSessionRequest withParameters(
            java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into
     *            Parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSessionRequest addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public StartSessionRequest clearParametersEntries() {
        this.parameters = null;
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
        if (getTarget() != null)
            sb.append("Target: " + getTarget() + ",");
        if (getDocumentName() != null)
            sb.append("DocumentName: " + getDocumentName() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSessionRequest == false)
            return false;
        StartSessionRequest other = (StartSessionRequest) obj;

        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null
                && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
