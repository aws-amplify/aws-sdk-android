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

/**
 * <p>
 * Contains an array of AWS resource objects. Each object represents an Amazon
 * S3 bucket, an AWS Lambda function, or an Amazon Machine Image (AMI) based on
 * Amazon EC2 that is associated with a particular job.
 * </p>
 */
public class JobResource implements Serializable {
    /**
     * <p>
     * An array of <code>S3Resource</code> objects.
     * </p>
     */
    private java.util.List<S3Resource> s3Resources;

    /**
     * <p>
     * The Python-language Lambda functions for this job.
     * </p>
     */
    private java.util.List<LambdaResource> lambdaResources;

    /**
     * <p>
     * The Amazon Machine Images (AMIs) associated with this job.
     * </p>
     */
    private java.util.List<Ec2AmiResource> ec2AmiResources;

    /**
     * <p>
     * An array of <code>S3Resource</code> objects.
     * </p>
     *
     * @return <p>
     *         An array of <code>S3Resource</code> objects.
     *         </p>
     */
    public java.util.List<S3Resource> getS3Resources() {
        return s3Resources;
    }

    /**
     * <p>
     * An array of <code>S3Resource</code> objects.
     * </p>
     *
     * @param s3Resources <p>
     *            An array of <code>S3Resource</code> objects.
     *            </p>
     */
    public void setS3Resources(java.util.Collection<S3Resource> s3Resources) {
        if (s3Resources == null) {
            this.s3Resources = null;
            return;
        }

        this.s3Resources = new java.util.ArrayList<S3Resource>(s3Resources);
    }

    /**
     * <p>
     * An array of <code>S3Resource</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Resources <p>
     *            An array of <code>S3Resource</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobResource withS3Resources(S3Resource... s3Resources) {
        if (getS3Resources() == null) {
            this.s3Resources = new java.util.ArrayList<S3Resource>(s3Resources.length);
        }
        for (S3Resource value : s3Resources) {
            this.s3Resources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>S3Resource</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Resources <p>
     *            An array of <code>S3Resource</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobResource withS3Resources(java.util.Collection<S3Resource> s3Resources) {
        setS3Resources(s3Resources);
        return this;
    }

    /**
     * <p>
     * The Python-language Lambda functions for this job.
     * </p>
     *
     * @return <p>
     *         The Python-language Lambda functions for this job.
     *         </p>
     */
    public java.util.List<LambdaResource> getLambdaResources() {
        return lambdaResources;
    }

    /**
     * <p>
     * The Python-language Lambda functions for this job.
     * </p>
     *
     * @param lambdaResources <p>
     *            The Python-language Lambda functions for this job.
     *            </p>
     */
    public void setLambdaResources(java.util.Collection<LambdaResource> lambdaResources) {
        if (lambdaResources == null) {
            this.lambdaResources = null;
            return;
        }

        this.lambdaResources = new java.util.ArrayList<LambdaResource>(lambdaResources);
    }

    /**
     * <p>
     * The Python-language Lambda functions for this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaResources <p>
     *            The Python-language Lambda functions for this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobResource withLambdaResources(LambdaResource... lambdaResources) {
        if (getLambdaResources() == null) {
            this.lambdaResources = new java.util.ArrayList<LambdaResource>(lambdaResources.length);
        }
        for (LambdaResource value : lambdaResources) {
            this.lambdaResources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Python-language Lambda functions for this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaResources <p>
     *            The Python-language Lambda functions for this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobResource withLambdaResources(java.util.Collection<LambdaResource> lambdaResources) {
        setLambdaResources(lambdaResources);
        return this;
    }

    /**
     * <p>
     * The Amazon Machine Images (AMIs) associated with this job.
     * </p>
     *
     * @return <p>
     *         The Amazon Machine Images (AMIs) associated with this job.
     *         </p>
     */
    public java.util.List<Ec2AmiResource> getEc2AmiResources() {
        return ec2AmiResources;
    }

    /**
     * <p>
     * The Amazon Machine Images (AMIs) associated with this job.
     * </p>
     *
     * @param ec2AmiResources <p>
     *            The Amazon Machine Images (AMIs) associated with this job.
     *            </p>
     */
    public void setEc2AmiResources(java.util.Collection<Ec2AmiResource> ec2AmiResources) {
        if (ec2AmiResources == null) {
            this.ec2AmiResources = null;
            return;
        }

        this.ec2AmiResources = new java.util.ArrayList<Ec2AmiResource>(ec2AmiResources);
    }

    /**
     * <p>
     * The Amazon Machine Images (AMIs) associated with this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2AmiResources <p>
     *            The Amazon Machine Images (AMIs) associated with this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobResource withEc2AmiResources(Ec2AmiResource... ec2AmiResources) {
        if (getEc2AmiResources() == null) {
            this.ec2AmiResources = new java.util.ArrayList<Ec2AmiResource>(ec2AmiResources.length);
        }
        for (Ec2AmiResource value : ec2AmiResources) {
            this.ec2AmiResources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Machine Images (AMIs) associated with this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2AmiResources <p>
     *            The Amazon Machine Images (AMIs) associated with this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobResource withEc2AmiResources(java.util.Collection<Ec2AmiResource> ec2AmiResources) {
        setEc2AmiResources(ec2AmiResources);
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
        if (getS3Resources() != null)
            sb.append("S3Resources: " + getS3Resources() + ",");
        if (getLambdaResources() != null)
            sb.append("LambdaResources: " + getLambdaResources() + ",");
        if (getEc2AmiResources() != null)
            sb.append("Ec2AmiResources: " + getEc2AmiResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3Resources() == null) ? 0 : getS3Resources().hashCode());
        hashCode = prime * hashCode
                + ((getLambdaResources() == null) ? 0 : getLambdaResources().hashCode());
        hashCode = prime * hashCode
                + ((getEc2AmiResources() == null) ? 0 : getEc2AmiResources().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobResource == false)
            return false;
        JobResource other = (JobResource) obj;

        if (other.getS3Resources() == null ^ this.getS3Resources() == null)
            return false;
        if (other.getS3Resources() != null
                && other.getS3Resources().equals(this.getS3Resources()) == false)
            return false;
        if (other.getLambdaResources() == null ^ this.getLambdaResources() == null)
            return false;
        if (other.getLambdaResources() != null
                && other.getLambdaResources().equals(this.getLambdaResources()) == false)
            return false;
        if (other.getEc2AmiResources() == null ^ this.getEc2AmiResources() == null)
            return false;
        if (other.getEc2AmiResources() != null
                && other.getEc2AmiResources().equals(this.getEc2AmiResources()) == false)
            return false;
        return true;
    }
}
