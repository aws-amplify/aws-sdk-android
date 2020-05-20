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

package com.amazonaws.services.backup.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Backup Vault Event
 */
public enum BackupVaultEvent {

    BACKUP_JOB_STARTED("BACKUP_JOB_STARTED"),
    BACKUP_JOB_COMPLETED("BACKUP_JOB_COMPLETED"),
    BACKUP_JOB_SUCCESSFUL("BACKUP_JOB_SUCCESSFUL"),
    BACKUP_JOB_FAILED("BACKUP_JOB_FAILED"),
    BACKUP_JOB_EXPIRED("BACKUP_JOB_EXPIRED"),
    RESTORE_JOB_STARTED("RESTORE_JOB_STARTED"),
    RESTORE_JOB_COMPLETED("RESTORE_JOB_COMPLETED"),
    RESTORE_JOB_SUCCESSFUL("RESTORE_JOB_SUCCESSFUL"),
    RESTORE_JOB_FAILED("RESTORE_JOB_FAILED"),
    COPY_JOB_STARTED("COPY_JOB_STARTED"),
    COPY_JOB_SUCCESSFUL("COPY_JOB_SUCCESSFUL"),
    COPY_JOB_FAILED("COPY_JOB_FAILED"),
    RECOVERY_POINT_MODIFIED("RECOVERY_POINT_MODIFIED"),
    BACKUP_PLAN_CREATED("BACKUP_PLAN_CREATED"),
    BACKUP_PLAN_MODIFIED("BACKUP_PLAN_MODIFIED");

    private String value;

    private BackupVaultEvent(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, BackupVaultEvent> enumMap;
    static {
        enumMap = new HashMap<String, BackupVaultEvent>();
        enumMap.put("BACKUP_JOB_STARTED", BACKUP_JOB_STARTED);
        enumMap.put("BACKUP_JOB_COMPLETED", BACKUP_JOB_COMPLETED);
        enumMap.put("BACKUP_JOB_SUCCESSFUL", BACKUP_JOB_SUCCESSFUL);
        enumMap.put("BACKUP_JOB_FAILED", BACKUP_JOB_FAILED);
        enumMap.put("BACKUP_JOB_EXPIRED", BACKUP_JOB_EXPIRED);
        enumMap.put("RESTORE_JOB_STARTED", RESTORE_JOB_STARTED);
        enumMap.put("RESTORE_JOB_COMPLETED", RESTORE_JOB_COMPLETED);
        enumMap.put("RESTORE_JOB_SUCCESSFUL", RESTORE_JOB_SUCCESSFUL);
        enumMap.put("RESTORE_JOB_FAILED", RESTORE_JOB_FAILED);
        enumMap.put("COPY_JOB_STARTED", COPY_JOB_STARTED);
        enumMap.put("COPY_JOB_SUCCESSFUL", COPY_JOB_SUCCESSFUL);
        enumMap.put("COPY_JOB_FAILED", COPY_JOB_FAILED);
        enumMap.put("RECOVERY_POINT_MODIFIED", RECOVERY_POINT_MODIFIED);
        enumMap.put("BACKUP_PLAN_CREATED", BACKUP_PLAN_CREATED);
        enumMap.put("BACKUP_PLAN_MODIFIED", BACKUP_PLAN_MODIFIED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return BackupVaultEvent corresponding to the value
     */
    public static BackupVaultEvent fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
