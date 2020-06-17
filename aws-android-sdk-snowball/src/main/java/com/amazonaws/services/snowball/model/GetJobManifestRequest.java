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

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a link to an Amazon S3 presigned URL for the manifest file associated
 * with the specified <code>JobId</code> value. You can access the manifest file
 * for up to 60 minutes after this request has been made. To access the manifest
 * file after 60 minutes have passed, you'll have to make another call to the
 * <code>GetJobManifest</code> action.
 * </p>
 * <p>
 * The manifest is an encrypted file that you can download after your job enters
 * the <code>WithCustomer</code> status. The manifest is decrypted by using the
 * <code>UnlockCode</code> code value, when you pass both values to the Snowball
 * through the Snowball client when the client is started for the first time.
 * </p>
 * <p>
 * As a best practice, we recommend that you don't save a copy of an
 * <code>UnlockCode</code> value in the same location as the manifest file for
 * that job. Saving these separately helps prevent unauthorized parties from
 * gaining access to the Snowball associated with that job.
 * </p>
 * <p>
 * The credentials of a given job, including its manifest file and unlock code,
 * expire 90 days after the job is created.
 * </p>
 */
public class GetJobManifestRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID for a job that you want to get the manifest file for, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>(M|J)ID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}
     * <br/>
     */
    private String jobId;

    /**
     * <p>
     * The ID for a job that you want to get the manifest file for, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>(M|J)ID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}
     * <br/>
     *
     * @return <p>
     *         The ID for a job that you want to get the manifest file for, for
     *         example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The ID for a job that you want to get the manifest file for, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>(M|J)ID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}
     * <br/>
     *
     * @param jobId <p>
     *            The ID for a job that you want to get the manifest file for,
     *            for example
     *            <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID for a job that you want to get the manifest file for, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>(M|J)ID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}
     * <br/>
     *
     * @param jobId <p>
     *            The ID for a job that you want to get the manifest file for,
     *            for example
     *            <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobManifestRequest withJobId(String jobId) {
        this.jobId = jobId;
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobManifestRequest == false)
            return false;
        GetJobManifestRequest other = (GetJobManifestRequest) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        return true;
    }
}
