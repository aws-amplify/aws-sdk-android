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
package com.amazonaws.services.compute-optimizer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Exports optimization recommendations for Auto Scaling groups.</p> <p>Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting Recommendations</a> in the <i>Compute Optimizer User Guide</i>.</p> <p>You can have only one Auto Scaling group export job in progress per AWS Region.</p>
 */
public class ExportAutoScalingGroupRecommendationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The IDs of the AWS accounts for which to export Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to export recommendations.</p> <p>This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted.</p> <p>You can specify multiple account IDs per request.</p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>An array of objects that describe a filter to export a more specific set of Auto Scaling group recommendations.</p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>The recommendations data to include in the export file.</p>
     */
    private java.util.List<String> fieldsToExport;

    /**
     * <p>An object to specify the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for the export job.</p> <p>You must create the destination Amazon S3 bucket for your recommendations export before you create the export job. Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3 bucket. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/create-s3-bucket-policy-for-compute-optimizer.html">Amazon S3 Bucket Policy for Compute Optimizer</a> in the <i>Compute Optimizer user guide</i>.</p>
     */
    private S3DestinationConfig s3DestinationConfig;

    /**
     * <p>The format of the export file.</p> <p>The only export file format currently supported is <code>Csv</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Csv
     */
    private String fileFormat;

    /**
     * <p>Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the master account of an organization.</p> <p>The member accounts must also be opted in to Compute Optimizer.</p> <p>Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted.</p> <p>This parameter cannot be specified together with the account IDs parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.</p>
     */
    private Boolean includeMemberAccounts;

    /**
     * <p>The IDs of the AWS accounts for which to export Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to export recommendations.</p> <p>This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted.</p> <p>You can specify multiple account IDs per request.</p>
     *
     * @return <p>The IDs of the AWS accounts for which to export Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to export recommendations.</p> <p>This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted.</p> <p>You can specify multiple account IDs per request.</p>
     */
    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>The IDs of the AWS accounts for which to export Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to export recommendations.</p> <p>This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted.</p> <p>You can specify multiple account IDs per request.</p>
     *
     * @param accountIds <p>The IDs of the AWS accounts for which to export Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to export recommendations.</p> <p>This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted.</p> <p>You can specify multiple account IDs per request.</p>
     */
    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>The IDs of the AWS accounts for which to export Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to export recommendations.</p> <p>This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted.</p> <p>You can specify multiple account IDs per request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountIds <p>The IDs of the AWS accounts for which to export Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to export recommendations.</p> <p>This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted.</p> <p>You can specify multiple account IDs per request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ExportAutoScalingGroupRecommendationsRequest withAccountIds(String... accountIds) {
        if (getAccountIds() == null) {
            this.accountIds = new java.util.ArrayList<String>(accountIds.length);
        }
        for (String value : accountIds) {
            this.accountIds.add(value);
        }
        return this;
    }

    /**
     * <p>The IDs of the AWS accounts for which to export Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to export recommendations.</p> <p>This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted.</p> <p>You can specify multiple account IDs per request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountIds <p>The IDs of the AWS accounts for which to export Auto Scaling group recommendations.</p> <p>If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to export recommendations.</p> <p>This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted.</p> <p>You can specify multiple account IDs per request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ExportAutoScalingGroupRecommendationsRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>An array of objects that describe a filter to export a more specific set of Auto Scaling group recommendations.</p>
     *
     * @return <p>An array of objects that describe a filter to export a more specific set of Auto Scaling group recommendations.</p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>An array of objects that describe a filter to export a more specific set of Auto Scaling group recommendations.</p>
     *
     * @param filters <p>An array of objects that describe a filter to export a more specific set of Auto Scaling group recommendations.</p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>An array of objects that describe a filter to export a more specific set of Auto Scaling group recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>An array of objects that describe a filter to export a more specific set of Auto Scaling group recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ExportAutoScalingGroupRecommendationsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe a filter to export a more specific set of Auto Scaling group recommendations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>An array of objects that describe a filter to export a more specific set of Auto Scaling group recommendations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ExportAutoScalingGroupRecommendationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>The recommendations data to include in the export file.</p>
     *
     * @return <p>The recommendations data to include in the export file.</p>
     */
    public java.util.List<String> getFieldsToExport() {
        return fieldsToExport;
    }

    /**
     * <p>The recommendations data to include in the export file.</p>
     *
     * @param fieldsToExport <p>The recommendations data to include in the export file.</p>
     */
    public void setFieldsToExport(java.util.Collection<String> fieldsToExport) {
        if (fieldsToExport == null) {
            this.fieldsToExport = null;
            return;
        }

        this.fieldsToExport = new java.util.ArrayList<String>(fieldsToExport);
    }

    /**
     * <p>The recommendations data to include in the export file.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fieldsToExport <p>The recommendations data to include in the export file.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ExportAutoScalingGroupRecommendationsRequest withFieldsToExport(String... fieldsToExport) {
        if (getFieldsToExport() == null) {
            this.fieldsToExport = new java.util.ArrayList<String>(fieldsToExport.length);
        }
        for (String value : fieldsToExport) {
            this.fieldsToExport.add(value);
        }
        return this;
    }

    /**
     * <p>The recommendations data to include in the export file.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fieldsToExport <p>The recommendations data to include in the export file.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ExportAutoScalingGroupRecommendationsRequest withFieldsToExport(java.util.Collection<String> fieldsToExport) {
        setFieldsToExport(fieldsToExport);
        return this;
    }

    /**
     * <p>An object to specify the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for the export job.</p> <p>You must create the destination Amazon S3 bucket for your recommendations export before you create the export job. Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3 bucket. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/create-s3-bucket-policy-for-compute-optimizer.html">Amazon S3 Bucket Policy for Compute Optimizer</a> in the <i>Compute Optimizer user guide</i>.</p>
     *
     * @return <p>An object to specify the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for the export job.</p> <p>You must create the destination Amazon S3 bucket for your recommendations export before you create the export job. Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3 bucket. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/create-s3-bucket-policy-for-compute-optimizer.html">Amazon S3 Bucket Policy for Compute Optimizer</a> in the <i>Compute Optimizer user guide</i>.</p>
     */
    public S3DestinationConfig getS3DestinationConfig() {
        return s3DestinationConfig;
    }

    /**
     * <p>An object to specify the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for the export job.</p> <p>You must create the destination Amazon S3 bucket for your recommendations export before you create the export job. Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3 bucket. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/create-s3-bucket-policy-for-compute-optimizer.html">Amazon S3 Bucket Policy for Compute Optimizer</a> in the <i>Compute Optimizer user guide</i>.</p>
     *
     * @param s3DestinationConfig <p>An object to specify the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for the export job.</p> <p>You must create the destination Amazon S3 bucket for your recommendations export before you create the export job. Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3 bucket. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/create-s3-bucket-policy-for-compute-optimizer.html">Amazon S3 Bucket Policy for Compute Optimizer</a> in the <i>Compute Optimizer user guide</i>.</p>
     */
    public void setS3DestinationConfig(S3DestinationConfig s3DestinationConfig) {
        this.s3DestinationConfig = s3DestinationConfig;
    }

    /**
     * <p>An object to specify the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for the export job.</p> <p>You must create the destination Amazon S3 bucket for your recommendations export before you create the export job. Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3 bucket. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/create-s3-bucket-policy-for-compute-optimizer.html">Amazon S3 Bucket Policy for Compute Optimizer</a> in the <i>Compute Optimizer user guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3DestinationConfig <p>An object to specify the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for the export job.</p> <p>You must create the destination Amazon S3 bucket for your recommendations export before you create the export job. Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3 bucket. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/create-s3-bucket-policy-for-compute-optimizer.html">Amazon S3 Bucket Policy for Compute Optimizer</a> in the <i>Compute Optimizer user guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ExportAutoScalingGroupRecommendationsRequest withS3DestinationConfig(S3DestinationConfig s3DestinationConfig) {
        this.s3DestinationConfig = s3DestinationConfig;
        return this;
    }

    /**
     * <p>The format of the export file.</p> <p>The only export file format currently supported is <code>Csv</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Csv
     *
     * @return <p>The format of the export file.</p> <p>The only export file format currently supported is <code>Csv</code>.</p>
     *
     * @see FileFormat
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * <p>The format of the export file.</p> <p>The only export file format currently supported is <code>Csv</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Csv
     *
     * @param fileFormat <p>The format of the export file.</p> <p>The only export file format currently supported is <code>Csv</code>.</p>
     *
     * @see FileFormat
     */
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>The format of the export file.</p> <p>The only export file format currently supported is <code>Csv</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Csv
     *
     * @param fileFormat <p>The format of the export file.</p> <p>The only export file format currently supported is <code>Csv</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see FileFormat
     */
    public ExportAutoScalingGroupRecommendationsRequest withFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    /**
     * <p>The format of the export file.</p> <p>The only export file format currently supported is <code>Csv</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Csv
     *
     * @param fileFormat <p>The format of the export file.</p> <p>The only export file format currently supported is <code>Csv</code>.</p>
     *
     * @see FileFormat
     */
    public void setFileFormat(FileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
    }

    /**
     * <p>The format of the export file.</p> <p>The only export file format currently supported is <code>Csv</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Csv
     *
     * @param fileFormat <p>The format of the export file.</p> <p>The only export file format currently supported is <code>Csv</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see FileFormat
     */
    public ExportAutoScalingGroupRecommendationsRequest withFileFormat(FileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
        return this;
    }

    /**
     * <p>Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the master account of an organization.</p> <p>The member accounts must also be opted in to Compute Optimizer.</p> <p>Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted.</p> <p>This parameter cannot be specified together with the account IDs parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.</p>
     *
     * @return <p>Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the master account of an organization.</p> <p>The member accounts must also be opted in to Compute Optimizer.</p> <p>Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted.</p> <p>This parameter cannot be specified together with the account IDs parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.</p>
     */
    public Boolean isIncludeMemberAccounts() {
        return includeMemberAccounts;
    }

    /**
     * <p>Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the master account of an organization.</p> <p>The member accounts must also be opted in to Compute Optimizer.</p> <p>Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted.</p> <p>This parameter cannot be specified together with the account IDs parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.</p>
     *
     * @return <p>Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the master account of an organization.</p> <p>The member accounts must also be opted in to Compute Optimizer.</p> <p>Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted.</p> <p>This parameter cannot be specified together with the account IDs parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.</p>
     */
    public Boolean getIncludeMemberAccounts() {
        return includeMemberAccounts;
    }

    /**
     * <p>Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the master account of an organization.</p> <p>The member accounts must also be opted in to Compute Optimizer.</p> <p>Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted.</p> <p>This parameter cannot be specified together with the account IDs parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.</p>
     *
     * @param includeMemberAccounts <p>Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the master account of an organization.</p> <p>The member accounts must also be opted in to Compute Optimizer.</p> <p>Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted.</p> <p>This parameter cannot be specified together with the account IDs parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.</p>
     */
    public void setIncludeMemberAccounts(Boolean includeMemberAccounts) {
        this.includeMemberAccounts = includeMemberAccounts;
    }

    /**
     * <p>Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the master account of an organization.</p> <p>The member accounts must also be opted in to Compute Optimizer.</p> <p>Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted.</p> <p>This parameter cannot be specified together with the account IDs parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeMemberAccounts <p>Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the master account of an organization.</p> <p>The member accounts must also be opted in to Compute Optimizer.</p> <p>Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted.</p> <p>This parameter cannot be specified together with the account IDs parameter. The parameters are mutually exclusive.</p> <p>Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ExportAutoScalingGroupRecommendationsRequest withIncludeMemberAccounts(Boolean includeMemberAccounts) {
        this.includeMemberAccounts = includeMemberAccounts;
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
        if (getAccountIds() != null) sb.append("accountIds: " + getAccountIds() + ",");
        if (getFilters() != null) sb.append("filters: " + getFilters() + ",");
        if (getFieldsToExport() != null) sb.append("fieldsToExport: " + getFieldsToExport() + ",");
        if (getS3DestinationConfig() != null) sb.append("s3DestinationConfig: " + getS3DestinationConfig() + ",");
        if (getFileFormat() != null) sb.append("fileFormat: " + getFileFormat() + ",");
        if (getIncludeMemberAccounts() != null) sb.append("includeMemberAccounts: " + getIncludeMemberAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getFieldsToExport() == null) ? 0 : getFieldsToExport().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationConfig() == null) ? 0 : getS3DestinationConfig().hashCode());
        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        hashCode = prime * hashCode + ((getIncludeMemberAccounts() == null) ? 0 : getIncludeMemberAccounts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ExportAutoScalingGroupRecommendationsRequest == false) return false;
        ExportAutoScalingGroupRecommendationsRequest other = (ExportAutoScalingGroupRecommendationsRequest)obj;

        if (other.getAccountIds() == null ^ this.getAccountIds() == null) return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false) return false;
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        if (other.getFieldsToExport() == null ^ this.getFieldsToExport() == null) return false;
        if (other.getFieldsToExport() != null && other.getFieldsToExport().equals(this.getFieldsToExport()) == false) return false;
        if (other.getS3DestinationConfig() == null ^ this.getS3DestinationConfig() == null) return false;
        if (other.getS3DestinationConfig() != null && other.getS3DestinationConfig().equals(this.getS3DestinationConfig()) == false) return false;
        if (other.getFileFormat() == null ^ this.getFileFormat() == null) return false;
        if (other.getFileFormat() != null && other.getFileFormat().equals(this.getFileFormat()) == false) return false;
        if (other.getIncludeMemberAccounts() == null ^ this.getIncludeMemberAccounts() == null) return false;
        if (other.getIncludeMemberAccounts() != null && other.getIncludeMemberAccounts().equals(this.getIncludeMemberAccounts()) == false) return false;
        return true;
    }
}
