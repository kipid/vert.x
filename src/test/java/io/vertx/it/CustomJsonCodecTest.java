/*
 * Copyright (c) 2011-2019 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 */

package io.vertx.it;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.test.core.VertxTestBase;
import org.junit.Test;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CustomJsonCodecTest extends VertxTestBase {

  @Test
  public void testJsonObject() {
    JsonObject obj = new JsonObject();
    obj.put("foo", "bar");
    assertEquals("{\"foo\":\"bar\"}", obj.encode());
  }

  @Test
  public void testJsonArray() {
    JsonArray array = new JsonArray();
    array.add("foo");
    assertEquals("[\"foo\"]", array.encode());
  }
}
