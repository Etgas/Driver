// Generated by Dagger (https://google.github.io/dagger).
package com.generalmobile.app.driverexample.ui.drivers;

import com.generalmobile.app.driverexample.service.driverApi;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class DriverViewModel_MembersInjector implements MembersInjector<DriverViewModel> {
  private final Provider<driverApi> baseApiProvider;

  public DriverViewModel_MembersInjector(Provider<driverApi> baseApiProvider) {
    this.baseApiProvider = baseApiProvider;
  }

  public static MembersInjector<DriverViewModel> create(Provider<driverApi> baseApiProvider) {
    return new DriverViewModel_MembersInjector(baseApiProvider);
  }

  @Override
  public void injectMembers(DriverViewModel instance) {
    injectBaseApi(instance, baseApiProvider.get());
  }

  public static void injectBaseApi(DriverViewModel instance, driverApi baseApi) {
    instance.baseApi = baseApi;
  }
}
