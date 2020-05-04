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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Set the supplied tag-set on an Amazon S3 Batch Operations job.</p> <p>A tag is a key-value pair. You can associate Amazon S3 Batch Operations tags with any job by sending a PUT request against the tagging subresource that is associated with the job. To modify the existing tag set, you can either replace the existing tag set entirely, or make changes within the existing tag set by retrieving the existing tag set using <a>GetJobTagging</a>, modify that tag set, and use this API action to replace the tag set with the one you have modified.. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">Using Job Tags</a> in the Amazon Simple Storage Service Developer Guide. </p> <p/> <note> <ul> <li> <p>If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations job. If you use this method, you will be charged for a Tier 1 Request (PUT). For more information, see <a href="http://aws.amazon.com/s3/pricing/">Amazon S3 pricing</a>.</p> </li> <li> <p>For deleting existing tags for your batch operations job, <a>DeleteJobTagging</a> request is preferred because it achieves the same result without incurring charges.</p> </li> <li> <p>A few things to consider about using tags:</p> <ul> <li> <p>Amazon S3 limits the maximum number of tags to 50 tags per job.</p> </li> <li> <p>You can associate up to 50 tags with a job as long as they have unique tag keys.</p> </li> <li> <p>A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in length.</p> </li> <li> <p>The key and values are case sensitive.</p> </li> <li> <p>For tagging-related restrictions related to characters and encodings, see <a href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined Tag Restrictions</a>.</p> </li> </ul> </li> </ul> </note> <p/> <p>To use this operation, you must have permission to perform the <code>s3:PutJobTagging</code> action.</p> <p>Related actions include:</p> <ul> <li> <p> <a>CreateJob</a> </p> </li> <li> <p> <a>GetJobTagging</a> </p> </li> <li> <p> <a>DeleteJobTagging</a> </p> </li> </ul>
 */
public class PutJobTaggingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The AWS account ID associated with the Amazon S3 Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String accountId;

    /**
     * <p>The ID for the Amazon S3 Batch Operations job whose tags you want to replace.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     */
    private String jobId;

    /**
     * <p>The set of tags to associate with the Amazon S3 Batch Operations job.</p>
     */
    private java.util.List<S3Tag> tags;

    /**
     * <p>The AWS account ID associated with the Amazon S3 Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>The AWS account ID associated with the Amazon S3 Batch Operations job.</p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>The AWS account ID associated with the Amazon S3 Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>The AWS account ID associated with the Amazon S3 Batch Operations job.</p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>The AWS account ID associated with the Amazon S3 Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>The AWS account ID associated with the Amazon S3 Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutJobTaggingRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>The ID for the Amazon S3 Batch Operations job whose tags you want to replace.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @return <p>The ID for the Amazon S3 Batch Operations job whose tags you want to replace.</p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>The ID for the Amazon S3 Batch Operations job whose tags you want to replace.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @param jobId <p>The ID for the Amazon S3 Batch Operations job whose tags you want to replace.</p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>The ID for the Amazon S3 Batch Operations job whose tags you want to replace.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @param jobId <p>The ID for the Amazon S3 Batch Operations job whose tags you want to replace.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutJobTaggingRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>The set of tags to associate with the Amazon S3 Batch Operations job.</p>
     *
     * @return <p>The set of tags to associate with the Amazon S3 Batch Operations job.</p>
     */
    public java.util.List<S3Tag> getTags() {
        return tags;
    }

    /**
     * <p>The set of tags to associate with the Amazon S3 Batch Operations job.</p>
     *
     * @param tags <p>The set of tags to associate with the Amazon S3 Batch Operations job.</p>
     */
    public void setTags(java.util.Collection<S3Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<S3Tag>(tags);
    }

    /**
     * <p>The set of tags to associate with the Amazon S3 Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The set of tags to associate with the Amazon S3 Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutJobTaggingRequest withTags(S3Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<S3Tag>(tags.length);
        }
        for (S3Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>The set of tags to associate with the Amazon S3 Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The set of tags to associate with the Amazon S3 Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutJobTaggingRequest withTags(java.util.Collection<S3Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
        if (getJobId() != null) sb.append("JobId: " + getJobId() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutJobTaggingRequest == false) return false;
        PutJobTaggingRequest other = (PutJobTaggingRequest)obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false;
        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false;
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false;
        return true;
    }
}
