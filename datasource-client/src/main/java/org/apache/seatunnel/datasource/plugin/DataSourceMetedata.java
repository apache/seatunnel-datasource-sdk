/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.datasource.plugin;

import org.apache.seatunnel.datasource.configuration.util.OptionRule;
import org.apache.seatunnel.datasource.model.Table;

import java.util.List;
import java.util.Map;

public interface DataSourceMetedata {

    Boolean checkDataSourceConnectivity(Map<String, Object> dataSourceParams);

    default Boolean capableGetSchema() {
        return false;
    }

    OptionRule getDataSourceFields();

    Table getTable(Map<String, Object> requestParams);

    List<String> getTables(Map<String, Object> requestParams);

    List<String> getDatabases(Map<String, Object> requestParams);

}
