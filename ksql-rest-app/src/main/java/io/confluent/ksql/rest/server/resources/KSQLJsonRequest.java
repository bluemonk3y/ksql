/**
 * Copyright 2017 Confluent Inc.
 **/
package io.confluent.ksql.rest.server.resources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class KSQLJsonRequest {
  public String ksql;

  public String getKsql() {
    return ksql;
  }

  // In case this is ever useful for debugging
  @Override
  public String toString() {
    return String.format("KSQLRequest {\"ksql\":\"%s\"}", ksql);
  }
}