/*
Copyright 2012-2015 Software Freedom Conservancy
Copyright 2007-2012 Selenium committers

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package org.openqa.selenium.testing;

import org.openqa.selenium.Platform;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Ignore {

  public static enum Driver {
    ALL,
    CHROME,
    HTMLUNIT,
    FIREFOX,
    IE,
    MARIONETTE,
    PHANTOMJS,
    REMOTE,
    SAFARI,
  }

  Driver[] value() default {Driver.ALL};

  Platform[] platforms() default {Platform.ANY};

  String reason() default ("Not implemented in driver yet");

  int[] issues() default {};

}