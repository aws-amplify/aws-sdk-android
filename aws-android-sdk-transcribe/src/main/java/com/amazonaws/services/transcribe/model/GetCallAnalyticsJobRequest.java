/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about a call analytics job. To see the status of the job,
 * check the <code>CallAnalyticsJobStatus</code> field. If the status is
 * <code>COMPLETED</code>, the job is finished and you can find the results at
 * the location specified in the <code>TranscriptFileUri</code> field. If you
 * enable personally identifiable information (PII) redaction, the redacted
 * transcript appears in the <code>RedactedTranscriptFileUri</code> field.
 * </p>
 */
public class GetCallAnalyticsJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the analytics job you want information about. This value is
     * case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String callAnalyticsJobName;

    /**
     * <p>
     * The name of the analytics job you want information about. This value is
     * case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the analytics job you want information about. This
     *         value is case sensitive.
     *         </p>
     */
    public String getCallAnalyticsJobName() {
        return callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the analytics job you want information about. This value is
     * case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param callAnalyticsJobName <p>
     *            The name of the analytics job you want information about. This
     *            value is case sensitive.
     *            </p>
     */
    public void setCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the analytics job you want information about. This value is
     * case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param callAnalyticsJobName <p>
     *            The name of the analytics job you want information about. This
     *            value is case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCallAnalyticsJobRequest withCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
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
        if (getCallAnalyticsJobName() != null)
            sb.append("CallAnalyticsJobName: " + getCallAnalyticsJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCallAnalyticsJobName() == null) ? 0 : getCallAnalyticsJobName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCallAnalyticsJobRequest == false)
            return false;
        GetCallAnalyticsJobRequest other = (GetCallAnalyticsJobRequest) obj;

        if (other.getCallAnalyticsJobName() == null ^ this.getCallAnalyticsJobName() == null)
            return false;
        if (other.getCallAnalyticsJobName() != null
                && other.getCallAnalyticsJobName().equals(this.getCallAnalyticsJobName()) == false)
            return false;
        return true;
    }
}
