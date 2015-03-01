/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog.computeresource;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * * Enumeration of local resource job manager types supported by Airavata
 * *
 * * FORK:
 * *  Forking of commands without any job manager
 * *
 * * PBS:
 * *  Job manager supporting the Portal Batch System (PBS) protocol. Some examples include TORQUE, PBSPro, Grid Engine.
 * *
 * * SLURM:
 * *  The Simple Linux Utility for Resource Management is a open source workload manager.
 *  *
 *  * UGE:
 *  *  Univa Grid Engine, a variation of PBS implementation.
 *  *
 *  * LSF:
 *  *  IBM Platform Load Sharing Facility is dominantly installed on IBM clusters.
 * *
 */
@SuppressWarnings("all") public enum ResourceJobManagerType implements org.apache.thrift.TEnum {
  FORK(0),
  PBS(1),
  SLURM(2),
  LSF(3),
  UGE(4);

  private final int value;

  private ResourceJobManagerType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ResourceJobManagerType findByValue(int value) { 
    switch (value) {
      case 0:
        return FORK;
      case 1:
        return PBS;
      case 2:
        return SLURM;
      case 3:
        return LSF;
      case 4:
        return UGE;
      default:
        return null;
    }
  }
}
