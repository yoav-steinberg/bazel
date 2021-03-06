// Copyright 2020 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.skydoc.fakebuildapi.android;

import com.google.common.collect.ImmutableList;
import com.google.devtools.build.lib.starlarkbuildapi.FileApi;
import com.google.devtools.build.lib.starlarkbuildapi.android.AndroidProguardInfoApi;
import com.google.devtools.build.lib.syntax.EvalException;
import com.google.devtools.build.lib.syntax.Sequence;

/** Fake implementation of AndroidProguardInfo. */
public class FakeAndroidProguardInfo implements AndroidProguardInfoApi<FileApi> {

  @Override
  public ImmutableList<FileApi> getLocalProguardSpecs() {
    return null;
  }

  @Override
  public String toProto() throws EvalException {
    return null;
  }

  @Override
  public String toJson() throws EvalException {
    return null;
  }

  /** Fake implementation of {@link AndroidProguardInfoApi.Provider}. */
  public static class FakeProvider implements AndroidProguardInfoApi.Provider<FileApi> {

    @Override
    public AndroidProguardInfoApi<FileApi> createInfo(Sequence<?> localProguardSpecs)
        throws EvalException {
      return new FakeAndroidProguardInfo();
    }
  }
}
