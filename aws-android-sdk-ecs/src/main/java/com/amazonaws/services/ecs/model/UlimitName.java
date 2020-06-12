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

package com.amazonaws.services.ecs.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Ulimit Name
 */
public enum UlimitName {

    Core("core"),
    Cpu("cpu"),
    Data("data"),
    Fsize("fsize"),
    Locks("locks"),
    Memlock("memlock"),
    Msgqueue("msgqueue"),
    Nice("nice"),
    Nofile("nofile"),
    Nproc("nproc"),
    Rss("rss"),
    Rtprio("rtprio"),
    Rttime("rttime"),
    Sigpending("sigpending"),
    Stack("stack");

    private String value;

    private UlimitName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, UlimitName> enumMap;
    static {
        enumMap = new HashMap<String, UlimitName>();
        enumMap.put("core", Core);
        enumMap.put("cpu", Cpu);
        enumMap.put("data", Data);
        enumMap.put("fsize", Fsize);
        enumMap.put("locks", Locks);
        enumMap.put("memlock", Memlock);
        enumMap.put("msgqueue", Msgqueue);
        enumMap.put("nice", Nice);
        enumMap.put("nofile", Nofile);
        enumMap.put("nproc", Nproc);
        enumMap.put("rss", Rss);
        enumMap.put("rtprio", Rtprio);
        enumMap.put("rttime", Rttime);
        enumMap.put("sigpending", Sigpending);
        enumMap.put("stack", Stack);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return UlimitName corresponding to the value
     */
    public static UlimitName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
