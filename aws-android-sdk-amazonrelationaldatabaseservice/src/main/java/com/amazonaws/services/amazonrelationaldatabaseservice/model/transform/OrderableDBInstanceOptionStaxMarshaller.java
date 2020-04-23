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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO OrderableDBInstanceOption
 */
class OrderableDBInstanceOptionStaxMarshaller {

    public void marshall(OrderableDBInstanceOption _orderableDBInstanceOption, Request<?> request,
            String _prefix) {
        String prefix;
        if (_orderableDBInstanceOption.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _orderableDBInstanceOption.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_orderableDBInstanceOption.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _orderableDBInstanceOption.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_orderableDBInstanceOption.getDBInstanceClass() != null) {
            prefix = _prefix + "DBInstanceClass";
            String dBInstanceClass = _orderableDBInstanceOption.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (_orderableDBInstanceOption.getLicenseModel() != null) {
            prefix = _prefix + "LicenseModel";
            String licenseModel = _orderableDBInstanceOption.getLicenseModel();
            request.addParameter(prefix, StringUtils.fromString(licenseModel));
        }
        if (_orderableDBInstanceOption.getAvailabilityZoneGroup() != null) {
            prefix = _prefix + "AvailabilityZoneGroup";
            String availabilityZoneGroup = _orderableDBInstanceOption.getAvailabilityZoneGroup();
            request.addParameter(prefix, StringUtils.fromString(availabilityZoneGroup));
        }
        if (_orderableDBInstanceOption.getAvailabilityZones() != null) {
            prefix = _prefix + "AvailabilityZones";
            java.util.List<AvailabilityZone> availabilityZones = _orderableDBInstanceOption
                    .getAvailabilityZones();
            int availabilityZonesIndex = 1;
            String availabilityZonesPrefix = prefix;
            for (AvailabilityZone availabilityZonesItem : availabilityZones) {
                prefix = availabilityZonesPrefix + "." + availabilityZonesIndex;
                if (availabilityZonesItem != null) {
                    AvailabilityZoneStaxMarshaller.getInstance().marshall(availabilityZonesItem,
                            request, prefix + ".");
                }
                availabilityZonesIndex++;
            }
            prefix = availabilityZonesPrefix;
        }
        if (_orderableDBInstanceOption.getMultiAZCapable() != null) {
            prefix = _prefix + "MultiAZCapable";
            Boolean multiAZCapable = _orderableDBInstanceOption.getMultiAZCapable();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZCapable));
        }
        if (_orderableDBInstanceOption.getReadReplicaCapable() != null) {
            prefix = _prefix + "ReadReplicaCapable";
            Boolean readReplicaCapable = _orderableDBInstanceOption.getReadReplicaCapable();
            request.addParameter(prefix, StringUtils.fromBoolean(readReplicaCapable));
        }
        if (_orderableDBInstanceOption.getVpc() != null) {
            prefix = _prefix + "Vpc";
            Boolean vpc = _orderableDBInstanceOption.getVpc();
            request.addParameter(prefix, StringUtils.fromBoolean(vpc));
        }
        if (_orderableDBInstanceOption.getSupportsStorageEncryption() != null) {
            prefix = _prefix + "SupportsStorageEncryption";
            Boolean supportsStorageEncryption = _orderableDBInstanceOption
                    .getSupportsStorageEncryption();
            request.addParameter(prefix, StringUtils.fromBoolean(supportsStorageEncryption));
        }
        if (_orderableDBInstanceOption.getStorageType() != null) {
            prefix = _prefix + "StorageType";
            String storageType = _orderableDBInstanceOption.getStorageType();
            request.addParameter(prefix, StringUtils.fromString(storageType));
        }
        if (_orderableDBInstanceOption.getSupportsIops() != null) {
            prefix = _prefix + "SupportsIops";
            Boolean supportsIops = _orderableDBInstanceOption.getSupportsIops();
            request.addParameter(prefix, StringUtils.fromBoolean(supportsIops));
        }
        if (_orderableDBInstanceOption.getSupportsEnhancedMonitoring() != null) {
            prefix = _prefix + "SupportsEnhancedMonitoring";
            Boolean supportsEnhancedMonitoring = _orderableDBInstanceOption
                    .getSupportsEnhancedMonitoring();
            request.addParameter(prefix, StringUtils.fromBoolean(supportsEnhancedMonitoring));
        }
        if (_orderableDBInstanceOption.getSupportsIAMDatabaseAuthentication() != null) {
            prefix = _prefix + "SupportsIAMDatabaseAuthentication";
            Boolean supportsIAMDatabaseAuthentication = _orderableDBInstanceOption
                    .getSupportsIAMDatabaseAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(supportsIAMDatabaseAuthentication));
        }
        if (_orderableDBInstanceOption.getSupportsPerformanceInsights() != null) {
            prefix = _prefix + "SupportsPerformanceInsights";
            Boolean supportsPerformanceInsights = _orderableDBInstanceOption
                    .getSupportsPerformanceInsights();
            request.addParameter(prefix, StringUtils.fromBoolean(supportsPerformanceInsights));
        }
        if (_orderableDBInstanceOption.getMinStorageSize() != null) {
            prefix = _prefix + "MinStorageSize";
            Integer minStorageSize = _orderableDBInstanceOption.getMinStorageSize();
            request.addParameter(prefix, StringUtils.fromInteger(minStorageSize));
        }
        if (_orderableDBInstanceOption.getMaxStorageSize() != null) {
            prefix = _prefix + "MaxStorageSize";
            Integer maxStorageSize = _orderableDBInstanceOption.getMaxStorageSize();
            request.addParameter(prefix, StringUtils.fromInteger(maxStorageSize));
        }
        if (_orderableDBInstanceOption.getMinIopsPerDbInstance() != null) {
            prefix = _prefix + "MinIopsPerDbInstance";
            Integer minIopsPerDbInstance = _orderableDBInstanceOption.getMinIopsPerDbInstance();
            request.addParameter(prefix, StringUtils.fromInteger(minIopsPerDbInstance));
        }
        if (_orderableDBInstanceOption.getMaxIopsPerDbInstance() != null) {
            prefix = _prefix + "MaxIopsPerDbInstance";
            Integer maxIopsPerDbInstance = _orderableDBInstanceOption.getMaxIopsPerDbInstance();
            request.addParameter(prefix, StringUtils.fromInteger(maxIopsPerDbInstance));
        }
        if (_orderableDBInstanceOption.getMinIopsPerGib() != null) {
            prefix = _prefix + "MinIopsPerGib";
            Double minIopsPerGib = _orderableDBInstanceOption.getMinIopsPerGib();
            request.addParameter(prefix, StringUtils.fromDouble(minIopsPerGib));
        }
        if (_orderableDBInstanceOption.getMaxIopsPerGib() != null) {
            prefix = _prefix + "MaxIopsPerGib";
            Double maxIopsPerGib = _orderableDBInstanceOption.getMaxIopsPerGib();
            request.addParameter(prefix, StringUtils.fromDouble(maxIopsPerGib));
        }
        if (_orderableDBInstanceOption.getAvailableProcessorFeatures() != null) {
            prefix = _prefix + "AvailableProcessorFeatures";
            java.util.List<AvailableProcessorFeature> availableProcessorFeatures = _orderableDBInstanceOption
                    .getAvailableProcessorFeatures();
            int availableProcessorFeaturesIndex = 1;
            String availableProcessorFeaturesPrefix = prefix;
            for (AvailableProcessorFeature availableProcessorFeaturesItem : availableProcessorFeatures) {
                prefix = availableProcessorFeaturesPrefix + "." + availableProcessorFeaturesIndex;
                if (availableProcessorFeaturesItem != null) {
                    AvailableProcessorFeatureStaxMarshaller.getInstance().marshall(
                            availableProcessorFeaturesItem, request, prefix + ".");
                }
                availableProcessorFeaturesIndex++;
            }
            prefix = availableProcessorFeaturesPrefix;
        }
        if (_orderableDBInstanceOption.getSupportedEngineModes() != null) {
            prefix = _prefix + "SupportedEngineModes";
            java.util.List<String> supportedEngineModes = _orderableDBInstanceOption
                    .getSupportedEngineModes();
            int supportedEngineModesIndex = 1;
            String supportedEngineModesPrefix = prefix;
            for (String supportedEngineModesItem : supportedEngineModes) {
                prefix = supportedEngineModesPrefix + ".member." + supportedEngineModesIndex;
                if (supportedEngineModesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(supportedEngineModesItem));
                }
                supportedEngineModesIndex++;
            }
            prefix = supportedEngineModesPrefix;
        }
        if (_orderableDBInstanceOption.getSupportsStorageAutoscaling() != null) {
            prefix = _prefix + "SupportsStorageAutoscaling";
            Boolean supportsStorageAutoscaling = _orderableDBInstanceOption
                    .getSupportsStorageAutoscaling();
            request.addParameter(prefix, StringUtils.fromBoolean(supportsStorageAutoscaling));
        }
        if (_orderableDBInstanceOption.getSupportsKerberosAuthentication() != null) {
            prefix = _prefix + "SupportsKerberosAuthentication";
            Boolean supportsKerberosAuthentication = _orderableDBInstanceOption
                    .getSupportsKerberosAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(supportsKerberosAuthentication));
        }
    }

    private static OrderableDBInstanceOptionStaxMarshaller instance;

    public static OrderableDBInstanceOptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OrderableDBInstanceOptionStaxMarshaller();
        return instance;
    }
}
