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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the notebook instance lifecycle configuration script.
 * </p>
 * <p>
 * Each lifecycle configuration script has a limit of 16384 characters.
 * </p>
 * <p>
 * The value of the <code>$PATH</code> environment variable that is available to
 * both scripts is <code>/sbin:bin:/usr/sbin:/usr/bin</code>.
 * </p>
 * <p>
 * View CloudWatch Logs for notebook instance lifecycle configurations in log
 * group <code>/aws/sagemaker/NotebookInstances</code> in log stream
 * <code>[notebook-instance-name]/[LifecycleConfigHook]</code>.
 * </p>
 * <p>
 * Lifecycle configuration scripts cannot run for longer than 5 minutes. If a
 * script runs for longer than 5 minutes, it fails and the notebook instance is
 * not created or started.
 * </p>
 * <p>
 * For information about notebook instance lifestyle configurations, see <a
 * href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
 * >Step 2.1: (Optional) Customize a Notebook Instance</a>.
 * </p>
 */
public class NotebookInstanceLifecycleHook implements Serializable {
    /**
     * <p>
     * A base64-encoded string that contains a shell script for a notebook
     * instance lifecycle configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\S\s]+<br/>
     */
    private String content;

    /**
     * <p>
     * A base64-encoded string that contains a shell script for a notebook
     * instance lifecycle configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\S\s]+<br/>
     *
     * @return <p>
     *         A base64-encoded string that contains a shell script for a
     *         notebook instance lifecycle configuration.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * A base64-encoded string that contains a shell script for a notebook
     * instance lifecycle configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\S\s]+<br/>
     *
     * @param content <p>
     *            A base64-encoded string that contains a shell script for a
     *            notebook instance lifecycle configuration.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * A base64-encoded string that contains a shell script for a notebook
     * instance lifecycle configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[\S\s]+<br/>
     *
     * @param content <p>
     *            A base64-encoded string that contains a shell script for a
     *            notebook instance lifecycle configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotebookInstanceLifecycleHook withContent(String content) {
        this.content = content;
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
        if (getContent() != null)
            sb.append("Content: " + getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotebookInstanceLifecycleHook == false)
            return false;
        NotebookInstanceLifecycleHook other = (NotebookInstanceLifecycleHook) obj;

        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
