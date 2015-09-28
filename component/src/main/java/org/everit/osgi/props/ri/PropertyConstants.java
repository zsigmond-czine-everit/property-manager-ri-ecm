/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.biz)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.osgi.props.ri;

/**
 * Constants of the Property component.
 */
public final class PropertyConstants {

  public static final String DEFAULT_CACHE_TARGET = "(MUST_BE_SET=TO_SOMETHING)";

  public static final String DEFAULT_SERVICE_DESCRIPTION = "Default Property Manager";

  public static final String PROP_CACHE_TARGET = "cache.target";

  public static final String PROP_QUERYDSL_SUPPORT_TARGET = "querydslSupport.target";

  public static final String PROP_TRANSACTION_HELPER_TARGET = "transactionHelper.target";

  public static final String SERVICE_FACTORY_PID_PROPERTY_MANAGER =
      "org.everit.props.ri.ecm.PropertyManager";

  private PropertyConstants() {
  }
}
