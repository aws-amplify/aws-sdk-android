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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a URL that you can use to connect to the Jupyter server from a
 * notebook instance. In the Amazon SageMaker console, when you choose
 * <code>Open</code> next to a notebook instance, Amazon SageMaker opens a new
 * tab showing the Jupyter server home page from the notebook instance. The
 * console uses this API to get the URL and show the page.
 * </p>
 * <p>
 * IAM authorization policies for this API are also enforced for every HTTP
 * request and WebSocket frame that attempts to connect to the notebook
 * instance.For example, you can restrict access to this API and to the URL that
 * it returns to a list of IP addresses that you specify. Use the
 * <code>NotIpAddress</code> condition operator and the
 * <code>aws:SourceIP</code> condition context key to specify the list of IP
 * addresses that you want to have access to the notebook instance. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/security_iam_id-based-policy-examples.html#nbi-ip-filter"
 * >Limit Access to a Notebook Instance by IP Address</a>.
 * </p>
 * <note>
 * <p>
 * The URL that you get from a call to <a>CreatePresignedNotebookInstanceUrl</a>
 * is valid only for 5 minutes. If you try to use the URL after the 5-minute
 * limit expires, you are directed to the AWS console sign-in page.
 * </p>
 * </note>
 */
public class CreatePresignedNotebookInstanceUrlRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String notebookInstanceName;

    /**
     * <p>
     * The duration of the session, in seconds. The default is 12 hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1800 - 43200<br/>
     */
    private Integer sessionExpirationDurationInSeconds;

    /**
     * <p>
     * The name of the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the notebook instance.
     *         </p>
     */
    public String getNotebookInstanceName() {
        return notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceName <p>
     *            The name of the notebook instance.
     *            </p>
     */
    public void setNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceName <p>
     *            The name of the notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePresignedNotebookInstanceUrlRequest withNotebookInstanceName(
            String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
        return this;
    }

    /**
     * <p>
     * The duration of the session, in seconds. The default is 12 hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1800 - 43200<br/>
     *
     * @return <p>
     *         The duration of the session, in seconds. The default is 12 hours.
     *         </p>
     */
    public Integer getSessionExpirationDurationInSeconds() {
        return sessionExpirationDurationInSeconds;
    }

    /**
     * <p>
     * The duration of the session, in seconds. The default is 12 hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1800 - 43200<br/>
     *
     * @param sessionExpirationDurationInSeconds <p>
     *            The duration of the session, in seconds. The default is 12
     *            hours.
     *            </p>
     */
    public void setSessionExpirationDurationInSeconds(Integer sessionExpirationDurationInSeconds) {
        this.sessionExpirationDurationInSeconds = sessionExpirationDurationInSeconds;
    }

    /**
     * <p>
     * The duration of the session, in seconds. The default is 12 hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1800 - 43200<br/>
     *
     * @param sessionExpirationDurationInSeconds <p>
     *            The duration of the session, in seconds. The default is 12
     *            hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePresignedNotebookInstanceUrlRequest withSessionExpirationDurationInSeconds(
            Integer sessionExpirationDurationInSeconds) {
        this.sessionExpirationDurationInSeconds = sessionExpirationDurationInSeconds;
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
        if (getNotebookInstanceName() != null)
            sb.append("NotebookInstanceName: " + getNotebookInstanceName() + ",");
        if (getSessionExpirationDurationInSeconds() != null)
            sb.append("SessionExpirationDurationInSeconds: "
                    + getSessionExpirationDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNotebookInstanceName() == null) ? 0 : getNotebookInstanceName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSessionExpirationDurationInSeconds() == null) ? 0
                        : getSessionExpirationDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePresignedNotebookInstanceUrlRequest == false)
            return false;
        CreatePresignedNotebookInstanceUrlRequest other = (CreatePresignedNotebookInstanceUrlRequest) obj;

        if (other.getNotebookInstanceName() == null ^ this.getNotebookInstanceName() == null)
            return false;
        if (other.getNotebookInstanceName() != null
                && other.getNotebookInstanceName().equals(this.getNotebookInstanceName()) == false)
            return false;
        if (other.getSessionExpirationDurationInSeconds() == null
                ^ this.getSessionExpirationDurationInSeconds() == null)
            return false;
        if (other.getSessionExpirationDurationInSeconds() != null
                && other.getSessionExpirationDurationInSeconds().equals(
                        this.getSessionExpirationDurationInSeconds()) == false)
            return false;
        return true;
    }
}
