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
 * The information about the updates in the query results, such as output
 * location and encryption configuration for the query results.
 * </p>
 */
public class ResultConfigurationUpdates implements Serializable {
    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as
     * <code>s3://path/to/query/bucket/</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a> If workgroup settings override client-side settings, then the
     * query uses the location for the query results and the encryption
     * configuration that are specified for the workgroup. The
     * "workgroup settings override" is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration.
     * See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     */
    private String outputLocation;

    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results
     * location (also known as a client-side setting) for queries in this
     * workgroup should be ignored and set to null. If set to "false" or not
     * set, and a value is present in the OutputLocation in
     * ResultConfigurationUpdates (the client-side setting), the OutputLocation
     * in the workgroup's ResultConfiguration will be updated with the new
     * value. For more information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     */
    private Boolean removeOutputLocation;

    /**
     * <p>
     * The encryption configuration for the query results.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;

    /**
     * <p>
     * If set to "true", indicates that the previously-specified encryption
     * configuration (also known as the client-side setting) for queries in this
     * workgroup should be ignored and set to null. If set to "false" or not
     * set, and a value is present in the EncryptionConfiguration in
     * ResultConfigurationUpdates (the client-side setting), the
     * EncryptionConfiguration in the workgroup's ResultConfiguration will be
     * updated with the new value. For more information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     */
    private Boolean removeEncryptionConfiguration;

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as
     * <code>s3://path/to/query/bucket/</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a> If workgroup settings override client-side settings, then the
     * query uses the location for the query results and the encryption
     * configuration that are specified for the workgroup. The
     * "workgroup settings override" is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration.
     * See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     *
     * @return <p>
     *         The location in Amazon S3 where your query results are stored,
     *         such as <code>s3://path/to/query/bucket/</code>. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/athena/latest/ug/querying.html"
     *         >Query Results</a> If workgroup settings override client-side
     *         settings, then the query uses the location for the query results
     *         and the encryption configuration that are specified for the
     *         workgroup. The "workgroup settings override" is specified in
     *         EnforceWorkGroupConfiguration (true/false) in the
     *         WorkGroupConfiguration. See
     *         <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *         </p>
     */
    public String getOutputLocation() {
        return outputLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as
     * <code>s3://path/to/query/bucket/</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a> If workgroup settings override client-side settings, then the
     * query uses the location for the query results and the encryption
     * configuration that are specified for the workgroup. The
     * "workgroup settings override" is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration.
     * See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     *
     * @param outputLocation <p>
     *            The location in Amazon S3 where your query results are stored,
     *            such as <code>s3://path/to/query/bucket/</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/querying.html"
     *            >Query Results</a> If workgroup settings override client-side
     *            settings, then the query uses the location for the query
     *            results and the encryption configuration that are specified
     *            for the workgroup. The "workgroup settings override" is
     *            specified in EnforceWorkGroupConfiguration (true/false) in the
     *            WorkGroupConfiguration. See
     *            <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *            </p>
     */
    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as
     * <code>s3://path/to/query/bucket/</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a> If workgroup settings override client-side settings, then the
     * query uses the location for the query results and the encryption
     * configuration that are specified for the workgroup. The
     * "workgroup settings override" is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration.
     * See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputLocation <p>
     *            The location in Amazon S3 where your query results are stored,
     *            such as <code>s3://path/to/query/bucket/</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/querying.html"
     *            >Query Results</a> If workgroup settings override client-side
     *            settings, then the query uses the location for the query
     *            results and the encryption configuration that are specified
     *            for the workgroup. The "workgroup settings override" is
     *            specified in EnforceWorkGroupConfiguration (true/false) in the
     *            WorkGroupConfiguration. See
     *            <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultConfigurationUpdates withOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results
     * location (also known as a client-side setting) for queries in this
     * workgroup should be ignored and set to null. If set to "false" or not
     * set, and a value is present in the OutputLocation in
     * ResultConfigurationUpdates (the client-side setting), the OutputLocation
     * in the workgroup's ResultConfiguration will be updated with the new
     * value. For more information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     *
     * @return <p>
     *         If set to "true", indicates that the previously-specified query
     *         results location (also known as a client-side setting) for
     *         queries in this workgroup should be ignored and set to null. If
     *         set to "false" or not set, and a value is present in the
     *         OutputLocation in ResultConfigurationUpdates (the client-side
     *         setting), the OutputLocation in the workgroup's
     *         ResultConfiguration will be updated with the new value. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *         >Workgroup Settings Override Client-Side Settings</a>.
     *         </p>
     */
    public Boolean isRemoveOutputLocation() {
        return removeOutputLocation;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results
     * location (also known as a client-side setting) for queries in this
     * workgroup should be ignored and set to null. If set to "false" or not
     * set, and a value is present in the OutputLocation in
     * ResultConfigurationUpdates (the client-side setting), the OutputLocation
     * in the workgroup's ResultConfiguration will be updated with the new
     * value. For more information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     *
     * @return <p>
     *         If set to "true", indicates that the previously-specified query
     *         results location (also known as a client-side setting) for
     *         queries in this workgroup should be ignored and set to null. If
     *         set to "false" or not set, and a value is present in the
     *         OutputLocation in ResultConfigurationUpdates (the client-side
     *         setting), the OutputLocation in the workgroup's
     *         ResultConfiguration will be updated with the new value. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *         >Workgroup Settings Override Client-Side Settings</a>.
     *         </p>
     */
    public Boolean getRemoveOutputLocation() {
        return removeOutputLocation;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results
     * location (also known as a client-side setting) for queries in this
     * workgroup should be ignored and set to null. If set to "false" or not
     * set, and a value is present in the OutputLocation in
     * ResultConfigurationUpdates (the client-side setting), the OutputLocation
     * in the workgroup's ResultConfiguration will be updated with the new
     * value. For more information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     *
     * @param removeOutputLocation <p>
     *            If set to "true", indicates that the previously-specified
     *            query results location (also known as a client-side setting)
     *            for queries in this workgroup should be ignored and set to
     *            null. If set to "false" or not set, and a value is present in
     *            the OutputLocation in ResultConfigurationUpdates (the
     *            client-side setting), the OutputLocation in the workgroup's
     *            ResultConfiguration will be updated with the new value. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *            >Workgroup Settings Override Client-Side Settings</a>.
     *            </p>
     */
    public void setRemoveOutputLocation(Boolean removeOutputLocation) {
        this.removeOutputLocation = removeOutputLocation;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results
     * location (also known as a client-side setting) for queries in this
     * workgroup should be ignored and set to null. If set to "false" or not
     * set, and a value is present in the OutputLocation in
     * ResultConfigurationUpdates (the client-side setting), the OutputLocation
     * in the workgroup's ResultConfiguration will be updated with the new
     * value. For more information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeOutputLocation <p>
     *            If set to "true", indicates that the previously-specified
     *            query results location (also known as a client-side setting)
     *            for queries in this workgroup should be ignored and set to
     *            null. If set to "false" or not set, and a value is present in
     *            the OutputLocation in ResultConfigurationUpdates (the
     *            client-side setting), the OutputLocation in the workgroup's
     *            ResultConfiguration will be updated with the new value. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *            >Workgroup Settings Override Client-Side Settings</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultConfigurationUpdates withRemoveOutputLocation(Boolean removeOutputLocation) {
        this.removeOutputLocation = removeOutputLocation;
        return this;
    }

    /**
     * <p>
     * The encryption configuration for the query results.
     * </p>
     *
     * @return <p>
     *         The encryption configuration for the query results.
     *         </p>
     */
    public EncryptionConfiguration getEncryptionConfiguration() {
        return encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration for the query results.
     * </p>
     *
     * @param encryptionConfiguration <p>
     *            The encryption configuration for the query results.
     *            </p>
     */
    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration for the query results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionConfiguration <p>
     *            The encryption configuration for the query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultConfigurationUpdates withEncryptionConfiguration(
            EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
        return this;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified encryption
     * configuration (also known as the client-side setting) for queries in this
     * workgroup should be ignored and set to null. If set to "false" or not
     * set, and a value is present in the EncryptionConfiguration in
     * ResultConfigurationUpdates (the client-side setting), the
     * EncryptionConfiguration in the workgroup's ResultConfiguration will be
     * updated with the new value. For more information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     *
     * @return <p>
     *         If set to "true", indicates that the previously-specified
     *         encryption configuration (also known as the client-side setting)
     *         for queries in this workgroup should be ignored and set to null.
     *         If set to "false" or not set, and a value is present in the
     *         EncryptionConfiguration in ResultConfigurationUpdates (the
     *         client-side setting), the EncryptionConfiguration in the
     *         workgroup's ResultConfiguration will be updated with the new
     *         value. For more information, see <a href=
     *         "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *         >Workgroup Settings Override Client-Side Settings</a>.
     *         </p>
     */
    public Boolean isRemoveEncryptionConfiguration() {
        return removeEncryptionConfiguration;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified encryption
     * configuration (also known as the client-side setting) for queries in this
     * workgroup should be ignored and set to null. If set to "false" or not
     * set, and a value is present in the EncryptionConfiguration in
     * ResultConfigurationUpdates (the client-side setting), the
     * EncryptionConfiguration in the workgroup's ResultConfiguration will be
     * updated with the new value. For more information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     *
     * @return <p>
     *         If set to "true", indicates that the previously-specified
     *         encryption configuration (also known as the client-side setting)
     *         for queries in this workgroup should be ignored and set to null.
     *         If set to "false" or not set, and a value is present in the
     *         EncryptionConfiguration in ResultConfigurationUpdates (the
     *         client-side setting), the EncryptionConfiguration in the
     *         workgroup's ResultConfiguration will be updated with the new
     *         value. For more information, see <a href=
     *         "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *         >Workgroup Settings Override Client-Side Settings</a>.
     *         </p>
     */
    public Boolean getRemoveEncryptionConfiguration() {
        return removeEncryptionConfiguration;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified encryption
     * configuration (also known as the client-side setting) for queries in this
     * workgroup should be ignored and set to null. If set to "false" or not
     * set, and a value is present in the EncryptionConfiguration in
     * ResultConfigurationUpdates (the client-side setting), the
     * EncryptionConfiguration in the workgroup's ResultConfiguration will be
     * updated with the new value. For more information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     *
     * @param removeEncryptionConfiguration <p>
     *            If set to "true", indicates that the previously-specified
     *            encryption configuration (also known as the client-side
     *            setting) for queries in this workgroup should be ignored and
     *            set to null. If set to "false" or not set, and a value is
     *            present in the EncryptionConfiguration in
     *            ResultConfigurationUpdates (the client-side setting), the
     *            EncryptionConfiguration in the workgroup's ResultConfiguration
     *            will be updated with the new value. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *            >Workgroup Settings Override Client-Side Settings</a>.
     *            </p>
     */
    public void setRemoveEncryptionConfiguration(Boolean removeEncryptionConfiguration) {
        this.removeEncryptionConfiguration = removeEncryptionConfiguration;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified encryption
     * configuration (also known as the client-side setting) for queries in this
     * workgroup should be ignored and set to null. If set to "false" or not
     * set, and a value is present in the EncryptionConfiguration in
     * ResultConfigurationUpdates (the client-side setting), the
     * EncryptionConfiguration in the workgroup's ResultConfiguration will be
     * updated with the new value. For more information, see <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeEncryptionConfiguration <p>
     *            If set to "true", indicates that the previously-specified
     *            encryption configuration (also known as the client-side
     *            setting) for queries in this workgroup should be ignored and
     *            set to null. If set to "false" or not set, and a value is
     *            present in the EncryptionConfiguration in
     *            ResultConfigurationUpdates (the client-side setting), the
     *            EncryptionConfiguration in the workgroup's ResultConfiguration
     *            will be updated with the new value. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *            >Workgroup Settings Override Client-Side Settings</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultConfigurationUpdates withRemoveEncryptionConfiguration(
            Boolean removeEncryptionConfiguration) {
        this.removeEncryptionConfiguration = removeEncryptionConfiguration;
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
        if (getOutputLocation() != null)
            sb.append("OutputLocation: " + getOutputLocation() + ",");
        if (getRemoveOutputLocation() != null)
            sb.append("RemoveOutputLocation: " + getRemoveOutputLocation() + ",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: " + getEncryptionConfiguration() + ",");
        if (getRemoveEncryptionConfiguration() != null)
            sb.append("RemoveEncryptionConfiguration: " + getRemoveEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveOutputLocation() == null) ? 0 : getRemoveOutputLocation().hashCode());
        hashCode = prime
                * hashCode
                + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoveEncryptionConfiguration() == null) ? 0
                        : getRemoveEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultConfigurationUpdates == false)
            return false;
        ResultConfigurationUpdates other = (ResultConfigurationUpdates) obj;

        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null
                && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getRemoveOutputLocation() == null ^ this.getRemoveOutputLocation() == null)
            return false;
        if (other.getRemoveOutputLocation() != null
                && other.getRemoveOutputLocation().equals(this.getRemoveOutputLocation()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null
                && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getRemoveEncryptionConfiguration() == null
                ^ this.getRemoveEncryptionConfiguration() == null)
            return false;
        if (other.getRemoveEncryptionConfiguration() != null
                && other.getRemoveEncryptionConfiguration().equals(
                        this.getRemoveEncryptionConfiguration()) == false)
            return false;
        return true;
    }
}
