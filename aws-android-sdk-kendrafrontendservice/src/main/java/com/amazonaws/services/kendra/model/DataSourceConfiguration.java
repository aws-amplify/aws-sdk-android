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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration information for a Amazon Kendra data source.
 * </p>
 */
public class DataSourceConfiguration implements Serializable {
    /**
     * <p>
     * Provides information to create a connector for a document repository in
     * an Amazon S3 bucket.
     * </p>
     */
    private S3DataSourceConfiguration s3Configuration;

    /**
     * <p>
     * Provides information necessary to create a connector for a Microsoft
     * SharePoint site.
     * </p>
     */
    private SharePointConfiguration sharePointConfiguration;

    /**
     * <p>
     * Provides information necessary to create a connector for a database.
     * </p>
     */
    private DatabaseConfiguration databaseConfiguration;

    /**
     * <p>
     * Provides configuration information for data sources that connect to a
     * Salesforce site.
     * </p>
     */
    private SalesforceConfiguration salesforceConfiguration;

    /**
     * <p>
     * Provided configuration for data sources that connect to Microsoft
     * OneDrive.
     * </p>
     */
    private OneDriveConfiguration oneDriveConfiguration;

    /**
     * <p>
     * Provides configuration for data sources that connect to ServiceNow
     * instances.
     * </p>
     */
    private ServiceNowConfiguration serviceNowConfiguration;

    /**
     * <p>
     * Provides information to create a connector for a document repository in
     * an Amazon S3 bucket.
     * </p>
     *
     * @return <p>
     *         Provides information to create a connector for a document
     *         repository in an Amazon S3 bucket.
     *         </p>
     */
    public S3DataSourceConfiguration getS3Configuration() {
        return s3Configuration;
    }

    /**
     * <p>
     * Provides information to create a connector for a document repository in
     * an Amazon S3 bucket.
     * </p>
     *
     * @param s3Configuration <p>
     *            Provides information to create a connector for a document
     *            repository in an Amazon S3 bucket.
     *            </p>
     */
    public void setS3Configuration(S3DataSourceConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * Provides information to create a connector for a document repository in
     * an Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Configuration <p>
     *            Provides information to create a connector for a document
     *            repository in an Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceConfiguration withS3Configuration(S3DataSourceConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
        return this;
    }

    /**
     * <p>
     * Provides information necessary to create a connector for a Microsoft
     * SharePoint site.
     * </p>
     *
     * @return <p>
     *         Provides information necessary to create a connector for a
     *         Microsoft SharePoint site.
     *         </p>
     */
    public SharePointConfiguration getSharePointConfiguration() {
        return sharePointConfiguration;
    }

    /**
     * <p>
     * Provides information necessary to create a connector for a Microsoft
     * SharePoint site.
     * </p>
     *
     * @param sharePointConfiguration <p>
     *            Provides information necessary to create a connector for a
     *            Microsoft SharePoint site.
     *            </p>
     */
    public void setSharePointConfiguration(SharePointConfiguration sharePointConfiguration) {
        this.sharePointConfiguration = sharePointConfiguration;
    }

    /**
     * <p>
     * Provides information necessary to create a connector for a Microsoft
     * SharePoint site.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sharePointConfiguration <p>
     *            Provides information necessary to create a connector for a
     *            Microsoft SharePoint site.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceConfiguration withSharePointConfiguration(
            SharePointConfiguration sharePointConfiguration) {
        this.sharePointConfiguration = sharePointConfiguration;
        return this;
    }

    /**
     * <p>
     * Provides information necessary to create a connector for a database.
     * </p>
     *
     * @return <p>
     *         Provides information necessary to create a connector for a
     *         database.
     *         </p>
     */
    public DatabaseConfiguration getDatabaseConfiguration() {
        return databaseConfiguration;
    }

    /**
     * <p>
     * Provides information necessary to create a connector for a database.
     * </p>
     *
     * @param databaseConfiguration <p>
     *            Provides information necessary to create a connector for a
     *            database.
     *            </p>
     */
    public void setDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
        this.databaseConfiguration = databaseConfiguration;
    }

    /**
     * <p>
     * Provides information necessary to create a connector for a database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseConfiguration <p>
     *            Provides information necessary to create a connector for a
     *            database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceConfiguration withDatabaseConfiguration(
            DatabaseConfiguration databaseConfiguration) {
        this.databaseConfiguration = databaseConfiguration;
        return this;
    }

    /**
     * <p>
     * Provides configuration information for data sources that connect to a
     * Salesforce site.
     * </p>
     *
     * @return <p>
     *         Provides configuration information for data sources that connect
     *         to a Salesforce site.
     *         </p>
     */
    public SalesforceConfiguration getSalesforceConfiguration() {
        return salesforceConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for data sources that connect to a
     * Salesforce site.
     * </p>
     *
     * @param salesforceConfiguration <p>
     *            Provides configuration information for data sources that
     *            connect to a Salesforce site.
     *            </p>
     */
    public void setSalesforceConfiguration(SalesforceConfiguration salesforceConfiguration) {
        this.salesforceConfiguration = salesforceConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for data sources that connect to a
     * Salesforce site.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param salesforceConfiguration <p>
     *            Provides configuration information for data sources that
     *            connect to a Salesforce site.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceConfiguration withSalesforceConfiguration(
            SalesforceConfiguration salesforceConfiguration) {
        this.salesforceConfiguration = salesforceConfiguration;
        return this;
    }

    /**
     * <p>
     * Provided configuration for data sources that connect to Microsoft
     * OneDrive.
     * </p>
     *
     * @return <p>
     *         Provided configuration for data sources that connect to Microsoft
     *         OneDrive.
     *         </p>
     */
    public OneDriveConfiguration getOneDriveConfiguration() {
        return oneDriveConfiguration;
    }

    /**
     * <p>
     * Provided configuration for data sources that connect to Microsoft
     * OneDrive.
     * </p>
     *
     * @param oneDriveConfiguration <p>
     *            Provided configuration for data sources that connect to
     *            Microsoft OneDrive.
     *            </p>
     */
    public void setOneDriveConfiguration(OneDriveConfiguration oneDriveConfiguration) {
        this.oneDriveConfiguration = oneDriveConfiguration;
    }

    /**
     * <p>
     * Provided configuration for data sources that connect to Microsoft
     * OneDrive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param oneDriveConfiguration <p>
     *            Provided configuration for data sources that connect to
     *            Microsoft OneDrive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceConfiguration withOneDriveConfiguration(
            OneDriveConfiguration oneDriveConfiguration) {
        this.oneDriveConfiguration = oneDriveConfiguration;
        return this;
    }

    /**
     * <p>
     * Provides configuration for data sources that connect to ServiceNow
     * instances.
     * </p>
     *
     * @return <p>
     *         Provides configuration for data sources that connect to
     *         ServiceNow instances.
     *         </p>
     */
    public ServiceNowConfiguration getServiceNowConfiguration() {
        return serviceNowConfiguration;
    }

    /**
     * <p>
     * Provides configuration for data sources that connect to ServiceNow
     * instances.
     * </p>
     *
     * @param serviceNowConfiguration <p>
     *            Provides configuration for data sources that connect to
     *            ServiceNow instances.
     *            </p>
     */
    public void setServiceNowConfiguration(ServiceNowConfiguration serviceNowConfiguration) {
        this.serviceNowConfiguration = serviceNowConfiguration;
    }

    /**
     * <p>
     * Provides configuration for data sources that connect to ServiceNow
     * instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceNowConfiguration <p>
     *            Provides configuration for data sources that connect to
     *            ServiceNow instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceConfiguration withServiceNowConfiguration(
            ServiceNowConfiguration serviceNowConfiguration) {
        this.serviceNowConfiguration = serviceNowConfiguration;
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
        if (getS3Configuration() != null)
            sb.append("S3Configuration: " + getS3Configuration() + ",");
        if (getSharePointConfiguration() != null)
            sb.append("SharePointConfiguration: " + getSharePointConfiguration() + ",");
        if (getDatabaseConfiguration() != null)
            sb.append("DatabaseConfiguration: " + getDatabaseConfiguration() + ",");
        if (getSalesforceConfiguration() != null)
            sb.append("SalesforceConfiguration: " + getSalesforceConfiguration() + ",");
        if (getOneDriveConfiguration() != null)
            sb.append("OneDriveConfiguration: " + getOneDriveConfiguration() + ",");
        if (getServiceNowConfiguration() != null)
            sb.append("ServiceNowConfiguration: " + getServiceNowConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime
                * hashCode
                + ((getSharePointConfiguration() == null) ? 0 : getSharePointConfiguration()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDatabaseConfiguration() == null) ? 0 : getDatabaseConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getSalesforceConfiguration() == null) ? 0 : getSalesforceConfiguration()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getOneDriveConfiguration() == null) ? 0 : getOneDriveConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceNowConfiguration() == null) ? 0 : getServiceNowConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceConfiguration == false)
            return false;
        DataSourceConfiguration other = (DataSourceConfiguration) obj;

        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null
                && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getSharePointConfiguration() == null ^ this.getSharePointConfiguration() == null)
            return false;
        if (other.getSharePointConfiguration() != null
                && other.getSharePointConfiguration().equals(this.getSharePointConfiguration()) == false)
            return false;
        if (other.getDatabaseConfiguration() == null ^ this.getDatabaseConfiguration() == null)
            return false;
        if (other.getDatabaseConfiguration() != null
                && other.getDatabaseConfiguration().equals(this.getDatabaseConfiguration()) == false)
            return false;
        if (other.getSalesforceConfiguration() == null ^ this.getSalesforceConfiguration() == null)
            return false;
        if (other.getSalesforceConfiguration() != null
                && other.getSalesforceConfiguration().equals(this.getSalesforceConfiguration()) == false)
            return false;
        if (other.getOneDriveConfiguration() == null ^ this.getOneDriveConfiguration() == null)
            return false;
        if (other.getOneDriveConfiguration() != null
                && other.getOneDriveConfiguration().equals(this.getOneDriveConfiguration()) == false)
            return false;
        if (other.getServiceNowConfiguration() == null ^ this.getServiceNowConfiguration() == null)
            return false;
        if (other.getServiceNowConfiguration() != null
                && other.getServiceNowConfiguration().equals(this.getServiceNowConfiguration()) == false)
            return false;
        return true;
    }
}
