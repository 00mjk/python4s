/*
 * Copyright 2019 Maksym Kysylov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kysylov.python4s

import org.scalatest.{FlatSpec, Matchers}

class ExceptionSpec extends FlatSpec with Matchers {

  "An exception wrapper" should "throw a python exception" in {
    val one = PythonObject(1)
    val zero = PythonObject(0)

    the[PythonException] thrownBy {
      one / zero
    } should have message "[ZeroDivisionError] division by zero"
  }
}
