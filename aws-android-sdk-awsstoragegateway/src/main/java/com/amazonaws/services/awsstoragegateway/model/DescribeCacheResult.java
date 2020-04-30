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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

public class DescribeCacheResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string has a minimum length of 1 and maximum length
     * of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     */
    private java.util.List<String> diskIds;

    /**
     * <p>
     * The amount of cache in bytes allocated to a gateway.
     * </p>
     */
    private Long cacheAllocatedInBytes;

    /**
     * <p>
     * Percent use of the gateway's cache storage. This metric applies only to
     * the gateway-cached volume setup. The sample is taken at the end of the
     * reporting period.
     * </p>
     */
    private Double cacheUsedPercentage;

    /**
     * <p>
     * The file share's contribution to the overall percentage of the gateway's
     * cache that has not been persisted to AWS. The sample is taken at the end
     * of the reporting period.
     * </p>
     */
    private Double cacheDirtyPercentage;

    /**
     * <p>
     * Percent of application read operations from the file shares that are
     * served from cache. The sample is taken at the end of the reporting
     * period.
     * </p>
     */
    private Double cacheHitPercentage;

    /**
     * <p>
     * Percent of application read operations from the file shares that are not
     * served from cache. The sample is taken at the end of the reporting
     * period.
     * </p>
     */
    private Double cacheMissPercentage;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for
     *         your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string has a minimum length of 1 and maximum length
     * of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     *
     * @return <p>
     *         An array of strings that identify disks that are to be configured
     *         as working storage. Each string has a minimum length of 1 and
     *         maximum length of 300. You can get the disk IDs from the
     *         <a>ListLocalDisks</a> API.
     *         </p>
     */
    public java.util.List<String> getDiskIds() {
        return diskIds;
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string has a minimum length of 1 and maximum length
     * of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     *
     * @param diskIds <p>
     *            An array of strings that identify disks that are to be
     *            configured as working storage. Each string has a minimum
     *            length of 1 and maximum length of 300. You can get the disk
     *            IDs from the <a>ListLocalDisks</a> API.
     *            </p>
     */
    public void setDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
            return;
        }

        this.diskIds = new java.util.ArrayList<String>(diskIds);
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string has a minimum length of 1 and maximum length
     * of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskIds <p>
     *            An array of strings that identify disks that are to be
     *            configured as working storage. Each string has a minimum
     *            length of 1 and maximum length of 300. You can get the disk
     *            IDs from the <a>ListLocalDisks</a> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheResult withDiskIds(String... diskIds) {
        if (getDiskIds() == null) {
            this.diskIds = new java.util.ArrayList<String>(diskIds.length);
        }
        for (String value : diskIds) {
            this.diskIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string has a minimum length of 1 and maximum length
     * of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskIds <p>
     *            An array of strings that identify disks that are to be
     *            configured as working storage. Each string has a minimum
     *            length of 1 and maximum length of 300. You can get the disk
     *            IDs from the <a>ListLocalDisks</a> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheResult withDiskIds(java.util.Collection<String> diskIds) {
        setDiskIds(diskIds);
        return this;
    }

    /**
     * <p>
     * The amount of cache in bytes allocated to a gateway.
     * </p>
     *
     * @return <p>
     *         The amount of cache in bytes allocated to a gateway.
     *         </p>
     */
    public Long getCacheAllocatedInBytes() {
        return cacheAllocatedInBytes;
    }

    /**
     * <p>
     * The amount of cache in bytes allocated to a gateway.
     * </p>
     *
     * @param cacheAllocatedInBytes <p>
     *            The amount of cache in bytes allocated to a gateway.
     *            </p>
     */
    public void setCacheAllocatedInBytes(Long cacheAllocatedInBytes) {
        this.cacheAllocatedInBytes = cacheAllocatedInBytes;
    }

    /**
     * <p>
     * The amount of cache in bytes allocated to a gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheAllocatedInBytes <p>
     *            The amount of cache in bytes allocated to a gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheResult withCacheAllocatedInBytes(Long cacheAllocatedInBytes) {
        this.cacheAllocatedInBytes = cacheAllocatedInBytes;
        return this;
    }

    /**
     * <p>
     * Percent use of the gateway's cache storage. This metric applies only to
     * the gateway-cached volume setup. The sample is taken at the end of the
     * reporting period.
     * </p>
     *
     * @return <p>
     *         Percent use of the gateway's cache storage. This metric applies
     *         only to the gateway-cached volume setup. The sample is taken at
     *         the end of the reporting period.
     *         </p>
     */
    public Double getCacheUsedPercentage() {
        return cacheUsedPercentage;
    }

    /**
     * <p>
     * Percent use of the gateway's cache storage. This metric applies only to
     * the gateway-cached volume setup. The sample is taken at the end of the
     * reporting period.
     * </p>
     *
     * @param cacheUsedPercentage <p>
     *            Percent use of the gateway's cache storage. This metric
     *            applies only to the gateway-cached volume setup. The sample is
     *            taken at the end of the reporting period.
     *            </p>
     */
    public void setCacheUsedPercentage(Double cacheUsedPercentage) {
        this.cacheUsedPercentage = cacheUsedPercentage;
    }

    /**
     * <p>
     * Percent use of the gateway's cache storage. This metric applies only to
     * the gateway-cached volume setup. The sample is taken at the end of the
     * reporting period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheUsedPercentage <p>
     *            Percent use of the gateway's cache storage. This metric
     *            applies only to the gateway-cached volume setup. The sample is
     *            taken at the end of the reporting period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheResult withCacheUsedPercentage(Double cacheUsedPercentage) {
        this.cacheUsedPercentage = cacheUsedPercentage;
        return this;
    }

    /**
     * <p>
     * The file share's contribution to the overall percentage of the gateway's
     * cache that has not been persisted to AWS. The sample is taken at the end
     * of the reporting period.
     * </p>
     *
     * @return <p>
     *         The file share's contribution to the overall percentage of the
     *         gateway's cache that has not been persisted to AWS. The sample is
     *         taken at the end of the reporting period.
     *         </p>
     */
    public Double getCacheDirtyPercentage() {
        return cacheDirtyPercentage;
    }

    /**
     * <p>
     * The file share's contribution to the overall percentage of the gateway's
     * cache that has not been persisted to AWS. The sample is taken at the end
     * of the reporting period.
     * </p>
     *
     * @param cacheDirtyPercentage <p>
     *            The file share's contribution to the overall percentage of the
     *            gateway's cache that has not been persisted to AWS. The sample
     *            is taken at the end of the reporting period.
     *            </p>
     */
    public void setCacheDirtyPercentage(Double cacheDirtyPercentage) {
        this.cacheDirtyPercentage = cacheDirtyPercentage;
    }

    /**
     * <p>
     * The file share's contribution to the overall percentage of the gateway's
     * cache that has not been persisted to AWS. The sample is taken at the end
     * of the reporting period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheDirtyPercentage <p>
     *            The file share's contribution to the overall percentage of the
     *            gateway's cache that has not been persisted to AWS. The sample
     *            is taken at the end of the reporting period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheResult withCacheDirtyPercentage(Double cacheDirtyPercentage) {
        this.cacheDirtyPercentage = cacheDirtyPercentage;
        return this;
    }

    /**
     * <p>
     * Percent of application read operations from the file shares that are
     * served from cache. The sample is taken at the end of the reporting
     * period.
     * </p>
     *
     * @return <p>
     *         Percent of application read operations from the file shares that
     *         are served from cache. The sample is taken at the end of the
     *         reporting period.
     *         </p>
     */
    public Double getCacheHitPercentage() {
        return cacheHitPercentage;
    }

    /**
     * <p>
     * Percent of application read operations from the file shares that are
     * served from cache. The sample is taken at the end of the reporting
     * period.
     * </p>
     *
     * @param cacheHitPercentage <p>
     *            Percent of application read operations from the file shares
     *            that are served from cache. The sample is taken at the end of
     *            the reporting period.
     *            </p>
     */
    public void setCacheHitPercentage(Double cacheHitPercentage) {
        this.cacheHitPercentage = cacheHitPercentage;
    }

    /**
     * <p>
     * Percent of application read operations from the file shares that are
     * served from cache. The sample is taken at the end of the reporting
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheHitPercentage <p>
     *            Percent of application read operations from the file shares
     *            that are served from cache. The sample is taken at the end of
     *            the reporting period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheResult withCacheHitPercentage(Double cacheHitPercentage) {
        this.cacheHitPercentage = cacheHitPercentage;
        return this;
    }

    /**
     * <p>
     * Percent of application read operations from the file shares that are not
     * served from cache. The sample is taken at the end of the reporting
     * period.
     * </p>
     *
     * @return <p>
     *         Percent of application read operations from the file shares that
     *         are not served from cache. The sample is taken at the end of the
     *         reporting period.
     *         </p>
     */
    public Double getCacheMissPercentage() {
        return cacheMissPercentage;
    }

    /**
     * <p>
     * Percent of application read operations from the file shares that are not
     * served from cache. The sample is taken at the end of the reporting
     * period.
     * </p>
     *
     * @param cacheMissPercentage <p>
     *            Percent of application read operations from the file shares
     *            that are not served from cache. The sample is taken at the end
     *            of the reporting period.
     *            </p>
     */
    public void setCacheMissPercentage(Double cacheMissPercentage) {
        this.cacheMissPercentage = cacheMissPercentage;
    }

    /**
     * <p>
     * Percent of application read operations from the file shares that are not
     * served from cache. The sample is taken at the end of the reporting
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheMissPercentage <p>
     *            Percent of application read operations from the file shares
     *            that are not served from cache. The sample is taken at the end
     *            of the reporting period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheResult withCacheMissPercentage(Double cacheMissPercentage) {
        this.cacheMissPercentage = cacheMissPercentage;
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getDiskIds() != null)
            sb.append("DiskIds: " + getDiskIds() + ",");
        if (getCacheAllocatedInBytes() != null)
            sb.append("CacheAllocatedInBytes: " + getCacheAllocatedInBytes() + ",");
        if (getCacheUsedPercentage() != null)
            sb.append("CacheUsedPercentage: " + getCacheUsedPercentage() + ",");
        if (getCacheDirtyPercentage() != null)
            sb.append("CacheDirtyPercentage: " + getCacheDirtyPercentage() + ",");
        if (getCacheHitPercentage() != null)
            sb.append("CacheHitPercentage: " + getCacheHitPercentage() + ",");
        if (getCacheMissPercentage() != null)
            sb.append("CacheMissPercentage: " + getCacheMissPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getDiskIds() == null) ? 0 : getDiskIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheAllocatedInBytes() == null) ? 0 : getCacheAllocatedInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getCacheUsedPercentage() == null) ? 0 : getCacheUsedPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getCacheDirtyPercentage() == null) ? 0 : getCacheDirtyPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getCacheHitPercentage() == null) ? 0 : getCacheHitPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getCacheMissPercentage() == null) ? 0 : getCacheMissPercentage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheResult == false)
            return false;
        DescribeCacheResult other = (DescribeCacheResult) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDiskIds() == null ^ this.getDiskIds() == null)
            return false;
        if (other.getDiskIds() != null && other.getDiskIds().equals(this.getDiskIds()) == false)
            return false;
        if (other.getCacheAllocatedInBytes() == null ^ this.getCacheAllocatedInBytes() == null)
            return false;
        if (other.getCacheAllocatedInBytes() != null
                && other.getCacheAllocatedInBytes().equals(this.getCacheAllocatedInBytes()) == false)
            return false;
        if (other.getCacheUsedPercentage() == null ^ this.getCacheUsedPercentage() == null)
            return false;
        if (other.getCacheUsedPercentage() != null
                && other.getCacheUsedPercentage().equals(this.getCacheUsedPercentage()) == false)
            return false;
        if (other.getCacheDirtyPercentage() == null ^ this.getCacheDirtyPercentage() == null)
            return false;
        if (other.getCacheDirtyPercentage() != null
                && other.getCacheDirtyPercentage().equals(this.getCacheDirtyPercentage()) == false)
            return false;
        if (other.getCacheHitPercentage() == null ^ this.getCacheHitPercentage() == null)
            return false;
        if (other.getCacheHitPercentage() != null
                && other.getCacheHitPercentage().equals(this.getCacheHitPercentage()) == false)
            return false;
        if (other.getCacheMissPercentage() == null ^ this.getCacheMissPercentage() == null)
            return false;
        if (other.getCacheMissPercentage() != null
                && other.getCacheMissPercentage().equals(this.getCacheMissPercentage()) == false)
            return false;
        return true;
    }
}
