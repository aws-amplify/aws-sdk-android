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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration of the workgroup, which includes the location in Amazon S3
 * where query results are stored, the encryption option, if any, used for query
 * results, whether the Amazon CloudWatch Metrics are enabled for the workgroup
 * and whether workgroup settings override query settings, and the data usage
 * limits for the amount of data scanned per query or per workgroup. The
 * workgroup settings override is specified in EnforceWorkGroupConfiguration
 * (true/false) in the WorkGroupConfiguration. See
 * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
 * </p>
 */
public class WorkGroupConfiguration implements Serializable {
    /**
     * <p>
     * The configuration for the workgroup, which includes the location in
     * Amazon S3 where query results are stored and the encryption option, if
     * any, used for query results. To run the query, you must specify the query
     * results location using one of the ways: either in the workgroup using
     * this setting, or for individual queries (client-side), using
     * <a>ResultConfiguration$OutputLocation</a>. If none of them is set, Athena
     * issues an error that no output location is provided. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a>.
     * </p>
     */
    private ResultConfiguration resultConfiguration;

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side
     * settings. If set to "false", client-side settings are used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     */
    private Boolean enforceWorkGroupConfiguration;

    /**
     * <p>
     * Indicates that the Amazon CloudWatch metrics are enabled for the
     * workgroup.
     * </p>
     */
    private Boolean publishCloudWatchMetricsEnabled;

    /**
     * <p>
     * The upper data usage limit (cutoff) for the amount of bytes a single
     * query in a workgroup is allowed to scan.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10000000 - <br/>
     */
    private Long bytesScannedCutoffPerQuery;

    /**
     * <p>
     * If set to <code>true</code>, allows members assigned to a workgroup to
     * reference Amazon S3 Requester Pays buckets in queries. If set to
     * <code>false</code>, workgroup members cannot query data from Requester
     * Pays buckets, and queries that retrieve data from Requester Pays buckets
     * cause an error. The default is <code>false</code>. For more information
     * about Requester Pays buckets, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html"
     * >Requester Pays Buckets</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     */
    private Boolean requesterPaysEnabled;

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in
     * Amazon S3 where query results are stored and the encryption option, if
     * any, used for query results. To run the query, you must specify the query
     * results location using one of the ways: either in the workgroup using
     * this setting, or for individual queries (client-side), using
     * <a>ResultConfiguration$OutputLocation</a>. If none of them is set, Athena
     * issues an error that no output location is provided. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a>.
     * </p>
     *
     * @return <p>
     *         The configuration for the workgroup, which includes the location
     *         in Amazon S3 where query results are stored and the encryption
     *         option, if any, used for query results. To run the query, you
     *         must specify the query results location using one of the ways:
     *         either in the workgroup using this setting, or for individual
     *         queries (client-side), using
     *         <a>ResultConfiguration$OutputLocation</a>. If none of them is
     *         set, Athena issues an error that no output location is provided.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/athena/latest/ug/querying.html"
     *         >Query Results</a>.
     *         </p>
     */
    public ResultConfiguration getResultConfiguration() {
        return resultConfiguration;
    }

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in
     * Amazon S3 where query results are stored and the encryption option, if
     * any, used for query results. To run the query, you must specify the query
     * results location using one of the ways: either in the workgroup using
     * this setting, or for individual queries (client-side), using
     * <a>ResultConfiguration$OutputLocation</a>. If none of them is set, Athena
     * issues an error that no output location is provided. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a>.
     * </p>
     *
     * @param resultConfiguration <p>
     *            The configuration for the workgroup, which includes the
     *            location in Amazon S3 where query results are stored and the
     *            encryption option, if any, used for query results. To run the
     *            query, you must specify the query results location using one
     *            of the ways: either in the workgroup using this setting, or
     *            for individual queries (client-side), using
     *            <a>ResultConfiguration$OutputLocation</a>. If none of them is
     *            set, Athena issues an error that no output location is
     *            provided. For more information, see <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/querying.html"
     *            >Query Results</a>.
     *            </p>
     */
    public void setResultConfiguration(ResultConfiguration resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
    }

    /**
     * <p>
     * The configuration for the workgroup, which includes the location in
     * Amazon S3 where query results are stored and the encryption option, if
     * any, used for query results. To run the query, you must specify the query
     * results location using one of the ways: either in the workgroup using
     * this setting, or for individual queries (client-side), using
     * <a>ResultConfiguration$OutputLocation</a>. If none of them is set, Athena
     * issues an error that no output location is provided. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultConfiguration <p>
     *            The configuration for the workgroup, which includes the
     *            location in Amazon S3 where query results are stored and the
     *            encryption option, if any, used for query results. To run the
     *            query, you must specify the query results location using one
     *            of the ways: either in the workgroup using this setting, or
     *            for individual queries (client-side), using
     *            <a>ResultConfiguration$OutputLocation</a>. If none of them is
     *            set, Athena issues an error that no output location is
     *            provided. For more information, see <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/querying.html"
     *            >Query Results</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkGroupConfiguration withResultConfiguration(ResultConfiguration resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
        return this;
    }

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side
     * settings. If set to "false", client-side settings are used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     *
     * @return <p>
     *         If set to "true", the settings for the workgroup override
     *         client-side settings. If set to "false", client-side settings are
     *         used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *         >Workgroup Settings Override Client-Side Settings</a>.
     *         </p>
     */
    public Boolean isEnforceWorkGroupConfiguration() {
        return enforceWorkGroupConfiguration;
    }

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side
     * settings. If set to "false", client-side settings are used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     *
     * @return <p>
     *         If set to "true", the settings for the workgroup override
     *         client-side settings. If set to "false", client-side settings are
     *         used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *         >Workgroup Settings Override Client-Side Settings</a>.
     *         </p>
     */
    public Boolean getEnforceWorkGroupConfiguration() {
        return enforceWorkGroupConfiguration;
    }

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side
     * settings. If set to "false", client-side settings are used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     *
     * @param enforceWorkGroupConfiguration <p>
     *            If set to "true", the settings for the workgroup override
     *            client-side settings. If set to "false", client-side settings
     *            are used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *            >Workgroup Settings Override Client-Side Settings</a>.
     *            </p>
     */
    public void setEnforceWorkGroupConfiguration(Boolean enforceWorkGroupConfiguration) {
        this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
    }

    /**
     * <p>
     * If set to "true", the settings for the workgroup override client-side
     * settings. If set to "false", client-side settings are used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enforceWorkGroupConfiguration <p>
     *            If set to "true", the settings for the workgroup override
     *            client-side settings. If set to "false", client-side settings
     *            are used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *            >Workgroup Settings Override Client-Side Settings</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkGroupConfiguration withEnforceWorkGroupConfiguration(
            Boolean enforceWorkGroupConfiguration) {
        this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
        return this;
    }

    /**
     * <p>
     * Indicates that the Amazon CloudWatch metrics are enabled for the
     * workgroup.
     * </p>
     *
     * @return <p>
     *         Indicates that the Amazon CloudWatch metrics are enabled for the
     *         workgroup.
     *         </p>
     */
    public Boolean isPublishCloudWatchMetricsEnabled() {
        return publishCloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Indicates that the Amazon CloudWatch metrics are enabled for the
     * workgroup.
     * </p>
     *
     * @return <p>
     *         Indicates that the Amazon CloudWatch metrics are enabled for the
     *         workgroup.
     *         </p>
     */
    public Boolean getPublishCloudWatchMetricsEnabled() {
        return publishCloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Indicates that the Amazon CloudWatch metrics are enabled for the
     * workgroup.
     * </p>
     *
     * @param publishCloudWatchMetricsEnabled <p>
     *            Indicates that the Amazon CloudWatch metrics are enabled for
     *            the workgroup.
     *            </p>
     */
    public void setPublishCloudWatchMetricsEnabled(Boolean publishCloudWatchMetricsEnabled) {
        this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Indicates that the Amazon CloudWatch metrics are enabled for the
     * workgroup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publishCloudWatchMetricsEnabled <p>
     *            Indicates that the Amazon CloudWatch metrics are enabled for
     *            the workgroup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkGroupConfiguration withPublishCloudWatchMetricsEnabled(
            Boolean publishCloudWatchMetricsEnabled) {
        this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
        return this;
    }

    /**
     * <p>
     * The upper data usage limit (cutoff) for the amount of bytes a single
     * query in a workgroup is allowed to scan.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10000000 - <br/>
     *
     * @return <p>
     *         The upper data usage limit (cutoff) for the amount of bytes a
     *         single query in a workgroup is allowed to scan.
     *         </p>
     */
    public Long getBytesScannedCutoffPerQuery() {
        return bytesScannedCutoffPerQuery;
    }

    /**
     * <p>
     * The upper data usage limit (cutoff) for the amount of bytes a single
     * query in a workgroup is allowed to scan.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10000000 - <br/>
     *
     * @param bytesScannedCutoffPerQuery <p>
     *            The upper data usage limit (cutoff) for the amount of bytes a
     *            single query in a workgroup is allowed to scan.
     *            </p>
     */
    public void setBytesScannedCutoffPerQuery(Long bytesScannedCutoffPerQuery) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
    }

    /**
     * <p>
     * The upper data usage limit (cutoff) for the amount of bytes a single
     * query in a workgroup is allowed to scan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10000000 - <br/>
     *
     * @param bytesScannedCutoffPerQuery <p>
     *            The upper data usage limit (cutoff) for the amount of bytes a
     *            single query in a workgroup is allowed to scan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkGroupConfiguration withBytesScannedCutoffPerQuery(Long bytesScannedCutoffPerQuery) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, allows members assigned to a workgroup to
     * reference Amazon S3 Requester Pays buckets in queries. If set to
     * <code>false</code>, workgroup members cannot query data from Requester
     * Pays buckets, and queries that retrieve data from Requester Pays buckets
     * cause an error. The default is <code>false</code>. For more information
     * about Requester Pays buckets, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html"
     * >Requester Pays Buckets</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, allows members assigned to a
     *         workgroup to reference Amazon S3 Requester Pays buckets in
     *         queries. If set to <code>false</code>, workgroup members cannot
     *         query data from Requester Pays buckets, and queries that retrieve
     *         data from Requester Pays buckets cause an error. The default is
     *         <code>false</code>. For more information about Requester Pays
     *         buckets, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html"
     *         >Requester Pays Buckets</a> in the <i>Amazon Simple Storage
     *         Service Developer Guide</i>.
     *         </p>
     */
    public Boolean isRequesterPaysEnabled() {
        return requesterPaysEnabled;
    }

    /**
     * <p>
     * If set to <code>true</code>, allows members assigned to a workgroup to
     * reference Amazon S3 Requester Pays buckets in queries. If set to
     * <code>false</code>, workgroup members cannot query data from Requester
     * Pays buckets, and queries that retrieve data from Requester Pays buckets
     * cause an error. The default is <code>false</code>. For more information
     * about Requester Pays buckets, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html"
     * >Requester Pays Buckets</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, allows members assigned to a
     *         workgroup to reference Amazon S3 Requester Pays buckets in
     *         queries. If set to <code>false</code>, workgroup members cannot
     *         query data from Requester Pays buckets, and queries that retrieve
     *         data from Requester Pays buckets cause an error. The default is
     *         <code>false</code>. For more information about Requester Pays
     *         buckets, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html"
     *         >Requester Pays Buckets</a> in the <i>Amazon Simple Storage
     *         Service Developer Guide</i>.
     *         </p>
     */
    public Boolean getRequesterPaysEnabled() {
        return requesterPaysEnabled;
    }

    /**
     * <p>
     * If set to <code>true</code>, allows members assigned to a workgroup to
     * reference Amazon S3 Requester Pays buckets in queries. If set to
     * <code>false</code>, workgroup members cannot query data from Requester
     * Pays buckets, and queries that retrieve data from Requester Pays buckets
     * cause an error. The default is <code>false</code>. For more information
     * about Requester Pays buckets, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html"
     * >Requester Pays Buckets</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @param requesterPaysEnabled <p>
     *            If set to <code>true</code>, allows members assigned to a
     *            workgroup to reference Amazon S3 Requester Pays buckets in
     *            queries. If set to <code>false</code>, workgroup members
     *            cannot query data from Requester Pays buckets, and queries
     *            that retrieve data from Requester Pays buckets cause an error.
     *            The default is <code>false</code>. For more information about
     *            Requester Pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html"
     *            >Requester Pays Buckets</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setRequesterPaysEnabled(Boolean requesterPaysEnabled) {
        this.requesterPaysEnabled = requesterPaysEnabled;
    }

    /**
     * <p>
     * If set to <code>true</code>, allows members assigned to a workgroup to
     * reference Amazon S3 Requester Pays buckets in queries. If set to
     * <code>false</code>, workgroup members cannot query data from Requester
     * Pays buckets, and queries that retrieve data from Requester Pays buckets
     * cause an error. The default is <code>false</code>. For more information
     * about Requester Pays buckets, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html"
     * >Requester Pays Buckets</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requesterPaysEnabled <p>
     *            If set to <code>true</code>, allows members assigned to a
     *            workgroup to reference Amazon S3 Requester Pays buckets in
     *            queries. If set to <code>false</code>, workgroup members
     *            cannot query data from Requester Pays buckets, and queries
     *            that retrieve data from Requester Pays buckets cause an error.
     *            The default is <code>false</code>. For more information about
     *            Requester Pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html"
     *            >Requester Pays Buckets</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkGroupConfiguration withRequesterPaysEnabled(Boolean requesterPaysEnabled) {
        this.requesterPaysEnabled = requesterPaysEnabled;
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
        if (getResultConfiguration() != null)
            sb.append("ResultConfiguration: " + getResultConfiguration() + ",");
        if (getEnforceWorkGroupConfiguration() != null)
            sb.append("EnforceWorkGroupConfiguration: " + getEnforceWorkGroupConfiguration() + ",");
        if (getPublishCloudWatchMetricsEnabled() != null)
            sb.append("PublishCloudWatchMetricsEnabled: " + getPublishCloudWatchMetricsEnabled()
                    + ",");
        if (getBytesScannedCutoffPerQuery() != null)
            sb.append("BytesScannedCutoffPerQuery: " + getBytesScannedCutoffPerQuery() + ",");
        if (getRequesterPaysEnabled() != null)
            sb.append("RequesterPaysEnabled: " + getRequesterPaysEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResultConfiguration() == null) ? 0 : getResultConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnforceWorkGroupConfiguration() == null) ? 0
                        : getEnforceWorkGroupConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getPublishCloudWatchMetricsEnabled() == null) ? 0
                        : getPublishCloudWatchMetricsEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getBytesScannedCutoffPerQuery() == null) ? 0 : getBytesScannedCutoffPerQuery()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRequesterPaysEnabled() == null) ? 0 : getRequesterPaysEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkGroupConfiguration == false)
            return false;
        WorkGroupConfiguration other = (WorkGroupConfiguration) obj;

        if (other.getResultConfiguration() == null ^ this.getResultConfiguration() == null)
            return false;
        if (other.getResultConfiguration() != null
                && other.getResultConfiguration().equals(this.getResultConfiguration()) == false)
            return false;
        if (other.getEnforceWorkGroupConfiguration() == null
                ^ this.getEnforceWorkGroupConfiguration() == null)
            return false;
        if (other.getEnforceWorkGroupConfiguration() != null
                && other.getEnforceWorkGroupConfiguration().equals(
                        this.getEnforceWorkGroupConfiguration()) == false)
            return false;
        if (other.getPublishCloudWatchMetricsEnabled() == null
                ^ this.getPublishCloudWatchMetricsEnabled() == null)
            return false;
        if (other.getPublishCloudWatchMetricsEnabled() != null
                && other.getPublishCloudWatchMetricsEnabled().equals(
                        this.getPublishCloudWatchMetricsEnabled()) == false)
            return false;
        if (other.getBytesScannedCutoffPerQuery() == null
                ^ this.getBytesScannedCutoffPerQuery() == null)
            return false;
        if (other.getBytesScannedCutoffPerQuery() != null
                && other.getBytesScannedCutoffPerQuery().equals(
                        this.getBytesScannedCutoffPerQuery()) == false)
            return false;
        if (other.getRequesterPaysEnabled() == null ^ this.getRequesterPaysEnabled() == null)
            return false;
        if (other.getRequesterPaysEnabled() != null
                && other.getRequesterPaysEnabled().equals(this.getRequesterPaysEnabled()) == false)
            return false;
        return true;
    }
}
