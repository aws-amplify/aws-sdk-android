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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Container for restore job parameters.
 * </p>
 */
public class RestoreRequest implements Serializable {
    /**
     * <p>
     * Lifetime of the active copy in days. Do not use with restores that
     * specify <code>OutputLocation</code>.
     * </p>
     */
    private Integer days;

    /**
     * <p>
     * S3 Glacier related parameters pertaining to this job. Do not use with
     * restores that specify <code>OutputLocation</code>.
     * </p>
     */
    private GlacierJobParameters glacierJobParameters;

    /**
     * <p>
     * Type of restore request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELECT
     */
    private String type;

    /**
     * <p>
     * S3 Glacier retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Bulk, Expedited
     */
    private String tier;

    /**
     * <p>
     * The optional description for the job.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Describes the parameters for Select job types.
     * </p>
     */
    private SelectParameters selectParameters;

    /**
     * <p>
     * Describes the location where the restore job's output is stored.
     * </p>
     */
    private OutputLocation outputLocation;

    /**
     * <p>
     * Lifetime of the active copy in days. Do not use with restores that
     * specify <code>OutputLocation</code>.
     * </p>
     *
     * @return <p>
     *         Lifetime of the active copy in days. Do not use with restores
     *         that specify <code>OutputLocation</code>.
     *         </p>
     */
    public Integer getDays() {
        return days;
    }

    /**
     * <p>
     * Lifetime of the active copy in days. Do not use with restores that
     * specify <code>OutputLocation</code>.
     * </p>
     *
     * @param days <p>
     *            Lifetime of the active copy in days. Do not use with restores
     *            that specify <code>OutputLocation</code>.
     *            </p>
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * <p>
     * Lifetime of the active copy in days. Do not use with restores that
     * specify <code>OutputLocation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param days <p>
     *            Lifetime of the active copy in days. Do not use with restores
     *            that specify <code>OutputLocation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreRequest withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * <p>
     * S3 Glacier related parameters pertaining to this job. Do not use with
     * restores that specify <code>OutputLocation</code>.
     * </p>
     *
     * @return <p>
     *         S3 Glacier related parameters pertaining to this job. Do not use
     *         with restores that specify <code>OutputLocation</code>.
     *         </p>
     */
    public GlacierJobParameters getGlacierJobParameters() {
        return glacierJobParameters;
    }

    /**
     * <p>
     * S3 Glacier related parameters pertaining to this job. Do not use with
     * restores that specify <code>OutputLocation</code>.
     * </p>
     *
     * @param glacierJobParameters <p>
     *            S3 Glacier related parameters pertaining to this job. Do not
     *            use with restores that specify <code>OutputLocation</code>.
     *            </p>
     */
    public void setGlacierJobParameters(GlacierJobParameters glacierJobParameters) {
        this.glacierJobParameters = glacierJobParameters;
    }

    /**
     * <p>
     * S3 Glacier related parameters pertaining to this job. Do not use with
     * restores that specify <code>OutputLocation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param glacierJobParameters <p>
     *            S3 Glacier related parameters pertaining to this job. Do not
     *            use with restores that specify <code>OutputLocation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreRequest withGlacierJobParameters(GlacierJobParameters glacierJobParameters) {
        this.glacierJobParameters = glacierJobParameters;
        return this;
    }

    /**
     * <p>
     * Type of restore request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELECT
     *
     * @return <p>
     *         Type of restore request.
     *         </p>
     * @see RestoreRequestType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Type of restore request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELECT
     *
     * @param type <p>
     *            Type of restore request.
     *            </p>
     * @see RestoreRequestType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of restore request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELECT
     *
     * @param type <p>
     *            Type of restore request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RestoreRequestType
     */
    public RestoreRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Type of restore request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELECT
     *
     * @param type <p>
     *            Type of restore request.
     *            </p>
     * @see RestoreRequestType
     */
    public void setType(RestoreRequestType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Type of restore request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELECT
     *
     * @param type <p>
     *            Type of restore request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RestoreRequestType
     */
    public RestoreRequest withType(RestoreRequestType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * S3 Glacier retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Bulk, Expedited
     *
     * @return <p>
     *         S3 Glacier retrieval tier at which the restore will be processed.
     *         </p>
     * @see Tier
     */
    public String getTier() {
        return tier;
    }

    /**
     * <p>
     * S3 Glacier retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Bulk, Expedited
     *
     * @param tier <p>
     *            S3 Glacier retrieval tier at which the restore will be
     *            processed.
     *            </p>
     * @see Tier
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * S3 Glacier retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Bulk, Expedited
     *
     * @param tier <p>
     *            S3 Glacier retrieval tier at which the restore will be
     *            processed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tier
     */
    public RestoreRequest withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * <p>
     * S3 Glacier retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Bulk, Expedited
     *
     * @param tier <p>
     *            S3 Glacier retrieval tier at which the restore will be
     *            processed.
     *            </p>
     * @see Tier
     */
    public void setTier(Tier tier) {
        this.tier = tier.toString();
    }

    /**
     * <p>
     * S3 Glacier retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Bulk, Expedited
     *
     * @param tier <p>
     *            S3 Glacier retrieval tier at which the restore will be
     *            processed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tier
     */
    public RestoreRequest withTier(Tier tier) {
        this.tier = tier.toString();
        return this;
    }

    /**
     * <p>
     * The optional description for the job.
     * </p>
     *
     * @return <p>
     *         The optional description for the job.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The optional description for the job.
     * </p>
     *
     * @param description <p>
     *            The optional description for the job.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The optional description for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Describes the parameters for Select job types.
     * </p>
     *
     * @return <p>
     *         Describes the parameters for Select job types.
     *         </p>
     */
    public SelectParameters getSelectParameters() {
        return selectParameters;
    }

    /**
     * <p>
     * Describes the parameters for Select job types.
     * </p>
     *
     * @param selectParameters <p>
     *            Describes the parameters for Select job types.
     *            </p>
     */
    public void setSelectParameters(SelectParameters selectParameters) {
        this.selectParameters = selectParameters;
    }

    /**
     * <p>
     * Describes the parameters for Select job types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selectParameters <p>
     *            Describes the parameters for Select job types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreRequest withSelectParameters(SelectParameters selectParameters) {
        this.selectParameters = selectParameters;
        return this;
    }

    /**
     * <p>
     * Describes the location where the restore job's output is stored.
     * </p>
     *
     * @return <p>
     *         Describes the location where the restore job's output is stored.
     *         </p>
     */
    public OutputLocation getOutputLocation() {
        return outputLocation;
    }

    /**
     * <p>
     * Describes the location where the restore job's output is stored.
     * </p>
     *
     * @param outputLocation <p>
     *            Describes the location where the restore job's output is
     *            stored.
     *            </p>
     */
    public void setOutputLocation(OutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * Describes the location where the restore job's output is stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputLocation <p>
     *            Describes the location where the restore job's output is
     *            stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreRequest withOutputLocation(OutputLocation outputLocation) {
        this.outputLocation = outputLocation;
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
        if (getDays() != null)
            sb.append("Days: " + getDays() + ",");
        if (getGlacierJobParameters() != null)
            sb.append("GlacierJobParameters: " + getGlacierJobParameters() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getTier() != null)
            sb.append("Tier: " + getTier() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSelectParameters() != null)
            sb.append("SelectParameters: " + getSelectParameters() + ",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: " + getOutputLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDays() == null) ? 0 : getDays().hashCode());
        hashCode = prime * hashCode
                + ((getGlacierJobParameters() == null) ? 0 : getGlacierJobParameters().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getSelectParameters() == null) ? 0 : getSelectParameters().hashCode());
        hashCode = prime * hashCode
                + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreRequest == false)
            return false;
        RestoreRequest other = (RestoreRequest) obj;

        if (other.getDays() == null ^ this.getDays() == null)
            return false;
        if (other.getDays() != null && other.getDays().equals(this.getDays()) == false)
            return false;
        if (other.getGlacierJobParameters() == null ^ this.getGlacierJobParameters() == null)
            return false;
        if (other.getGlacierJobParameters() != null
                && other.getGlacierJobParameters().equals(this.getGlacierJobParameters()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSelectParameters() == null ^ this.getSelectParameters() == null)
            return false;
        if (other.getSelectParameters() != null
                && other.getSelectParameters().equals(this.getSelectParameters()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null
                && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        return true;
    }
}
