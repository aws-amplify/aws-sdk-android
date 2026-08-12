/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Answering Machine Detection Status
 */
public enum AnsweringMachineDetectionStatus {

    ANSWERED("ANSWERED"),
    UNDETECTED("UNDETECTED"),
    ERROR("ERROR"),
    HUMAN_ANSWERED("HUMAN_ANSWERED"),
    SIT_TONE_DETECTED("SIT_TONE_DETECTED"),
    SIT_TONE_BUSY("SIT_TONE_BUSY"),
    SIT_TONE_INVALID_NUMBER("SIT_TONE_INVALID_NUMBER"),
    FAX_MACHINE_DETECTED("FAX_MACHINE_DETECTED"),
    VOICEMAIL_BEEP("VOICEMAIL_BEEP"),
    VOICEMAIL_NO_BEEP("VOICEMAIL_NO_BEEP"),
    AMD_UNRESOLVED("AMD_UNRESOLVED"),
    AMD_UNANSWERED("AMD_UNANSWERED"),
    AMD_ERROR("AMD_ERROR"),
    AMD_NOT_APPLICABLE("AMD_NOT_APPLICABLE");

    private String value;

    private AnsweringMachineDetectionStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AnsweringMachineDetectionStatus> enumMap;
    static {
        enumMap = new HashMap<String, AnsweringMachineDetectionStatus>();
        enumMap.put("ANSWERED", ANSWERED);
        enumMap.put("UNDETECTED", UNDETECTED);
        enumMap.put("ERROR", ERROR);
        enumMap.put("HUMAN_ANSWERED", HUMAN_ANSWERED);
        enumMap.put("SIT_TONE_DETECTED", SIT_TONE_DETECTED);
        enumMap.put("SIT_TONE_BUSY", SIT_TONE_BUSY);
        enumMap.put("SIT_TONE_INVALID_NUMBER", SIT_TONE_INVALID_NUMBER);
        enumMap.put("FAX_MACHINE_DETECTED", FAX_MACHINE_DETECTED);
        enumMap.put("VOICEMAIL_BEEP", VOICEMAIL_BEEP);
        enumMap.put("VOICEMAIL_NO_BEEP", VOICEMAIL_NO_BEEP);
        enumMap.put("AMD_UNRESOLVED", AMD_UNRESOLVED);
        enumMap.put("AMD_UNANSWERED", AMD_UNANSWERED);
        enumMap.put("AMD_ERROR", AMD_ERROR);
        enumMap.put("AMD_NOT_APPLICABLE", AMD_NOT_APPLICABLE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AnsweringMachineDetectionStatus corresponding to the value
     */
    public static AnsweringMachineDetectionStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
